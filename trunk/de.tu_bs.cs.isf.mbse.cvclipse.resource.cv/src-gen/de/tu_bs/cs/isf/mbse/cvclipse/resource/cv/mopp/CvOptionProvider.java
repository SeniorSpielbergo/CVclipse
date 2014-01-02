/**
 * <copyright>
 * </copyright>
 *
 * 
 */
/**
 * This class can be used to configure options that must be used when resources
 * are loaded. This is similar to using the extension point
 * 'de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.default_load_options' with the
 * difference that the options defined in this class are used even if no Eclipse
 * platform is running.
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

public class CvOptionProvider implements de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvOptionProvider {
	
	public java.util.Map<?,?> getOptions() {
		// create a map with static option providers here
		return java.util.Collections.emptyMap();
	}
	
}
