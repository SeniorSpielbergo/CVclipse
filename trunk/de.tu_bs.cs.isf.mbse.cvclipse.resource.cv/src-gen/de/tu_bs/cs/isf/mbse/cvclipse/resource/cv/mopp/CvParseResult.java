/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

public class CvParseResult implements de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvCommand<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource>> commands = new java.util.ArrayList<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvCommand<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource>>();
	
	public CvParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvCommand<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
