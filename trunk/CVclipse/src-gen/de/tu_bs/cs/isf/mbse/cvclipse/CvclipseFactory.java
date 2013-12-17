/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage
 * @generated
 */
public interface CvclipseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CvclipseFactory eINSTANCE = de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CV</em>'.
	 * @generated
	 */
	CV createCV();

	/**
	 * Returns a new object of class '<em>Letter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Letter</em>'.
	 * @generated
	 */
	Letter createLetter();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Personal Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personal Information</em>'.
	 * @generated
	 */
	PersonalInformation createPersonalInformation();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Bold Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bold Text</em>'.
	 * @generated
	 */
	BoldText createBoldText();

	/**
	 * Returns a new object of class '<em>Italic Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Italic Text</em>'.
	 * @generated
	 */
	ItalicText createItalicText();

	/**
	 * Returns a new object of class '<em>Bold Italic Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bold Italic Text</em>'.
	 * @generated
	 */
	BoldItalicText createBoldItalicText();

	/**
	 * Returns a new object of class '<em>Education Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Education Block</em>'.
	 * @generated
	 */
	EducationBlock createEducationBlock();

	/**
	 * Returns a new object of class '<em>Hobby Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hobby Block</em>'.
	 * @generated
	 */
	HobbyBlock createHobbyBlock();

	/**
	 * Returns a new object of class '<em>Professional Experience Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professional Experience Block</em>'.
	 * @generated
	 */
	ProfessionalExperienceBlock createProfessionalExperienceBlock();

	/**
	 * Returns a new object of class '<em>Language Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Block</em>'.
	 * @generated
	 */
	LanguageBlock createLanguageBlock();

	/**
	 * Returns a new object of class '<em>Item Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Block</em>'.
	 * @generated
	 */
	ItemBlock createItemBlock();

	/**
	 * Returns a new object of class '<em>List Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Block</em>'.
	 * @generated
	 */
	ListBlock createListBlock();

	/**
	 * Returns a new object of class '<em>Line Break</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Break</em>'.
	 * @generated
	 */
	LineBreak createLineBreak();

	/**
	 * Returns a new object of class '<em>Professional Training Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professional Training Block</em>'.
	 * @generated
	 */
	ProfessionalTrainingBlock createProfessionalTrainingBlock();

	/**
	 * Returns a new object of class '<em>Date Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Item</em>'.
	 * @generated
	 */
	DateItem createDateItem();

	/**
	 * Returns a new object of class '<em>Text Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Item</em>'.
	 * @generated
	 */
	TextItem createTextItem();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CvclipsePackage getCvclipsePackage();

} //CvclipseFactory
