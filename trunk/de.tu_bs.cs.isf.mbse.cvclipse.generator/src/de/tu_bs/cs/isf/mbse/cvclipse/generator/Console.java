package de.tu_bs.cs.isf.mbse.cvclipse.generator;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;

public class Console {
	private static boolean enabledDebug;
	private static boolean enabledWarning;
	private static boolean disablePluginConsole = false;
	
	public static boolean isEnabledDebug() {
		return enabledDebug;
	}

	public static void setEnabledDebug(boolean enabled) {
		enabledDebug = enabled;
	}

	public static boolean isEnabledWarning() {
		return enabledWarning;
	}

	public static void setEnabledWarning(boolean enabled) {
		enabledWarning = enabled;
	}

	public static void disablePluginConsole(boolean bool){
		disablePluginConsole = bool;
	}
	
	public static final String CONSOLE = "CVclipse Console";

	// http://wiki.eclipse.org/FAQ_How_do_I_write_to_the_console_from_a_plug-in%3F
	private static MessageConsole getConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

	public static MessageConsole getConsole(){
		return getConsole(CONSOLE);
	}
	
	public static void println(String message) {
		if(disablePluginConsole)
			System.out.println(message);
		else
			getConsole().newMessageStream().println(message);
	}
	
	public static void println() {
		if(disablePluginConsole)
			System.out.println();
		else
			getConsole().newMessageStream().println();
	}

	public static void print(String message) {
		if(disablePluginConsole)
			System.out.print(message);
		else
			getConsole().newMessageStream().print(message);
	}
	
	public static void debugln(String message) {
		if(isEnabledDebug()){
			if(disablePluginConsole)
				System.out.println(message);
			else
				getConsole().newMessageStream().println(message);
		}
	}
	
	public static void warningln(String message) {
		if(isEnabledWarning()){
			if(disablePluginConsole)
				System.out.println(message);
			else
				getConsole().newMessageStream().println(message);
		}
	}
	
	public static void debugln() {
		if(isEnabledDebug()){
			if(disablePluginConsole)
				System.out.println();
			else
				getConsole().newMessageStream().println();
		}
	}
	
	public static void warningln() {
		if(isEnabledWarning()){
			if(disablePluginConsole)
				System.out.println();
			else
				getConsole().newMessageStream().println();
		}
	}
	
	public static void debug(String message) {
		if(isEnabledDebug()){
			if(disablePluginConsole)
				System.out.print(message);
			else
				getConsole().newMessageStream().print(message);
		}
	}
	
	public static void warning(String message) {
		if(isEnabledWarning()){
			if(disablePluginConsole)
				System.out.print(message);
			else
				getConsole().newMessageStream().print(message);
		}
	}
	
	public static void clear() {
		getConsole().clearConsole();
	}
	
}
