package de.tu_bs.cs.isf.mbse.cvclipse.validation.personalinformation;

import java.util.Collections;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;

import de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation;
import de.tu_bs.cs.isf.mbse.cvclipse.validation.ModelConstraint;

public class TwitterLegal extends ModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		EObject target = context.getTarget();
		if (target instanceof PersonalInformation) {
			PersonalInformation pi = (PersonalInformation) target;
			if (pi.getTwitter().isEmpty() || pi.getTwitter().length() < 2) {
				return new ConstraintStatus(this, target, "Not a legal Twitter address!", Collections.singleton(pi));
			}
			else if (!pi.getTwitter().startsWith("@")) {
				return new ConstraintStatus(this, target, "Not a legal Twitter address!\nIt has to start with an \"@\"!", Collections.singleton(pi));
			}
			else if (numberOfOccurences('@', pi.getTwitter()) != 1) {
				return new ConstraintStatus(this, target, "Not a legal Twitter address!\nOnly one \"@\" is allowed in a Twitter address!", Collections.singleton(pi));
			}
		}
		
		return Status.OK_STATUS;
	}

}
