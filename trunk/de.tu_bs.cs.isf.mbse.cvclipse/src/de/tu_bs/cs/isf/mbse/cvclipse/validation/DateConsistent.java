package de.tu_bs.cs.isf.mbse.cvclipse.validation;

import java.util.Collections;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;

import de.tu_bs.cs.isf.mbse.cvclipse.Date;

public class DateConsistent extends ModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		EObject target = context.getTarget();
		if (target instanceof Date) {
			Date date = (Date) target;

			if (date.getYear() < 0) {
				return new ConstraintStatus(this, target, "Illegal date!\nThe \"year\" must be >= 0!", Collections.singleton(date));
			}
			else if (date.getMonth() < 1) {
				return new ConstraintStatus(this, target, "Illegal date!\nThe \"month\" must be >= 1!", Collections.singleton(date));
			}
			else if (date.getDay() < 1) {
				return new ConstraintStatus(this, target, "Illegal date!\nThe \"day\" must be >= 1!", Collections.singleton(date));
			}
			
			if (date.getMonth() > 12) {
				return new ConstraintStatus(this, target, "Illegal date!\nA \"year\" has only 12 months!", Collections.singleton(date));
			}
			
			IStatus legalDay = isLegalDayOfMonth(date, target); 
			if (!legalDay.equals(Status.OK_STATUS)) {
				return legalDay;
			}
		}

		return Status.OK_STATUS;
	}

	private boolean isLeapYear(int year) {
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			return true;
		} else {
			return false;
		}
	}
	
	private IStatus isLegalDayOfMonth(Date date, EObject target) {
		int day = date.getDay();
		switch (date.getMonth()) {
		case 1:
			return (day <= 31) ? Status.OK_STATUS : new ConstraintStatus(this, target, "Illegal date!\nJanuary only has 31 days!", Collections.singleton(date));
		case 2:
			if (isLeapYear(date.getYear())) {
				return (day <= 29) ? Status.OK_STATUS : new ConstraintStatus(this, target, "Illegal date!\nFebruary of the given year only has 29 days!", Collections.singleton(date));
			}
			else {
				if (day == 29) {
					return new ConstraintStatus(this, target, "Illegal date!\nThe given year \"" + date.getYear() + "\" is not a leap year!", Collections.singleton(date));
				}
				else if (day > 29) {
					return new ConstraintStatus(this, target, "Illegal date!\nFebruary of the given year only has 28 days!", Collections.singleton(date));
				}
				else {
					return Status.OK_STATUS;
				}
			}
		case 3:
			return (day <= 31) ? Status.OK_STATUS : new ConstraintStatus(this, target, "Illegal date!\nMarch only has 31 days!", Collections.singleton(date));
		case 4:
			return (day <= 30) ? Status.OK_STATUS : new ConstraintStatus(this, target, "Illegal date!\nApril only has 30 days!", Collections.singleton(date));
		case 5:
			return (day <= 31) ? Status.OK_STATUS : new ConstraintStatus(this, target, "Illegal date!\nMay only has 31 days!", Collections.singleton(date));
		case 6:
			return (day <= 30) ? Status.OK_STATUS : new ConstraintStatus(this, target, "Illegal date!\nJune only has 30 days!", Collections.singleton(date));
		case 7:
			return (day <= 31) ? Status.OK_STATUS : new ConstraintStatus(this, target, "Illegal date!\nJuly only has 31 days!", Collections.singleton(date));
		case 8:
			return (day <= 31) ? Status.OK_STATUS : new ConstraintStatus(this, target, "Illegal date!\nAugust only has 31 days!", Collections.singleton(date));
		case 9:
			return (day <= 30) ? Status.OK_STATUS : new ConstraintStatus(this, target, "Illegal date!\nSeptember only has 30 days!", Collections.singleton(date));
		case 10:
			return (day <= 31) ? Status.OK_STATUS : new ConstraintStatus(this, target, "Illegal date!\nOktober only has 31 days!", Collections.singleton(date));
		case 11:
			return (day <= 30) ? Status.OK_STATUS : new ConstraintStatus(this, target, "Illegal date!\nNovember only has 30 days!", Collections.singleton(date));
		case 12:
			return (day <= 31) ? Status.OK_STATUS : new ConstraintStatus(this, target, "Illegal date!\nDecember only has 31 days!", Collections.singleton(date));
		}
		
		return Status.OK_STATUS;
	}

}
