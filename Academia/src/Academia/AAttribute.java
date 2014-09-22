/**
 */
package Academia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Academia.AAttribute#getAContainer <em>AContainer</em>}</li>
 *   <li>{@link Academia.AAttribute#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link Academia.AAttribute#isUnique <em>Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @see Academia.AcademiaPackage#getAAttribute()
 * @model annotation="GDMS documentation='An Attribute identifies a property which represents a desired information about the a feature.'"
 * @generated
 */
public interface AAttribute extends ANamedElement, ATypedElement, ABoundedElement, AModeledElement, ADocumentatedElement {
	/**
	 * Returns the value of the '<em><b>AContainer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Academia.AObject#getAAttributes <em>AAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AContainer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AContainer</em>' container reference.
	 * @see #setAContainer(AObject)
	 * @see Academia.AcademiaPackage#getAAttribute_AContainer()
	 * @see Academia.AObject#getAAttributes
	 * @model opposite="aAttributes" required="true" transient="false"
	 * @generated
	 */
	AObject getAContainer();

	/**
	 * Sets the value of the '{@link Academia.AAttribute#getAContainer <em>AContainer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AContainer</em>' container reference.
	 * @see #getAContainer()
	 * @generated
	 */
	void setAContainer(AObject value);

	/**
	 * Returns the value of the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Literal</em>' attribute.
	 * @see #setDefaultValueLiteral(String)
	 * @see Academia.AcademiaPackage#getAAttribute_DefaultValueLiteral()
	 * @model
	 * @generated
	 */
	String getDefaultValueLiteral();

	/**
	 * Sets the value of the '{@link Academia.AAttribute#getDefaultValueLiteral <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Literal</em>' attribute.
	 * @see #getDefaultValueLiteral()
	 * @generated
	 */
	void setDefaultValueLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see Academia.AcademiaPackage#getAAttribute_Unique()
	 * @model default="false"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link Academia.AAttribute#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

} // AAttribute
