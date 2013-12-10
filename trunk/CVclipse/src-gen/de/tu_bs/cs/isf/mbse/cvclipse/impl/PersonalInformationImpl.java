/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse.impl;

import de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage;
import de.tu_bs.cs.isf.mbse.cvclipse.Date;
import de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation;
import de.tu_bs.cs.isf.mbse.cvclipse.TextMap;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personal Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getTwitter <em>Twitter</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getBirthName <em>Birth Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getBirthplace <em>Birthplace</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getHouseNumber <em>House Number</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getZipCode <em>Zip Code</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getCity <em>City</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getMobile <em>Mobile</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getWebsite <em>Website</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getGithub <em>Github</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getLinkedIn <em>Linked In</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getMaritalStatus <em>Marital Status</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getNationality <em>Nationality</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.PersonalInformationImpl#getBirthdate <em>Birthdate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonalInformationImpl extends MinimalEObjectImpl.Container implements PersonalInformation {
	/**
	 * The default value of the '{@link #getTwitter() <em>Twitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTwitter()
	 * @generated
	 * @ordered
	 */
	protected static final String TWITTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTwitter() <em>Twitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTwitter()
	 * @generated
	 * @ordered
	 */
	protected String twitter = TWITTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected static final String SURNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected String surname = SURNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthName() <em>Birth Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthName()
	 * @generated
	 * @ordered
	 */
	protected static final String BIRTH_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthName() <em>Birth Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthName()
	 * @generated
	 * @ordered
	 */
	protected String birthName = BIRTH_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthplace() <em>Birthplace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthplace()
	 * @generated
	 * @ordered
	 */
	protected static final String BIRTHPLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthplace() <em>Birthplace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthplace()
	 * @generated
	 * @ordered
	 */
	protected String birthplace = BIRTHPLACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseNumber() <em>House Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseNumber() <em>House Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseNumber()
	 * @generated
	 * @ordered
	 */
	protected String houseNumber = HOUSE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getZipCode() <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIP_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZipCode() <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipCode()
	 * @generated
	 * @ordered
	 */
	protected String zipCode = ZIP_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected String phone = PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMobile() <em>Mobile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobile()
	 * @generated
	 * @ordered
	 */
	protected static final String MOBILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMobile() <em>Mobile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobile()
	 * @generated
	 * @ordered
	 */
	protected String mobile = MOBILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected static final String FAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected String fax = FAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected String website = WEBSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGithub() <em>Github</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGithub()
	 * @generated
	 * @ordered
	 */
	protected static final String GITHUB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGithub() <em>Github</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGithub()
	 * @generated
	 * @ordered
	 */
	protected String github = GITHUB_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkedIn() <em>Linked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedIn()
	 * @generated
	 * @ordered
	 */
	protected static final String LINKED_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkedIn() <em>Linked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedIn()
	 * @generated
	 * @ordered
	 */
	protected String linkedIn = LINKED_IN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMaritalStatus() <em>Marital Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaritalStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<TextMap> maritalStatus;

	/**
	 * The cached value of the '{@link #getNationality() <em>Nationality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationality()
	 * @generated
	 * @ordered
	 */
	protected EList<TextMap> nationality;

	/**
	 * The cached value of the '{@link #getBirthdate() <em>Birthdate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected Date birthdate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonalInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvclipsePackage.Literals.PERSONAL_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTwitter() {
		return twitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTwitter(String newTwitter) {
		String oldTwitter = twitter;
		twitter = newTwitter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__TWITTER, oldTwitter, twitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__FIRSTNAME, oldFirstname, firstname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurname(String newSurname) {
		String oldSurname = surname;
		surname = newSurname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__SURNAME, oldSurname, surname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBirthName() {
		return birthName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthName(String newBirthName) {
		String oldBirthName = birthName;
		birthName = newBirthName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__BIRTH_NAME, oldBirthName, birthName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBirthplace() {
		return birthplace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthplace(String newBirthplace) {
		String oldBirthplace = birthplace;
		birthplace = newBirthplace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__BIRTHPLACE, oldBirthplace, birthplace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreet(String newStreet) {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__STREET, oldStreet, street));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseNumber(String newHouseNumber) {
		String oldHouseNumber = houseNumber;
		houseNumber = newHouseNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__HOUSE_NUMBER, oldHouseNumber, houseNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZipCode(String newZipCode) {
		String oldZipCode = zipCode;
		zipCode = newZipCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__ZIP_CODE, oldZipCode, zipCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(String newPhone) {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobile(String newMobile) {
		String oldMobile = mobile;
		mobile = newMobile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__MOBILE, oldMobile, mobile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFax(String newFax) {
		String oldFax = fax;
		fax = newFax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__FAX, oldFax, fax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsite(String newWebsite) {
		String oldWebsite = website;
		website = newWebsite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__WEBSITE, oldWebsite, website));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGithub() {
		return github;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGithub(String newGithub) {
		String oldGithub = github;
		github = newGithub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__GITHUB, oldGithub, github));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkedIn() {
		return linkedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedIn(String newLinkedIn) {
		String oldLinkedIn = linkedIn;
		linkedIn = newLinkedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__LINKED_IN, oldLinkedIn, linkedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextMap> getMaritalStatus() {
		if (maritalStatus == null) {
			maritalStatus = new EObjectContainmentEList<TextMap>(TextMap.class, this, CvclipsePackage.PERSONAL_INFORMATION__MARITAL_STATUS);
		}
		return maritalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextMap> getNationality() {
		if (nationality == null) {
			nationality = new EObjectContainmentEList<TextMap>(TextMap.class, this, CvclipsePackage.PERSONAL_INFORMATION__NATIONALITY);
		}
		return nationality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthdate() {
		return birthdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBirthdate(Date newBirthdate, NotificationChain msgs) {
		Date oldBirthdate = birthdate;
		birthdate = newBirthdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__BIRTHDATE, oldBirthdate, newBirthdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthdate(Date newBirthdate) {
		if (newBirthdate != birthdate) {
			NotificationChain msgs = null;
			if (birthdate != null)
				msgs = ((InternalEObject)birthdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.PERSONAL_INFORMATION__BIRTHDATE, null, msgs);
			if (newBirthdate != null)
				msgs = ((InternalEObject)newBirthdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.PERSONAL_INFORMATION__BIRTHDATE, null, msgs);
			msgs = basicSetBirthdate(newBirthdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.PERSONAL_INFORMATION__BIRTHDATE, newBirthdate, newBirthdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvclipsePackage.PERSONAL_INFORMATION__MARITAL_STATUS:
				return ((InternalEList<?>)getMaritalStatus()).basicRemove(otherEnd, msgs);
			case CvclipsePackage.PERSONAL_INFORMATION__NATIONALITY:
				return ((InternalEList<?>)getNationality()).basicRemove(otherEnd, msgs);
			case CvclipsePackage.PERSONAL_INFORMATION__BIRTHDATE:
				return basicSetBirthdate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CvclipsePackage.PERSONAL_INFORMATION__TWITTER:
				return getTwitter();
			case CvclipsePackage.PERSONAL_INFORMATION__FIRSTNAME:
				return getFirstname();
			case CvclipsePackage.PERSONAL_INFORMATION__SURNAME:
				return getSurname();
			case CvclipsePackage.PERSONAL_INFORMATION__BIRTH_NAME:
				return getBirthName();
			case CvclipsePackage.PERSONAL_INFORMATION__BIRTHPLACE:
				return getBirthplace();
			case CvclipsePackage.PERSONAL_INFORMATION__STREET:
				return getStreet();
			case CvclipsePackage.PERSONAL_INFORMATION__HOUSE_NUMBER:
				return getHouseNumber();
			case CvclipsePackage.PERSONAL_INFORMATION__COUNTRY:
				return getCountry();
			case CvclipsePackage.PERSONAL_INFORMATION__ZIP_CODE:
				return getZipCode();
			case CvclipsePackage.PERSONAL_INFORMATION__CITY:
				return getCity();
			case CvclipsePackage.PERSONAL_INFORMATION__EMAIL:
				return getEmail();
			case CvclipsePackage.PERSONAL_INFORMATION__PHONE:
				return getPhone();
			case CvclipsePackage.PERSONAL_INFORMATION__MOBILE:
				return getMobile();
			case CvclipsePackage.PERSONAL_INFORMATION__FAX:
				return getFax();
			case CvclipsePackage.PERSONAL_INFORMATION__WEBSITE:
				return getWebsite();
			case CvclipsePackage.PERSONAL_INFORMATION__GITHUB:
				return getGithub();
			case CvclipsePackage.PERSONAL_INFORMATION__LINKED_IN:
				return getLinkedIn();
			case CvclipsePackage.PERSONAL_INFORMATION__MARITAL_STATUS:
				return getMaritalStatus();
			case CvclipsePackage.PERSONAL_INFORMATION__NATIONALITY:
				return getNationality();
			case CvclipsePackage.PERSONAL_INFORMATION__BIRTHDATE:
				return getBirthdate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CvclipsePackage.PERSONAL_INFORMATION__TWITTER:
				setTwitter((String)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__FIRSTNAME:
				setFirstname((String)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__SURNAME:
				setSurname((String)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__BIRTH_NAME:
				setBirthName((String)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__BIRTHPLACE:
				setBirthplace((String)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__STREET:
				setStreet((String)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__HOUSE_NUMBER:
				setHouseNumber((String)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__COUNTRY:
				setCountry((String)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__ZIP_CODE:
				setZipCode((String)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__CITY:
				setCity((String)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__EMAIL:
				setEmail((String)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__PHONE:
				setPhone((String)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__MOBILE:
				setMobile((String)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__FAX:
				setFax((String)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__WEBSITE:
				setWebsite((String)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__GITHUB:
				setGithub((String)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__LINKED_IN:
				setLinkedIn((String)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__MARITAL_STATUS:
				getMaritalStatus().clear();
				getMaritalStatus().addAll((Collection<? extends TextMap>)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__NATIONALITY:
				getNationality().clear();
				getNationality().addAll((Collection<? extends TextMap>)newValue);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__BIRTHDATE:
				setBirthdate((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CvclipsePackage.PERSONAL_INFORMATION__TWITTER:
				setTwitter(TWITTER_EDEFAULT);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__FIRSTNAME:
				setFirstname(FIRSTNAME_EDEFAULT);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__SURNAME:
				setSurname(SURNAME_EDEFAULT);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__BIRTH_NAME:
				setBirthName(BIRTH_NAME_EDEFAULT);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__BIRTHPLACE:
				setBirthplace(BIRTHPLACE_EDEFAULT);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__HOUSE_NUMBER:
				setHouseNumber(HOUSE_NUMBER_EDEFAULT);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__ZIP_CODE:
				setZipCode(ZIP_CODE_EDEFAULT);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__MOBILE:
				setMobile(MOBILE_EDEFAULT);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__FAX:
				setFax(FAX_EDEFAULT);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__WEBSITE:
				setWebsite(WEBSITE_EDEFAULT);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__GITHUB:
				setGithub(GITHUB_EDEFAULT);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__LINKED_IN:
				setLinkedIn(LINKED_IN_EDEFAULT);
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__MARITAL_STATUS:
				getMaritalStatus().clear();
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__NATIONALITY:
				getNationality().clear();
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__BIRTHDATE:
				setBirthdate((Date)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CvclipsePackage.PERSONAL_INFORMATION__TWITTER:
				return TWITTER_EDEFAULT == null ? twitter != null : !TWITTER_EDEFAULT.equals(twitter);
			case CvclipsePackage.PERSONAL_INFORMATION__FIRSTNAME:
				return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
			case CvclipsePackage.PERSONAL_INFORMATION__SURNAME:
				return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
			case CvclipsePackage.PERSONAL_INFORMATION__BIRTH_NAME:
				return BIRTH_NAME_EDEFAULT == null ? birthName != null : !BIRTH_NAME_EDEFAULT.equals(birthName);
			case CvclipsePackage.PERSONAL_INFORMATION__BIRTHPLACE:
				return BIRTHPLACE_EDEFAULT == null ? birthplace != null : !BIRTHPLACE_EDEFAULT.equals(birthplace);
			case CvclipsePackage.PERSONAL_INFORMATION__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case CvclipsePackage.PERSONAL_INFORMATION__HOUSE_NUMBER:
				return HOUSE_NUMBER_EDEFAULT == null ? houseNumber != null : !HOUSE_NUMBER_EDEFAULT.equals(houseNumber);
			case CvclipsePackage.PERSONAL_INFORMATION__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case CvclipsePackage.PERSONAL_INFORMATION__ZIP_CODE:
				return ZIP_CODE_EDEFAULT == null ? zipCode != null : !ZIP_CODE_EDEFAULT.equals(zipCode);
			case CvclipsePackage.PERSONAL_INFORMATION__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case CvclipsePackage.PERSONAL_INFORMATION__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case CvclipsePackage.PERSONAL_INFORMATION__PHONE:
				return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
			case CvclipsePackage.PERSONAL_INFORMATION__MOBILE:
				return MOBILE_EDEFAULT == null ? mobile != null : !MOBILE_EDEFAULT.equals(mobile);
			case CvclipsePackage.PERSONAL_INFORMATION__FAX:
				return FAX_EDEFAULT == null ? fax != null : !FAX_EDEFAULT.equals(fax);
			case CvclipsePackage.PERSONAL_INFORMATION__WEBSITE:
				return WEBSITE_EDEFAULT == null ? website != null : !WEBSITE_EDEFAULT.equals(website);
			case CvclipsePackage.PERSONAL_INFORMATION__GITHUB:
				return GITHUB_EDEFAULT == null ? github != null : !GITHUB_EDEFAULT.equals(github);
			case CvclipsePackage.PERSONAL_INFORMATION__LINKED_IN:
				return LINKED_IN_EDEFAULT == null ? linkedIn != null : !LINKED_IN_EDEFAULT.equals(linkedIn);
			case CvclipsePackage.PERSONAL_INFORMATION__MARITAL_STATUS:
				return maritalStatus != null && !maritalStatus.isEmpty();
			case CvclipsePackage.PERSONAL_INFORMATION__NATIONALITY:
				return nationality != null && !nationality.isEmpty();
			case CvclipsePackage.PERSONAL_INFORMATION__BIRTHDATE:
				return birthdate != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (twitter: ");
		result.append(twitter);
		result.append(", firstname: ");
		result.append(firstname);
		result.append(", surname: ");
		result.append(surname);
		result.append(", birthName: ");
		result.append(birthName);
		result.append(", birthplace: ");
		result.append(birthplace);
		result.append(", street: ");
		result.append(street);
		result.append(", houseNumber: ");
		result.append(houseNumber);
		result.append(", country: ");
		result.append(country);
		result.append(", zipCode: ");
		result.append(zipCode);
		result.append(", city: ");
		result.append(city);
		result.append(", email: ");
		result.append(email);
		result.append(", phone: ");
		result.append(phone);
		result.append(", mobile: ");
		result.append(mobile);
		result.append(", fax: ");
		result.append(fax);
		result.append(", website: ");
		result.append(website);
		result.append(", github: ");
		result.append(github);
		result.append(", linkedIn: ");
		result.append(linkedIn);
		result.append(')');
		return result.toString();
	}

} //PersonalInformationImpl
