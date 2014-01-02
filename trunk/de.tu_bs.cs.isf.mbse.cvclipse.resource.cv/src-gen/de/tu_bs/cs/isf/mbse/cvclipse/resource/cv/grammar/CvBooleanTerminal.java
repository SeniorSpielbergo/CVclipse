/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar;

/**
 * A class to represent boolean terminals in a grammar.
 */
public class CvBooleanTerminal extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvTerminal {
	
	private String trueLiteral;
	private String falseLiteral;
	
	public CvBooleanTerminal(org.eclipse.emf.ecore.EStructuralFeature attribute, String trueLiteral, String falseLiteral, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvCardinality cardinality, int mandatoryOccurrencesAfter) {
		super(attribute, cardinality, mandatoryOccurrencesAfter);
		assert attribute instanceof org.eclipse.emf.ecore.EAttribute;
		this.trueLiteral = trueLiteral;
		this.falseLiteral = falseLiteral;
	}
	
	public String getTrueLiteral() {
		return trueLiteral;
	}
	
	public String getFalseLiteral() {
		return falseLiteral;
	}
	
	public org.eclipse.emf.ecore.EAttribute getAttribute() {
		return (org.eclipse.emf.ecore.EAttribute) getFeature();
	}
	
}
