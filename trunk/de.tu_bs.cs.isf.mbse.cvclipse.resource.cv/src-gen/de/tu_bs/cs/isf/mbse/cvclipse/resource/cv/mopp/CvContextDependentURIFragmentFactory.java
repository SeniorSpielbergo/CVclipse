/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class CvContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public CvContextDependentURIFragmentFactory(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
