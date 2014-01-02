/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

public class CvDynamicTokenStyler {
	
	/**
	 * This method is called to dynamically style tokens.
	 * 
	 * @param resource the TextResource that contains the token
	 * @param token the token to obtain a style for
	 * @param staticStyle the token style as set in the editor preferences (is
	 * <code>null</code> if syntax highlighting for the token is disabled)
	 */
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenStyle getDynamicTokenStyle(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource resource, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextToken token, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenStyle staticStyle) {
		// The default implementation returns the static style without any changes. To
		// implement dynamic token styling, set the overrideDynamicTokenStyler option to
		// <code>false</code> and customize this method.
		return staticStyle;
	}
	
}
