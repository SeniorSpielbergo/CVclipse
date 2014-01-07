/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util;

/**
 * Class CvTextResourceUtil can be used to perform common tasks on text resources,
 * such as loading and saving resources, as well as, checking them for errors.
 * This class is deprecated and has been replaced by
 * de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvResourceUtil.
 */
public class CvTextResourceUtil {
	
	/**
	 * Use de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvResource getResource(org.eclipse.core.resources.IFile file) {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvEclipseProxy().getResource(file);
	}
	
	/**
	 * Use de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvResource getResource(org.eclipse.emf.common.util.URI uri) {
		return de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvResourceUtil.getResource(uri);
	}
	
	/**
	 * Use de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvResourceUtil.getResource(uri, options);
	}
	
}
