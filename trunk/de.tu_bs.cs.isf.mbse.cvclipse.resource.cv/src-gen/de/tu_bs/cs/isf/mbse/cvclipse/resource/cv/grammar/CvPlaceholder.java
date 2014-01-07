/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class CvPlaceholder extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvTerminal {
	
	private final String tokenName;
	
	public CvPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
