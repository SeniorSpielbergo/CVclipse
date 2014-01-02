/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui;

public class CvAnnotationModel extends org.eclipse.ui.texteditor.ResourceMarkerAnnotationModel {
	
	public CvAnnotationModel(org.eclipse.core.resources.IResource resource) {
		super(resource);
	}
	
	protected org.eclipse.ui.texteditor.MarkerAnnotation createMarkerAnnotation(org.eclipse.core.resources.IMarker marker) {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvMarkerAnnotation(marker);
	}
	
}
