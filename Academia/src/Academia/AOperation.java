/**
 */
package Academia;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Academia.AOperation#getAContainer <em>AContainer</em>}</li>
 *   <li>{@link Academia.AOperation#getAParameters <em>AParameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see Academia.AcademiaPackage#getAOperation()
 * @model annotation="GDMS documentation='A Operation is a function or an action associated to a feature.'"
 * @generated
 */
public interface AOperation extends ANamedElement, ATypedElement, ABoundedElement, AModeledElement, ADocumentatedElement {
	/**
	 * Returns the value of the '<em><b>AContainer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Academia.AObject#getAOperations <em>AOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AContainer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AContainer</em>' container reference.
	 * @see #setAContainer(AObject)
	 * @see Academia.AcademiaPackage#getAOperation_AContainer()
	 * @see Academia.AObject#getAOperations
	 * @model opposite="aOperations" required="true" transient="false"
	 * @generated
	 */
	AObject getAContainer();

	/**
	 * Sets the value of the '{@link Academia.AOperation#getAContainer <em>AContainer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AContainer</em>' container reference.
	 * @see #getAContainer()
	 * @generated
	 */
	void setAContainer(AObject value);

	/**
	 * Returns the value of the '<em><b>AParameters</b></em>' containment reference list.
	 * The list contents are of type {@link Academia.AParameter}.
	 * It is bidirectional and its opposite is '{@link Academia.AParameter#getAContainer <em>AContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AParameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AParameters</em>' containment reference list.
	 * @see Academia.AcademiaPackage#getAOperation_AParameters()
	 * @see Academia.AParameter#getAContainer
	 * @model opposite="aContainer" containment="true"
	 * @generated
	 */
	EList<AParameter> getAParameters();

} // AOperation
