/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse.impl;

import de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage;
import de.tu_bs.cs.isf.mbse.cvclipse.Languages;
import de.tu_bs.cs.isf.mbse.cvclipse.Letter;
import de.tu_bs.cs.isf.mbse.cvclipse.Text;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Letter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.LetterImpl#getOpening <em>Opening</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.LetterImpl#getClosing <em>Closing</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.LetterImpl#getEnclosure <em>Enclosure</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.LetterImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.LetterImpl#getRecipientCompany <em>Recipient Company</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.LetterImpl#getRecipientStreet <em>Recipient Street</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.LetterImpl#getRecipientCity <em>Recipient City</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.LetterImpl#getRecipientCountry <em>Recipient Country</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.LetterImpl#getRecipientAttention <em>Recipient Attention</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LetterImpl extends EObjectImpl implements Letter {
	/**
	 * The cached value of the '{@link #getOpening() <em>Opening</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpening()
	 * @generated
	 * @ordered
	 */
	protected EMap<Languages, Text> opening;

	/**
	 * The cached value of the '{@link #getClosing() <em>Closing</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosing()
	 * @generated
	 * @ordered
	 */
	protected EMap<Languages, Text> closing;

	/**
	 * The cached value of the '{@link #getEnclosure() <em>Enclosure</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosure()
	 * @generated
	 * @ordered
	 */
	protected EMap<Languages, Text> enclosure;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EMap<Languages, Text> text;

	/**
	 * The default value of the '{@link #getRecipientCompany() <em>Recipient Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientCompany()
	 * @generated
	 * @ordered
	 */
	protected static final String RECIPIENT_COMPANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecipientCompany() <em>Recipient Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientCompany()
	 * @generated
	 * @ordered
	 */
	protected String recipientCompany = RECIPIENT_COMPANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecipientStreet() <em>Recipient Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String RECIPIENT_STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecipientStreet() <em>Recipient Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientStreet()
	 * @generated
	 * @ordered
	 */
	protected String recipientStreet = RECIPIENT_STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecipientCity() <em>Recipient City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientCity()
	 * @generated
	 * @ordered
	 */
	protected static final String RECIPIENT_CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecipientCity() <em>Recipient City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientCity()
	 * @generated
	 * @ordered
	 */
	protected String recipientCity = RECIPIENT_CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecipientCountry() <em>Recipient Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String RECIPIENT_COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecipientCountry() <em>Recipient Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientCountry()
	 * @generated
	 * @ordered
	 */
	protected String recipientCountry = RECIPIENT_COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecipientAttention() <em>Recipient Attention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientAttention()
	 * @generated
	 * @ordered
	 */
	protected static final String RECIPIENT_ATTENTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecipientAttention() <em>Recipient Attention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientAttention()
	 * @generated
	 * @ordered
	 */
	protected String recipientAttention = RECIPIENT_ATTENTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LetterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvclipsePackage.Literals.LETTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Languages, Text> getOpening() {
		if (opening == null) {
			opening = new EcoreEMap<Languages,Text>(CvclipsePackage.Literals.LANGUAGE_TO_TEXT_MAP_ENTRY, LanguageToTextMapEntryImpl.class, this, CvclipsePackage.LETTER__OPENING);
		}
		return opening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Languages, Text> getClosing() {
		if (closing == null) {
			closing = new EcoreEMap<Languages,Text>(CvclipsePackage.Literals.LANGUAGE_TO_TEXT_MAP_ENTRY, LanguageToTextMapEntryImpl.class, this, CvclipsePackage.LETTER__CLOSING);
		}
		return closing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Languages, Text> getEnclosure() {
		if (enclosure == null) {
			enclosure = new EcoreEMap<Languages,Text>(CvclipsePackage.Literals.LANGUAGE_TO_TEXT_MAP_ENTRY, LanguageToTextMapEntryImpl.class, this, CvclipsePackage.LETTER__ENCLOSURE);
		}
		return enclosure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Languages, Text> getText() {
		if (text == null) {
			text = new EcoreEMap<Languages,Text>(CvclipsePackage.Literals.LANGUAGE_TO_TEXT_MAP_ENTRY, LanguageToTextMapEntryImpl.class, this, CvclipsePackage.LETTER__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecipientCompany() {
		return recipientCompany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipientCompany(String newRecipientCompany) {
		String oldRecipientCompany = recipientCompany;
		recipientCompany = newRecipientCompany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.LETTER__RECIPIENT_COMPANY, oldRecipientCompany, recipientCompany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecipientStreet() {
		return recipientStreet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipientStreet(String newRecipientStreet) {
		String oldRecipientStreet = recipientStreet;
		recipientStreet = newRecipientStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.LETTER__RECIPIENT_STREET, oldRecipientStreet, recipientStreet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecipientCity() {
		return recipientCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipientCity(String newRecipientCity) {
		String oldRecipientCity = recipientCity;
		recipientCity = newRecipientCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.LETTER__RECIPIENT_CITY, oldRecipientCity, recipientCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecipientCountry() {
		return recipientCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipientCountry(String newRecipientCountry) {
		String oldRecipientCountry = recipientCountry;
		recipientCountry = newRecipientCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.LETTER__RECIPIENT_COUNTRY, oldRecipientCountry, recipientCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecipientAttention() {
		return recipientAttention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipientAttention(String newRecipientAttention) {
		String oldRecipientAttention = recipientAttention;
		recipientAttention = newRecipientAttention;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.LETTER__RECIPIENT_ATTENTION, oldRecipientAttention, recipientAttention));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvclipsePackage.LETTER__OPENING:
				return ((InternalEList<?>)getOpening()).basicRemove(otherEnd, msgs);
			case CvclipsePackage.LETTER__CLOSING:
				return ((InternalEList<?>)getClosing()).basicRemove(otherEnd, msgs);
			case CvclipsePackage.LETTER__ENCLOSURE:
				return ((InternalEList<?>)getEnclosure()).basicRemove(otherEnd, msgs);
			case CvclipsePackage.LETTER__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
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
			case CvclipsePackage.LETTER__OPENING:
				if (coreType) return getOpening();
				else return getOpening().map();
			case CvclipsePackage.LETTER__CLOSING:
				if (coreType) return getClosing();
				else return getClosing().map();
			case CvclipsePackage.LETTER__ENCLOSURE:
				if (coreType) return getEnclosure();
				else return getEnclosure().map();
			case CvclipsePackage.LETTER__TEXT:
				if (coreType) return getText();
				else return getText().map();
			case CvclipsePackage.LETTER__RECIPIENT_COMPANY:
				return getRecipientCompany();
			case CvclipsePackage.LETTER__RECIPIENT_STREET:
				return getRecipientStreet();
			case CvclipsePackage.LETTER__RECIPIENT_CITY:
				return getRecipientCity();
			case CvclipsePackage.LETTER__RECIPIENT_COUNTRY:
				return getRecipientCountry();
			case CvclipsePackage.LETTER__RECIPIENT_ATTENTION:
				return getRecipientAttention();
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
			case CvclipsePackage.LETTER__OPENING:
				((EStructuralFeature.Setting)getOpening()).set(newValue);
				return;
			case CvclipsePackage.LETTER__CLOSING:
				((EStructuralFeature.Setting)getClosing()).set(newValue);
				return;
			case CvclipsePackage.LETTER__ENCLOSURE:
				((EStructuralFeature.Setting)getEnclosure()).set(newValue);
				return;
			case CvclipsePackage.LETTER__TEXT:
				((EStructuralFeature.Setting)getText()).set(newValue);
				return;
			case CvclipsePackage.LETTER__RECIPIENT_COMPANY:
				setRecipientCompany((String)newValue);
				return;
			case CvclipsePackage.LETTER__RECIPIENT_STREET:
				setRecipientStreet((String)newValue);
				return;
			case CvclipsePackage.LETTER__RECIPIENT_CITY:
				setRecipientCity((String)newValue);
				return;
			case CvclipsePackage.LETTER__RECIPIENT_COUNTRY:
				setRecipientCountry((String)newValue);
				return;
			case CvclipsePackage.LETTER__RECIPIENT_ATTENTION:
				setRecipientAttention((String)newValue);
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
			case CvclipsePackage.LETTER__OPENING:
				getOpening().clear();
				return;
			case CvclipsePackage.LETTER__CLOSING:
				getClosing().clear();
				return;
			case CvclipsePackage.LETTER__ENCLOSURE:
				getEnclosure().clear();
				return;
			case CvclipsePackage.LETTER__TEXT:
				getText().clear();
				return;
			case CvclipsePackage.LETTER__RECIPIENT_COMPANY:
				setRecipientCompany(RECIPIENT_COMPANY_EDEFAULT);
				return;
			case CvclipsePackage.LETTER__RECIPIENT_STREET:
				setRecipientStreet(RECIPIENT_STREET_EDEFAULT);
				return;
			case CvclipsePackage.LETTER__RECIPIENT_CITY:
				setRecipientCity(RECIPIENT_CITY_EDEFAULT);
				return;
			case CvclipsePackage.LETTER__RECIPIENT_COUNTRY:
				setRecipientCountry(RECIPIENT_COUNTRY_EDEFAULT);
				return;
			case CvclipsePackage.LETTER__RECIPIENT_ATTENTION:
				setRecipientAttention(RECIPIENT_ATTENTION_EDEFAULT);
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
			case CvclipsePackage.LETTER__OPENING:
				return opening != null && !opening.isEmpty();
			case CvclipsePackage.LETTER__CLOSING:
				return closing != null && !closing.isEmpty();
			case CvclipsePackage.LETTER__ENCLOSURE:
				return enclosure != null && !enclosure.isEmpty();
			case CvclipsePackage.LETTER__TEXT:
				return text != null && !text.isEmpty();
			case CvclipsePackage.LETTER__RECIPIENT_COMPANY:
				return RECIPIENT_COMPANY_EDEFAULT == null ? recipientCompany != null : !RECIPIENT_COMPANY_EDEFAULT.equals(recipientCompany);
			case CvclipsePackage.LETTER__RECIPIENT_STREET:
				return RECIPIENT_STREET_EDEFAULT == null ? recipientStreet != null : !RECIPIENT_STREET_EDEFAULT.equals(recipientStreet);
			case CvclipsePackage.LETTER__RECIPIENT_CITY:
				return RECIPIENT_CITY_EDEFAULT == null ? recipientCity != null : !RECIPIENT_CITY_EDEFAULT.equals(recipientCity);
			case CvclipsePackage.LETTER__RECIPIENT_COUNTRY:
				return RECIPIENT_COUNTRY_EDEFAULT == null ? recipientCountry != null : !RECIPIENT_COUNTRY_EDEFAULT.equals(recipientCountry);
			case CvclipsePackage.LETTER__RECIPIENT_ATTENTION:
				return RECIPIENT_ATTENTION_EDEFAULT == null ? recipientAttention != null : !RECIPIENT_ATTENTION_EDEFAULT.equals(recipientAttention);
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
		result.append(" (recipientCompany: ");
		result.append(recipientCompany);
		result.append(", recipientStreet: ");
		result.append(recipientStreet);
		result.append(", recipientCity: ");
		result.append(recipientCity);
		result.append(", recipientCountry: ");
		result.append(recipientCountry);
		result.append(", recipientAttention: ");
		result.append(recipientAttention);
		result.append(')');
		return result.toString();
	}

} //LetterImpl
