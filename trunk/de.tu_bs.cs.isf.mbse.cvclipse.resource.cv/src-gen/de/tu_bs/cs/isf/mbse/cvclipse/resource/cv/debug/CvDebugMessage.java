/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class CvDebugMessage {
	
	private static final char DELIMITER = ':';
	private de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes messageType;
	private String[] arguments;
	
	public CvDebugMessage(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public CvDebugMessage(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvStringUtil.encode(DELIMITER, parts);
	}
	
	public static CvDebugMessage deserialize(String response) {
		java.util.List<String> parts = de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes type = de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes.valueOf(messageType);
		CvDebugMessage message = new CvDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.ECvDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvStringUtil.explode(arguments, ", ") + "]";
	}
	
}
