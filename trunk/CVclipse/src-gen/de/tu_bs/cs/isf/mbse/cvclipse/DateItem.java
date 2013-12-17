/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.DateItem#getBegin <em>Begin</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.DateItem#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getDateItem()
 * @model
 * @generated
 */
public interface DateItem extends Item {
	/**
	 * Returns the value of the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' containment reference.
	 * @see #setBegin(Date)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getDateItem_Begin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Date getBegin();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.DateItem#getBegin <em>Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' containment reference.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Date)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getDateItem_End()
	 * @model containment="true"
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.DateItem#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

} // DateItem
