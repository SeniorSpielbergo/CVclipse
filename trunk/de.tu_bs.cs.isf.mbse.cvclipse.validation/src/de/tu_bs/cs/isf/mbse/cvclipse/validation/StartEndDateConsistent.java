package de.tu_bs.cs.isf.mbse.cvclipse.validation;

import java.util.Collections;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;

import de.tu_bs.cs.isf.mbse.cvclipse.Date;
import de.tu_bs.cs.isf.mbse.cvclipse.DateItem;

public class StartEndDateConsistent extends ModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		EObject target = context.getTarget();
		if (target instanceof DateItem) {
			DateItem di = (DateItem) target;
			
			Date startDate = di.getBegin();
			Date endDate = di.getEnd();

			boolean sameYear = false;
			boolean sameMonth = false;
			if (endDate != null) {
				if (startDate.getYear() <= endDate.getYear()) {
					if (startDate.getYear() == endDate.getYear()) {
						sameYear = true;
					}
					if (sameYear && startDate.getMonth() > endDate.getMonth()) {
						return new ConstraintStatus(this, target, "Illegal time interval!\nThe start month is after the end month!", Collections.singleton(startDate));
					}
					else {
						if (startDate.getMonth() == endDate.getMonth()) {
							sameMonth = true;
						}
						if (sameYear && sameMonth && startDate.getDay() != 0 && endDate.getDay() != 0) {
							if (startDate.getDay() > endDate.getDay()) {
								return new ConstraintStatus(this, target, "Illegal time interval!\nThe start day is after the end day!", Collections.singleton(startDate));
							}
						}
					}
				}
				else {
					return new ConstraintStatus(this, target, "Illegal time interval!\nThe start year is after the end year!", Collections.singleton(startDate));
				}
			}
		}
		
		return Status.OK_STATUS;
	}

}
