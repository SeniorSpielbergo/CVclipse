/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;

import org.eclipse.emf.common.util.EMap;

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
	 * The key is of type {@link de.tu_bs.cs.isf.mbse.cvclipse.Language},
	 * and the value is of type {@link de.tu_bs.cs.isf.mbse.cvclipse.Text},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Content</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Content</em>' map.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getTextItem_LeftContent()
	 * @model mapType="de.tu_bs.cs.isf.mbse.cvclipse.LanguageToTextMapEntry<de.tu_bs.cs.isf.mbse.cvclipse.Language, de.tu_bs.cs.isf.mbse.cvclipse.Text>"
	 * @generated
	 */
	EMap<Language, Text> getLeftContent();

} // TextItem
