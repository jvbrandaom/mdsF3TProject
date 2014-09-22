package dcore.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dcore.core.DObject;
import dcore.core.DReflection;
import dcore.logging.LoggingStrategy;

/**
 * Encapsulates a DObject in order to add functionality to it, such as
 * persistence and logging. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @see #DObject
 * @generated
 */
public abstract class DObjectDAO {

	/**
	 * Defines the logging strategy applied to the DObjectDAO. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private static LoggingStrategy loggingStrategy;

	/**
	 * Defines the persistence strategy applied to the DObjectDAO. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private static PersistenceStrategy persistenceStrategy;

	/**
	 * The DObject instance encapsulated by the DObjectDAO. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private DObject dObject;

	/**
	 * Constructor which loads the persistence strategy class indicated in the
	 * properties file and initializes the <code>persisted</code> and
	 * <code>changed</code> attributes as false and the stateLog as an empty
	 * String. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DObjectDAO() {
		loggingStrategy = getLoggingStrategy();
		persistenceStrategy = getPersistenceStrategy();
		dObject = null;
	}

	/**
	 * Constructor which loads the persistence strategy class indicated in the
	 * properties file and initializes the <code>persisted</code> and
	 * <code>changed</code> attributes as false and the stateLog as an empty
	 * String. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param dObject
	 *            the DObject instance to be encapsulated by the DAO.
	 * @generated
	 */
	public DObjectDAO(DObject dObject) {
		loggingStrategy = getLoggingStrategy();
		persistenceStrategy = getPersistenceStrategy();
		this.dObject = dObject;
	}

	/**
	 * Override this method to indicate the logging strategy adopted by the
	 * application. You can extend one of the logging strategies provided by the
	 * core of the framework or create a new strategy implementing
	 * <code>LoggingStrategy</code> interface. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of a <code>LoggingStrategy</code> subclass.
	 * @generated
	 */
	public abstract Class<? extends LoggingStrategy> getLoggingStrategyClass();

	/**
	 * Returns a instance of the logging strategy class used by the application.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of a <code>LoggingStrategy</code> subclass.
	 * @generated
	 */
	private LoggingStrategy getLoggingStrategy() {
		if (loggingStrategy == null) {
			try {
				loggingStrategy = (LoggingStrategy) Class.forName(
						getLoggingStrategyClass().getName()).newInstance();
			} catch (Exception e) {
			}
		}
		return loggingStrategy;
	}

	/**
	 * Override this method to indicate the persistence strategy adopted by the
	 * application. You can extend one of the persistence strategies provided by
	 * the core of the framework or create a new strategy implementing
	 * <code>PersistenceStrategy</code> interface. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an <code>PersistenceStrategy</code> subclass.
	 * @generated
	 */
	public abstract Class<? extends PersistenceStrategy> getPersistenceStrategyClass();

	/**
	 * Returns a instance of the persistence strategy class used by the
	 * application. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of a <code>PersistenceStrategy</code> subclass.
	 * @generated
	 */
	private PersistenceStrategy getPersistenceStrategy() {
		if (persistenceStrategy == null) {
			try {
				persistenceStrategy = (PersistenceStrategy) Class.forName(
						getPersistenceStrategyClass().getName()).newInstance();
			} catch (Exception e) {
			}
		}
		return persistenceStrategy;
	}

	/**
	 * Returns the information about the last persistence operation executed
	 * with this DObject instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the information stored in the state log of this DObject instance.
	 * @generated
	 */
	public LoggingStrategy getLog() {
		return loggingStrategy;
	}

	/**
	 * Returns the DObject instance of this DAO. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the DObject encapsulated by this DAO.
	 * @generated
	 */
	public DObject getDObject() {
		return dObject;
	}

	/**
	 * Sets the DObject instance of this DAO. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param dObject
	 *            the new DObject instance to be encapsulated by this DAO.
	 * @generated
	 */
	public void setDObject(DObject dObject) {
		this.dObject = dObject;
	}

