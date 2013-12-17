/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.CV#getPicture <em>Picture</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.CV#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getCV()
 * @model
 * @generated
 */
public interface CV extends EObject {
	/**
	 * Returns the value of the '<em><b>Picture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picture</em>' attribute.
	 * @see #setPicture(String)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getCV_Picture()
	 * @model
	 * @generated
	 */
	String getPicture();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.CV#getPicture <em>Picture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picture</em>' attribute.
	 * @see #getPicture()
	 * @generated
	 */
	void setPicture(String value);

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.cvclipse.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getCV_Blocks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Block> getBlocks();

} // CV
