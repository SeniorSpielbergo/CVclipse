/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse.impl;

import de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage;
import de.tu_bs.cs.isf.mbse.cvclipse.Letter;
import de.tu_bs.cs.isf.mbse.cvclipse.TextMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 * </ul>
 * </p>
 *
 * @generated
 */
public class LetterImpl extends MinimalEObjectImpl.Container implements Letter {
	/**
	 * The cached value of the '{@link #getOpening() <em>Opening</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpening()
	 * @generated
	 * @ordered
	 */
	protected TextMap opening;

	/**
	 * The cached value of the '{@link #getClosing() <em>Closing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosing()
	 * @generated
	 * @ordered
	 */
	protected TextMap closing;

	/**
	 * The cached value of the '{@link #getEnclosure() <em>Enclosure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosure()
	 * @generated
	 * @ordered
	 */
	protected TextMap enclosure;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected TextMap text;

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
	public TextMap getOpening() {
		return opening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpening(TextMap newOpening, NotificationChain msgs) {
		TextMap oldOpening = opening;
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
	public void setOpening(TextMap newOpening) {
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
	public TextMap getClosing() {
		return closing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClosing(TextMap newClosing, NotificationChain msgs) {
		TextMap oldClosing = closing;
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
	public void setClosing(TextMap newClosing) {
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
	public TextMap getEnclosure() {
		return enclosure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnclosure(TextMap newEnclosure, NotificationChain msgs) {
		TextMap oldEnclosure = enclosure;
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
	public void setEnclosure(TextMap newEnclosure) {
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
	public TextMap getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(TextMap newText, NotificationChain msgs) {
		TextMap oldText = text;
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
	public void setText(TextMap newText) {
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
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CvclipsePackage.LETTER__OPENING:
				setOpening((TextMap)newValue);
				return;
			case CvclipsePackage.LETTER__CLOSING:
				setClosing((TextMap)newValue);
				return;
			case CvclipsePackage.LETTER__ENCLOSURE:
				setEnclosure((TextMap)newValue);
				return;
			case CvclipsePackage.LETTER__TEXT:
				setText((TextMap)newValue);
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
				setOpening((TextMap)null);
				return;
			case CvclipsePackage.LETTER__CLOSING:
				setClosing((TextMap)null);
				return;
			case CvclipsePackage.LETTER__ENCLOSURE:
				setEnclosure((TextMap)null);
				return;
			case CvclipsePackage.LETTER__TEXT:
				setText((TextMap)null);
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
		}
		return super.eIsSet(featureID);
	}

} //LetterImpl
