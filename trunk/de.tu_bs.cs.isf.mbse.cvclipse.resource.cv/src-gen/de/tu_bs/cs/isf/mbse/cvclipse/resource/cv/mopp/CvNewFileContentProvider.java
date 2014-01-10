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
		String content = "options \n\tlanguages: german, english\n//\tstyle: casual\t// styles: casual, classic, banking, oldstyle\n//\tcolor: blue\t\t// colors: blue, orange, green, red, purple, grey, black\n\n//\tplace: \"Musterhausen\"\n//\tdate: 2000/1/1\n\npersonal \n\tfirstname: \"Max\"\n\tsurname: \"Mustermann\"\n\tbirthdate: 1970/01/01\n\tbirthplace: \"Musterstadt\"\n\tstreet: \"Musterstrasse 1\"\n\tcity: \"12345 Musterstadt\"\n//\tphone: \"12345/1234567\" \n//\tfax: \"12345/1234568\"\n//\tmobile: \"0123/12345678\"\n//\twebsite: \"www.maxmustermann.de\"\n//\temail: \"max.mustermann@muster.de\"\n//\ttwitter: \"@maxmustermann\"\n// \tlinkedin: \"MaxMustermann\"\n//\tgithub: \"MaxMustermann\"\n\tnationality: german \"Deutsch\", english \"German\"\n\nletter\n\trecipient\n\t\tcompany: \"Musterfrau GmbH\"\n//\t\tattention: \"Erika Musterfrau\"\n\t\tstreet: \"Musterstrasse 2\"\n\t\tcity: \"12345 Musterstadt\"\n//\t\topening: german \"Sehr geehrte Frau Musterfrau\", english \"Dear Ms. Musterfrau\"\n//\t\tclosing: german \"Mit freundlichem Gruss\", english \"Best regards\"\n//\t\tenclosure: german \"Appendix\", english \"Appendix\"\n\t\ttext: \n\t\t\tgerman \n\t\t\t\"Bewerbungstext...\", \n\t\t\t\n\t\t\tenglish \n\t\t\t\"Application text...\"\n\t\t\t\t\ncv\n\tpicture: \"max.jpg\"\n\t\n\tblock\n\t\ttitle: \n\t\t\tgerman \"Bildung\", english \"Education\"\n\t\t1976/6/1 \t\t\t\t\t\t| \tgerman \"Grundschule Musterstadt\", english \"Elementary School Musterstadt\"\n\t\tgerman \"...\", english \"...\"\t\t|\tgerman \"...\", english \"...\"\n\t\t\n\tlist\n\t\ttitle:\n\t\t\tgerman \"Sprachkenntnisse\", english \"Languages\"\n\t\tgerman \"Deutsch\", english \"German\" \t\t\t| german \"Muttersprache\", english \"Mother tongue\"\n\t\tgerman \"Englisch\", english \"English\"\t \t| german \"Verhandlungssicher\", english \"fluent\"".replace("\n", System.getProperty("line.separator"));
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
