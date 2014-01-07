/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface ICvCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
