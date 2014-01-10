package de.tu_bs.cs.isf.mbse.cvclipse.validation.letter;

import java.util.Collections;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;

import de.tu_bs.cs.isf.mbse.cvclipse.Application;
import de.tu_bs.cs.isf.mbse.cvclipse.validation.ModelConstraint;

public class LetterExists extends ModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		EObject target = context.getTarget();
		
		if (target instanceof Application) {
			Application application  = (Application) target;
			
			if (application.getLetter() == null) {
				return new ConstraintStatus(this, target, "No \"Letter\" defined!\nAdd \"Add a Letter to your CV\"", Collections.singleton(application));
			}
		}
		return Status.OK_STATUS;
	}

}
