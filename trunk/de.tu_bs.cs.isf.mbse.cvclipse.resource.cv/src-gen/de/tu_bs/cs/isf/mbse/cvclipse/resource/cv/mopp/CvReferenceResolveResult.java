/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

/**
 * A basic implementation of the
 * de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolveResult interface
 * that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class CvReferenceResolveResult<ReferenceType> implements de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvQuickFix> quickFixes;
	
	public CvReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
