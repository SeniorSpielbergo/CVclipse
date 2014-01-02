/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class CvDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugTarget debugTarget;
	
	private de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugCommunicationHelper communicationHelper = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugCommunicationHelper();
	
	public CvDebugProxy(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		// creating client proxy socket (trying to connect)...
		java.net.Socket client = new java.net.Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			java.io.BufferedInputStream input = new java.io.BufferedInputStream(client.getInputStream());
			reader = new java.io.BufferedReader(new java.io.InputStreamReader(input));
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
		try {
			output = new java.io.PrintStream(client.getOutputStream());
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes.EXIT);
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage getStack() {
		return sendCommandAndRead(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage message = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage message = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage response = sendCommandAndRead(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage response = sendCommandAndRead(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugVariable[] variables  = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			java.util.Map<String, Long> childVariables = new java.util.TreeMap<String, Long>(new java.util.Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			org.eclipse.debug.core.model.IValue value = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugVariable variable = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes command, String... parameters) {
		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage message = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage sendCommandAndRead(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes command, String... parameters) {
		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage message = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
