/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar;

public class CvChoice extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvSyntaxElement {
	
	public CvChoice(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvCardinality cardinality, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvStringUtil.explode(getChildren(), "|");
	}
	
}
