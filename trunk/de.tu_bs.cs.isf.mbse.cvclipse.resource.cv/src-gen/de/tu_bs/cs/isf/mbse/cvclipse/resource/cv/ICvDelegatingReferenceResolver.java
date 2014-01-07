/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv;

/**
 * A delegating reference resolver is an extension of a normal reference resolver
 * that can be configured with another resolver that it may delegate method calls
 * to. This interface can be implemented by additional resolvers to customize
 * resolving using the load option ADDITIONAL_REFERENCE_RESOLVERS.
 * 
 * @see de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvOptions
 */
public interface ICvDelegatingReferenceResolver<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> extends de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolver<ContainerType, ReferenceType> {
	
	/**
	 * Sets the delegate for this resolver.
	 */
	public void setDelegate(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolver<ContainerType, ReferenceType> delegate);
	
}
