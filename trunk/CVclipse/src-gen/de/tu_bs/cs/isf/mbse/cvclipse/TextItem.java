/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.TextItem#getLeftContent <em>Left Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getTextItem()
 * @model
 * @generated
 */
public interface TextItem extends Item {
	/**
	 * Returns the value of the '<em><b>Left Content</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Content</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Content</em>' map.
	 * @see #setLeftContent(Map.Entry)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getTextItem_LeftContent()
	 * @model mapType="de.tu_bs.cs.isf.mbse.cvclipse.LanguageToTextMapEntry<de.tu_bs.cs.isf.mbse.cvclipse.Languages, de.tu_bs.cs.isf.mbse.cvclipse.Text>"
	 * @generated
	 */
	Map.Entry<Languages, Text> getLeftContent();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.TextItem#getLeftContent <em>Left Content</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Content</em>' map.
	 * @see #getLeftContent()
	 * @generated
	 */
	void setLeftContent(Map.Entry<Languages, Text> value);

} // TextItem
