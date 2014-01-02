/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

public class CvReferenceResolverSwitch implements de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvRuntimeUtil().logWarning("Found value with invalid type for option " + de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolver) {
			de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolver replacingResolver = (de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolver) resolverValue;
			if (replacingResolver instanceof de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceCache) {
					de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolver nextResolver = (de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolver) next;
					if (nextResolver instanceof de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvRuntimeUtil().logWarning("Found value with invalid type in value map for option " + de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvRuntimeUtil().logWarning("Found value with invalid type in value map for option " + de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
