/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface ICvExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvExpectedElement follower, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvPair<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvExpectedElement, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvContainedFeature[]>> getFollowers();
	
}
