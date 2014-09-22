/**
 */
package Academia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AFeature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Academia.AFeature#getStereo <em>Stereo</em>}</li>
 *   <li>{@link Academia.AFeature#getAParent <em>AParent</em>}</li>
 *   <li>{@link Academia.AFeature#getAAllParents <em>AAll Parents</em>}</li>
 *   <li>{@link Academia.AFeature#getProvidedAttributes <em>Provided Attributes</em>}</li>
 *   <li>{@link Academia.AFeature#getAttributesSQL <em>Attributes SQL</em>}</li>
 *   <li>{@link Academia.AFeature#getMultipleFields <em>Multiple Fields</em>}</li>
 *   <li>{@link Academia.AFeature#getAssociations <em>Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see Academia.AcademiaPackage#getAFeature()
 * @model abstract="true"
 *        annotation="GDMS documentation='A feature is a functional characteristic of the domain of a problem. A feature aggregates value to users.'"
 * @generated
 */
public interface AFeature extends AClassifier {
	/**
	 * Returns the value of the '<em><b>Stereo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereo</em>' attribute.
	 * @see Academia.AcademiaPackage#getAFeature_Stereo()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getStereo();

	/**
	 * Returns the value of the '<em><b>AParent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Academia.AClassifier#getAChilds <em>AChilds</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AParent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AParent</em>' reference.
	 * @see #setAParent(AClassifier)
	 * @see Academia.AcademiaPackage#getAFeature_AParent()
	 * @see Academia.AClassifier#getAChilds
	 * @model opposite="aChilds" required="true"
	 * @generated
	 */
	AClassifier getAParent();

	/**
	 * Sets the value of the '{@link Academia.AFeature#getAParent <em>AParent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AParent</em>' reference.
	 * @see #getAParent()
	 * @generated
	 */
	void setAParent(AClassifier value);

	/**
	 * Returns the value of the '<em><b>AAll Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AAll Parents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AAll Parents</em>' attribute.
	 * @see Academia.AcademiaPackage#getAFeature_AAllParents()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	String getAAllParents();

	/**
	 * Returns the value of the '<em><b>Provided Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Attributes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Attributes</em>' attribute.
	 * @see Academia.AcademiaPackage#getAFeature_ProvidedAttributes()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getProvidedAttributes();

	/**
	 * Returns the value of the '<em><b>Attributes SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes SQL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes SQL</em>' attribute.
	 * @see Academia.AcademiaPackage#getAFeature_AttributesSQL()
	 * @model required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	String getAttributesSQL();

	/**
	 * Returns the value of the '<em><b>Multiple Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Fields</em>' attribute.
	 * @see Academia.AcademiaPackage#getAFeature_MultipleFields()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	String getMultipleFields();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' attribute.
	 * @see Academia.AcademiaPackage#getAFeature_Associations()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	String getAssociations();

} // AFeature
