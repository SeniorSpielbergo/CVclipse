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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

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
	protected Map.Entry<Languages, Text> opening;

	/**
	 * The cached value of the '{@link #getClosing() <em>Closing</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosing()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<Languages, Text> closing;

	/**
	 * The cached value of the '{@link #getEnclosure() <em>Enclosure</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosure()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<Languages, Text> enclosure;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<Languages, Text> text;

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
	public Map.Entry<Languages, Text> getOpening() {
		return opening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpening(Map.Entry<Languages, Text> newOpening, NotificationChain msgs) {
		Map.Entry<Languages, Text> oldOpening = opening;
		opening = newOpening;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvclipsePackage.LETTER__OPENING, oldOpening, newOpening);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpening(Map.Entry<Languages, Text> newOpening) {
		if (newOpening != opening) {
			NotificationChain msgs = null;
			if (opening != null)
				msgs = ((InternalEObject)opening).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.LETTER__OPENING, null, msgs);
			if (newOpening != null)
				msgs = ((InternalEObject)newOpening).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.LETTER__OPENING, null, msgs);
			msgs = basicSetOpening(newOpening, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.LETTER__OPENING, newOpening, newOpening));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Languages, Text> getClosing() {
		return closing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClosing(Map.Entry<Languages, Text> newClosing, NotificationChain msgs) {
		Map.Entry<Languages, Text> oldClosing = closing;
		closing = newClosing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvclipsePackage.LETTER__CLOSING, oldClosing, newClosing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosing(Map.Entry<Languages, Text> newClosing) {
		if (newClosing != closing) {
			NotificationChain msgs = null;
			if (closing != null)
				msgs = ((InternalEObject)closing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.LETTER__CLOSING, null, msgs);
			if (newClosing != null)
				msgs = ((InternalEObject)newClosing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.LETTER__CLOSING, null, msgs);
			msgs = basicSetClosing(newClosing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.LETTER__CLOSING, newClosing, newClosing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Languages, Text> getEnclosure() {
		return enclosure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnclosure(Map.Entry<Languages, Text> newEnclosure, NotificationChain msgs) {
		Map.Entry<Languages, Text> oldEnclosure = enclosure;
		enclosure = newEnclosure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvclipsePackage.LETTER__ENCLOSURE, oldEnclosure, newEnclosure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosure(Map.Entry<Languages, Text> newEnclosure) {
		if (newEnclosure != enclosure) {
			NotificationChain msgs = null;
			if (enclosure != null)
				msgs = ((InternalEObject)enclosure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.LETTER__ENCLOSURE, null, msgs);
			if (newEnclosure != null)
				msgs = ((InternalEObject)newEnclosure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.LETTER__ENCLOSURE, null, msgs);
			msgs = basicSetEnclosure(newEnclosure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.LETTER__ENCLOSURE, newEnclosure, newEnclosure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Languages, Text> getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(Map.Entry<Languages, Text> newText, NotificationChain msgs) {
		Map.Entry<Languages, Text> oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvclipsePackage.LETTER__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(Map.Entry<Languages, Text> newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.LETTER__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.LETTER__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.LETTER__TEXT, newText, newText));
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
				return basicSetOpening(null, msgs);
			case CvclipsePackage.LETTER__CLOSING:
				return basicSetClosing(null, msgs);
			case CvclipsePackage.LETTER__ENCLOSURE:
				return basicSetEnclosure(null, msgs);
			case CvclipsePackage.LETTER__TEXT:
				return basicSetText(null, msgs);
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
				return getOpening();
			case CvclipsePackage.LETTER__CLOSING:
				return getClosing();
			case CvclipsePackage.LETTER__ENCLOSURE:
				return getEnclosure();
			case CvclipsePackage.LETTER__TEXT:
				return getText();
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
				setOpening((Map.Entry<Languages, Text>)newValue);
				return;
			case CvclipsePackage.LETTER__CLOSING:
				setClosing((Map.Entry<Languages, Text>)newValue);
				return;
			case CvclipsePackage.LETTER__ENCLOSURE:
				setEnclosure((Map.Entry<Languages, Text>)newValue);
				return;
			case CvclipsePackage.LETTER__TEXT:
				setText((Map.Entry<Languages, Text>)newValue);
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
				setOpening((Map.Entry<Languages, Text>)null);
				return;
			case CvclipsePackage.LETTER__CLOSING:
				setClosing((Map.Entry<Languages, Text>)null);
				return;
			case CvclipsePackage.LETTER__ENCLOSURE:
				setEnclosure((Map.Entry<Languages, Text>)null);
				return;
			case CvclipsePackage.LETTER__TEXT:
				setText((Map.Entry<Languages, Text>)null);
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
				return opening != null;
			case CvclipsePackage.LETTER__CLOSING:
				return closing != null;
			case CvclipsePackage.LETTER__ENCLOSURE:
				return enclosure != null;
			case CvclipsePackage.LETTER__TEXT:
				return text != null;
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
