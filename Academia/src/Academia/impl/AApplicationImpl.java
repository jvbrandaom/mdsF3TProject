/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Academia.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import Academia.AApplication;
import Academia.ANamedElement;
import Academia.LoggingStrategy;
import Academia.PersistenceStrategy;
import Academia.AcademiaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AApplication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Academia.impl.AApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link Academia.impl.AApplicationImpl#getPersistenceStrategy <em>Persistence Strategy</em>}</li>
 *   <li>{@link Academia.impl.AApplicationImpl#getLoggingStrategy <em>Logging Strategy</em>}</li>
 *   <li>{@link Academia.impl.AApplicationImpl#getDatabaseUser <em>Database User</em>}</li>
 *   <li>{@link Academia.impl.AApplicationImpl#getDatabasePassword <em>Database Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AApplicationImpl extends AClassifierImpl implements AApplication {

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getPersistenceStrategy() <em>Persistence Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final PersistenceStrategy PERSISTENCE_STRATEGY_EDEFAULT = PersistenceStrategy.JAVA;
	/**
	 * The cached value of the '{@link #getPersistenceStrategy() <em>Persistence Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceStrategy()
	 * @generated
	 * @ordered
	 */
	protected PersistenceStrategy persistenceStrategy = PERSISTENCE_STRATEGY_EDEFAULT;
	/**
	 * The default value of the '{@link #getLoggingStrategy() <em>Logging Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggingStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final LoggingStrategy LOGGING_STRATEGY_EDEFAULT = LoggingStrategy.PROPERTIES_FILE;
	/**
	 * The cached value of the '{@link #getLoggingStrategy() <em>Logging Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggingStrategy()
	 * @generated
	 * @ordered
	 */
	protected LoggingStrategy loggingStrategy = LOGGING_STRATEGY_EDEFAULT;
	/**
	 * The default value of the '{@link #getDatabaseUser() <em>Database User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseUser()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_USER_EDEFAULT = "root";
	/**
	 * The cached value of the '{@link #getDatabaseUser() <em>Database User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseUser()
	 * @generated
	 * @ordered
	 */
	protected String databaseUser = DATABASE_USER_EDEFAULT;
	/**
	 * The default value of the '{@link #getDatabasePassword() <em>Database Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePassword()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_PASSWORD_EDEFAULT = "root";
	/**
	 * The cached value of the '{@link #getDatabasePassword() <em>Database Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePassword()
	 * @generated
	 * @ordered
	 */
	protected String databasePassword = DATABASE_PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcademiaPackage.Literals.AAPPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.AAPPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceStrategy getPersistenceStrategy() {
		return persistenceStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceStrategy(PersistenceStrategy newPersistenceStrategy) {
		PersistenceStrategy oldPersistenceStrategy = persistenceStrategy;
		persistenceStrategy = newPersistenceStrategy == null ? PERSISTENCE_STRATEGY_EDEFAULT : newPersistenceStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.AAPPLICATION__PERSISTENCE_STRATEGY, oldPersistenceStrategy, persistenceStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingStrategy getLoggingStrategy() {
		return loggingStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoggingStrategy(LoggingStrategy newLoggingStrategy) {
		LoggingStrategy oldLoggingStrategy = loggingStrategy;
		loggingStrategy = newLoggingStrategy == null ? LOGGING_STRATEGY_EDEFAULT : newLoggingStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.AAPPLICATION__LOGGING_STRATEGY, oldLoggingStrategy, loggingStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseUser() {
		return databaseUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseUser(String newDatabaseUser) {
		String oldDatabaseUser = databaseUser;
		databaseUser = newDatabaseUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.AAPPLICATION__DATABASE_USER, oldDatabaseUser, databaseUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabasePassword() {
		return databasePassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasePassword(String newDatabasePassword) {
		String oldDatabasePassword = databasePassword;
		databasePassword = newDatabasePassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.AAPPLICATION__DATABASE_PASSWORD, oldDatabasePassword, databasePassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcademiaPackage.AAPPLICATION__NAME:
				return getName();
			case AcademiaPackage.AAPPLICATION__PERSISTENCE_STRATEGY:
				return getPersistenceStrategy();
			case AcademiaPackage.AAPPLICATION__LOGGING_STRATEGY:
				return getLoggingStrategy();
			case AcademiaPackage.AAPPLICATION__DATABASE_USER:
				return getDatabaseUser();
			case AcademiaPackage.AAPPLICATION__DATABASE_PASSWORD:
				return getDatabasePassword();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AcademiaPackage.AAPPLICATION__NAME:
				setName((String)newValue);
				return;
			case AcademiaPackage.AAPPLICATION__PERSISTENCE_STRATEGY:
				setPersistenceStrategy((PersistenceStrategy)newValue);
				return;
			case AcademiaPackage.AAPPLICATION__LOGGING_STRATEGY:
				setLoggingStrategy((LoggingStrategy)newValue);
				return;
			case AcademiaPackage.AAPPLICATION__DATABASE_USER:
				setDatabaseUser((String)newValue);
				return;
			case AcademiaPackage.AAPPLICATION__DATABASE_PASSWORD:
				setDatabasePassword((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AcademiaPackage.AAPPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AcademiaPackage.AAPPLICATION__PERSISTENCE_STRATEGY:
				setPersistenceStrategy(PERSISTENCE_STRATEGY_EDEFAULT);
				return;
			case AcademiaPackage.AAPPLICATION__LOGGING_STRATEGY:
				setLoggingStrategy(LOGGING_STRATEGY_EDEFAULT);
				return;
			case AcademiaPackage.AAPPLICATION__DATABASE_USER:
				setDatabaseUser(DATABASE_USER_EDEFAULT);
				return;
			case AcademiaPackage.AAPPLICATION__DATABASE_PASSWORD:
				setDatabasePassword(DATABASE_PASSWORD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AcademiaPackage.AAPPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AcademiaPackage.AAPPLICATION__PERSISTENCE_STRATEGY:
				return persistenceStrategy != PERSISTENCE_STRATEGY_EDEFAULT;
			case AcademiaPackage.AAPPLICATION__LOGGING_STRATEGY:
				return loggingStrategy != LOGGING_STRATEGY_EDEFAULT;
			case AcademiaPackage.AAPPLICATION__DATABASE_USER:
				return DATABASE_USER_EDEFAULT == null ? databaseUser != null : !DATABASE_USER_EDEFAULT.equals(databaseUser);
			case AcademiaPackage.AAPPLICATION__DATABASE_PASSWORD:
				return DATABASE_PASSWORD_EDEFAULT == null ? databasePassword != null : !DATABASE_PASSWORD_EDEFAULT.equals(databasePassword);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ANamedElement.class) {
			switch (derivedFeatureID) {
				case AcademiaPackage.AAPPLICATION__NAME: return AcademiaPackage.ANAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ANamedElement.class) {
			switch (baseFeatureID) {
				case AcademiaPackage.ANAMED_ELEMENT__NAME: return AcademiaPackage.AAPPLICATION__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", persistenceStrategy: ");
		result.append(persistenceStrategy);
		result.append(", loggingStrategy: ");
		result.append(loggingStrategy);
		result.append(", databaseUser: ");
		result.append(databaseUser);
		result.append(", databasePassword: ");
		result.append(databasePassword);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getTYPE() {
		return "AAPPLICATION";
	}
	
} //AApplicationImpl
