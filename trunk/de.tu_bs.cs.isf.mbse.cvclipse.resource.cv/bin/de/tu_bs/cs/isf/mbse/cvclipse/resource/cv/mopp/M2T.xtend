package de.tu_bs.cs.isf.mbse.cvclipse.resource.cv.mopp

import de.tu_bs.cs.isf.mbse.cvclipse.Application
import de.tu_bs.cs.isf.mbse.cvclipse.Language
import de.tu_bs.cs.isf.mbse.cvclipse.ListBlock
import de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock
import de.tu_bs.cs.isf.mbse.cvclipse.TextItem
import de.tu_bs.cs.isf.mbse.cvclipse.DateItem
import java.io.File
import java.io.FileOutputStream
import java.util.List

class M2T {
	def M2T() {
		
	}
	
	// defaults
	String DEFAULT_STYLE = "casual";
	String DEFAULT_COLOR = "blue";
	
	String GERMAN_OPENING = "Sehr geehrte Damen und Herren";
	String ENGLISH_OPENING = "Dear Sir or Madam";
	String FRENCH_OPENING = "Mesdames, Messieurs";
	String SPANISH_OPENING = "Muy señores míos";
	
	String GERMAN_CLOSING = "Mit freundlichen Grüßen";
	String ENGLISH_CLOSING = "Yours sincerly";
	String FRENCH_CLOSING = "Je vous adresse, Madame, Monsieur, mes salutations distinguées";
	String SPANISH_CLOSING = "Le saluda atentamente";
	
	String GERMAN_PERSONAL = "Angaben zur Person";
	String ENGLISH_PERSONAL = "Personal Information";
	String SPANISH_PERSONAL = "Información Personal";
	String FRENCH_PERSONAL = "Information Personelle";
	
	String GERMAN_NATIONALITY = "Staatsangehörigkeit";
	String ENGLISH_NATIONALITY = "Nationality";
	String FRENCH_NATIONALITY = "Nationalité";
	String SPANISH_NATIONALITY = "Nacionalidad";
	
	String GERMAN_BIRTHDATE = "Geburtsdatum";
	String ENGLISH_BIRTHDATE = "Birthdate";
	String SPANISH_BIRTHDATE = "Fecha de Nacimiento";
	String FRENCH_BIRTHDATE = "Date de Naissance";
	
	String GERMAN_BIRTHPLACE = "Geburtsort";
	String ENGLISH_BIRTHPLACE = "Birthplace";
	String SPANISH_BIRTHPLACE = "Lugar de Nacimiento";
	String FRENCH_BIRTHPLACE = "Lieu de Naissance";
	
	String GERMAN_SINCE = "seit";
	String ENGLISH_SINCE = "since";
	String FRENCH_SINCE = "depuis";
	String SPANISH_SINCE = "deste";

		
	ModelLoader m = new ModelLoader();
	Application app;
	List<Language> languages;
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
	
	def String generateContents(Language language) {
		'''
«generateHead(language)»

«generatePersonal(language)»

\setlength{\hintscolumnwidth}{4.5cm}

\begin{document}
«IF app.letter != null»«generateLetter(language)»«ENDIF»
«generateCv(language)»
\end{document}
		'''
	}
	
