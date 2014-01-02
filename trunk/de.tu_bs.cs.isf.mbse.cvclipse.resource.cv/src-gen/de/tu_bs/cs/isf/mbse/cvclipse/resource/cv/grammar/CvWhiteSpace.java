/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar;

public class CvWhiteSpace extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvFormattingElement {
	
	private final int amount;
	
	public CvWhiteSpace(int amount, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
