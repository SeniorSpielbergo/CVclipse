/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Block#getItems <em>Items</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Block#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getBlock()
 * @model abstract="true"
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.cvclipse.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getBlock_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Item> getItems();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' map.
	 * @see #setTitle(Map.Entry)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getBlock_Title()
	 * @model mapType="de.tu_bs.cs.isf.mbse.cvclipse.LanguageToTextMapEntry<de.tu_bs.cs.isf.mbse.cvclipse.Languages, de.tu_bs.cs.isf.mbse.cvclipse.Text>"
	 * @generated
	 */
	Map.Entry<Languages, Text> getTitle();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Block#getTitle <em>Title</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' map.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Map.Entry<Languages, Text> value);

} // Block
