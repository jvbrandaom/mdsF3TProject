/**
 */
package Academia;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AClassifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Academia.AClassifier#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link Academia.AClassifier#getAChilds <em>AChilds</em>}</li>
 * </ul>
 * </p>
 *
 * @see Academia.AcademiaPackage#getAClassifier()
 * @model abstract="true"
 * @generated
 */
public interface AClassifier extends AModeledElement, ADocumentatedElement {
	/**
	 * Returns the value of the '<em><b>TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TYPE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TYPE</em>' attribute.
	 * @see Academia.AcademiaPackage#getAClassifier_TYPE()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getTYPE();

	/**
	 * Returns the value of the '<em><b>AChilds</b></em>' reference list.
	 * The list contents are of type {@link Academia.AFeature}.
	 * It is bidirectional and its opposite is '{@link Academia.AFeature#getAParent <em>AParent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AChilds</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AChilds</em>' reference list.
	 * @see Academia.AcademiaPackage#getAClassifier_AChilds()
	 * @see Academia.AFeature#getAParent
	 * @model opposite="aParent"
	 * @generated
	 */
	EList<AFeature> getAChilds();

} // AClassifier
