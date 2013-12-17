/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse.util;

import de.tu_bs.cs.isf.mbse.cvclipse.*;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage
 * @generated
 */
public class CvclipseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CvclipsePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CvclipseSwitch() {
		if (modelPackage == null) {
			modelPackage = CvclipsePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CvclipsePackage.CV: {
				CV cv = (CV)theEObject;
				T result = caseCV(cv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.LETTER: {
				Letter letter = (Letter)theEObject;
				T result = caseLetter(letter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.PERSONAL_INFORMATION: {
				PersonalInformation personalInformation = (PersonalInformation)theEObject;
				T result = casePersonalInformation(personalInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.BOLD_TEXT: {
				BoldText boldText = (BoldText)theEObject;
				T result = caseBoldText(boldText);
				if (result == null) result = caseText(boldText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.ITALIC_TEXT: {
				ItalicText italicText = (ItalicText)theEObject;
				T result = caseItalicText(italicText);
				if (result == null) result = caseText(italicText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.BOLD_ITALIC_TEXT: {
				BoldItalicText boldItalicText = (BoldItalicText)theEObject;
				T result = caseBoldItalicText(boldItalicText);
				if (result == null) result = caseText(boldItalicText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.EDUCATION_BLOCK: {
				EducationBlock educationBlock = (EducationBlock)theEObject;
				T result = caseEducationBlock(educationBlock);
				if (result == null) result = caseItemBlock(educationBlock);
				if (result == null) result = caseBlock(educationBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.HOBBY_BLOCK: {
				HobbyBlock hobbyBlock = (HobbyBlock)theEObject;
				T result = caseHobbyBlock(hobbyBlock);
				if (result == null) result = caseListBlock(hobbyBlock);
				if (result == null) result = caseBlock(hobbyBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.PROFESSIONAL_EXPERIENCE_BLOCK: {
				ProfessionalExperienceBlock professionalExperienceBlock = (ProfessionalExperienceBlock)theEObject;
				T result = caseProfessionalExperienceBlock(professionalExperienceBlock);
				if (result == null) result = caseItemBlock(professionalExperienceBlock);
				if (result == null) result = caseBlock(professionalExperienceBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.LANGUAGE_BLOCK: {
				LanguageBlock languageBlock = (LanguageBlock)theEObject;
				T result = caseLanguageBlock(languageBlock);
				if (result == null) result = caseItemBlock(languageBlock);
				if (result == null) result = caseBlock(languageBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.ITEM_BLOCK: {
				ItemBlock itemBlock = (ItemBlock)theEObject;
				T result = caseItemBlock(itemBlock);
				if (result == null) result = caseBlock(itemBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.LIST_BLOCK: {
				ListBlock listBlock = (ListBlock)theEObject;
				T result = caseListBlock(listBlock);
				if (result == null) result = caseBlock(listBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.LINE_BREAK: {
				LineBreak lineBreak = (LineBreak)theEObject;
				T result = caseLineBreak(lineBreak);
				if (result == null) result = caseText(lineBreak);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.PROFESSIONAL_TRAINING_BLOCK: {
				ProfessionalTrainingBlock professionalTrainingBlock = (ProfessionalTrainingBlock)theEObject;
				T result = caseProfessionalTrainingBlock(professionalTrainingBlock);
				if (result == null) result = caseItemBlock(professionalTrainingBlock);
				if (result == null) result = caseBlock(professionalTrainingBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.DATE_ITEM: {
				DateItem dateItem = (DateItem)theEObject;
				T result = caseDateItem(dateItem);
				if (result == null) result = caseItem(dateItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.TEXT_ITEM: {
				TextItem textItem = (TextItem)theEObject;
				T result = caseTextItem(textItem);
				if (result == null) result = caseItem(textItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CvclipsePackage.LANGUAGE_TO_TEXT_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<Languages, Text> languageToTextMapEntry = (Map.Entry<Languages, Text>)theEObject;
				T result = caseLanguageToTextMapEntry(languageToTextMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCV(CV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Letter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Letter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetter(Letter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personal Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personal Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonalInformation(PersonalInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bold Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bold Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoldText(BoldText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Italic Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Italic Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItalicText(ItalicText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bold Italic Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bold Italic Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoldItalicText(BoldItalicText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Education Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Education Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEducationBlock(EducationBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hobby Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hobby Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHobbyBlock(HobbyBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Professional Experience Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Professional Experience Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfessionalExperienceBlock(ProfessionalExperienceBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageBlock(LanguageBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemBlock(ItemBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListBlock(ListBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Break</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineBreak(LineBreak object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Professional Training Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Professional Training Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfessionalTrainingBlock(ProfessionalTrainingBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateItem(DateItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextItem(TextItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language To Text Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language To Text Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageToTextMapEntry(Map.Entry<Languages, Text> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CvclipseSwitch
