/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Languages</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getLanguages()
 * @model
 * @generated
 */
public enum Languages implements Enumerator {
	/**
	 * The '<em><b>GERMAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GERMAN_VALUE
	 * @generated
	 * @ordered
	 */
	GERMAN(0, "GERMAN", "ngerman"),

	/**
	 * The '<em><b>ENGLISH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENGLISH_VALUE
	 * @generated
	 * @ordered
	 */
	ENGLISH(1, "ENGLISH", "english"),

	/**
	 * The '<em><b>FRENCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRENCH_VALUE
	 * @generated
	 * @ordered
	 */
	FRENCH(2, "FRENCH", "french"),

	/**
	 * The '<em><b>ITALIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITALIAN_VALUE
	 * @generated
	 * @ordered
	 */
	ITALIAN(3, "ITALIAN", "italian"),

	/**
	 * The '<em><b>SPANISH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPANISH_VALUE
	 * @generated
	 * @ordered
	 */
	SPANISH(4, "SPANISH", "spanish"),

	/**
	 * The '<em><b>PORTUGUESE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTUGUESE_VALUE
	 * @generated
	 * @ordered
	 */
	PORTUGUESE(5, "PORTUGUESE", "portuguese"),

	/**
	 * The '<em><b>POLISH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLISH_VALUE
	 * @generated
	 * @ordered
	 */
	POLISH(6, "POLISH", "polish"),

	/**
	 * The '<em><b>CZECH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CZECH_VALUE
	 * @generated
	 * @ordered
	 */
	CZECH(7, "CZECH", "czech");

	/**
	 * The '<em><b>GERMAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GERMAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GERMAN
	 * @model literal="ngerman"
	 * @generated
	 * @ordered
	 */
	public static final int GERMAN_VALUE = 0;

	/**
	 * The '<em><b>ENGLISH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENGLISH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENGLISH
	 * @model literal="english"
	 * @generated
	 * @ordered
	 */
	public static final int ENGLISH_VALUE = 1;

	/**
	 * The '<em><b>FRENCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FRENCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRENCH
	 * @model literal="french"
	 * @generated
	 * @ordered
	 */
	public static final int FRENCH_VALUE = 2;

	/**
	 * The '<em><b>ITALIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ITALIAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITALIAN
	 * @model literal="italian"
	 * @generated
	 * @ordered
	 */
	public static final int ITALIAN_VALUE = 3;

	/**
	 * The '<em><b>SPANISH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPANISH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPANISH
	 * @model literal="spanish"
	 * @generated
	 * @ordered
	 */
	public static final int SPANISH_VALUE = 4;

	/**
	 * The '<em><b>PORTUGUESE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PORTUGUESE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PORTUGUESE
	 * @model literal="portuguese"
	 * @generated
	 * @ordered
	 */
	public static final int PORTUGUESE_VALUE = 5;

	/**
	 * The '<em><b>POLISH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POLISH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLISH
	 * @model literal="polish"
	 * @generated
	 * @ordered
	 */
	public static final int POLISH_VALUE = 6;

	/**
	 * The '<em><b>CZECH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CZECH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CZECH
	 * @model literal="czech"
	 * @generated
	 * @ordered
	 */
	public static final int CZECH_VALUE = 7;

	/**
	 * An array of all the '<em><b>Languages</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Languages[] VALUES_ARRAY =
		new Languages[] {
			GERMAN,
			ENGLISH,
			FRENCH,
			ITALIAN,
			SPANISH,
			PORTUGUESE,
			POLISH,
			CZECH,
		};

	/**
	 * A public read-only list of all the '<em><b>Languages</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Languages> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Languages</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Languages get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Languages result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Languages</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Languages getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Languages result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Languages</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Languages get(int value) {
		switch (value) {
			case GERMAN_VALUE: return GERMAN;
			case ENGLISH_VALUE: return ENGLISH;
			case FRENCH_VALUE: return FRENCH;
			case ITALIAN_VALUE: return ITALIAN;
			case SPANISH_VALUE: return SPANISH;
			case PORTUGUESE_VALUE: return PORTUGUESE;
			case POLISH_VALUE: return POLISH;
			case CZECH_VALUE: return CZECH;
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
	private Languages(int value, String name, String literal) {
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
	
} //Languages
