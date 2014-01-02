/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui;

public class CvHoverTextProvider implements de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvHoverTextProvider {
	
	private de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvDefaultHoverTextProvider defaultProvider = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
