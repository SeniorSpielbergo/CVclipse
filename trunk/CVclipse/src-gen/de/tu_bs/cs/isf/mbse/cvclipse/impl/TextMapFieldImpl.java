/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse.impl;

import de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage;
import de.tu_bs.cs.isf.mbse.cvclipse.Languages;
import de.tu_bs.cs.isf.mbse.cvclipse.Text;
import de.tu_bs.cs.isf.mbse.cvclipse.TextMapField;

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
 * An implementation of the model object '<em><b>Text Map Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.TextMapFieldImpl#getKey <em>Key</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.TextMapFieldImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextMapFieldImpl extends MinimalEObjectImpl.Container implements TextMapField {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final Languages KEY_EDEFAULT = Languages.GERMAN;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Languages key = KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Text> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextMapFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvclipsePackage.Literals.TEXT_MAP_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Languages getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Languages newKey) {
		Languages oldKey = key;
		key = newKey == null ? KEY_EDEFAULT : newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.TEXT_MAP_FIELD__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Text> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<Text>(Text.class, this, CvclipsePackage.TEXT_MAP_FIELD__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvclipsePackage.TEXT_MAP_FIELD__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
			case CvclipsePackage.TEXT_MAP_FIELD__KEY:
				return getKey();
			case CvclipsePackage.TEXT_MAP_FIELD__VALUE:
				return getValue();
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
			case CvclipsePackage.TEXT_MAP_FIELD__KEY:
				setKey((Languages)newValue);
				return;
			case CvclipsePackage.TEXT_MAP_FIELD__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends Text>)newValue);
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
			case CvclipsePackage.TEXT_MAP_FIELD__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case CvclipsePackage.TEXT_MAP_FIELD__VALUE:
				getValue().clear();
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
			case CvclipsePackage.TEXT_MAP_FIELD__KEY:
				return key != KEY_EDEFAULT;
			case CvclipsePackage.TEXT_MAP_FIELD__VALUE:
				return value != null && !value.isEmpty();
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
		result.append(" (key: ");
		result.append(key);
		result.append(')');
		return result.toString();
	}

} //TextMapFieldImpl
