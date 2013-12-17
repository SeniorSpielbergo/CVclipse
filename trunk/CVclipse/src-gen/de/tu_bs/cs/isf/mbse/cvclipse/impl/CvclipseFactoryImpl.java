/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse.impl;

import de.tu_bs.cs.isf.mbse.cvclipse.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CvclipseFactoryImpl extends EFactoryImpl implements CvclipseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CvclipseFactory init() {
		try {
			CvclipseFactory theCvclipseFactory = (CvclipseFactory)EPackage.Registry.INSTANCE.getEFactory(CvclipsePackage.eNS_URI);
			if (theCvclipseFactory != null) {
				return theCvclipseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CvclipseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CvclipseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CvclipsePackage.CV: return createCV();
			case CvclipsePackage.LETTER: return createLetter();
			case CvclipsePackage.APPLICATION: return createApplication();
			case CvclipsePackage.PERSONAL_INFORMATION: return createPersonalInformation();
			case CvclipsePackage.TEXT: return createText();
			case CvclipsePackage.BOLD_TEXT: return createBoldText();
			case CvclipsePackage.ITALIC_TEXT: return createItalicText();
			case CvclipsePackage.BOLD_ITALIC_TEXT: return createBoldItalicText();
			case CvclipsePackage.EDUCATION_BLOCK: return createEducationBlock();
			case CvclipsePackage.HOBBY_BLOCK: return createHobbyBlock();
			case CvclipsePackage.PROFESSIONAL_EXPERIENCE_BLOCK: return createProfessionalExperienceBlock();
			case CvclipsePackage.LANGUAGE_BLOCK: return createLanguageBlock();
			case CvclipsePackage.ITEM_BLOCK: return createItemBlock();
			case CvclipsePackage.LIST_BLOCK: return createListBlock();
			case CvclipsePackage.LINE_BREAK: return createLineBreak();
			case CvclipsePackage.PROFESSIONAL_TRAINING_BLOCK: return createProfessionalTrainingBlock();
			case CvclipsePackage.DATE_ITEM: return createDateItem();
			case CvclipsePackage.TEXT_ITEM: return createTextItem();
			case CvclipsePackage.DATE: return createDate();
			case CvclipsePackage.LANGUAGE_TO_TEXT_MAP_ENTRY: return (EObject)createLanguageToTextMapEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CvclipsePackage.LANGUAGES:
				return createLanguagesFromString(eDataType, initialValue);
			case CvclipsePackage.STYLES:
				return createStylesFromString(eDataType, initialValue);
			case CvclipsePackage.COLORS:
				return createColorsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CvclipsePackage.LANGUAGES:
				return convertLanguagesToString(eDataType, instanceValue);
			case CvclipsePackage.STYLES:
				return convertStylesToString(eDataType, instanceValue);
			case CvclipsePackage.COLORS:
				return convertColorsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CV createCV() {
		CVImpl cv = new CVImpl();
		return cv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Letter createLetter() {
		LetterImpl letter = new LetterImpl();
		return letter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalInformation createPersonalInformation() {
		PersonalInformationImpl personalInformation = new PersonalInformationImpl();
		return personalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoldText createBoldText() {
		BoldTextImpl boldText = new BoldTextImpl();
		return boldText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItalicText createItalicText() {
		ItalicTextImpl italicText = new ItalicTextImpl();
		return italicText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoldItalicText createBoldItalicText() {
		BoldItalicTextImpl boldItalicText = new BoldItalicTextImpl();
		return boldItalicText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EducationBlock createEducationBlock() {
		EducationBlockImpl educationBlock = new EducationBlockImpl();
		return educationBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HobbyBlock createHobbyBlock() {
		HobbyBlockImpl hobbyBlock = new HobbyBlockImpl();
		return hobbyBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfessionalExperienceBlock createProfessionalExperienceBlock() {
		ProfessionalExperienceBlockImpl professionalExperienceBlock = new ProfessionalExperienceBlockImpl();
		return professionalExperienceBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageBlock createLanguageBlock() {
		LanguageBlockImpl languageBlock = new LanguageBlockImpl();
		return languageBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemBlock createItemBlock() {
		ItemBlockImpl itemBlock = new ItemBlockImpl();
		return itemBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListBlock createListBlock() {
		ListBlockImpl listBlock = new ListBlockImpl();
		return listBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineBreak createLineBreak() {
		LineBreakImpl lineBreak = new LineBreakImpl();
		return lineBreak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfessionalTrainingBlock createProfessionalTrainingBlock() {
		ProfessionalTrainingBlockImpl professionalTrainingBlock = new ProfessionalTrainingBlockImpl();
		return professionalTrainingBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateItem createDateItem() {
		DateItemImpl dateItem = new DateItemImpl();
		return dateItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextItem createTextItem() {
		TextItemImpl textItem = new TextItemImpl();
		return textItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Languages, Text> createLanguageToTextMapEntry() {
		LanguageToTextMapEntryImpl languageToTextMapEntry = new LanguageToTextMapEntryImpl();
		return languageToTextMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Languages createLanguagesFromString(EDataType eDataType, String initialValue) {
		Languages result = Languages.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguagesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Styles createStylesFromString(EDataType eDataType, String initialValue) {
		Styles result = Styles.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStylesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colors createColorsFromString(EDataType eDataType, String initialValue) {
		Colors result = Colors.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CvclipsePackage getCvclipsePackage() {
		return (CvclipsePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CvclipsePackage getPackage() {
		return CvclipsePackage.eINSTANCE;
	}

} //CvclipseFactoryImpl
