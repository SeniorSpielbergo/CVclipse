/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar;

/**
 * A class to represent an enumeration terminal in the grammar.
 */
public class CvEnumerationTerminal extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvTerminal {
	
	private java.util.Map<String, String> mapping = new java.util.LinkedHashMap<String, String>();
	
	public CvEnumerationTerminal(org.eclipse.emf.ecore.EStructuralFeature attribute, String[] literalMappings, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvCardinality cardinality, int mandatoryOccurrencesAfter) {
		super(attribute, cardinality, mandatoryOccurrencesAfter);
		assert attribute instanceof org.eclipse.emf.ecore.EAttribute;
		assert literalMappings.length % 2 == 0;
		for (int i = 0; i < literalMappings.length; i += 2) {
			String literalName = literalMappings[i];
			String text = literalMappings[i + 1];
			this.mapping.put(literalName, text);
		}
	}
	
	public java.util.Map<String, String> getLiteralMapping() {
		return this.mapping;
	}
	
	public org.eclipse.emf.ecore.EAttribute getAttribute() {
		return (org.eclipse.emf.ecore.EAttribute) getFeature();
	}
	
	public String getText(String literalName) {
		return this.mapping.get(literalName);
	}
	
}
