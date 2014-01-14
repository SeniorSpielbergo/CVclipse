package de.tu_bs.cs.isf.mbse.cvclipse.validation.personalinformation;

import java.util.Collections;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;

import de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation;
import de.tu_bs.cs.isf.mbse.cvclipse.validation.ModelConstraint;

public class EmailLegal extends ModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		EObject target = context.getTarget();
		if (target instanceof PersonalInformation) {
			PersonalInformation pi = (PersonalInformation) target;
			
			String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
			if (pi.getEmail()!=null && !pi.getEmail().matches(emailreg)) {
				return new ConstraintStatus(this, target, "Not a legal \"email\" address!", Collections.singleton(pi));
			}
		}
		
		return Status.OK_STATUS;
	}

}
