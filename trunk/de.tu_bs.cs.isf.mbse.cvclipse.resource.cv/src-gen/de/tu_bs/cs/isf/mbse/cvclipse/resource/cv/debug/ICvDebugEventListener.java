/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug;

public interface ICvDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.debug.CvDebugMessage message);
}
