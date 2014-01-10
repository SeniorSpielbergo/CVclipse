package de.tu_bs.cs.isf.mbse.cvclipse.validation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;

import de.tu_bs.cs.isf.mbse.cvclipse.Application;
import de.tu_bs.cs.isf.mbse.cvclipse.Block;
import de.tu_bs.cs.isf.mbse.cvclipse.Item;
import de.tu_bs.cs.isf.mbse.cvclipse.Language;
import de.tu_bs.cs.isf.mbse.cvclipse.TextItem;
import de.tu_bs.cs.isf.mbse.cvclipse.Text;
import de.tu_bs.cs.isf.mbse.cvclipse.impl.LanguageToTextMapEntryImpl;

public class LanguagesConsistent extends ModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		EObject target = context.getTarget();
		if (target instanceof Application) {
			Application app = (Application) target;
			List<Language> languages = app.getLanguages();
			Map<EMap<Language, Text>, EObject> maps = new HashMap<EMap<Language, Text>, EObject>();
			maps.put(app.getLetter().getClosing(), app.getLetter());
			maps.put(app.getLetter().getEnclosure(), app.getLetter());
			maps.put(app.getLetter().getOpening(), app.getLetter());
			maps.put(app.getLetter().getText(), app.getLetter());
			maps.put(app.getPersonalInformation().getCountry(), app.getPersonalInformation());
			maps.put(app.getPersonalInformation().getNationality(), app.getPersonalInformation());
			maps.put(app.getPersonalInformation().getMaritalStatus(), app.getPersonalInformation());
			for(Block b : app.getCv().getBlocks()) {
				maps.put(b.getTitle(), b);
				for(Item i : b.getItems()) {
					maps.put(i.getRightContent(), i);
					if(i instanceof TextItem) {
						TextItem t = (TextItem) i;
						maps.put(t.getLeftContent(), t);
					}
				}
			}
			
			for(EMap<Language,Text> map : maps.keySet()) {
				Language missingLanguage = languagesExistInMap(languages, map);
				if(missingLanguage != null) {
					return new ConstraintStatus(this, target, "Language " + missingLanguage.getName() + " is missing.", Collections.singleton(maps.get(map)));
				}
				Language languageTooMuch = languagesDefined(languages, map);
				if(languageTooMuch != null) {
					return new ConstraintStatus(this, target, "Language " + languageTooMuch.getName() + " is missing in head.", Collections.singleton(maps.get(map)));
				}
			}
		}			
		return Status.OK_STATUS;
	}

	private Language languagesExistInMap(List<Language> languages, EMap<Language, Text> map) {
		for(Language language : languages) {
			if(!map.keySet().contains(language)) {
				return language;
			}
		}
		return null;
	}
	
	private Language languagesDefined(List<Language> languages, EMap<Language, Text> map) {
		for(Language language : map.keySet()) {
			if(!languages.contains(language)) {
				return language;
			}
		}
		return null;
	}
}
