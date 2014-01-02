/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

/**
 * The CvTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class CvTokenResolverFactory implements de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolverFactory {
	
	private java.util.Map<String, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver> featureName2CollectInTokenResolver;
	private static de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver defaultResolver = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.analysis.CvDefaultTokenResolver();
	
	public CvTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver>();
		registerTokenResolver("EMAIL", new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.analysis.CvEMAILTokenResolver());
		registerTokenResolver("TWITTER", new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.analysis.CvTWITTERTokenResolver());
		registerTokenResolver("TWO_DIGIT", new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.analysis.CvTWO_DIGITTokenResolver());
		registerTokenResolver("FOUR_DIGIT", new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.analysis.CvFOUR_DIGITTokenResolver());
		registerTokenResolver("QUOTED_34_34", new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.analysis.CvQUOTED_34_34TokenResolver());
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver internalCreateResolver(java.util.Map<String, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver> resolverMap, String key, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
