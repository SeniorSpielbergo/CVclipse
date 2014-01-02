/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class CvAbstractExpectedElement implements de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvPair<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvExpectedElement, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvContainedFeature[]>> followers = new java.util.LinkedHashSet<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvPair<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvExpectedElement, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvContainedFeature[]>>();
	
	public CvAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvExpectedElement follower, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvContainedFeature[] path) {
		followers.add(new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvPair<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvExpectedElement, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvPair<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvExpectedElement, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
