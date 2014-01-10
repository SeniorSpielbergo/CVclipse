package de.tu_bs.cs.isf.mbse.cvclipse.validation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.model.ConstraintSeverity;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IModelConstraint;
import org.eclipse.emf.validation.service.AbstractConstraintDescriptor;
import org.eclipse.emf.validation.service.IConstraintDescriptor;

import de.tu_bs.cs.isf.mbse.cvclipse.validation.personalinformation.FirstnameExists;

public abstract class ModelConstraint extends AbstractModelConstraint implements IModelConstraint {

	@Override
	public IConstraintDescriptor getDescriptor() {
		return new AbstractConstraintDescriptor() {

			@Override
			public String getBody() {
				return null;
			}

			@Override
			public String getDescription() {
				return "description";
			}

			@Override
			public EvaluationMode<?> getEvaluationMode() {
				return EvaluationMode.BATCH;
			}

			@Override
			public String getId() {
				return null;
			}

			@Override
			public String getMessagePattern() {
				return "message";
			}

			@Override
			public String getName() {
				return "name";
			}

			@Override
			public String getPluginId() {
				return FirstnameExists.class.getPackage().getName();
			}

			@Override
			public ConstraintSeverity getSeverity() {
				return ConstraintSeverity.ERROR;
			}

			@Override
			public int getStatusCode() {
				return 0;
			}

			@Override
			public boolean targetsEvent(Notification arg0) {
				return true;
			}

			@Override
			public boolean targetsTypeOf(EObject arg0) {
				return false;
			}
			
		};
	}

	protected int numberOfOccurences(char searchCharacter, String stringToCheck) {
		int count = 0;
		for (int i = 0; i < stringToCheck.length(); i++) {
			if (stringToCheck.charAt(i) == searchCharacter) {
				count++;
			}
		}
		return count;
	}

}
