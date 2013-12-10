/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Letter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getOpening <em>Opening</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getClosing <em>Closing</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getEnclosure <em>Enclosure</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getLetter()
 * @model
 * @generated
 */
public interface Letter extends EObject {
	/**
	 * Returns the value of the '<em><b>Opening</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opening</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening</em>' containment reference.
	 * @see #setOpening(TextMap)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getLetter_Opening()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextMap getOpening();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getOpening <em>Opening</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening</em>' containment reference.
	 * @see #getOpening()
	 * @generated
	 */
	void setOpening(TextMap value);

	/**
	 * Returns the value of the '<em><b>Closing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closing</em>' containment reference.
	 * @see #setClosing(TextMap)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getLetter_Closing()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextMap getClosing();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getClosing <em>Closing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing</em>' containment reference.
	 * @see #getClosing()
	 * @generated
	 */
	void setClosing(TextMap value);

	/**
	 * Returns the value of the '<em><b>Enclosure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosure</em>' containment reference.
	 * @see #setEnclosure(TextMap)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getLetter_Enclosure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextMap getEnclosure();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getEnclosure <em>Enclosure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosure</em>' containment reference.
	 * @see #getEnclosure()
	 * @generated
	 */
	void setEnclosure(TextMap value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(TextMap)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getLetter_Text()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextMap getText();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(TextMap value);

} // Letter
