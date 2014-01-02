/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

/**
 * A representation for a range in a document where an enumeration literal (i.e.,
 * a set of static strings) is expected.
 */
public class CvExpectedEnumerationTerminal extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvAbstractExpectedElement {
	
	private de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvEnumerationTerminal enumerationTerminal;
	
	public CvExpectedEnumerationTerminal(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvEnumerationTerminal enumerationTerminal) {
		super(enumerationTerminal.getMetaclass());
		this.enumerationTerminal = enumerationTerminal;
	}
	
	public java.util.Set<String> getTokenNames() {
		// EnumerationTerminals are associated with multiple tokens, one for each literal
		// that was mapped to a string
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>();
		java.util.Map<String, String> mapping = enumerationTerminal.getLiteralMapping();
		for (String literalName : mapping.keySet()) {
			String text = mapping.get(literalName);
			if (text != null && !"".equals(text)) {
				tokenNames.add("'" + text + "'");
			}
		}
		return tokenNames;
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvEnumerationTerminal getEnumerationTerminal() {
		return this.enumerationTerminal;
	}
	
	/**
	 * Returns the expected enumeration terminal.
	 */
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.grammar.CvSyntaxElement getSymtaxElement() {
		return enumerationTerminal;
	}
	
	public String toString() {
		return "EnumTerminal \"" + getEnumerationTerminal() + "\"";
	}
	
}
