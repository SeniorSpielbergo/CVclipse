/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar;

public class CvTerminal extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvSyntaxElement {
	
	private final org.eclipse.emf.ecore.EStructuralFeature feature;
	private final int mandatoryOccurencesAfter;
	
	public CvTerminal(org.eclipse.emf.ecore.EStructuralFeature feature, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvCardinality cardinality, int mandatoryOccurencesAfter) {
		super(cardinality, null);
		this.feature = feature;
		this.mandatoryOccurencesAfter = mandatoryOccurencesAfter;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return feature;
	}
	
	public int getMandatoryOccurencesAfter() {
		return mandatoryOccurencesAfter;
	}
	
	public String toString() {
		return feature.getName() + "[]";
	}
	
}
