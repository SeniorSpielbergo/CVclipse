/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

public class CvNewFileContentProvider {
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvMetaInformation getMetaInformation() {
		return new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvMetaInformation();
	}
	
	public String getNewFileContent(String newFileName) {
		return getExampleContent(new org.eclipse.emf.ecore.EClass[] {
			de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.eINSTANCE.getApplication(),
		}, getMetaInformation().getClassesWithSyntax(), newFileName);
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass[] startClasses, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, String newFileName) {
		String content = "";
		for (org.eclipse.emf.ecore.EClass next : startClasses) {
			content = getExampleContent(next, allClassesWithSyntax, newFileName);
			if (content.trim().length() > 0) {
				break;
			}
		}
		return content;
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass eClass, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, String newFileName) {
		// create a minimal model
		org.eclipse.emf.ecore.EObject root = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		if (root == null) {
			// could not create a minimal model. returning an empty document is the best we
			// can do.
			return "";
		}
		// use printer to get text for model
		java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (java.io.IOException e) {
			new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.util.CvRuntimeUtil().logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextPrinter getPrinter(java.io.OutputStream outputStream) {
		return getMetaInformation().createPrinter(outputStream, new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvResource());
	}
	
}
