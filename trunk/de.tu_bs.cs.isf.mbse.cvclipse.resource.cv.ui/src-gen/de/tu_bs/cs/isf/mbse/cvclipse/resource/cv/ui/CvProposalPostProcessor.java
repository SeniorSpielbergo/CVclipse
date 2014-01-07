/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class CvProposalPostProcessor {
	
	public java.util.List<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvCompletionProposal> process(java.util.List<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
