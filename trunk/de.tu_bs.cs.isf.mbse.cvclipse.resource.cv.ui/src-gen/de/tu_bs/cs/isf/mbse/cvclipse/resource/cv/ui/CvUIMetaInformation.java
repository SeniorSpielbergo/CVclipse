/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui;

public class CvUIMetaInformation extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvMetaInformation {
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvHoverTextProvider getHoverTextProvider() {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvHoverTextProvider();
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvImageProvider getImageProvider() {
		return de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvImageProvider.INSTANCE;
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvColorManager createColorManager() {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource,
	 * de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvColorManager) instead.
	 */
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvTokenScanner createTokenScanner(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvTokenScanner createTokenScanner(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource resource, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvColorManager colorManager) {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvTokenScanner(resource, colorManager);
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvCodeCompletionHelper createCodeCompletionHelper() {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvCodeCompletionHelper();
	}
	
}
