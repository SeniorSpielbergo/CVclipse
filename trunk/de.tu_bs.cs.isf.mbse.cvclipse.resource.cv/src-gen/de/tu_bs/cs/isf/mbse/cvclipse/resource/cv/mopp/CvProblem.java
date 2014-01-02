/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

public class CvProblem implements de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvProblem {
	
	private String message;
	private de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemType type;
	private de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemSeverity severity;
	private java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvQuickFix> quickFixes;
	
	public CvProblem(String message, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemType type, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvQuickFix>emptySet());
	}
	
	public CvProblem(String message, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemType type, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemSeverity severity, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public CvProblem(String message, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemType type, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemSeverity severity, java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemType getType() {
		return type;
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
