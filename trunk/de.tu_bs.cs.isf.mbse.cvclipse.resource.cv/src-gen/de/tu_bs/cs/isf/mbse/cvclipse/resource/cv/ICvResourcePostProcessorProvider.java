/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface ICvResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvResourcePostProcessor getResourcePostProcessor();
	
}
