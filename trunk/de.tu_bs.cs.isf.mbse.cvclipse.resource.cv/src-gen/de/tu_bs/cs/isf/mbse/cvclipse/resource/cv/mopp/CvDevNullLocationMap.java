/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

/**
 * An inactive implementation of the ILocationMap interface. That is used if the
 * de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvOptions.DISABLE_LOCATION_MAP
 * option is set.
 */
public class CvDevNullLocationMap implements de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvLocationMap {
	
	public void setLine(org.eclipse.emf.ecore.EObject element, int line) {
	}
	
	public int getLine(org.eclipse.emf.ecore.EObject element) {
		return -1;
	}
	
	public void setColumn(org.eclipse.emf.ecore.EObject element, int column) {
	}
	
	public int getColumn(org.eclipse.emf.ecore.EObject element) {
		return -1;
	}
	
	public void setCharStart(org.eclipse.emf.ecore.EObject element, int charStart) {
	}
	
	public int getCharStart(org.eclipse.emf.ecore.EObject element) {
		return -1;
	}
	
	public void setCharEnd(org.eclipse.emf.ecore.EObject element, int charEnd) {
	}
	
	public int getCharEnd(org.eclipse.emf.ecore.EObject element) {
		return -1;
	}
	
	public java.util.List<org.eclipse.emf.ecore.EObject> getElementsAt(final int documentOffset) {
		return java.util.Collections.<org.eclipse.emf.ecore.EObject>emptyList();
	}
	
	public java.util.List<org.eclipse.emf.ecore.EObject> getElementsBetween(final int startOffset, final int endOffset) {
		return java.util.Collections.<org.eclipse.emf.ecore.EObject>emptyList();
	}
	
}
