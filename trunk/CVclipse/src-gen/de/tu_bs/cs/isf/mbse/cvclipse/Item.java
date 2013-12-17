/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Item#getRightContent <em>Right Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getItem()
 * @model abstract="true"
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Right Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Content</em>' containment reference.
	 * @see #setRightContent(TextMap)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getItem_RightContent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextMap getRightContent();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Item#getRightContent <em>Right Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Content</em>' containment reference.
	 * @see #getRightContent()
	 * @generated
	 */
	void setRightContent(TextMap value);

} // Item
