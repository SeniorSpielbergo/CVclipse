/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;


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
	 * Returns the value of the '<em><b>Left Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Content</em>' containment reference.
	 * @see #setLeftContent(TextMap)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getTextItem_LeftContent()
	 * @model containment="true"
	 * @generated
	 */
	TextMap getLeftContent();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.TextItem#getLeftContent <em>Left Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Content</em>' containment reference.
	 * @see #getLeftContent()
	 * @generated
	 */
	void setLeftContent(TextMap value);

} // TextItem
