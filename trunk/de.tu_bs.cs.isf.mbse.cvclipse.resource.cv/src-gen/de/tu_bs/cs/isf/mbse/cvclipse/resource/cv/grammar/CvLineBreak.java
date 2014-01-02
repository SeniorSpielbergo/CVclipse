/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar;

public class CvLineBreak extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvFormattingElement {
	
	private final int tabs;
	
	public CvLineBreak(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
