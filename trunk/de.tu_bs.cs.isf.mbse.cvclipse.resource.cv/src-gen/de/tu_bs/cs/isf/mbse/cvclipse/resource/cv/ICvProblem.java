/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv;

public interface ICvProblem {
	public String getMessage();
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemSeverity getSeverity();
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemType getType();
	public java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvQuickFix> getQuickFixes();
}
