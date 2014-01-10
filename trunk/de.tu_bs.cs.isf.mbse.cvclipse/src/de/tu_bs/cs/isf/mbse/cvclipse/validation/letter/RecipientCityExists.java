package de.tu_bs.cs.isf.mbse.cvclipse.validation.letter;

import java.util.Collections;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;

import de.tu_bs.cs.isf.mbse.cvclipse.Letter;
import de.tu_bs.cs.isf.mbse.cvclipse.validation.ModelConstraint;

public class RecipientCityExists extends ModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		EObject target = context.getTarget();
		
		if (target instanceof Letter) {
			Letter letter = (Letter) target;
			
			if (letter.getRecipientCity() == null || letter.getRecipientCity().isEmpty()) {
				return new ConstraintStatus(this, target, "No \"recipientCity\" defined!\nAdd \"recipientCity: <RECIPIENTCITY>\"", Collections.singleton(letter));
			}
		}
		return Status.OK_STATUS;
	}

}
