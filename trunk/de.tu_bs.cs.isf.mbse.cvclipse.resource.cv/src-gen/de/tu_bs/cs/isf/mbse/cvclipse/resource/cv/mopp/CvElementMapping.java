/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

/**
 * A basic implementation of the
 * de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class CvElementMapping<ReferenceType> implements de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public CvElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
