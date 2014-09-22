/**
 */
package Academia;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ANamed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Academia.ANamedElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Academia.AcademiaPackage#getANamedElement()
 * @model abstract="true"
 *        annotation="GDMS documentation='A Named Element is an element that has a name.'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvalidName MissingName UniqueName'"
 * @generated
 */
public interface ANamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Academia.AcademiaPackage#getANamedElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Academia.ANamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ANamedElement
