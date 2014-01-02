/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

public class CvMetaInformation implements de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvMetaInformation {
	
	public String getSyntaxName() {
		return "cv";
	}
	
	public String getURI() {
		return "http://www.tu-braunschweig.de/isf/cvclipse/1.0";
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextScanner createLexer() {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvAntlrScanner(new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvLexer());
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvParser().createInstance(inputStream, encoding);
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextPrinter createPrinter(java.io.OutputStream outputStream, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource resource) {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvReferenceResolverSwitch getReferenceResolverSwitch() {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvReferenceResolverSwitch();
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolverFactory getTokenResolverFactory() {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "de.tu_bs.cs.isf.mbse.cvclipse/model/cvclipse.cs";
	}
	
	public String[] getTokenNames() {
		return de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvParser.tokenNames;
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenStyle getDefaultTokenStyle(String tokenName) {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvBracketPair> getBracketPairs() {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvResourceFactory();
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvNewFileContentProvider getNewFileContentProvider() {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.launchConfigurationType";
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvNameProvider createNameProvider() {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.analysis.CvDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvAntlrTokenHelper tokenHelper = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvAntlrTokenHelper();
		java.util.List<String> highlightableTokens = new java.util.ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
