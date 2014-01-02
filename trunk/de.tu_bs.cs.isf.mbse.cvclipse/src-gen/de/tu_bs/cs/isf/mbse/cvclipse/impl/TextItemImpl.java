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

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

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
	protected EMap<Languages, Text> leftContent;

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
	public EMap<Languages, Text> getLeftContent() {
		if (leftContent == null) {
			leftContent = new EcoreEMap<Languages,Text>(CvclipsePackage.Literals.LANGUAGE_TO_TEXT_MAP_ENTRY, LanguageToTextMapEntryImpl.class, this, CvclipsePackage.TEXT_ITEM__LEFT_CONTENT);
		}
		return leftContent;
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
				return ((InternalEList<?>)getLeftContent()).basicRemove(otherEnd, msgs);
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
				if (coreType) return getLeftContent();
				else return getLeftContent().map();
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
				((EStructuralFeature.Setting)getLeftContent()).set(newValue);
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
				getLeftContent().clear();
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
				return leftContent != null && !leftContent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TextItemImpl
