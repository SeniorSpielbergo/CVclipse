/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class CvSyntaxElement {
	
	private CvSyntaxElement[] children;
	private CvSyntaxElement parent;
	private de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvCardinality cardinality;
	
	public CvSyntaxElement(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvCardinality cardinality, CvSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (CvSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(CvSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public CvSyntaxElement getParent() {
		return parent;
	}
	
	public CvSyntaxElement[] getChildren() {
		if (children == null) {
			return new CvSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvCardinality getCardinality() {
		return cardinality;
	}
	
}
