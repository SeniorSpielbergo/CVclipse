/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar;

public class CvCompound extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvSyntaxElement {
	
	public CvCompound(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvChoice choice, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvCardinality cardinality) {
		super(cardinality, new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
