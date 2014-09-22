/**
 */
package Academia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Academia.AParameter#getAContainer <em>AContainer</em>}</li>
 * </ul>
 * </p>
 *
 * @see Academia.AcademiaPackage#getAParameter()
 * @model annotation="GDMS documentation='A Parameter is a property of an operation. It is a value which must be passed to the operation so that it can be executed.'"
 * @generated
 */
public interface AParameter extends ANamedElement, ATypedElement, ABoundedElement, AModeledElement {
	/**
	 * Returns the value of the '<em><b>AContainer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Academia.AOperation#getAParameters <em>AParameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AContainer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AContainer</em>' container reference.
	 * @see #setAContainer(AOperation)
	 * @see Academia.AcademiaPackage#getAParameter_AContainer()
	 * @see Academia.AOperation#getAParameters
	 * @model opposite="aParameters" required="true" transient="false"
	 * @generated
	 */
	AOperation getAContainer();

	/**
	 * Sets the value of the '{@link Academia.AParameter#getAContainer <em>AContainer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AContainer</em>' container reference.
	 * @see #getAContainer()
	 * @generated
	 */
	void setAContainer(AOperation value);

} // AParameter
