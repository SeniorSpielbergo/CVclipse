/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

public class CvBracketInformationProvider {
	
	public class BracketPair implements de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvBracketPair> getBracketPairs() {
		java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvBracketPair> result = new java.util.ArrayList<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvBracketPair>();
		result.add(new BracketPair("\"", "\"", false));
		return result;
	}
	
}
