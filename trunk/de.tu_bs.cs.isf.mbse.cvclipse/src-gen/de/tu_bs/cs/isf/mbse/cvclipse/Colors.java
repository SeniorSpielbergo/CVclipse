/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Colors</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage#getColors()
 * @model
 * @generated
 */
public enum Colors implements Enumerator {
	/**
	 * The '<em><b>BLUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	BLUE(0, "BLUE", "blue"),

	/**
	 * The '<em><b>ORANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORANGE_VALUE
	 * @generated
	 * @ordered
	 */
	ORANGE(1, "ORANGE", "orange"),

	/**
	 * The '<em><b>GREEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	GREEN(2, "GREEN", "green"),

	/**
	 * The '<em><b>RED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_VALUE
	 * @generated
	 * @ordered
	 */
	RED(3, "RED", "red"),

	/**
	 * The '<em><b>PURPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PURPLE_VALUE
	 * @generated
	 * @ordered
	 */
	PURPLE(4, "PURPLE", "purple"),

	/**
	 * The '<em><b>GREY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREY_VALUE
	 * @generated
	 * @ordered
	 */
	GREY(5, "GREY", "grey"),

	/**
	 * The '<em><b>BLACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK(6, "BLACK", "black");

	/**
	 * The '<em><b>BLUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLUE
	 * @model literal="blue"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_VALUE = 0;

	/**
	 * The '<em><b>ORANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORANGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORANGE
	 * @model literal="orange"
	 * @generated
	 * @ordered
	 */
	public static final int ORANGE_VALUE = 1;

	/**
	 * The '<em><b>GREEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREEN
	 * @model literal="green"
	 * @generated
	 * @ordered
	 */
	public static final int GREEN_VALUE = 2;

	/**
	 * The '<em><b>RED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RED
	 * @model literal="red"
	 * @generated
	 * @ordered
	 */
	public static final int RED_VALUE = 3;

	/**
	 * The '<em><b>PURPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PURPLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PURPLE
	 * @model literal="purple"
	 * @generated
	 * @ordered
	 */
	public static final int PURPLE_VALUE = 4;

	/**
	 * The '<em><b>GREY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREY
	 * @model literal="grey"
	 * @generated
	 * @ordered
	 */
	public static final int GREY_VALUE = 5;

	/**
	 * The '<em><b>BLACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLACK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLACK
	 * @model literal="black"
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_VALUE = 6;

	/**
	 * An array of all the '<em><b>Colors</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Colors[] VALUES_ARRAY =
		new Colors[] {
			BLUE,
			ORANGE,
			GREEN,
			RED,
			PURPLE,
			GREY,
			BLACK,
		};

	/**
	 * A public read-only list of all the '<em><b>Colors</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Colors> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Colors</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Colors get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Colors result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Colors</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Colors getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Colors result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Colors</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Colors get(int value) {
		switch (value) {
			case BLUE_VALUE: return BLUE;
			case ORANGE_VALUE: return ORANGE;
			case GREEN_VALUE: return GREEN;
			case RED_VALUE: return RED;
			case PURPLE_VALUE: return PURPLE;
			case GREY_VALUE: return GREY;
			case BLACK_VALUE: return BLACK;
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
	private Colors(int value, String name, String literal) {
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
	
} //Colors
