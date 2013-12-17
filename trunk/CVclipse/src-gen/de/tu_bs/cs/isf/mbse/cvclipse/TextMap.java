/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.cvclipse.TextMap#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getTextMap()
 * @model
 * @generated
 */
public interface TextMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.cvclipse.TextMapField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getTextMap_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextMapField> getFields();

} // TextMap
