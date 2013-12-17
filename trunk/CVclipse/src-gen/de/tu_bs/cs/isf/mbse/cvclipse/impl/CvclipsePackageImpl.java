/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse.impl;

import de.tu_bs.cs.isf.mbse.cvclipse.Application;
import de.tu_bs.cs.isf.mbse.cvclipse.Block;
import de.tu_bs.cs.isf.mbse.cvclipse.BoldItalicText;
import de.tu_bs.cs.isf.mbse.cvclipse.BoldText;
import de.tu_bs.cs.isf.mbse.cvclipse.Colors;
import de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory;
import de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage;
import de.tu_bs.cs.isf.mbse.cvclipse.Date;
import de.tu_bs.cs.isf.mbse.cvclipse.DateItem;
import de.tu_bs.cs.isf.mbse.cvclipse.EducationBlock;
import de.tu_bs.cs.isf.mbse.cvclipse.HobbyBlock;
import de.tu_bs.cs.isf.mbse.cvclipse.ItalicText;
import de.tu_bs.cs.isf.mbse.cvclipse.Item;
import de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock;
import de.tu_bs.cs.isf.mbse.cvclipse.LanguageBlock;
import de.tu_bs.cs.isf.mbse.cvclipse.Languages;
import de.tu_bs.cs.isf.mbse.cvclipse.Letter;
import de.tu_bs.cs.isf.mbse.cvclipse.LineBreak;
import de.tu_bs.cs.isf.mbse.cvclipse.ListBlock;
import de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation;
import de.tu_bs.cs.isf.mbse.cvclipse.ProfessionalExperienceBlock;
import de.tu_bs.cs.isf.mbse.cvclipse.ProfessionalTrainingBlock;
import de.tu_bs.cs.isf.mbse.cvclipse.Styles;
import de.tu_bs.cs.isf.mbse.cvclipse.Text;
import de.tu_bs.cs.isf.mbse.cvclipse.TextItem;
import de.tu_bs.cs.isf.mbse.cvclipse.TextMap;
import de.tu_bs.cs.isf.mbse.cvclipse.TextMapField;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CvclipsePackageImpl extends EPackageImpl implements CvclipsePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personalInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boldTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass italicTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boldItalicTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass educationBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hobbyBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professionalExperienceBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineBreakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professionalTrainingBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textMapFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languagesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stylesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CvclipsePackageImpl() {
		super(eNS_URI, CvclipseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CvclipsePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CvclipsePackage init() {
		if (isInited) return (CvclipsePackage)EPackage.Registry.INSTANCE.getEPackage(CvclipsePackage.eNS_URI);

		// Obtain or create and register package
		CvclipsePackageImpl theCvclipsePackage = (CvclipsePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CvclipsePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CvclipsePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCvclipsePackage.createPackageContents();

		// Initialize created meta-data
		theCvclipsePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCvclipsePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CvclipsePackage.eNS_URI, theCvclipsePackage);
		return theCvclipsePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCV() {
		return cvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCV_Picture() {
		return (EAttribute)cvEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCV_Blocks() {
		return (EReference)cvEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetter() {
		return letterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetter_Opening() {
		return (EReference)letterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetter_Closing() {
		return (EReference)letterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetter_Enclosure() {
		return (EReference)letterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetter_Text() {
		return (EReference)letterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Cv() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Letter() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Languages() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_PersonalInformation() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Style() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Color() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Place() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Date() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonalInformation() {
		return personalInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalInformation_Twitter() {
		return (EAttribute)personalInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalInformation_Firstname() {
		return (EAttribute)personalInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalInformation_Surname() {
		return (EAttribute)personalInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalInformation_BirthName() {
		return (EAttribute)personalInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalInformation_Birthplace() {
		return (EAttribute)personalInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalInformation_Street() {
		return (EAttribute)personalInformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalInformation_HouseNumber() {
		return (EAttribute)personalInformationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalInformation_Country() {
		return (EAttribute)personalInformationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalInformation_ZipCode() {
		return (EAttribute)personalInformationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalInformation_City() {
		return (EAttribute)personalInformationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalInformation_Email() {
		return (EAttribute)personalInformationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalInformation_Phone() {
		return (EAttribute)personalInformationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalInformation_Mobile() {
		return (EAttribute)personalInformationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalInformation_Fax() {
		return (EAttribute)personalInformationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalInformation_Website() {
		return (EAttribute)personalInformationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalInformation_Github() {
		return (EAttribute)personalInformationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalInformation_LinkedIn() {
		return (EAttribute)personalInformationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonalInformation_MaritalStatus() {
		return (EReference)personalInformationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonalInformation_Nationality() {
		return (EReference)personalInformationEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonalInformation_Birthdate() {
		return (EReference)personalInformationEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Items() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Title() {
		return (EReference)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Content() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoldText() {
		return boldTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItalicText() {
		return italicTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoldItalicText() {
		return boldItalicTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEducationBlock() {
		return educationBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHobbyBlock() {
		return hobbyBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfessionalExperienceBlock() {
		return professionalExperienceBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageBlock() {
		return languageBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemBlock() {
		return itemBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListBlock() {
		return listBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineBreak() {
		return lineBreakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_RightContent() {
		return (EReference)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfessionalTrainingBlock() {
		return professionalTrainingBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateItem() {
		return dateItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateItem_Begin() {
		return (EReference)dateItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateItem_End() {
		return (EReference)dateItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextItem() {
		return textItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextItem_LeftContent() {
		return (EReference)textItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Day() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Month() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Year() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextMapField() {
		return textMapFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextMapField_Key() {
		return (EAttribute)textMapFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextMapField_Value() {
		return (EReference)textMapFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextMap() {
		return textMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextMap_Fields() {
		return (EReference)textMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLanguages() {
		return languagesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStyles() {
		return stylesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColors() {
		return colorsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CvclipseFactory getCvclipseFactory() {
		return (CvclipseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cvEClass = createEClass(CV);
		createEAttribute(cvEClass, CV__PICTURE);
		createEReference(cvEClass, CV__BLOCKS);

		letterEClass = createEClass(LETTER);
		createEReference(letterEClass, LETTER__OPENING);
		createEReference(letterEClass, LETTER__CLOSING);
		createEReference(letterEClass, LETTER__ENCLOSURE);
		createEReference(letterEClass, LETTER__TEXT);

		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__CV);
		createEReference(applicationEClass, APPLICATION__LETTER);
		createEAttribute(applicationEClass, APPLICATION__LANGUAGES);
		createEReference(applicationEClass, APPLICATION__PERSONAL_INFORMATION);
		createEAttribute(applicationEClass, APPLICATION__STYLE);
		createEAttribute(applicationEClass, APPLICATION__COLOR);
		createEAttribute(applicationEClass, APPLICATION__PLACE);
		createEReference(applicationEClass, APPLICATION__DATE);

		personalInformationEClass = createEClass(PERSONAL_INFORMATION);
		createEAttribute(personalInformationEClass, PERSONAL_INFORMATION__TWITTER);
		createEAttribute(personalInformationEClass, PERSONAL_INFORMATION__FIRSTNAME);
		createEAttribute(personalInformationEClass, PERSONAL_INFORMATION__SURNAME);
		createEAttribute(personalInformationEClass, PERSONAL_INFORMATION__BIRTH_NAME);
		createEAttribute(personalInformationEClass, PERSONAL_INFORMATION__BIRTHPLACE);
		createEAttribute(personalInformationEClass, PERSONAL_INFORMATION__STREET);
		createEAttribute(personalInformationEClass, PERSONAL_INFORMATION__HOUSE_NUMBER);
		createEAttribute(personalInformationEClass, PERSONAL_INFORMATION__COUNTRY);
		createEAttribute(personalInformationEClass, PERSONAL_INFORMATION__ZIP_CODE);
		createEAttribute(personalInformationEClass, PERSONAL_INFORMATION__CITY);
		createEAttribute(personalInformationEClass, PERSONAL_INFORMATION__EMAIL);
		createEAttribute(personalInformationEClass, PERSONAL_INFORMATION__PHONE);
		createEAttribute(personalInformationEClass, PERSONAL_INFORMATION__MOBILE);
		createEAttribute(personalInformationEClass, PERSONAL_INFORMATION__FAX);
		createEAttribute(personalInformationEClass, PERSONAL_INFORMATION__WEBSITE);
		createEAttribute(personalInformationEClass, PERSONAL_INFORMATION__GITHUB);
		createEAttribute(personalInformationEClass, PERSONAL_INFORMATION__LINKED_IN);
		createEReference(personalInformationEClass, PERSONAL_INFORMATION__MARITAL_STATUS);
		createEReference(personalInformationEClass, PERSONAL_INFORMATION__NATIONALITY);
		createEReference(personalInformationEClass, PERSONAL_INFORMATION__BIRTHDATE);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__ITEMS);
		createEReference(blockEClass, BLOCK__TITLE);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__CONTENT);

		boldTextEClass = createEClass(BOLD_TEXT);

		italicTextEClass = createEClass(ITALIC_TEXT);

		boldItalicTextEClass = createEClass(BOLD_ITALIC_TEXT);

		educationBlockEClass = createEClass(EDUCATION_BLOCK);

		hobbyBlockEClass = createEClass(HOBBY_BLOCK);

		professionalExperienceBlockEClass = createEClass(PROFESSIONAL_EXPERIENCE_BLOCK);

		languageBlockEClass = createEClass(LANGUAGE_BLOCK);

		itemBlockEClass = createEClass(ITEM_BLOCK);

		listBlockEClass = createEClass(LIST_BLOCK);

		lineBreakEClass = createEClass(LINE_BREAK);

		itemEClass = createEClass(ITEM);
		createEReference(itemEClass, ITEM__RIGHT_CONTENT);

		professionalTrainingBlockEClass = createEClass(PROFESSIONAL_TRAINING_BLOCK);

		dateItemEClass = createEClass(DATE_ITEM);
		createEReference(dateItemEClass, DATE_ITEM__BEGIN);
		createEReference(dateItemEClass, DATE_ITEM__END);

		textItemEClass = createEClass(TEXT_ITEM);
		createEReference(textItemEClass, TEXT_ITEM__LEFT_CONTENT);

		dateEClass = createEClass(DATE);
		createEAttribute(dateEClass, DATE__DAY);
		createEAttribute(dateEClass, DATE__MONTH);
		createEAttribute(dateEClass, DATE__YEAR);

		textMapFieldEClass = createEClass(TEXT_MAP_FIELD);
		createEAttribute(textMapFieldEClass, TEXT_MAP_FIELD__KEY);
		createEReference(textMapFieldEClass, TEXT_MAP_FIELD__VALUE);

		textMapEClass = createEClass(TEXT_MAP);
		createEReference(textMapEClass, TEXT_MAP__FIELDS);

		// Create enums
		languagesEEnum = createEEnum(LANGUAGES);
		stylesEEnum = createEEnum(STYLES);
		colorsEEnum = createEEnum(COLORS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		boldTextEClass.getESuperTypes().add(this.getText());
		italicTextEClass.getESuperTypes().add(this.getText());
		boldItalicTextEClass.getESuperTypes().add(this.getText());
		educationBlockEClass.getESuperTypes().add(this.getItemBlock());
		hobbyBlockEClass.getESuperTypes().add(this.getListBlock());
		professionalExperienceBlockEClass.getESuperTypes().add(this.getItemBlock());
		languageBlockEClass.getESuperTypes().add(this.getItemBlock());
		itemBlockEClass.getESuperTypes().add(this.getBlock());
		listBlockEClass.getESuperTypes().add(this.getBlock());
		lineBreakEClass.getESuperTypes().add(this.getText());
		professionalTrainingBlockEClass.getESuperTypes().add(this.getItemBlock());
		dateItemEClass.getESuperTypes().add(this.getItem());
		textItemEClass.getESuperTypes().add(this.getItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(cvEClass, de.tu_bs.cs.isf.mbse.cvclipse.CV.class, "CV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCV_Picture(), ecorePackage.getEString(), "picture", null, 0, 1, de.tu_bs.cs.isf.mbse.cvclipse.CV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCV_Blocks(), this.getBlock(), null, "blocks", null, 1, -1, de.tu_bs.cs.isf.mbse.cvclipse.CV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(letterEClass, Letter.class, "Letter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLetter_Opening(), this.getTextMap(), null, "opening", null, 1, 1, Letter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLetter_Closing(), this.getTextMap(), null, "closing", null, 1, 1, Letter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLetter_Enclosure(), this.getTextMap(), null, "enclosure", null, 1, 1, Letter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLetter_Text(), this.getTextMap(), null, "text", null, 1, 1, Letter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_Cv(), this.getCV(), null, "cv", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Letter(), this.getLetter(), null, "letter", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Languages(), this.getLanguages(), "languages", null, 1, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_PersonalInformation(), this.getPersonalInformation(), null, "personalInformation", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Style(), this.getStyles(), "style", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Color(), this.getColors(), "color", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Place(), ecorePackage.getEString(), "place", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Date(), this.getDate(), null, "date", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personalInformationEClass, PersonalInformation.class, "PersonalInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonalInformation_Twitter(), ecorePackage.getEString(), "twitter", null, 0, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalInformation_Firstname(), ecorePackage.getEString(), "firstname", null, 1, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalInformation_Surname(), ecorePackage.getEString(), "surname", null, 1, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalInformation_BirthName(), ecorePackage.getEString(), "birthName", null, 0, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalInformation_Birthplace(), ecorePackage.getEString(), "birthplace", null, 1, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalInformation_Street(), ecorePackage.getEString(), "street", null, 1, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalInformation_HouseNumber(), ecorePackage.getEString(), "houseNumber", null, 1, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalInformation_Country(), ecorePackage.getEString(), "country", null, 0, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalInformation_ZipCode(), ecorePackage.getEString(), "zipCode", null, 1, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalInformation_City(), ecorePackage.getEString(), "city", null, 1, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalInformation_Email(), ecorePackage.getEString(), "email", null, 0, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalInformation_Phone(), ecorePackage.getEString(), "phone", null, 0, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalInformation_Mobile(), ecorePackage.getEString(), "mobile", null, 0, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalInformation_Fax(), ecorePackage.getEString(), "fax", null, 0, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalInformation_Website(), ecorePackage.getEString(), "website", null, 0, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalInformation_Github(), ecorePackage.getEString(), "github", null, 0, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalInformation_LinkedIn(), ecorePackage.getEString(), "linkedIn", null, 0, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonalInformation_MaritalStatus(), this.getTextMap(), null, "maritalStatus", null, 0, -1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonalInformation_Nationality(), this.getTextMap(), null, "nationality", null, 0, -1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonalInformation_Birthdate(), this.getDate(), null, "birthdate", null, 1, 1, PersonalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Items(), this.getItem(), null, "items", null, 1, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Title(), this.getTextMap(), null, "title", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Content(), ecorePackage.getEString(), "content", null, 1, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boldTextEClass, BoldText.class, "BoldText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(italicTextEClass, ItalicText.class, "ItalicText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boldItalicTextEClass, BoldItalicText.class, "BoldItalicText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(educationBlockEClass, EducationBlock.class, "EducationBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hobbyBlockEClass, HobbyBlock.class, "HobbyBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(professionalExperienceBlockEClass, ProfessionalExperienceBlock.class, "ProfessionalExperienceBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(languageBlockEClass, LanguageBlock.class, "LanguageBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemBlockEClass, ItemBlock.class, "ItemBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listBlockEClass, ListBlock.class, "ListBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lineBreakEClass, LineBreak.class, "LineBreak", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemEClass, Item.class, "Item", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItem_RightContent(), this.getTextMap(), null, "rightContent", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(professionalTrainingBlockEClass, ProfessionalTrainingBlock.class, "ProfessionalTrainingBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateItemEClass, DateItem.class, "DateItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDateItem_Begin(), this.getDate(), null, "begin", null, 1, 1, DateItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDateItem_End(), this.getDate(), null, "end", null, 0, 1, DateItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textItemEClass, TextItem.class, "TextItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextItem_LeftContent(), this.getTextMap(), null, "leftContent", null, 0, 1, TextItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDate_Day(), ecorePackage.getEInt(), "day", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Month(), ecorePackage.getEInt(), "month", null, 1, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Year(), ecorePackage.getEInt(), "year", null, 1, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textMapFieldEClass, TextMapField.class, "TextMapField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextMapField_Key(), this.getLanguages(), "key", null, 1, 1, TextMapField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextMapField_Value(), this.getText(), null, "value", null, 1, -1, TextMapField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textMapEClass, TextMap.class, "TextMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextMap_Fields(), this.getTextMapField(), null, "fields", null, 0, -1, TextMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(languagesEEnum, Languages.class, "Languages");
		addEEnumLiteral(languagesEEnum, Languages.GERMAN);
		addEEnumLiteral(languagesEEnum, Languages.ENGLISH);
		addEEnumLiteral(languagesEEnum, Languages.FRENCH);
		addEEnumLiteral(languagesEEnum, Languages.ITALIAN);
		addEEnumLiteral(languagesEEnum, Languages.SPANISH);
		addEEnumLiteral(languagesEEnum, Languages.PORTUGUESE);
		addEEnumLiteral(languagesEEnum, Languages.POLISH);
		addEEnumLiteral(languagesEEnum, Languages.CZECH);

		initEEnum(stylesEEnum, Styles.class, "Styles");
		addEEnumLiteral(stylesEEnum, Styles.CASUAL);
		addEEnumLiteral(stylesEEnum, Styles.CLASSIC);
		addEEnumLiteral(stylesEEnum, Styles.OLDSTYLE);
		addEEnumLiteral(stylesEEnum, Styles.BANKING);

		initEEnum(colorsEEnum, Colors.class, "Colors");
		addEEnumLiteral(colorsEEnum, Colors.BLUE);
		addEEnumLiteral(colorsEEnum, Colors.ORANGE);
		addEEnumLiteral(colorsEEnum, Colors.GREEN);
		addEEnumLiteral(colorsEEnum, Colors.RED);
		addEEnumLiteral(colorsEEnum, Colors.PURPLE);
		addEEnumLiteral(colorsEEnum, Colors.GREY);
		addEEnumLiteral(colorsEEnum, Colors.BLACK);

		// Create resource
		createResource(eNS_URI);
	}

} //CvclipsePackageImpl
