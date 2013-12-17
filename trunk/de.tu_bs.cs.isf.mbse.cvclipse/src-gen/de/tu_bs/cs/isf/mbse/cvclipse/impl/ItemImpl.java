/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse.impl;

import de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage;
import de.tu_bs.cs.isf.mbse.cvclipse.Item;
import de.tu_bs.cs.isf.mbse.cvclipse.Languages;
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
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.ItemImpl#getRightContent <em>Right Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ItemImpl extends EObjectImpl implements Item {
	/**
	 * The cached value of the '{@link #getRightContent() <em>Right Content</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightContent()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<Languages, Text> rightContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvclipsePackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Languages, Text> getRightContent() {
		return rightContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightContent(Map.Entry<Languages, Text> newRightContent, NotificationChain msgs) {
		Map.Entry<Languages, Text> oldRightContent = rightContent;
		rightContent = newRightContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvclipsePackage.ITEM__RIGHT_CONTENT, oldRightContent, newRightContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightContent(Map.Entry<Languages, Text> newRightContent) {
		if (newRightContent != rightContent) {
			NotificationChain msgs = null;
			if (rightContent != null)
				msgs = ((InternalEObject)rightContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.ITEM__RIGHT_CONTENT, null, msgs);
			if (newRightContent != null)
				msgs = ((InternalEObject)newRightContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.ITEM__RIGHT_CONTENT, null, msgs);
			msgs = basicSetRightContent(newRightContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.ITEM__RIGHT_CONTENT, newRightContent, newRightContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvclipsePackage.ITEM__RIGHT_CONTENT:
				return basicSetRightContent(null, msgs);
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
			case CvclipsePackage.ITEM__RIGHT_CONTENT:
				return getRightContent();
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
			case CvclipsePackage.ITEM__RIGHT_CONTENT:
				setRightContent((Map.Entry<Languages, Text>)newValue);
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
			case CvclipsePackage.ITEM__RIGHT_CONTENT:
				setRightContent((Map.Entry<Languages, Text>)null);
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
			case CvclipsePackage.ITEM__RIGHT_CONTENT:
				return rightContent != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemImpl
