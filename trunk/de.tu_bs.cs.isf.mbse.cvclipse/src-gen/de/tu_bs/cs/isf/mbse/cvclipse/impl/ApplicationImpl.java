/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse.impl;

import de.tu_bs.cs.isf.mbse.cvclipse.Application;
import de.tu_bs.cs.isf.mbse.cvclipse.CV;
import de.tu_bs.cs.isf.mbse.cvclipse.Colors;
import de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage;
import de.tu_bs.cs.isf.mbse.cvclipse.Date;
import de.tu_bs.cs.isf.mbse.cvclipse.Languages;
import de.tu_bs.cs.isf.mbse.cvclipse.Letter;
import de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation;
import de.tu_bs.cs.isf.mbse.cvclipse.Styles;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ApplicationImpl#getCv <em>Cv</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ApplicationImpl#getLetter <em>Letter</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ApplicationImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ApplicationImpl#getPersonalInformation <em>Personal Information</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ApplicationImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ApplicationImpl#getColor <em>Color</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ApplicationImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ApplicationImpl#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application {
	/**
	 * The cached value of the '{@link #getCv() <em>Cv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCv()
	 * @generated
	 * @ordered
	 */
	protected CV cv;

	/**
	 * The cached value of the '{@link #getLetter() <em>Letter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetter()
	 * @generated
	 * @ordered
	 */
	protected Letter letter;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<Languages> languages;

	/**
	 * The cached value of the '{@link #getPersonalInformation() <em>Personal Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalInformation()
	 * @generated
	 * @ordered
	 */
	protected PersonalInformation personalInformation;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final Styles STYLE_EDEFAULT = Styles.CASUAL;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected Styles style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Colors COLOR_EDEFAULT = Colors.BLUE;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Colors color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlace() <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected String place = PLACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvclipsePackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CV getCv() {
		return cv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCv(CV newCv, NotificationChain msgs) {
		CV oldCv = cv;
		cv = newCv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvclipsePackage.APPLICATION__CV, oldCv, newCv);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCv(CV newCv) {
		if (newCv != cv) {
			NotificationChain msgs = null;
			if (cv != null)
				msgs = ((InternalEObject)cv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.APPLICATION__CV, null, msgs);
			if (newCv != null)
				msgs = ((InternalEObject)newCv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.APPLICATION__CV, null, msgs);
			msgs = basicSetCv(newCv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.APPLICATION__CV, newCv, newCv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Letter getLetter() {
		return letter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLetter(Letter newLetter, NotificationChain msgs) {
		Letter oldLetter = letter;
		letter = newLetter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvclipsePackage.APPLICATION__LETTER, oldLetter, newLetter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetter(Letter newLetter) {
		if (newLetter != letter) {
			NotificationChain msgs = null;
			if (letter != null)
				msgs = ((InternalEObject)letter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.APPLICATION__LETTER, null, msgs);
			if (newLetter != null)
				msgs = ((InternalEObject)newLetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.APPLICATION__LETTER, null, msgs);
			msgs = basicSetLetter(newLetter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.APPLICATION__LETTER, newLetter, newLetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Languages> getLanguages() {
		if (languages == null) {
			languages = new EDataTypeUniqueEList<Languages>(Languages.class, this, CvclipsePackage.APPLICATION__LANGUAGES);
		}
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalInformation getPersonalInformation() {
		return personalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonalInformation(PersonalInformation newPersonalInformation, NotificationChain msgs) {
		PersonalInformation oldPersonalInformation = personalInformation;
		personalInformation = newPersonalInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvclipsePackage.APPLICATION__PERSONAL_INFORMATION, oldPersonalInformation, newPersonalInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonalInformation(PersonalInformation newPersonalInformation) {
		if (newPersonalInformation != personalInformation) {
			NotificationChain msgs = null;
			if (personalInformation != null)
				msgs = ((InternalEObject)personalInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.APPLICATION__PERSONAL_INFORMATION, null, msgs);
			if (newPersonalInformation != null)
				msgs = ((InternalEObject)newPersonalInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.APPLICATION__PERSONAL_INFORMATION, null, msgs);
			msgs = basicSetPersonalInformation(newPersonalInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.APPLICATION__PERSONAL_INFORMATION, newPersonalInformation, newPersonalInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Styles getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(Styles newStyle) {
		Styles oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.APPLICATION__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colors getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Colors newColor) {
		Colors oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.APPLICATION__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(String newPlace) {
		String oldPlace = place;
		place = newPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.APPLICATION__PLACE, oldPlace, place));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvclipsePackage.APPLICATION__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.APPLICATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.APPLICATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.APPLICATION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvclipsePackage.APPLICATION__CV:
				return basicSetCv(null, msgs);
			case CvclipsePackage.APPLICATION__LETTER:
				return basicSetLetter(null, msgs);
			case CvclipsePackage.APPLICATION__PERSONAL_INFORMATION:
				return basicSetPersonalInformation(null, msgs);
			case CvclipsePackage.APPLICATION__DATE:
				return basicSetDate(null, msgs);
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
			case CvclipsePackage.APPLICATION__CV:
				return getCv();
			case CvclipsePackage.APPLICATION__LETTER:
				return getLetter();
			case CvclipsePackage.APPLICATION__LANGUAGES:
				return getLanguages();
			case CvclipsePackage.APPLICATION__PERSONAL_INFORMATION:
				return getPersonalInformation();
			case CvclipsePackage.APPLICATION__STYLE:
				return getStyle();
			case CvclipsePackage.APPLICATION__COLOR:
				return getColor();
			case CvclipsePackage.APPLICATION__PLACE:
				return getPlace();
			case CvclipsePackage.APPLICATION__DATE:
				return getDate();
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
			case CvclipsePackage.APPLICATION__CV:
				setCv((CV)newValue);
				return;
			case CvclipsePackage.APPLICATION__LETTER:
				setLetter((Letter)newValue);
				return;
			case CvclipsePackage.APPLICATION__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends Languages>)newValue);
				return;
			case CvclipsePackage.APPLICATION__PERSONAL_INFORMATION:
				setPersonalInformation((PersonalInformation)newValue);
				return;
			case CvclipsePackage.APPLICATION__STYLE:
				setStyle((Styles)newValue);
				return;
			case CvclipsePackage.APPLICATION__COLOR:
				setColor((Colors)newValue);
				return;
			case CvclipsePackage.APPLICATION__PLACE:
				setPlace((String)newValue);
				return;
			case CvclipsePackage.APPLICATION__DATE:
				setDate((Date)newValue);
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
			case CvclipsePackage.APPLICATION__CV:
				setCv((CV)null);
				return;
			case CvclipsePackage.APPLICATION__LETTER:
				setLetter((Letter)null);
				return;
			case CvclipsePackage.APPLICATION__LANGUAGES:
				getLanguages().clear();
				return;
			case CvclipsePackage.APPLICATION__PERSONAL_INFORMATION:
				setPersonalInformation((PersonalInformation)null);
				return;
			case CvclipsePackage.APPLICATION__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case CvclipsePackage.APPLICATION__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case CvclipsePackage.APPLICATION__PLACE:
				setPlace(PLACE_EDEFAULT);
				return;
			case CvclipsePackage.APPLICATION__DATE:
				setDate((Date)null);
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
			case CvclipsePackage.APPLICATION__CV:
				return cv != null;
			case CvclipsePackage.APPLICATION__LETTER:
				return letter != null;
			case CvclipsePackage.APPLICATION__LANGUAGES:
				return languages != null && !languages.isEmpty();
			case CvclipsePackage.APPLICATION__PERSONAL_INFORMATION:
				return personalInformation != null;
			case CvclipsePackage.APPLICATION__STYLE:
				return style != STYLE_EDEFAULT;
			case CvclipsePackage.APPLICATION__COLOR:
				return color != COLOR_EDEFAULT;
			case CvclipsePackage.APPLICATION__PLACE:
				return PLACE_EDEFAULT == null ? place != null : !PLACE_EDEFAULT.equals(place);
			case CvclipsePackage.APPLICATION__DATE:
				return date != null;
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
		result.append(" (languages: ");
		result.append(languages);
		result.append(", style: ");
		result.append(style);
		result.append(", color: ");
		result.append(color);
		result.append(", place: ");
		result.append(place);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
