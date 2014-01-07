/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getStyle()
 * @model
 * @generated
 */
public enum Style implements Enumerator {
	/**
	 * The '<em><b>CASUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASUAL_VALUE
	 * @generated
	 * @ordered
	 */
	CASUAL(0, "CASUAL", "casual"),

	/**
	 * The '<em><b>CLASSIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIC_VALUE
	 * @generated
	 * @ordered
	 */
	CLASSIC(1, "CLASSIC", "classic"),

	/**
	 * The '<em><b>OLDSTYLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLDSTYLE_VALUE
	 * @generated
	 * @ordered
	 */
	OLDSTYLE(2, "OLDSTYLE", "oldstyle"),

	/**
	 * The '<em><b>BANKING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANKING_VALUE
	 * @generated
	 * @ordered
	 */
	BANKING(3, "BANKING", "banking");

	/**
	 * The '<em><b>CASUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CASUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASUAL
	 * @model literal="casual"
	 * @generated
	 * @ordered
	 */
	public static final int CASUAL_VALUE = 0;

	/**
	 * The '<em><b>CLASSIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLASSIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASSIC
	 * @model literal="classic"
	 * @generated
	 * @ordered
	 */
	public static final int CLASSIC_VALUE = 1;

	/**
	 * The '<em><b>OLDSTYLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OLDSTYLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OLDSTYLE
	 * @model literal="oldstyle"
	 * @generated
	 * @ordered
	 */
	public static final int OLDSTYLE_VALUE = 2;

	/**
	 * The '<em><b>BANKING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BANKING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BANKING
	 * @model literal="banking"
	 * @generated
	 * @ordered
	 */
	public static final int BANKING_VALUE = 3;

	/**
	 * An array of all the '<em><b>Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Style[] VALUES_ARRAY =
		new Style[] {
			CASUAL,
			CLASSIC,
			OLDSTYLE,
			BANKING,
		};

	/**
	 * A public read-only list of all the '<em><b>Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Style> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Style get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Style result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Style getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Style result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Style get(int value) {
		switch (value) {
			case CASUAL_VALUE: return CASUAL;
			case CLASSIC_VALUE: return CLASSIC;
			case OLDSTYLE_VALUE: return OLDSTYLE;
			case BANKING_VALUE: return BANKING;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Style(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Style
