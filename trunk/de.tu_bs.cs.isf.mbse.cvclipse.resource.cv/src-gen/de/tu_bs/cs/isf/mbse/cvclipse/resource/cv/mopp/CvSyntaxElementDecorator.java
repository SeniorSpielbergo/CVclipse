/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

public class CvSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private CvSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public CvSyntaxElementDecorator(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvSyntaxElement decoratedElement, CvSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public CvSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
