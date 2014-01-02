/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui;

/**
 * A class used to initialize default preference values.
 */
public class CvPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvBracketSet bracketSet = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvBracketSet(null, null);
		final java.util.Collection<de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ui.CvSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
