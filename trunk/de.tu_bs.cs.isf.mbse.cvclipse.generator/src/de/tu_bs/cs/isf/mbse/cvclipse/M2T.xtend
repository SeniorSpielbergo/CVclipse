package de.tu_bs.cs.isf.mbse.cvclipse

import java.io.File
import java.io.FileOutputStream
import java.util.List

class M2T {
	// defaults
	String DEFAULT_STYLE = "casual";
	String DEFAULT_COLOR = "blue";
	
	ModelLoader m = new ModelLoader();
	Application app;
	List<Languages> languages;
	File targetFile;
	FileOutputStream streamy;
	String output;
	
	def generate(String folder, String fileName) {
		app = m.loadModel(folder, fileName);
		languages = app.languages;
		for(l : languages) {
			targetFile = new File(folder + File.separator + fileName + "_" + l.getName().toLowerCase + ".tex");
			targetFile.createNewFile();
			streamy = new FileOutputStream(targetFile);
			output = generateContents(l).replaceAll("\"", "");
			streamy.write(output.getBytes());
			streamy.close();
		}
		
	}
	
	def String generateContents(Languages language) {
		'''
«generateHead(language)»

«generatePersonal(language)»
		'''
	}
	
	def String generateHead(Languages language) {
'''
\documentclass[12pt,a4paper,sans]{moderncv}

\usepackage[utf8]{inputenc}
\usepackage[T1]{fontenc}
\usepackage[«language.literal»]{babel}
\usepackage[scale=0.75]{geometry}

\moderncvstyle{«IF app.getStyle() == null»«DEFAULT_STYLE»«ELSE»«app.getStyle.getLiteral()»«ENDIF»}
\moderncvcolor{«IF app.getColor() == null»«DEFAULT_COLOR»«ELSE»«app.getColor.getLiteral()»«ENDIF»}
'''
	}
	
	def String generatePersonal(Languages languages) {
'''
\name{«app.personalInformation.firstname»}{«app.personalInformation.surname»}
\address{«app.personalInformation.street»}{«app.personalInformation.city»}
«IF app.personalInformation.phone != null»\phone[fixed]{«app.personalInformation.phone»}«ENDIF»
«IF app.personalInformation.mobile != null»\phone[mobile]{«app.personalInformation.mobile»}«ENDIF»
«IF app.personalInformation.fax != null»\phone[fax]{«app.personalInformation.fax»}«ENDIF»
«IF app.personalInformation.email != null»\email{«app.personalInformation.email»}«ENDIF»
«IF app.personalInformation.website != null»\homepage{«app.personalInformation.website»}«ENDIF»
«IF app.personalInformation.linkedIn != null»\social[linkedin]{«app.personalInformation.linkedIn»}«ENDIF»
«IF app.personalInformation.twitter != null»\social[twitter]{«app.personalInformation.twitter»}«ENDIF»
«IF app.personalInformation.github != null»\social[github]{«app.personalInformation.github»}«ENDIF»
«IF app.cv.picture != null»\photo[64pt][0.4pt]{«app.cv.picture»}«ENDIF»
'''
	}
}