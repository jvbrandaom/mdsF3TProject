/**
 */
package Academia;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Academia.AObject#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link Academia.AObject#getAAttributes <em>AAttributes</em>}</li>
 *   <li>{@link Academia.AObject#getAOperations <em>AOperations</em>}</li>
 *   <li>{@link Academia.AObject#getPrimaryKey <em>Primary Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see Academia.AcademiaPackage#getAObject()
 * @model annotation="GDMS documentation='A feature object is a domain feature that can be mandatory or optional. A set of Feature Objects composes the fuctionality of the applications.'"
 * @generated
 */
public interface AObject extends AFeature, ANamedElement {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see Academia.AcademiaPackage#getAObject_Abstract()
	 * @model default="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link Academia.AObject#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>AAttributes</b></em>' containment reference list.
	 * The list contents are of type {@link Academia.AAttribute}.
	 * It is bidirectional and its opposite is '{@link Academia.AAttribute#getAContainer <em>AContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AAttributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AAttributes</em>' containment reference list.
	 * @see Academia.AcademiaPackage#getAObject_AAttributes()
	 * @see Academia.AAttribute#getAContainer
	 * @model opposite="aContainer" containment="true"
	 * @generated
	 */
	EList<AAttribute> getAAttributes();

	/**
	 * Returns the value of the '<em><b>AOperations</b></em>' containment reference list.
	 * The list contents are of type {@link Academia.AOperation}.
	 * It is bidirectional and its opposite is '{@link Academia.AOperation#getAContainer <em>AContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AOperations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AOperations</em>' containment reference list.
	 * @see Academia.AcademiaPackage#getAObject_AOperations()
	 * @see Academia.AOperation#getAContainer
	 * @model opposite="aContainer" containment="true"
	 * @generated
	 */
	EList<AOperation> getAOperations();

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' attribute.
	 * @see Academia.AcademiaPackage#getAObject_PrimaryKey()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getPrimaryKey();

} // AObject
