/**
 */
package Academia;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Academia.APackage#getDomain <em>Domain</em>}</li>
 *   <li>{@link Academia.APackage#getDProject <em>DProject</em>}</li>
 *   <li>{@link Academia.APackage#getAClassifiers <em>AClassifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see Academia.AcademiaPackage#getAPackage()
 * @model annotation="GDMS documentation='A Package contains instances of the features of a sub-set of the domain. The features of the package specifies the features that form an application.'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueApplication MissingApplication'"
 * @generated
 */
public interface APackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * The default value is <code>"Academia"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see Academia.AcademiaPackage#getAPackage_Domain()
	 * @model default="Academia" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDomain();

	/**
	 * Returns the value of the '<em><b>DProject</b></em>' attribute.
	 * The default value is <code>"academia"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DProject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DProject</em>' attribute.
	 * @see Academia.AcademiaPackage#getAPackage_DProject()
	 * @model default="academia" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDProject();

	/**
	 * Returns the value of the '<em><b>AClassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link Academia.AClassifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AClassifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AClassifiers</em>' containment reference list.
	 * @see Academia.AcademiaPackage#getAPackage_AClassifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<AClassifier> getAClassifiers();

} // APackage
