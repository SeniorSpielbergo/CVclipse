/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug;

public class CvSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvStackFrame) {
			de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvStackFrame frame = (de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
