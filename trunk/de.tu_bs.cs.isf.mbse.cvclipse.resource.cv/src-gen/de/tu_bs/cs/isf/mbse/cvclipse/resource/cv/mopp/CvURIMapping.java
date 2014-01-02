/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

/**
 * A basic implementation of the
 * de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvURIMapping interface that can map
 * identifiers to URIs.
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvURIMapping.
 */
public class CvURIMapping<ReferenceType> implements de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvURIMapping<ReferenceType> {
	
	private org.eclipse.emf.common.util.URI uri;
	private String identifier;
	private String warning;
	
	public CvURIMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier, String warning) {
		super();
		this.uri = newIdentifier;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public org.eclipse.emf.common.util.URI getTargetIdentifier() {
		return uri;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
