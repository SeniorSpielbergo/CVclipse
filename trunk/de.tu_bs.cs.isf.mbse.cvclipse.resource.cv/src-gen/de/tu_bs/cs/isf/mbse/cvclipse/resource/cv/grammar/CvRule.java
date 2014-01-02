/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class CvRule extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public CvRule(org.eclipse.emf.ecore.EClass metaclass, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvChoice choice, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvCardinality cardinality) {
		super(cardinality, new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvChoice getDefinition() {
		return (de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvChoice) getChildren()[0];
	}
	
}

