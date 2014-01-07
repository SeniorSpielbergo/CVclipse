/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar;

public class CvSequence extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvSyntaxElement {
	
	public CvSequence(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvCardinality cardinality, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvStringUtil.explode(getChildren(), " ");
	}
	
}
