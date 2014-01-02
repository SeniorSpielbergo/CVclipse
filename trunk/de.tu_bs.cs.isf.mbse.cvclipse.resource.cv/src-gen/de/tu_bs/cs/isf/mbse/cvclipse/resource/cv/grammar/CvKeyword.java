/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class CvKeyword extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvSyntaxElement {
	
	private final String value;
	
	public CvKeyword(String value, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
