/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;

import org.eclipse.emf.common.util.EMap;

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
	 * Returns the value of the '<em><b>Right Content</b></em>' map.
	 * The key is of type {@link de.tu_bs.cs.isf.mbse.cvclipse.Language},
	 * and the value is of type {@link de.tu_bs.cs.isf.mbse.cvclipse.Text},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Content</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Content</em>' map.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getItem_RightContent()
	 * @model mapType="de.tu_bs.cs.isf.mbse.cvclipse.LanguageToTextMapEntry<de.tu_bs.cs.isf.mbse.cvclipse.Language, de.tu_bs.cs.isf.mbse.cvclipse.Text>"
	 * @generated
	 */
	EMap<Language, Text> getRightContent();

} // Item
