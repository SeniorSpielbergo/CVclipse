/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

public class CvAntlrScanner implements de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public CvAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextToken result = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
