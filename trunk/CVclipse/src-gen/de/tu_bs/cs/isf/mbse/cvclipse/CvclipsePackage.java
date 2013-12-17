/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory
 * @model kind="package"
 * @generated
 */
public interface CvclipsePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cvclipse";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.tu-braunschweig.de/isf/cvclipse/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.tu_bs.cs.isf.mbse";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CvclipsePackage eINSTANCE = de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.CVImpl <em>CV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CVImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getCV()
	 * @generated
	 */
	int CV = 0;

	/**
	 * The feature id for the '<em><b>Picture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__PICTURE = 0;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__BLOCKS = 1;

	/**
	 * The number of structural features of the '<em>CV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.LetterImpl <em>Letter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.LetterImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getLetter()
	 * @generated
	 */
	int LETTER = 1;

	/**
	 * The feature id for the '<em><b>Opening</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER__OPENING = 0;

	/**
	 * The feature id for the '<em><b>Closing</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER__CLOSING = 1;

	/**
	 * The feature id for the '<em><b>Enclosure</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER__ENCLOSURE = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER__TEXT = 3;

	/**
	 * The feature id for the '<em><b>Recipient Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER__RECIPIENT_COMPANY = 4;

	/**
	 * The feature id for the '<em><b>Recipient Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER__RECIPIENT_STREET = 5;

	/**
	 * The feature id for the '<em><b>Recipient City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER__RECIPIENT_CITY = 6;

	/**
	 * The feature id for the '<em><b>Recipient Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER__RECIPIENT_COUNTRY = 7;

	/**
	 * The feature id for the '<em><b>Recipient Attention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER__RECIPIENT_ATTENTION = 8;

	/**
	 * The number of structural features of the '<em>Letter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Letter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LETTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.ApplicationImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Cv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CV = 0;

	/**
	 * The feature id for the '<em><b>Letter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__LETTER = 1;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__LANGUAGES = 2;

	/**
	 * The feature id for the '<em><b>Personal Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PERSONAL_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__STYLE = 4;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__COLOR = 5;

	/**
	 * The feature id for the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PLACE = 6;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DATE = 7;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl <em>Personal Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getPersonalInformation()
	 * @generated
	 */
	int PERSONAL_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Twitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__TWITTER = 0;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__FIRSTNAME = 1;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__SURNAME = 2;

	/**
	 * The feature id for the '<em><b>Birth Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__BIRTH_NAME = 3;

	/**
	 * The feature id for the '<em><b>Birthplace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__BIRTHPLACE = 4;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__STREET = 5;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__COUNTRY = 6;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__CITY = 7;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__EMAIL = 8;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__PHONE = 9;

	/**
	 * The feature id for the '<em><b>Mobile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__MOBILE = 10;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__FAX = 11;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__WEBSITE = 12;

	/**
	 * The feature id for the '<em><b>Github</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__GITHUB = 13;

	/**
	 * The feature id for the '<em><b>Linked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__LINKED_IN = 14;

	/**
	 * The feature id for the '<em><b>Marital Status</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__MARITAL_STATUS = 15;

	/**
	 * The feature id for the '<em><b>Nationality</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__NATIONALITY = 16;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__BIRTHDATE = 17;

	/**
	 * The feature id for the '<em><b>Photo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION__PHOTO = 18;

	/**
	 * The number of structural features of the '<em>Personal Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Personal Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.BlockImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TITLE = 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.TextImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getText()
	 * @generated
	 */
	int TEXT = 5;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.BoldTextImpl <em>Bold Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.BoldTextImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getBoldText()
	 * @generated
	 */
	int BOLD_TEXT = 6;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_TEXT__CONTENT = TEXT__CONTENT;

	/**
	 * The number of structural features of the '<em>Bold Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_TEXT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bold Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_TEXT_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ItalicTextImpl <em>Italic Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.ItalicTextImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getItalicText()
	 * @generated
	 */
	int ITALIC_TEXT = 7;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_TEXT__CONTENT = TEXT__CONTENT;

	/**
	 * The number of structural features of the '<em>Italic Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_TEXT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Italic Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_TEXT_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.BoldItalicTextImpl <em>Bold Italic Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.BoldItalicTextImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getBoldItalicText()
	 * @generated
	 */
	int BOLD_ITALIC_TEXT = 8;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_ITALIC_TEXT__CONTENT = TEXT__CONTENT;

	/**
	 * The number of structural features of the '<em>Bold Italic Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_ITALIC_TEXT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bold Italic Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_ITALIC_TEXT_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ItemBlockImpl <em>Item Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.ItemBlockImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getItemBlock()
	 * @generated
	 */
	int ITEM_BLOCK = 13;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_BLOCK__ITEMS = BLOCK__ITEMS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_BLOCK__TITLE = BLOCK__TITLE;

	/**
	 * The number of structural features of the '<em>Item Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Item Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.EducationBlockImpl <em>Education Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.EducationBlockImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getEducationBlock()
	 * @generated
	 */
	int EDUCATION_BLOCK = 9;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_BLOCK__ITEMS = ITEM_BLOCK__ITEMS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_BLOCK__TITLE = ITEM_BLOCK__TITLE;

	/**
	 * The number of structural features of the '<em>Education Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_BLOCK_FEATURE_COUNT = ITEM_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Education Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_BLOCK_OPERATION_COUNT = ITEM_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ListBlockImpl <em>List Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.ListBlockImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getListBlock()
	 * @generated
	 */
	int LIST_BLOCK = 14;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK__ITEMS = BLOCK__ITEMS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK__TITLE = BLOCK__TITLE;

	/**
	 * The number of structural features of the '<em>List Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.HobbyBlockImpl <em>Hobby Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.HobbyBlockImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getHobbyBlock()
	 * @generated
	 */
	int HOBBY_BLOCK = 10;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOBBY_BLOCK__ITEMS = LIST_BLOCK__ITEMS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOBBY_BLOCK__TITLE = LIST_BLOCK__TITLE;

	/**
	 * The number of structural features of the '<em>Hobby Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOBBY_BLOCK_FEATURE_COUNT = LIST_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hobby Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOBBY_BLOCK_OPERATION_COUNT = LIST_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ProfessionalExperienceBlockImpl <em>Professional Experience Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.ProfessionalExperienceBlockImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getProfessionalExperienceBlock()
	 * @generated
	 */
	int PROFESSIONAL_EXPERIENCE_BLOCK = 11;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_EXPERIENCE_BLOCK__ITEMS = ITEM_BLOCK__ITEMS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_EXPERIENCE_BLOCK__TITLE = ITEM_BLOCK__TITLE;

	/**
	 * The number of structural features of the '<em>Professional Experience Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_EXPERIENCE_BLOCK_FEATURE_COUNT = ITEM_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Professional Experience Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_EXPERIENCE_BLOCK_OPERATION_COUNT = ITEM_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.LanguageBlockImpl <em>Language Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.LanguageBlockImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getLanguageBlock()
	 * @generated
	 */
	int LANGUAGE_BLOCK = 12;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_BLOCK__ITEMS = ITEM_BLOCK__ITEMS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_BLOCK__TITLE = ITEM_BLOCK__TITLE;

	/**
	 * The number of structural features of the '<em>Language Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_BLOCK_FEATURE_COUNT = ITEM_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Language Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_BLOCK_OPERATION_COUNT = ITEM_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.LineBreakImpl <em>Line Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.LineBreakImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getLineBreak()
	 * @generated
	 */
	int LINE_BREAK = 15;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__CONTENT = TEXT__CONTENT;

	/**
	 * The number of structural features of the '<em>Line Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.ItemImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 16;

	/**
	 * The feature id for the '<em><b>Right Content</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__RIGHT_CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ProfessionalTrainingBlockImpl <em>Professional Training Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.ProfessionalTrainingBlockImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getProfessionalTrainingBlock()
	 * @generated
	 */
	int PROFESSIONAL_TRAINING_BLOCK = 17;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_TRAINING_BLOCK__ITEMS = ITEM_BLOCK__ITEMS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_TRAINING_BLOCK__TITLE = ITEM_BLOCK__TITLE;

	/**
	 * The number of structural features of the '<em>Professional Training Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_TRAINING_BLOCK_FEATURE_COUNT = ITEM_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Professional Training Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_TRAINING_BLOCK_OPERATION_COUNT = ITEM_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.DateItemImpl <em>Date Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.DateItemImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getDateItem()
	 * @generated
	 */
	int DATE_ITEM = 18;

	/**
	 * The feature id for the '<em><b>Right Content</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ITEM__RIGHT_CONTENT = ITEM__RIGHT_CONTENT;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ITEM__BEGIN = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ITEM__END = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Date Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Date Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.TextItemImpl <em>Text Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.TextItemImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getTextItem()
	 * @generated
	 */
	int TEXT_ITEM = 19;

	/**
	 * The feature id for the '<em><b>Right Content</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ITEM__RIGHT_CONTENT = ITEM__RIGHT_CONTENT;

	/**
	 * The feature id for the '<em><b>Left Content</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ITEM__LEFT_CONTENT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.DateImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getDate()
	 * @generated
	 */
	int DATE = 20;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__DAY = 0;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__MONTH = 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__YEAR = 2;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE___TO_STRING = 0;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.LanguageToTextMapEntryImpl <em>Language To Text Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.LanguageToTextMapEntryImpl
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getLanguageToTextMapEntry()
	 * @generated
	 */
	int LANGUAGE_TO_TEXT_MAP_ENTRY = 21;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TO_TEXT_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TO_TEXT_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Language To Text Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TO_TEXT_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Language To Text Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_TO_TEXT_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Languages <em>Languages</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Languages
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getLanguages()
	 * @generated
	 */
	int LANGUAGES = 22;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Styles <em>Styles</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Styles
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getStyles()
	 * @generated
	 */
	int STYLES = 23;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Colors <em>Colors</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Colors
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getColors()
	 * @generated
	 */
	int COLORS = 24;


	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.CV <em>CV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CV</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CV
	 * @generated
	 */
	EClass getCV();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.CV#getPicture <em>Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Picture</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CV#getPicture()
	 * @see #getCV()
	 * @generated
	 */
	EAttribute getCV_Picture();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.cvclipse.CV#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CV#getBlocks()
	 * @see #getCV()
	 * @generated
	 */
	EReference getCV_Blocks();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter <em>Letter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Letter</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Letter
	 * @generated
	 */
	EClass getLetter();

	/**
	 * Returns the meta object for the map '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getOpening <em>Opening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Opening</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Letter#getOpening()
	 * @see #getLetter()
	 * @generated
	 */
	EReference getLetter_Opening();

	/**
	 * Returns the meta object for the map '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getClosing <em>Closing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Closing</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Letter#getClosing()
	 * @see #getLetter()
	 * @generated
	 */
	EReference getLetter_Closing();

	/**
	 * Returns the meta object for the map '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getEnclosure <em>Enclosure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Enclosure</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Letter#getEnclosure()
	 * @see #getLetter()
	 * @generated
	 */
	EReference getLetter_Enclosure();

	/**
	 * Returns the meta object for the map '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Text</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Letter#getText()
	 * @see #getLetter()
	 * @generated
	 */
	EReference getLetter_Text();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientCompany <em>Recipient Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recipient Company</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientCompany()
	 * @see #getLetter()
	 * @generated
	 */
	EAttribute getLetter_RecipientCompany();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientStreet <em>Recipient Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recipient Street</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientStreet()
	 * @see #getLetter()
	 * @generated
	 */
	EAttribute getLetter_RecipientStreet();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientCity <em>Recipient City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recipient City</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientCity()
	 * @see #getLetter()
	 * @generated
	 */
	EAttribute getLetter_RecipientCity();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientCountry <em>Recipient Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recipient Country</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientCountry()
	 * @see #getLetter()
	 * @generated
	 */
	EAttribute getLetter_RecipientCountry();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientAttention <em>Recipient Attention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recipient Attention</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientAttention()
	 * @see #getLetter()
	 * @generated
	 */
	EAttribute getLetter_RecipientAttention();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getCv <em>Cv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cv</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Application#getCv()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Cv();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getLetter <em>Letter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Letter</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Application#getLetter()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Letter();

	/**
	 * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Languages</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Application#getLanguages()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Languages();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getPersonalInformation <em>Personal Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personal Information</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Application#getPersonalInformation()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_PersonalInformation();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Application#getStyle()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Style();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Application#getColor()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Color();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Place</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Application#getPlace()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Place();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Application#getDate()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Date();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation <em>Personal Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personal Information</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation
	 * @generated
	 */
	EClass getPersonalInformation();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getTwitter <em>Twitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Twitter</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getTwitter()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EAttribute getPersonalInformation_Twitter();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getFirstname()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EAttribute getPersonalInformation_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getSurname()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EAttribute getPersonalInformation_Surname();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getBirthName <em>Birth Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getBirthName()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EAttribute getPersonalInformation_BirthName();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getBirthplace <em>Birthplace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthplace</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getBirthplace()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EAttribute getPersonalInformation_Birthplace();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getStreet()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EAttribute getPersonalInformation_Street();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getCountry()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EAttribute getPersonalInformation_Country();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getCity()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EAttribute getPersonalInformation_City();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getEmail()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EAttribute getPersonalInformation_Email();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getPhone()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EAttribute getPersonalInformation_Phone();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getMobile <em>Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mobile</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getMobile()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EAttribute getPersonalInformation_Mobile();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fax</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getFax()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EAttribute getPersonalInformation_Fax();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getWebsite()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EAttribute getPersonalInformation_Website();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getGithub <em>Github</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Github</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getGithub()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EAttribute getPersonalInformation_Github();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getLinkedIn <em>Linked In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linked In</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getLinkedIn()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EAttribute getPersonalInformation_LinkedIn();

	/**
	 * Returns the meta object for the map '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getMaritalStatus <em>Marital Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Marital Status</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getMaritalStatus()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EReference getPersonalInformation_MaritalStatus();

	/**
	 * Returns the meta object for the map '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getNationality <em>Nationality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Nationality</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getNationality()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EReference getPersonalInformation_Nationality();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Birthdate</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getBirthdate()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EReference getPersonalInformation_Birthdate();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getPhoto <em>Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Photo</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation#getPhoto()
	 * @see #getPersonalInformation()
	 * @generated
	 */
	EAttribute getPersonalInformation_Photo();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.cvclipse.Block#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Block#getItems()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Items();

	/**
	 * Returns the meta object for the map '{@link de.tu_bs.cs.isf.mbse.cvclipse.Block#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Title</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Block#getTitle()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Title();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.Text#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Text#getContent()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Content();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.BoldText <em>Bold Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bold Text</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.BoldText
	 * @generated
	 */
	EClass getBoldText();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.ItalicText <em>Italic Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Italic Text</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.ItalicText
	 * @generated
	 */
	EClass getItalicText();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.BoldItalicText <em>Bold Italic Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bold Italic Text</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.BoldItalicText
	 * @generated
	 */
	EClass getBoldItalicText();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.EducationBlock <em>Education Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Education Block</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.EducationBlock
	 * @generated
	 */
	EClass getEducationBlock();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.HobbyBlock <em>Hobby Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hobby Block</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.HobbyBlock
	 * @generated
	 */
	EClass getHobbyBlock();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.ProfessionalExperienceBlock <em>Professional Experience Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professional Experience Block</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.ProfessionalExperienceBlock
	 * @generated
	 */
	EClass getProfessionalExperienceBlock();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.LanguageBlock <em>Language Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Block</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.LanguageBlock
	 * @generated
	 */
	EClass getLanguageBlock();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock <em>Item Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Block</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.ItemBlock
	 * @generated
	 */
	EClass getItemBlock();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.ListBlock <em>List Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Block</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.ListBlock
	 * @generated
	 */
	EClass getListBlock();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.LineBreak <em>Line Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Break</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.LineBreak
	 * @generated
	 */
	EClass getLineBreak();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the map '{@link de.tu_bs.cs.isf.mbse.cvclipse.Item#getRightContent <em>Right Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Right Content</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Item#getRightContent()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_RightContent();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.ProfessionalTrainingBlock <em>Professional Training Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professional Training Block</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.ProfessionalTrainingBlock
	 * @generated
	 */
	EClass getProfessionalTrainingBlock();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.DateItem <em>Date Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Item</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.DateItem
	 * @generated
	 */
	EClass getDateItem();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.cvclipse.DateItem#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Begin</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.DateItem#getBegin()
	 * @see #getDateItem()
	 * @generated
	 */
	EReference getDateItem_Begin();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.cvclipse.DateItem#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.DateItem#getEnd()
	 * @see #getDateItem()
	 * @generated
	 */
	EReference getDateItem_End();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.TextItem <em>Text Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Item</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.TextItem
	 * @generated
	 */
	EClass getTextItem();

	/**
	 * Returns the meta object for the map '{@link de.tu_bs.cs.isf.mbse.cvclipse.TextItem#getLeftContent <em>Left Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Left Content</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.TextItem#getLeftContent()
	 * @see #getTextItem()
	 * @generated
	 */
	EReference getTextItem_LeftContent();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.cvclipse.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.Date#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Date#getDay()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Day();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.Date#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Date#getMonth()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Month();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.cvclipse.Date#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Date#getYear()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Year();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Date#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Date#toString()
	 * @generated
	 */
	EOperation getDate__ToString();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Language To Text Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language To Text Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="de.tu_bs.cs.isf.mbse.cvclipse.Languages" keyRequired="true"
	 *        valueType="de.tu_bs.cs.isf.mbse.cvclipse.Text" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	EClass getLanguageToTextMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getLanguageToTextMapEntry()
	 * @generated
	 */
	EAttribute getLanguageToTextMapEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getLanguageToTextMapEntry()
	 * @generated
	 */
	EReference getLanguageToTextMapEntry_Value();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.mbse.cvclipse.Languages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Languages</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Languages
	 * @generated
	 */
	EEnum getLanguages();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.mbse.cvclipse.Styles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Styles</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Styles
	 * @generated
	 */
	EEnum getStyles();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.mbse.cvclipse.Colors <em>Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colors</em>'.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Colors
	 * @generated
	 */
	EEnum getColors();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CvclipseFactory getCvclipseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.CVImpl <em>CV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CVImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getCV()
		 * @generated
		 */
		EClass CV = eINSTANCE.getCV();

		/**
		 * The meta object literal for the '<em><b>Picture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CV__PICTURE = eINSTANCE.getCV_Picture();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CV__BLOCKS = eINSTANCE.getCV_Blocks();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.LetterImpl <em>Letter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.LetterImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getLetter()
		 * @generated
		 */
		EClass LETTER = eINSTANCE.getLetter();

		/**
		 * The meta object literal for the '<em><b>Opening</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LETTER__OPENING = eINSTANCE.getLetter_Opening();

		/**
		 * The meta object literal for the '<em><b>Closing</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LETTER__CLOSING = eINSTANCE.getLetter_Closing();

		/**
		 * The meta object literal for the '<em><b>Enclosure</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LETTER__ENCLOSURE = eINSTANCE.getLetter_Enclosure();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LETTER__TEXT = eINSTANCE.getLetter_Text();

		/**
		 * The meta object literal for the '<em><b>Recipient Company</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LETTER__RECIPIENT_COMPANY = eINSTANCE.getLetter_RecipientCompany();

		/**
		 * The meta object literal for the '<em><b>Recipient Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LETTER__RECIPIENT_STREET = eINSTANCE.getLetter_RecipientStreet();

		/**
		 * The meta object literal for the '<em><b>Recipient City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LETTER__RECIPIENT_CITY = eINSTANCE.getLetter_RecipientCity();

		/**
		 * The meta object literal for the '<em><b>Recipient Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LETTER__RECIPIENT_COUNTRY = eINSTANCE.getLetter_RecipientCountry();

		/**
		 * The meta object literal for the '<em><b>Recipient Attention</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LETTER__RECIPIENT_ATTENTION = eINSTANCE.getLetter_RecipientAttention();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.ApplicationImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Cv</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__CV = eINSTANCE.getApplication_Cv();

		/**
		 * The meta object literal for the '<em><b>Letter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__LETTER = eINSTANCE.getApplication_Letter();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__LANGUAGES = eINSTANCE.getApplication_Languages();

		/**
		 * The meta object literal for the '<em><b>Personal Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__PERSONAL_INFORMATION = eINSTANCE.getApplication_PersonalInformation();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__STYLE = eINSTANCE.getApplication_Style();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__COLOR = eINSTANCE.getApplication_Color();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__PLACE = eINSTANCE.getApplication_Place();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__DATE = eINSTANCE.getApplication_Date();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl <em>Personal Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getPersonalInformation()
		 * @generated
		 */
		EClass PERSONAL_INFORMATION = eINSTANCE.getPersonalInformation();

		/**
		 * The meta object literal for the '<em><b>Twitter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFORMATION__TWITTER = eINSTANCE.getPersonalInformation_Twitter();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFORMATION__FIRSTNAME = eINSTANCE.getPersonalInformation_Firstname();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFORMATION__SURNAME = eINSTANCE.getPersonalInformation_Surname();

		/**
		 * The meta object literal for the '<em><b>Birth Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFORMATION__BIRTH_NAME = eINSTANCE.getPersonalInformation_BirthName();

		/**
		 * The meta object literal for the '<em><b>Birthplace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFORMATION__BIRTHPLACE = eINSTANCE.getPersonalInformation_Birthplace();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFORMATION__STREET = eINSTANCE.getPersonalInformation_Street();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFORMATION__COUNTRY = eINSTANCE.getPersonalInformation_Country();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFORMATION__CITY = eINSTANCE.getPersonalInformation_City();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFORMATION__EMAIL = eINSTANCE.getPersonalInformation_Email();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFORMATION__PHONE = eINSTANCE.getPersonalInformation_Phone();

		/**
		 * The meta object literal for the '<em><b>Mobile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFORMATION__MOBILE = eINSTANCE.getPersonalInformation_Mobile();

		/**
		 * The meta object literal for the '<em><b>Fax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFORMATION__FAX = eINSTANCE.getPersonalInformation_Fax();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFORMATION__WEBSITE = eINSTANCE.getPersonalInformation_Website();

		/**
		 * The meta object literal for the '<em><b>Github</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFORMATION__GITHUB = eINSTANCE.getPersonalInformation_Github();

		/**
		 * The meta object literal for the '<em><b>Linked In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFORMATION__LINKED_IN = eINSTANCE.getPersonalInformation_LinkedIn();

		/**
		 * The meta object literal for the '<em><b>Marital Status</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_INFORMATION__MARITAL_STATUS = eINSTANCE.getPersonalInformation_MaritalStatus();

		/**
		 * The meta object literal for the '<em><b>Nationality</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_INFORMATION__NATIONALITY = eINSTANCE.getPersonalInformation_Nationality();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_INFORMATION__BIRTHDATE = eINSTANCE.getPersonalInformation_Birthdate();

		/**
		 * The meta object literal for the '<em><b>Photo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFORMATION__PHOTO = eINSTANCE.getPersonalInformation_Photo();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.BlockImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__ITEMS = eINSTANCE.getBlock_Items();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__TITLE = eINSTANCE.getBlock_Title();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.TextImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__CONTENT = eINSTANCE.getText_Content();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.BoldTextImpl <em>Bold Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.BoldTextImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getBoldText()
		 * @generated
		 */
		EClass BOLD_TEXT = eINSTANCE.getBoldText();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ItalicTextImpl <em>Italic Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.ItalicTextImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getItalicText()
		 * @generated
		 */
		EClass ITALIC_TEXT = eINSTANCE.getItalicText();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.BoldItalicTextImpl <em>Bold Italic Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.BoldItalicTextImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getBoldItalicText()
		 * @generated
		 */
		EClass BOLD_ITALIC_TEXT = eINSTANCE.getBoldItalicText();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.EducationBlockImpl <em>Education Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.EducationBlockImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getEducationBlock()
		 * @generated
		 */
		EClass EDUCATION_BLOCK = eINSTANCE.getEducationBlock();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.HobbyBlockImpl <em>Hobby Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.HobbyBlockImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getHobbyBlock()
		 * @generated
		 */
		EClass HOBBY_BLOCK = eINSTANCE.getHobbyBlock();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ProfessionalExperienceBlockImpl <em>Professional Experience Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.ProfessionalExperienceBlockImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getProfessionalExperienceBlock()
		 * @generated
		 */
		EClass PROFESSIONAL_EXPERIENCE_BLOCK = eINSTANCE.getProfessionalExperienceBlock();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.LanguageBlockImpl <em>Language Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.LanguageBlockImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getLanguageBlock()
		 * @generated
		 */
		EClass LANGUAGE_BLOCK = eINSTANCE.getLanguageBlock();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ItemBlockImpl <em>Item Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.ItemBlockImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getItemBlock()
		 * @generated
		 */
		EClass ITEM_BLOCK = eINSTANCE.getItemBlock();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ListBlockImpl <em>List Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.ListBlockImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getListBlock()
		 * @generated
		 */
		EClass LIST_BLOCK = eINSTANCE.getListBlock();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.LineBreakImpl <em>Line Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.LineBreakImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getLineBreak()
		 * @generated
		 */
		EClass LINE_BREAK = eINSTANCE.getLineBreak();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.ItemImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Right Content</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__RIGHT_CONTENT = eINSTANCE.getItem_RightContent();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ProfessionalTrainingBlockImpl <em>Professional Training Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.ProfessionalTrainingBlockImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getProfessionalTrainingBlock()
		 * @generated
		 */
		EClass PROFESSIONAL_TRAINING_BLOCK = eINSTANCE.getProfessionalTrainingBlock();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.DateItemImpl <em>Date Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.DateItemImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getDateItem()
		 * @generated
		 */
		EClass DATE_ITEM = eINSTANCE.getDateItem();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_ITEM__BEGIN = eINSTANCE.getDateItem_Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_ITEM__END = eINSTANCE.getDateItem_End();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.TextItemImpl <em>Text Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.TextItemImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getTextItem()
		 * @generated
		 */
		EClass TEXT_ITEM = eINSTANCE.getTextItem();

		/**
		 * The meta object literal for the '<em><b>Left Content</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_ITEM__LEFT_CONTENT = eINSTANCE.getTextItem_LeftContent();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.DateImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__DAY = eINSTANCE.getDate_Day();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__MONTH = eINSTANCE.getDate_Month();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__YEAR = eINSTANCE.getDate_Year();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATE___TO_STRING = eINSTANCE.getDate__ToString();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.LanguageToTextMapEntryImpl <em>Language To Text Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.LanguageToTextMapEntryImpl
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getLanguageToTextMapEntry()
		 * @generated
		 */
		EClass LANGUAGE_TO_TEXT_MAP_ENTRY = eINSTANCE.getLanguageToTextMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_TO_TEXT_MAP_ENTRY__KEY = eINSTANCE.getLanguageToTextMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE_TO_TEXT_MAP_ENTRY__VALUE = eINSTANCE.getLanguageToTextMapEntry_Value();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Languages <em>Languages</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.Languages
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getLanguages()
		 * @generated
		 */
		EEnum LANGUAGES = eINSTANCE.getLanguages();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Styles <em>Styles</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.Styles
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getStyles()
		 * @generated
		 */
		EEnum STYLES = eINSTANCE.getStyles();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Colors <em>Colors</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.Colors
		 * @see de.tu_bs.cs.isf.mbse.cvclipse.impl.CvclipsePackageImpl#getColors()
		 * @generated
		 */
		EEnum COLORS = eINSTANCE.getColors();

	}

} //CvclipsePackage
