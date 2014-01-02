/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar;

public class CvContainment extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public CvContainment(org.eclipse.emf.ecore.EStructuralFeature feature, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvStringUtil.explode(allowedTypes, ", ", new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