	def String generateHead(Language language) {
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
	
	def String generatePersonal(Language languages) {
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
	
	def String generateLetter(Language languages) {
		'''
\recipient{«IF app.letter.recipientAttention != null»«app.letter.recipientAttention»«ENDIF»}{«app.letter.recipientCompany»\\«app.letter.recipientStreet»\\«app.letter.recipientCity»«IF app.letter.recipientCountry != null»\\«app.letter.recipientCountry»«ENDIF»}
\date{«IF app.date != null»«app.date»«ELSE»\today«ENDIF»}
\opening{«IF !app.letter.opening.empty»«app.letter.opening.get(languages)»«ELSEIF languages.equals(Language.ENGLISH)»«ENGLISH_OPENING»«ELSEIF languages.equals(Language.GERMAN)»«GERMAN_OPENING»«ELSEIF languages.equals(Language.SPANISH)»«SPANISH_OPENING»«ELSEIF languages.equals(Language.FRENCH)»«FRENCH_OPENING»«ENDIF»,}
\closing{«IF !app.letter.closing.empty»«app.letter.closing.get(languages)»«ELSEIF languages.equals(Language.ENGLISH)»«ENGLISH_CLOSING»«ELSEIF languages.equals(Language.GERMAN)»«GERMAN_CLOSING»«ELSEIF languages.equals(Language.SPANISH)»«SPANISH_CLOSING»«ELSEIF languages.equals(Language.FRENCH)»«FRENCH_CLOSING»«ENDIF»,}
«IF !app.letter.enclosure.empty»\enclosure{«app.letter.enclosure.get(languages)»}«ENDIF»
\makelettertitle
«app.letter.text.get(languages)»

\makeletterclosing
\clearpage
		'''
	}
	
	def String generateCv(Language languages) {
		'''
\makecvtitle
\section{«IF languages.equals(Language.ENGLISH)»«ENGLISH_PERSONAL»«ELSEIF languages.equals(Language.GERMAN)»«GERMAN_PERSONAL»«ELSEIF languages.equals(Language.SPANISH)»«SPANISH_PERSONAL»«ELSEIF languages.equals(Language.FRENCH)»«FRENCH_PERSONAL»«ENDIF»}
«IF !app.personalInformation.nationality.empty»\cvitem{\textbf{«IF languages.equals(Language.ENGLISH)»«ENGLISH_NATIONALITY»«ELSEIF languages.equals(Language.GERMAN)»«GERMAN_NATIONALITY»«ELSEIF languages.equals(Language.SPANISH)»«SPANISH_NATIONALITY»«ELSEIF languages.equals(Language.FRENCH)»«FRENCH_NATIONALITY»«ENDIF»}}{«app.personalInformation.nationality.get(languages)»}«ENDIF»
\cvitem{\textbf{«IF languages.equals(Language.ENGLISH)»«ENGLISH_BIRTHDATE»«ELSEIF languages.equals(Language.GERMAN)»«GERMAN_BIRTHDATE»«ELSEIF languages.equals(Language.SPANISH)»«SPANISH_BIRTHDATE»«ELSEIF languages.equals(Language.FRENCH)»«FRENCH_BIRTHDATE»«ENDIF»}}{«app.personalInformation.birthdate»}
\cvitem{\textbf{«IF languages.equals(Language.ENGLISH)»«ENGLISH_BIRTHPLACE»«ELSEIF languages.equals(Language.GERMAN)»«GERMAN_BIRTHPLACE»«ELSEIF languages.equals(Language.SPANISH)»«SPANISH_BIRTHPLACE»«ELSEIF languages.equals(Language.FRENCH)»«FRENCH_BIRTHPLACE»«ENDIF»}}{«app.personalInformation.birthplace»}
«FOR block : app.cv.blocks»
\section{«block.title.get(languages)»}
«IF block instanceof ListBlock»
«FOR i : 0..(block.items.size-1)»«IF i%2==0»\cvdoubleitem{\textbf{«(block.items.get(i) as TextItem).leftContent.get(languages)»}}{«block.items.get(i).rightContent.get(languages)»}«IF block.items.size>i+1»{\textbf{«(block.items.get(i+1) as TextItem).leftContent.get(languages)»}}{«block.items.get(i+1).rightContent.get(languages)»}«ELSE»{}{}«ENDIF»«ENDIF»«ENDFOR»
«ELSEIF block instanceof ItemBlock»
«FOR item: block.items»
\cvitem{«IF item instanceof TextItem»\textbf{«(item as TextItem).leftContent.get(languages)»}«ENDIF»«IF item instanceof DateItem»«IF (item as DateItem).end != null»«(item as DateItem).begin.toString» -- «(item as DateItem).end.toString»«ELSE»«IF languages.equals(Language.ENGLISH)»«ENGLISH_SINCE»«ELSEIF languages.equals(Language.GERMAN)»«GERMAN_SINCE»«ELSEIF languages.equals(Language.SPANISH)»«SPANISH_SINCE»«ELSEIF languages.equals(Language.FRENCH)»«FRENCH_SINCE»«ENDIF» «(item as DateItem).begin.toString»«ENDIF»«ENDIF»}{«item.rightContent.get(languages)»}
«ENDFOR»
«ENDIF»
«ENDFOR»

\emptysection \closesection \vspace{4cm}
«app.place», «IF app.date != null»«app.date.toString»«ELSE»\today«ENDIF»
		'''
	}	
}