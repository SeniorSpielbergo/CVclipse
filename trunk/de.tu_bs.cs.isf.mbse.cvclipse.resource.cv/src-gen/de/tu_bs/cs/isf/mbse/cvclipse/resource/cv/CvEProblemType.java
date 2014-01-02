/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv;

public enum CvEProblemType {
	SYNTAX_ERROR, PRINT_PROBLEM, UNRESOLVED_REFERENCE, ANALYSIS_PROBLEM, BUILDER_ERROR, UNKNOWN, ;
	
	/**
	 * Returns the ID that is used for this type of problem when creating markers for
	 * problems.
	 */
	public String getID() {
		if (this == UNKNOWN) {
			return "";
		}
		return this.name().toLowerCase();
	}
	
}
