/**
 */
package Academia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AApplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Academia.AApplication#getPersistenceStrategy <em>Persistence Strategy</em>}</li>
 *   <li>{@link Academia.AApplication#getLoggingStrategy <em>Logging Strategy</em>}</li>
 *   <li>{@link Academia.AApplication#getDatabaseUser <em>Database User</em>}</li>
 *   <li>{@link Academia.AApplication#getDatabasePassword <em>Database Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see Academia.AcademiaPackage#getAApplication()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RootFeaturesOnly'"
 * @generated
 */
public interface AApplication extends AClassifier, ANamedElement {
	/**
	 * Returns the value of the '<em><b>Persistence Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link Academia.PersistenceStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Strategy</em>' attribute.
	 * @see Academia.PersistenceStrategy
	 * @see #setPersistenceStrategy(PersistenceStrategy)
	 * @see Academia.AcademiaPackage#getAApplication_PersistenceStrategy()
	 * @model required="true"
	 * @generated
	 */
	PersistenceStrategy getPersistenceStrategy();

	/**
	 * Sets the value of the '{@link Academia.AApplication#getPersistenceStrategy <em>Persistence Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Strategy</em>' attribute.
	 * @see Academia.PersistenceStrategy
	 * @see #getPersistenceStrategy()
	 * @generated
	 */
	void setPersistenceStrategy(PersistenceStrategy value);

	/**
	 * Returns the value of the '<em><b>Logging Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link Academia.LoggingStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logging Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logging Strategy</em>' attribute.
	 * @see Academia.LoggingStrategy
	 * @see #setLoggingStrategy(LoggingStrategy)
	 * @see Academia.AcademiaPackage#getAApplication_LoggingStrategy()
	 * @model required="true"
	 * @generated
	 */
	LoggingStrategy getLoggingStrategy();

	/**
	 * Sets the value of the '{@link Academia.AApplication#getLoggingStrategy <em>Logging Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logging Strategy</em>' attribute.
	 * @see Academia.LoggingStrategy
	 * @see #getLoggingStrategy()
	 * @generated
	 */
	void setLoggingStrategy(LoggingStrategy value);

	/**
	 * Returns the value of the '<em><b>Database User</b></em>' attribute.
	 * The default value is <code>"root"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database User</em>' attribute.
	 * @see #setDatabaseUser(String)
	 * @see Academia.AcademiaPackage#getAApplication_DatabaseUser()
	 * @model default="root"
	 * @generated
	 */
	String getDatabaseUser();

	/**
	 * Sets the value of the '{@link Academia.AApplication#getDatabaseUser <em>Database User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database User</em>' attribute.
	 * @see #getDatabaseUser()
	 * @generated
	 */
	void setDatabaseUser(String value);

	/**
	 * Returns the value of the '<em><b>Database Password</b></em>' attribute.
	 * The default value is <code>"root"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Password</em>' attribute.
	 * @see #setDatabasePassword(String)
	 * @see Academia.AcademiaPackage#getAApplication_DatabasePassword()
	 * @model default="root"
	 * @generated
	 */
	String getDatabasePassword();

	/**
	 * Sets the value of the '{@link Academia.AApplication#getDatabasePassword <em>Database Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Password</em>' attribute.
	 * @see #getDatabasePassword()
	 * @generated
	 */
	void setDatabasePassword(String value);

} // AApplication
