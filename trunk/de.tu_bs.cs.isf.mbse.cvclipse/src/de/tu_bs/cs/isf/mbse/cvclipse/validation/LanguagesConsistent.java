package de.tu_bs.cs.isf.mbse.cvclipse.validation;

import java.util.Collections;
import java.util.List;

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
import de.tu_bs.cs.isf.mbse.cvclipse.Text;
import de.tu_bs.cs.isf.mbse.cvclipse.TextItem;

public class LanguagesConsistent extends ModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		EObject target = context.getTarget();
		if (target instanceof Application) {
			IStatus status;
			Application app = (Application) target;
			List<Language> languages = app.getLanguages();
			if(app.getLetter()!=null) {
				if(!app.getLetter().getClosing().isEmpty()) {
					status = checkMap(app.getLetter().getClosing(), languages, app.getLetter());
					if(status!=Status.OK_STATUS) {
						return status;
					}
				}
				if(!app.getLetter().getEnclosure().isEmpty()) {	
					status = checkMap(app.getLetter().getEnclosure(), languages, app.getLetter());
					if(status!=Status.OK_STATUS) {
						return status;
					}
				}
				if(!app.getLetter().getOpening().isEmpty()) {	
					status = checkMap(app.getLetter().getOpening(), languages, app.getLetter());
					if(status!=Status.OK_STATUS) {
						return status;
					}
				}
				if(!app.getLetter().getText().isEmpty()) {	
					status = checkMap(app.getLetter().getText(), languages, app.getLetter());
					if(status!=Status.OK_STATUS) {
						return status;
					}
				}
			}
			if(!app.getPersonalInformation().getCountry().isEmpty()) {
				status = checkMap(app.getPersonalInformation().getCountry(), languages, app.getPersonalInformation());
				if(status!=Status.OK_STATUS) {
					return status;
				}
			}

			if(!app.getPersonalInformation().getNationality().isEmpty()) {
				status = checkMap(app.getPersonalInformation().getNationality(), languages, app.getPersonalInformation());
				if(status!=Status.OK_STATUS) {
					return status;
				}
			}

			if(!app.getPersonalInformation().getMaritalStatus().isEmpty()) {
				status = checkMap(app.getPersonalInformation().getMaritalStatus(), languages, app.getPersonalInformation());
				if(status!=Status.OK_STATUS) {
					return status;
				}
			}
			for(Block b : app.getCv().getBlocks()) {
				status = checkMap(b.getTitle(), languages, b);
				if(status!=Status.OK_STATUS) {
					return status;
				}
				for(Item i : b.getItems()) {
					status = checkMap(i.getRightContent(), languages, i);
					if(status!=Status.OK_STATUS) {
						return status;
					}
					if(i instanceof TextItem) {
						TextItem t = (TextItem) i;
						status = checkMap(t.getLeftContent(), languages, t);
						if(status!=Status.OK_STATUS) {
							return status;
						}
					}
				}
			}
		}			
		return Status.OK_STATUS;
	}

	private IStatus checkMap(EMap<Language, Text> map, List<Language> languages, EObject target) {
		Language missingLanguage = languagesExistInMap(languages, map);
		if(missingLanguage != null) {
			return new ConstraintStatus(this, target, "Language " + missingLanguage.getName() + " is missing.", Collections.singleton(target));
		}
		Language languageTooMuch = languagesDefined(languages, map);
		if(languageTooMuch != null) {
			return new ConstraintStatus(this, target, "Language " + languageTooMuch.getName() + " is missing in head.", Collections.singleton(target));
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
