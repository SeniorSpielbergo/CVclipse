/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv;

/**
 * An interface used to access the result of parsing a document.
 */
public interface ICvParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvCommand<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource>> getPostParseCommands();
	
}
