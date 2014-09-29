package dcore.persistence;

import java.util.List;
import java.util.Map;

import dcore.core.DObject;

/**
 * Defines the default methods for the classes which perform a persistent
 * strategy for the DSF. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public abstract class PersistenceStrategy {

	/**
	 * Creates a new DOBjectDAO instance that encapsulates the DObject passed as
	 * parameter. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param dObject
	 *            the DObject instance to be encapsulated by the DOBjectDAO.
	 * @return a DOBjectDAO instance or null if the DObjectDAO class is unknown.
	 * @generated
	 */
	public DObjectDAO newDAO(DObject dObject) {
		DObjectDAO dObjectDAO = null;
		try {
			dObjectDAO = getDAOClass().newInstance();
			dObjectDAO.setDObject(dObject);
		} catch (Exception e) {
			System.err
					.println("It was not possible to create a new DAO."
							+ "\nProbably the DObjectDAO class is unknown. Check the getDObjectDAOClass method.");
		}
		return dObjectDAO;
	}

	/**
	 * Override this method to indicate the application DAO class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an <code>DOBjectDAO</code> subclass.
	 * @generated
	 */
	public abstract Class<? extends DObjectDAO> getDAOClass();

	/**
	 * Removes registers from the database. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param table
	 *            the name of the table in the database where the register is
	 *            stored.
	 * @param whereClause
	 *            a valid SQL where clause filtering the registers to be
	 *            deleted. If this parameter is passed as null or empty, then
	 *            the query is executed with no where clause.
	 * @return true if the SQL delete operation was successful executed in the
	 *         database or false if not.
	 * @generated
	 */
	public abstract boolean delete(String table, String whereClause);

	/**
	 * Deletes the register in the database which corresponds to the DObject
	 * instance. In other words, it deletes the register whose id attribute has
	 * the same value of those of the DObject instance. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param dObject
	 *            the DObject instance whose register in the database must be
	 *            deleted.
	 * @return true if the SQL delete operation was successful executed in the
	 *         database or false if not.
	 * @generated
	 */
	public abstract boolean delete(DObjectDAO dObjectDAO);

	/**
	 * Executes a query based on one or more tables of the database. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param fieldClause
	 *            the name of the fields (separated by commas) whose information
	 *            must be loaded. If this parameter is passed as null or empty,
	 *            then the token '*' is assumed and all fields of the tables
	 *            involved in the query will be included.
	 * @param tables
	 *            the name of the tables (separated by commas) where the
	 *            information is loaded from.
	 * @param whereClause
	 *            a valid SQL where clause filtering the registers to be loaded.
	 *            If this parameter is passed as null or empty, then the query
	 *            is executed with no where clause.
	 * @return a list of lists of Object instances. Each Object instance
	 *         corresponds to a value (cell) and each list of Object instances
	 *         corresponds to a row of the result of the query.
	 * @generated
	 */
	public abstract List<List<Object>> load(String fieldClause, String tables,
			String whereClause);

	/**
	 * Loads a List of persisted DObject instances retrieving the registers from
	 * the database that matches to the condition passed as parameter. The
	 * instances that were loaded are set as persisted and not changed. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param clazz
	 *            a Class instance that corresponds to a DObject class. There
	 *            must be a table in the database with the same name of the
	 *            DObject class.
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
	public abstract List<DObject> load(Class<? extends DObject> clazz,
			Map<String, String> condition);

	/**
	 * Inserts a register in the database. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param table
	 *            the name of the table in the database where the register must
	 *            be stored.
	 * @param fieldClause
	 *            a valid SQL field clause specifying the fields where the
	 *            values must be inserted.
	 * @param valueClause
	 *            a valid SQL value clause specifying the values to be inserted.
	 * @return true if the SQL insert operation was successful executed in the
	 *         database or false if not.
	 * @generated
	 */
	public abstract boolean save(String table, String fieldClause,
			String valueClause);

	/**
	 * Inserts a register in the database which corresponds to the DObject
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param dObject
	 *            the DObject instance whose data must be stored as a register
	 *            in the database.
	 * @return true if the SQL insert operation was successful executed in the
	 *         database or false if not.
	 * @generated
	 */
	public abstract boolean save(DObjectDAO dObjectDAO);

	/**
	 * Updates the register in the database. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param table
	 *            the name of the table in the database where the register is
	 *            stored.
	 * @param setClause
	 *            a valid SQL set clause specifying the fields to be updated and
	 *            their new values.
	 * @param whereClause
	 *            a valid SQL where clause filtering the registers to be
	 *            updated. If this parameter is passed as null or empty, then
	 *            the query is executed with no where clause.
	 * @return true if the SQL update operation was successful executed in the
	 *         database or false if not.
	 * @generated
	 */
	public abstract boolean update(String table, String setClause,
			String whereClause);

	/**
	 * Updates the register in the database which corresponds to the DObject
	 * instance.
	 * 
	 * @param dObject
	 *            the DObject instance whose register in the database must be
	 *            updated.
	 * @return true if the SQL update operation was successful executed in the
	 *         database or false if not.
	 * @generated
	 */
	public abstract boolean update(DObjectDAO dObjectDAO);

}