	/**
	 * Deletes a persisted DObject instance removing its register in the
	 * database. The instance is set as not persisted and not changed. If this
	 * DObject instance is not persisted, no action is done. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return 1 if the register of the DObject instance is removed form the
	 *         database, 0 if no action is done or -1 if a failure occur and the
	 *         register of the DObject instance is not removed from the
	 *         database.
	 * @generated
	 */
	public int delete() {
		int output = persistenceStrategy.delete(this) == true ? 1 : -1;
		getLoggingStrategy().add("operation_delete_" + output, dObject);
		return output;
	}

	/**
	 * Loads a persisted DObject instance retrieving the register from the
	 * database that matches to the id attribute values passed as parameter. The
	 * DObject instance that was loaded is set as persisted and not changed.
	 * This method calls <code>getIdAttributes</code> to obtain the ID attribute
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param idFieldValues
	 *            the values of the ID attributes.
	 * @return a DObject instance that stores the data loaded from the register
	 *         or null if there is no register with such id in the database.
	 * @generated
	 */
	public void load(String[] idFieldValues) {
		String[] idFields = dObject.getIdFields();
		Map<String, String> condition = new HashMap<String, String>();
		for (int i = 0; i < idFields.length; i++) {
			condition.put(idFields[i], idFieldValues[i]);
		}
		DObject result = persistenceStrategy
				.load(dObject.getClass(), condition).get(0);
		int output = result == null ? -1 : 1;
		getLoggingStrategy().add("operation_load_" + output, dObject);
		if (result != null) {
			DReflection.copyValues(result, dObject);
		}
	}

	/**
	 * Loads a List of persisted DObject instances retrieving all the registers
	 * from the database that matches to the type of this class and to the
	 * condition passed as parameter. The DObject instances that were loaded are
	 * set as persisted and not changed. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param condition
	 *            a combination of fields/fields or fields/values that filters
	 *            the information retrieved from the database. If a null or a
	 *            empty Map is passed as parameter, then all registers in the
	 *            table are retrieved.
	 * @return a List of DObject instances which match to the condition or null
	 *         if a failure occurs. The List can be empty if no register in the
	 *         database match to the condition.
	 * @generated
	 */
	public List<? extends DObject> load(Map<String, String> condition) {
		List<? extends DObject> result = persistenceStrategy.load(
				dObject.getClass(), condition);
		int output = result == null ? -1 : 1;
		getLoggingStrategy().add("operation_load_" + output, dObject);
		return result;
	}

	/**
	 * Loads a List of persisted DObject instances retrieving all the registers
	 * from the database that matches to the type of this class. The DObject
	 * instances that were loaded are set as persisted and not changed. This
	 * method is equivalent to call <code>load("")</code>. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a List of DObject instances loaded from the database. This List
	 *         can be empty if there is no register in the database table
	 *         related to the DObject instance class.
	 * @generated
	 */
	public List<? extends DObject> loadAll() {
		return load(new HashMap<String, String>());
	}

	/**
	 * Saves a non-persisted DObject instance as a register in the database. The
	 * instance is set as persisted and not changed. If this DObject instance is
	 * persisted and changed, the <b>update</b> operation is invoked instead.
	 * However, if this DObject instance is persisted and not changed, no action
	 * is done. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return 1 if the DObject instance is saved as a register in the database
	 *         or updated, 0 if no action is done or -1 if a failure occur and
	 *         the DObject instance is not saved.
	 * @generated
	 */
	public int save() {
		int output = persistenceStrategy.save(this) == true ? 1 : -1;
		getLoggingStrategy().add("operation_save_" + output, dObject);
		return output;
	}

	/**
	 * Updates the register in the database that corresponds to the DObject
	 * instance with the data currently stored in this instance. The instance is
	 * set as persisted and not changed. If this DObject instance is changed and
	 * not persisted, the <b>save</b> operation is invoked instead. However, if
	 * this DObject instance is persisted and not changed, no action is done.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return 1 if the register of the DObject instance in the database is
	 *         updated or this instance is saved, 0 if no action is done or -1
	 *         if a failure occur and the register is not updated.
	 * @generated
	 */
	public int update() {
		int output = persistenceStrategy.update(this) == true ? 1 : 0;
		getLoggingStrategy().add("operation_update_" + output, dObject);
		return output;
	}

}
