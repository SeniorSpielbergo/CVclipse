/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.analysis;

public class CvTEXTTokenResolver implements de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver {
	
	private de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.analysis.CvDefaultTokenResolver defaultTokenResolver = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.analysis.CvDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
