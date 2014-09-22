/**
 */
package Academia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AVariation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Academia.AVariation#getLocalAttributes <em>Local Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see Academia.AcademiaPackage#getAVariation()
 * @model annotation="GDMS documentation='A feature variation adds attributes and operations to feature objects, providing different behavior to them. Feature variation adds variability to feature objects, making slight changes in the application functionlity.'"
 * @generated
 */
public interface AVariation extends AFeature {
	/**
	 * Returns the value of the '<em><b>Local Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Attributes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Attributes</em>' attribute.
	 * @see Academia.AcademiaPackage#getAVariation_LocalAttributes()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	String getLocalAttributes();

} // AVariation
