/**
 */
package Academia;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ABounded Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Academia.ABoundedElement#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link Academia.ABoundedElement#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see Academia.AcademiaPackage#getABoundedElement()
 * @model abstract="true"
 *        annotation="GDMS documentation='A Bounded Element is a element that has lower and upper bounds.'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LowerBoundInvalidValue UpperBoundInvalidValue'"
 * @generated
 */
public interface ABoundedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(String)
	 * @see Academia.AcademiaPackage#getABoundedElement_LowerBound()
	 * @model default="0" required="true"
	 * @generated
	 */
	String getLowerBound();

	/**
	 * Sets the value of the '{@link Academia.ABoundedElement#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(String value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(String)
	 * @see Academia.AcademiaPackage#getABoundedElement_UpperBound()
	 * @model default="1" required="true"
	 * @generated
	 */
	String getUpperBound();

	/**
	 * Sets the value of the '{@link Academia.ABoundedElement#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(String value);

} // ABoundedElement
