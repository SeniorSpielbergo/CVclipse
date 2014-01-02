/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp;

public class CvPrinter implements de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextPrinter {
	
	protected de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolverFactory tokenResolverFactory = new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public CvPrinter(java.io.OutputStream outputStream, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof de.tu_bs.cs.isf.mbse.cvclipse.Application) {
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application((de.tu_bs.cs.isf.mbse.cvclipse.Application) element, globaltab, out);
			return;
		}
		if (element instanceof de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation) {
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation((de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation) element, globaltab, out);
			return;
		}
		if (element instanceof de.tu_bs.cs.isf.mbse.cvclipse.Letter) {
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter((de.tu_bs.cs.isf.mbse.cvclipse.Letter) element, globaltab, out);
			return;
		}
		if (element instanceof de.tu_bs.cs.isf.mbse.cvclipse.CV) {
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_CV((de.tu_bs.cs.isf.mbse.cvclipse.CV) element, globaltab, out);
			return;
		}
		if (element instanceof de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock) {
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock((de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock) element, globaltab, out);
			return;
		}
		if (element instanceof de.tu_bs.cs.isf.mbse.cvclipse.ListBlock) {
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock((de.tu_bs.cs.isf.mbse.cvclipse.ListBlock) element, globaltab, out);
			return;
		}
		if (element instanceof de.tu_bs.cs.isf.mbse.cvclipse.TextItem) {
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem((de.tu_bs.cs.isf.mbse.cvclipse.TextItem) element, globaltab, out);
			return;
		}
		if (element instanceof de.tu_bs.cs.isf.mbse.cvclipse.DateItem) {
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem((de.tu_bs.cs.isf.mbse.cvclipse.DateItem) element, globaltab, out);
			return;
		}
		if (element instanceof de.tu_bs.cs.isf.mbse.cvclipse.Date) {
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_Date((de.tu_bs.cs.isf.mbse.cvclipse.Date) element, globaltab, out);
			return;
		}
		if (element instanceof de.tu_bs.cs.isf.mbse.cvclipse.impl.LanguageToTextMapEntryImpl) {
			print_java_util_Map_Entry((de.tu_bs.cs.isf.mbse.cvclipse.impl.LanguageToTextMapEntryImpl) element, globaltab, out);
			return;
		}
		if (element instanceof de.tu_bs.cs.isf.mbse.cvclipse.Text) {
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_Text((de.tu_bs.cs.isf.mbse.cvclipse.Text) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvReferenceResolverSwitch getReferenceResolverSwitch() {
		return (de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvReferenceResolverSwitch) new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp.CvProblem(errorMessage, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemType.PRINT_PROBLEM, de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.CvEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application(de.tu_bs.cs.isf.mbse.cvclipse.Application element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__CV));
		printCountingMap.put("cv", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LETTER));
		printCountingMap.put("letter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES));
		printCountingMap.put("languages", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__PERSONAL_INFORMATION));
		printCountingMap.put("personalInformation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__STYLE));
		printCountingMap.put("style", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__COLOR));
		printCountingMap.put("color", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__PLACE));
		printCountingMap.put("place", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__DATE));
		printCountingMap.put("date", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("options");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_5(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_6(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_0(de.tu_bs.cs.isf.mbse.cvclipse.Application element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("languages");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("languages");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
			}
			printCountingMap.put("languages", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_0_0(de.tu_bs.cs.isf.mbse.cvclipse.Application element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("languages");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LANGUAGES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
			}
			printCountingMap.put("languages", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_1(de.tu_bs.cs.isf.mbse.cvclipse.Application element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("style");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("style");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__STYLE));
			if (o != null) {
			}
			printCountingMap.put("style", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_2(de.tu_bs.cs.isf.mbse.cvclipse.Application element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("color");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("color");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__COLOR));
			if (o != null) {
			}
			printCountingMap.put("color", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_3(de.tu_bs.cs.isf.mbse.cvclipse.Application element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("place");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("place");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__PLACE));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__PLACE), element));
				out.print(" ");
			}
			printCountingMap.put("place", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_4(de.tu_bs.cs.isf.mbse.cvclipse.Application element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("date");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("date");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__DATE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("date", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_5(de.tu_bs.cs.isf.mbse.cvclipse.Application element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("personalInformation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__PERSONAL_INFORMATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("personalInformation", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Application_6(de.tu_bs.cs.isf.mbse.cvclipse.Application element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"letter"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"cv"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("cv");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__CV));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("cv", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("letter");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.APPLICATION__LETTER));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("letter", count - 1);
			}
		}
	}
	
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__TWITTER));
		printCountingMap.put("twitter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__FIRSTNAME));
		printCountingMap.put("firstname", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__SURNAME));
		printCountingMap.put("surname", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__BIRTH_NAME));
		printCountingMap.put("birthName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__BIRTHPLACE));
		printCountingMap.put("birthplace", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__STREET));
		printCountingMap.put("street", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__CITY));
		printCountingMap.put("city", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__EMAIL));
		printCountingMap.put("email", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__PHONE));
		printCountingMap.put("phone", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__MOBILE));
		printCountingMap.put("mobile", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__FAX));
		printCountingMap.put("fax", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__WEBSITE));
		printCountingMap.put("website", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__GITHUB));
		printCountingMap.put("github", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__LINKED_IN));
		printCountingMap.put("linkedIn", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__MARITAL_STATUS));
		printCountingMap.put("maritalStatus", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__NATIONALITY));
		printCountingMap.put("nationality", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__BIRTHDATE));
		printCountingMap.put("birthdate", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__COUNTRY));
		printCountingMap.put("country", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("personal");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"firstname"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"surname"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"birthName"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"birthplace"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"birthdate"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"maritalStatus"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"nationality"		));
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"street"		));
		if (tempMatchCount > matches) {
			alt = 7;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"city"		));
		if (tempMatchCount > matches) {
			alt = 8;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"country"		));
		if (tempMatchCount > matches) {
			alt = 9;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"email"		));
		if (tempMatchCount > matches) {
			alt = 10;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"phone"		));
		if (tempMatchCount > matches) {
			alt = 11;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"mobile"		));
		if (tempMatchCount > matches) {
			alt = 12;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"fax"		));
		if (tempMatchCount > matches) {
			alt = 13;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"website"		));
		if (tempMatchCount > matches) {
			alt = 14;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"github"		));
		if (tempMatchCount > matches) {
			alt = 15;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"linkedIn"		));
		if (tempMatchCount > matches) {
			alt = 16;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"twitter"		));
		if (tempMatchCount > matches) {
			alt = 17;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_1(element, localtab, out, printCountingMap);
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_2(element, localtab, out, printCountingMap);
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_3(element, localtab, out, printCountingMap);
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_4(element, localtab, out, printCountingMap);
			}
			break;
			case 5:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_5(element, localtab, out, printCountingMap);
			}
			break;
			case 6:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_6(element, localtab, out, printCountingMap);
			}
			break;
			case 7:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_7(element, localtab, out, printCountingMap);
			}
			break;
			case 8:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_8(element, localtab, out, printCountingMap);
			}
			break;
			case 9:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_9(element, localtab, out, printCountingMap);
			}
			break;
			case 10:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_10(element, localtab, out, printCountingMap);
			}
			break;
			case 11:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_11(element, localtab, out, printCountingMap);
			}
			break;
			case 12:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_12(element, localtab, out, printCountingMap);
			}
			break;
			case 13:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_13(element, localtab, out, printCountingMap);
			}
			break;
			case 14:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_14(element, localtab, out, printCountingMap);
			}
			break;
			case 15:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_15(element, localtab, out, printCountingMap);
			}
			break;
			case 16:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_16(element, localtab, out, printCountingMap);
			}
			break;
			case 17:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_17(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_0(element, localtab, out, printCountingMap);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_0(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("firstname");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("firstname");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__FIRSTNAME));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__FIRSTNAME), element));
				out.print(" ");
			}
			printCountingMap.put("firstname", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_1(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("surname");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("surname");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__SURNAME));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__SURNAME), element));
				out.print(" ");
			}
			printCountingMap.put("surname", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_2(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("birthname");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("birthName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__BIRTH_NAME));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__BIRTH_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("birthName", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_3(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("birthplace");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("birthplace");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__BIRTHPLACE));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__BIRTHPLACE), element));
				out.print(" ");
			}
			printCountingMap.put("birthplace", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_4(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("birthdate");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("birthdate");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__BIRTHDATE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("birthdate", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_5(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("marital status");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("maritalStatus");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__MARITAL_STATUS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("maritalStatus", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_5_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_5_0(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("maritalStatus");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__MARITAL_STATUS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("maritalStatus", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_6(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("nationality");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("nationality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__NATIONALITY));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("nationality", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_6_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_6_0(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("nationality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__NATIONALITY));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("nationality", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_7(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("street");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("street");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__STREET));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__STREET), element));
				out.print(" ");
			}
			printCountingMap.put("street", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_8(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("city");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("city");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__CITY));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__CITY), element));
				out.print(" ");
			}
			printCountingMap.put("city", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_9(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("country");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("country");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__COUNTRY));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("country", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_9_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_9_0(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("country");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__COUNTRY));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("country", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_10(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("email");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("email");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__EMAIL));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("EMAIL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__EMAIL), element));
				out.print(" ");
			}
			printCountingMap.put("email", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_11(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("phone");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("phone");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__PHONE));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__PHONE), element));
				out.print(" ");
			}
			printCountingMap.put("phone", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_12(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("mobile");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("mobile");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__MOBILE));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__MOBILE), element));
				out.print(" ");
			}
			printCountingMap.put("mobile", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_13(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("fax");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("fax");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__FAX));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__FAX), element));
				out.print(" ");
			}
			printCountingMap.put("fax", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_14(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("website");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("website");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__WEBSITE));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__WEBSITE), element));
				out.print(" ");
			}
			printCountingMap.put("website", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_15(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("github");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("github");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__GITHUB));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__GITHUB), element));
				out.print(" ");
			}
			printCountingMap.put("github", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_16(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("linkedin");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("linkedIn");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__LINKED_IN));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__LINKED_IN), element));
				out.print(" ");
			}
			printCountingMap.put("linkedIn", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_PersonalInformation_0_17(de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("twitter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("twitter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__TWITTER));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("TWITTER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.PERSONAL_INFORMATION__TWITTER), element));
				out.print(" ");
			}
			printCountingMap.put("twitter", count - 1);
		}
	}
	
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter(de.tu_bs.cs.isf.mbse.cvclipse.Letter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__OPENING));
		printCountingMap.put("opening", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__CLOSING));
		printCountingMap.put("closing", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__ENCLOSURE));
		printCountingMap.put("enclosure", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__TEXT));
		printCountingMap.put("text", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_COMPANY));
		printCountingMap.put("recipientCompany", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_STREET));
		printCountingMap.put("recipientStreet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_CITY));
		printCountingMap.put("recipientCity", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_COUNTRY));
		printCountingMap.put("recipientCountry", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_ATTENTION));
		printCountingMap.put("recipientAttention", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("letter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("recipient");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0(de.tu_bs.cs.isf.mbse.cvclipse.Letter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"recipientCompany"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"recipientStreet"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"recipientCity"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"recipientCountry"		));
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"recipientAttention"		));
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"opening"		));
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"text"		));
		if (tempMatchCount > matches) {
			alt = 6;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"closing"		));
		if (tempMatchCount > matches) {
			alt = 7;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"enclosure"		));
		if (tempMatchCount > matches) {
			alt = 8;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_1(element, localtab, out, printCountingMap);
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_2(element, localtab, out, printCountingMap);
			}
			break;
			case 3:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_3(element, localtab, out, printCountingMap);
			}
			break;
			case 4:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_4(element, localtab, out, printCountingMap);
			}
			break;
			case 5:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_5(element, localtab, out, printCountingMap);
			}
			break;
			case 6:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_6(element, localtab, out, printCountingMap);
			}
			break;
			case 7:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_7(element, localtab, out, printCountingMap);
			}
			break;
			case 8:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_8(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_0(element, localtab, out, printCountingMap);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_0(de.tu_bs.cs.isf.mbse.cvclipse.Letter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("company");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("recipientCompany");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_COMPANY));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_COMPANY), element));
				out.print(" ");
			}
			printCountingMap.put("recipientCompany", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_1(de.tu_bs.cs.isf.mbse.cvclipse.Letter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("street");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("recipientStreet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_STREET));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_STREET), element));
				out.print(" ");
			}
			printCountingMap.put("recipientStreet", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_2(de.tu_bs.cs.isf.mbse.cvclipse.Letter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("city");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("recipientCity");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_CITY));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_CITY), element));
				out.print(" ");
			}
			printCountingMap.put("recipientCity", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_3(de.tu_bs.cs.isf.mbse.cvclipse.Letter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("country");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("recipientCountry");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_COUNTRY));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_COUNTRY), element));
				out.print(" ");
			}
			printCountingMap.put("recipientCountry", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_4(de.tu_bs.cs.isf.mbse.cvclipse.Letter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("attention");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("recipientAttention");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_ATTENTION));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__RECIPIENT_ATTENTION), element));
				out.print(" ");
			}
			printCountingMap.put("recipientAttention", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_5(de.tu_bs.cs.isf.mbse.cvclipse.Letter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("opening");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("opening");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__OPENING));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("opening", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_5_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_5_0(de.tu_bs.cs.isf.mbse.cvclipse.Letter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("opening");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__OPENING));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("opening", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_6(de.tu_bs.cs.isf.mbse.cvclipse.Letter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("text");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("text");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__TEXT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("text", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_6_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_6_0(de.tu_bs.cs.isf.mbse.cvclipse.Letter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("text");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__TEXT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("text", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_7(de.tu_bs.cs.isf.mbse.cvclipse.Letter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("closing");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("closing");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__CLOSING));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("closing", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_7_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_7_0(de.tu_bs.cs.isf.mbse.cvclipse.Letter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("closing");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__CLOSING));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("closing", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_8(de.tu_bs.cs.isf.mbse.cvclipse.Letter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("enclosure");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("enclosure");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__ENCLOSURE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("enclosure", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_8_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Letter_0_8_0(de.tu_bs.cs.isf.mbse.cvclipse.Letter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("enclosure");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LETTER__ENCLOSURE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("enclosure", count - 1);
		}
	}
	
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_CV(de.tu_bs.cs.isf.mbse.cvclipse.CV element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.CV__PICTURE));
		printCountingMap.put("picture", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.CV__BLOCKS));
		printCountingMap.put("blocks", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("cv");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("picture");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("picture");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.CV__PICTURE));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.CV__PICTURE), element));
				out.print(" ");
			}
			printCountingMap.put("picture", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("blocks");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.CV__BLOCKS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("blocks", 0);
		}
	}
	
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock(de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.ITEM_BLOCK__ITEMS));
		printCountingMap.put("items", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.ITEM_BLOCK__TITLE));
		printCountingMap.put("title", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("block");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("title");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("title");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.ITEM_BLOCK__TITLE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("title", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock_1(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock_0(de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("title");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.ITEM_BLOCK__TITLE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("title", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_ItemBlock_1(de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("items");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.ITEM_BLOCK__ITEMS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("items", count - 1);
		}
	}
	
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock(de.tu_bs.cs.isf.mbse.cvclipse.ListBlock element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LIST_BLOCK__ITEMS));
		printCountingMap.put("items", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LIST_BLOCK__TITLE));
		printCountingMap.put("title", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("list");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("title");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("title");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LIST_BLOCK__TITLE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("title", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock_1(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock_0(de.tu_bs.cs.isf.mbse.cvclipse.ListBlock element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("title");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LIST_BLOCK__TITLE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("title", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_ListBlock_1(de.tu_bs.cs.isf.mbse.cvclipse.ListBlock element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("items");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.LIST_BLOCK__ITEMS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("items", count - 1);
		}
	}
	
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem(de.tu_bs.cs.isf.mbse.cvclipse.TextItem element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.TEXT_ITEM__RIGHT_CONTENT));
		printCountingMap.put("rightContent", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.TEXT_ITEM__LEFT_CONTENT));
		printCountingMap.put("leftContent", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rightContent");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.TEXT_ITEM__RIGHT_CONTENT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rightContent", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem_0(de.tu_bs.cs.isf.mbse.cvclipse.TextItem element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem_0_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem_0_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem_0_0(de.tu_bs.cs.isf.mbse.cvclipse.TextItem element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("leftContent");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.TEXT_ITEM__LEFT_CONTENT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("leftContent", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem_0_1(de.tu_bs.cs.isf.mbse.cvclipse.TextItem element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("leftContent");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.TEXT_ITEM__LEFT_CONTENT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("leftContent", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_TextItem_1(de.tu_bs.cs.isf.mbse.cvclipse.TextItem element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rightContent");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.TEXT_ITEM__RIGHT_CONTENT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rightContent", count - 1);
		}
	}
	
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem(de.tu_bs.cs.isf.mbse.cvclipse.DateItem element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE_ITEM__RIGHT_CONTENT));
		printCountingMap.put("rightContent", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE_ITEM__BEGIN));
		printCountingMap.put("begin", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE_ITEM__END));
		printCountingMap.put("end", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("begin");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE_ITEM__BEGIN));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("begin", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rightContent");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE_ITEM__RIGHT_CONTENT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rightContent", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem_0(de.tu_bs.cs.isf.mbse.cvclipse.DateItem element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("-");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("end");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE_ITEM__END));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("end", count - 1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_DateItem_1(de.tu_bs.cs.isf.mbse.cvclipse.DateItem element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rightContent");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE_ITEM__RIGHT_CONTENT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rightContent", count - 1);
		}
	}
	
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Date(de.tu_bs.cs.isf.mbse.cvclipse.Date element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE__DAY));
		printCountingMap.put("day", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE__MONTH));
		printCountingMap.put("month", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE__YEAR));
		printCountingMap.put("year", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("year");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE__YEAR));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("FOUR_DIGIT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE__YEAR), element));
				out.print(" ");
			}
			printCountingMap.put("year", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("/");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("month");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE__MONTH));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("TWO_DIGIT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE__MONTH), element));
				out.print(" ");
			}
			printCountingMap.put("month", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_de_tu_005fbs_cs_isf_mbse_cvclipse_Date_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Date_0(de.tu_bs.cs.isf.mbse.cvclipse.Date element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("/");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("day");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE__DAY));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("TWO_DIGIT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.DATE__DAY), element));
				out.print(" ");
			}
			printCountingMap.put("day", count - 1);
		}
	}
	
	
	public void print_java_util_Map_Entry(de.tu_bs.cs.isf.mbse.cvclipse.impl.LanguageToTextMapEntryImpl element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.getKey();
		printCountingMap.put("key", temp == null ? 0 : 1);
		temp = element.getValue();
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("key");
		if (count > 0) {
			Object o = element.getKey();
			if (o != null) {
			}
			printCountingMap.put("key", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.getValue();
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_de_tu_005fbs_cs_isf_mbse_cvclipse_Text(de.tu_bs.cs.isf.mbse.cvclipse.Text element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.TEXT__CONTENT));
		printCountingMap.put("content", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("content");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.TEXT__CONTENT));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.ICvTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage.TEXT__CONTENT), element));
				out.print(" ");
			}
			printCountingMap.put("content", count - 1);
		}
	}
	
	
}
