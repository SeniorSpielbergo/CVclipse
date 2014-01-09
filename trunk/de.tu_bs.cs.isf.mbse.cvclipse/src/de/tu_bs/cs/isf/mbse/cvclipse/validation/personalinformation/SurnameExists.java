package de.tu_bs.cs.isf.mbse.cvclipse.validation.personalinformation;

import java.util.Collections;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;

import de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation;
import de.tu_bs.cs.isf.mbse.cvclipse.validation.ModelConstraint;

public class SurnameExists extends ModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		EObject target = context.getTarget();
		if (target instanceof PersonalInformation) {
			PersonalInformation pi = (PersonalInformation) target;
			
			if (pi.getSurname() == null || pi.getSurname().isEmpty()) {
				return new ConstraintStatus(this, target, "No \"surname\" defined!", Collections.singleton(pi));
			}
		}
		
		return Status.OK_STATUS;
	}

}
