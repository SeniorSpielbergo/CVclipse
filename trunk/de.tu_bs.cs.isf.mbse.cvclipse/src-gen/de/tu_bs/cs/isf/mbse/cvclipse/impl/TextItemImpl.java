/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse.impl;

import de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage;
import de.tu_bs.cs.isf.mbse.cvclipse.Languages;
import de.tu_bs.cs.isf.mbse.cvclipse.Text;
import de.tu_bs.cs.isf.mbse.cvclipse.TextItem;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.impl.TextItemImpl#getLeftContent <em>Left Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextItemImpl extends ItemImpl implements TextItem {
	/**
	 * The cached value of the '{@link #getLeftContent() <em>Left Content</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftContent()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<Languages, Text> leftContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvclipsePackage.Literals.TEXT_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Languages, Text> getLeftContent() {
		return leftContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftContent(Map.Entry<Languages, Text> newLeftContent, NotificationChain msgs) {
		Map.Entry<Languages, Text> oldLeftContent = leftContent;
		leftContent = newLeftContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvclipsePackage.TEXT_ITEM__LEFT_CONTENT, oldLeftContent, newLeftContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftContent(Map.Entry<Languages, Text> newLeftContent) {
		if (newLeftContent != leftContent) {
			NotificationChain msgs = null;
			if (leftContent != null)
				msgs = ((InternalEObject)leftContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.TEXT_ITEM__LEFT_CONTENT, null, msgs);
			if (newLeftContent != null)
				msgs = ((InternalEObject)newLeftContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvclipsePackage.TEXT_ITEM__LEFT_CONTENT, null, msgs);
			msgs = basicSetLeftContent(newLeftContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvclipsePackage.TEXT_ITEM__LEFT_CONTENT, newLeftContent, newLeftContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvclipsePackage.TEXT_ITEM__LEFT_CONTENT:
				return basicSetLeftContent(null, msgs);
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
			case CvclipsePackage.TEXT_ITEM__LEFT_CONTENT:
				return getLeftContent();
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
			case CvclipsePackage.TEXT_ITEM__LEFT_CONTENT:
				setLeftContent((Map.Entry<Languages, Text>)newValue);
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
			case CvclipsePackage.TEXT_ITEM__LEFT_CONTENT:
				setLeftContent((Map.Entry<Languages, Text>)null);
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
			case CvclipsePackage.TEXT_ITEM__LEFT_CONTENT:
				return leftContent != null;
		}
		return super.eIsSet(featureID);
	}

} //TextItemImpl
