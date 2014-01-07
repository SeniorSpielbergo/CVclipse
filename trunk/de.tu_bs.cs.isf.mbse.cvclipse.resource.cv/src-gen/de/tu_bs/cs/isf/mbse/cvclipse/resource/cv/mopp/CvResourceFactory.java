/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

public class CvResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public CvResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvResource(uri);
	}
	
}
