/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class CvExpectedStructuralFeature extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvAbstractExpectedElement {
	
	private de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvPlaceholder placeholder;
	
	public CvExpectedStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	/**
	 * Returns the expected placeholder.
	 */
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvSyntaxElement getSymtaxElement() {
		return placeholder;
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof CvExpectedStructuralFeature) {
			return getFeature().equals(((CvExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
}
