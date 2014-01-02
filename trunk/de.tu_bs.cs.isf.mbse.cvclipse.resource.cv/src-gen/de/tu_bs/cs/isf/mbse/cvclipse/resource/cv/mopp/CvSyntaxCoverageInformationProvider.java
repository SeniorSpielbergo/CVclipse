/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

public class CvSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(),
			de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getPersonalInformation(),
			de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLetter(),
			de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getCV(),
			de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getItemBlock(),
			de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getListBlock(),
			de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getTextItem(),
			de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getDateItem(),
			de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getDate(),
			de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getLanguageToTextMapEntry(),
			de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getText(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(),
		};
	}
	
}
