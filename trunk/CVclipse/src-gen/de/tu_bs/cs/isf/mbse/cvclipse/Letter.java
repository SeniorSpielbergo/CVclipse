/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;

import java.util.Map;

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
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientCompany <em>Recipient Company</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientStreet <em>Recipient Street</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientCity <em>Recipient City</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientCountry <em>Recipient Country</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientAttention <em>Recipient Attention</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getLetter()
 * @model
 * @generated
 */
public interface Letter extends EObject {
	/**
	 * Returns the value of the '<em><b>Opening</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opening</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening</em>' map.
	 * @see #setOpening(Map.Entry)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getLetter_Opening()
	 * @model mapType="de.tu_bs.cs.isf.mbse.cvclipse.LanguageToTextMapEntry<de.tu_bs.cs.isf.mbse.cvclipse.Languages, de.tu_bs.cs.isf.mbse.cvclipse.Text>"
	 * @generated
	 */
	Map.Entry<Languages, Text> getOpening();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getOpening <em>Opening</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening</em>' map.
	 * @see #getOpening()
	 * @generated
	 */
	void setOpening(Map.Entry<Languages, Text> value);

	/**
	 * Returns the value of the '<em><b>Closing</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closing</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closing</em>' map.
	 * @see #setClosing(Map.Entry)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getLetter_Closing()
	 * @model mapType="de.tu_bs.cs.isf.mbse.cvclipse.LanguageToTextMapEntry<de.tu_bs.cs.isf.mbse.cvclipse.Languages, de.tu_bs.cs.isf.mbse.cvclipse.Text>"
	 * @generated
	 */
	Map.Entry<Languages, Text> getClosing();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getClosing <em>Closing</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing</em>' map.
	 * @see #getClosing()
	 * @generated
	 */
	void setClosing(Map.Entry<Languages, Text> value);

	/**
	 * Returns the value of the '<em><b>Enclosure</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosure</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosure</em>' map.
	 * @see #setEnclosure(Map.Entry)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getLetter_Enclosure()
	 * @model mapType="de.tu_bs.cs.isf.mbse.cvclipse.LanguageToTextMapEntry<de.tu_bs.cs.isf.mbse.cvclipse.Languages, de.tu_bs.cs.isf.mbse.cvclipse.Text>"
	 * @generated
	 */
	Map.Entry<Languages, Text> getEnclosure();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getEnclosure <em>Enclosure</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosure</em>' map.
	 * @see #getEnclosure()
	 * @generated
	 */
	void setEnclosure(Map.Entry<Languages, Text> value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' map.
	 * @see #setText(Map.Entry)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getLetter_Text()
	 * @model mapType="de.tu_bs.cs.isf.mbse.cvclipse.LanguageToTextMapEntry<de.tu_bs.cs.isf.mbse.cvclipse.Languages, de.tu_bs.cs.isf.mbse.cvclipse.Text>"
	 * @generated
	 */
	Map.Entry<Languages, Text> getText();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getText <em>Text</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' map.
	 * @see #getText()
	 * @generated
	 */
	void setText(Map.Entry<Languages, Text> value);

	/**
	 * Returns the value of the '<em><b>Recipient Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient Company</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient Company</em>' attribute.
	 * @see #setRecipientCompany(String)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getLetter_RecipientCompany()
	 * @model required="true"
	 * @generated
	 */
	String getRecipientCompany();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientCompany <em>Recipient Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient Company</em>' attribute.
	 * @see #getRecipientCompany()
	 * @generated
	 */
	void setRecipientCompany(String value);

	/**
	 * Returns the value of the '<em><b>Recipient Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient Street</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient Street</em>' attribute.
	 * @see #setRecipientStreet(String)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getLetter_RecipientStreet()
	 * @model required="true"
	 * @generated
	 */
	String getRecipientStreet();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientStreet <em>Recipient Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient Street</em>' attribute.
	 * @see #getRecipientStreet()
	 * @generated
	 */
	void setRecipientStreet(String value);

	/**
	 * Returns the value of the '<em><b>Recipient City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient City</em>' attribute.
	 * @see #setRecipientCity(String)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getLetter_RecipientCity()
	 * @model required="true"
	 * @generated
	 */
	String getRecipientCity();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientCity <em>Recipient City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient City</em>' attribute.
	 * @see #getRecipientCity()
	 * @generated
	 */
	void setRecipientCity(String value);

	/**
	 * Returns the value of the '<em><b>Recipient Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient Country</em>' attribute.
	 * @see #setRecipientCountry(String)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getLetter_RecipientCountry()
	 * @model required="true"
	 * @generated
	 */
	String getRecipientCountry();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientCountry <em>Recipient Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient Country</em>' attribute.
	 * @see #getRecipientCountry()
	 * @generated
	 */
	void setRecipientCountry(String value);

	/**
	 * Returns the value of the '<em><b>Recipient Attention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient Attention</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient Attention</em>' attribute.
	 * @see #setRecipientAttention(String)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getLetter_RecipientAttention()
	 * @model required="true"
	 * @generated
	 */
	String getRecipientAttention();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Letter#getRecipientAttention <em>Recipient Attention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient Attention</em>' attribute.
	 * @see #getRecipientAttention()
	 * @generated
	 */
	void setRecipientAttention(String value);

} // Letter
