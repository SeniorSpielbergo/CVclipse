/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Date#getDay <em>Day</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Date#getMonth <em>Month</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Date#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getDate()
 * @model
 * @generated
 */
public interface Date extends EObject {
	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(int)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getDate_Day()
	 * @model
	 * @generated
	 */
	int getDay();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Date#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(int value);

	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see #setMonth(int)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getDate_Month()
	 * @model required="true"
	 * @generated
	 */
	int getMonth();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Date#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(int value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getDate_Year()
	 * @model required="true"
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Date#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(day!=0) {\r\n\treturn \"\"+year+\"/\"+month+\"/\"+day;\r\n} else {\r\n\treturn \"\"+year+\"/\"+month;\r\n}'"
	 * @generated
	 */
	String toString();

} // Date
