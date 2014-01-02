/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getCv <em>Cv</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getLetter <em>Letter</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getLanguages <em>Languages</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getPersonalInformation <em>Personal Information</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getStyle <em>Style</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getColor <em>Color</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getPlace <em>Place</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Cv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cv</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cv</em>' containment reference.
	 * @see #setCv(CV)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getApplication_Cv()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CV getCv();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getCv <em>Cv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cv</em>' containment reference.
	 * @see #getCv()
	 * @generated
	 */
	void setCv(CV value);

	/**
	 * Returns the value of the '<em><b>Letter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Letter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Letter</em>' containment reference.
	 * @see #setLetter(Letter)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getApplication_Letter()
	 * @model containment="true"
	 * @generated
	 */
	Letter getLetter();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getLetter <em>Letter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Letter</em>' containment reference.
	 * @see #getLetter()
	 * @generated
	 */
	void setLetter(Letter value);

	/**
	 * Returns the value of the '<em><b>Languages</b></em>' attribute list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.cvclipse.Languages}.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.mbse.cvclipse.Languages}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Languages</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' attribute list.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Languages
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getApplication_Languages()
	 * @model required="true"
	 * @generated
	 */
	EList<Languages> getLanguages();

	/**
	 * Returns the value of the '<em><b>Personal Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personal Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Information</em>' containment reference.
	 * @see #setPersonalInformation(PersonalInformation)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getApplication_PersonalInformation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PersonalInformation getPersonalInformation();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getPersonalInformation <em>Personal Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Information</em>' containment reference.
	 * @see #getPersonalInformation()
	 * @generated
	 */
	void setPersonalInformation(PersonalInformation value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.mbse.cvclipse.Styles}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Styles
	 * @see #setStyle(Styles)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getApplication_Style()
	 * @model
	 * @generated
	 */
	Styles getStyle();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Styles
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(Styles value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.mbse.cvclipse.Colors}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Colors
	 * @see #setColor(Colors)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getApplication_Color()
	 * @model
	 * @generated
	 */
	Colors getColor();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.Colors
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Colors value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' attribute.
	 * @see #setPlace(String)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getApplication_Place()
	 * @model
	 * @generated
	 */
	String getPlace();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getPlace <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' attribute.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getApplication_Date()
	 * @model containment="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.cvclipse.Application#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // Application
