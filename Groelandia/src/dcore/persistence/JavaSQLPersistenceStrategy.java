package dcore.persistence;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dcore.core.DFeature;
import dcore.core.DObject;
import dcore.core.DReflection;
import dcore.core.DVariation;

/**
 * A PersistenceStrategy subclass the uses the <code>java.sql</code> API to
 * implement the persistence functions. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @see #PersistenceStrategy
 * @generated
 */
public abstract class JavaSQLPersistenceStrategy extends PersistenceStrategy {

	/**
	 * Performs and maintain the connection to the database. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private static Connection connection;

	/**
	 * Constructor. Initializes the object with a null connection. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public JavaSQLPersistenceStrategy() {
		connection = null;
	}

	/**
	 * Override this method to indicate the database driver used by the
	 * application. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the name of a database driver.
	 * @generated
	 */
	public abstract String getDatabaseDriver();

	/**
	 * Override this method to indicate the URL of the database used by the
	 * application. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the URL of a database.
	 * @generated
	 */
	public abstract String getDatabaseURL();

	/**
	 * Override this method to indicate an user of the database adopted by the
	 * application. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the name of a database user.
	 * @generated
	 */
	public abstract String getDatabaseUser();

	/**
	 * Override this method to indicate the password of the user of the
	 * database. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the password of a database user.
	 * @generated
	 */
	public abstract String getDatabasePassword();

	/**
	 * This method returns an instance of <code>Connection</code>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the connection to the database.
	 * @generated
	 */
	private Connection getConnection() {
		if (connection == null)
			setConnection();
		return connection;
	}

	/**
	 * Configures the connection to the database. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private void setConnection() {
		try {
			Class.forName(getDatabaseDriver());
			connection = DriverManager.getConnection(getDatabaseURL(),
					getDatabaseUser(), getDatabasePassword());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.err
					.println("\n\nDB driver not found. Verify the path and restart the application.");
			System.exit(-1);
		} catch (Exception e) {
			StackTraceElement[] stack = e.getStackTrace();
			if (stack.length > 0) {
				System.err.println("Source\\File: " + stack[0].getFileName());
				System.err.println("Line: " + stack[0].getLineNumber());
				System.err.println("Message: " + e.getMessage());
				System.err.println("Exception: " + e);
			}
		}
	}

	/**
	 * Executes a manipulation SQL clause. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @throws java.sql.SQLException
	 * @generated
	 */
	public void executeManipulationSQL(String sql) throws SQLException {
		Statement statement = getConnection().createStatement(
				ResultSet.FETCH_FORWARD, ResultSet.CONCUR_READ_ONLY);
		statement.executeUpdate(sql);
		statement.close();
	}

	/**
	 * Executes a query SQL clause. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @throws java.sql.SQLException
	 * @return a ResultSet with the result of the query. It can be be empty if
	 *         no row in the database fulfill the query.
	 * @generated
	 */
	public ResultSet executeQuerySQL(String sql) throws SQLException {
		Statement statement = getConnection().createStatement(
				ResultSet.FETCH_FORWARD, ResultSet.CONCUR_READ_ONLY);
		return statement.executeQuery(sql);
	}

	/**
	 * Creates a field clause for a SQL insert operation based on the names of
	 * the attributes of a DObject instance. For example, if the names of the
	 * persistent fields of the instance are 'fldx' and 'fldy', then the insert
	 * field clause will be "fldx, fldy". <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param dObject
	 *            an instance of a DObject subclass.
	 * @return a field clause for a SQL insert operation.
	 * @generated
	 */
	public String getInsertFieldClause(DObject dObject) {

		String clause = "";
		int count = 0;

		for (String field : DReflection.getAllFieldNames(dObject.getClass())) {

			Class<?> fieldType = DReflection.getFieldType(dObject.getClass(),
					field, false);

			if (DReflection.isDVariation(fieldType)) { // if the field is a
														// variation strategy
				Class<?> variationClass = DReflection.getFieldDFeatureClass(
						dObject, field);
				for (Field variationField : variationClass.getDeclaredFields())
					clause += (++count > 1 ? ", " : "")
							+ variationField.getName();
				continue;
			}

			if (DReflection.isMultiple(dObject, field)) { // if the field is
															// multiple
				for (Class<?> mFieldClass : DReflection
						.invokeGetMultipleFieldClasses(dObject, field))
					clause += (++count > 1 ? ", " : "")
							+ DReflection.lowerCaseFirst(mFieldClass
									.getSimpleName());
				continue;
			}

			if (DReflection.isCollection(fieldType) || // if the field is a
														// collection or not
														// used
					(DReflection.isDObject(fieldType) && !DReflection
							.isFieldUsed(dObject, field)))
				continue; // ignore the field

			clause += (++count > 1 ? ", " : "") + field;
		}
		return clause;
	}

	/**
	 * Creates a field clause for a SQL insert operation based on the values of
	 * the attributes of a DObject instance. For example, if the values of the
	 * id attributes of the instance are '1' and 'DOG', then the insert field
	 * clause will be "1, 'DOG'". <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param dObject
	 *            an instance of a DObject subclass.
	 * @return a value clause for a SQL insert operation.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public String getInsertValueClause(DObject dObject) {

		String clause = "";
		int count = 0;

		for (String field : DReflection.getAllFieldNames(dObject.getClass())) {

			Class<?> fieldType = DReflection.getFieldType(dObject.getClass(),
					field, false);

			if (DReflection.isDVariation(fieldType)) { // if the field is a
														// variation strategy
				DVariation fdDVariation = (DVariation) DReflection
						.getFieldValue(dObject, field);
				for (Field variationField : fdDVariation.getClass()
						.getDeclaredFields())
					clause += (++count > 1 ? ", " : " ")
							+ DReflection.getFieldValueAsString(fdDVariation,
									variationField.getName(), true);
				continue;
			}

			if (DReflection.isMultiple(dObject, field)) { // if the field is
															// multiple
				List<DObject> mFieldValues = (List<DObject>) DReflection
						.getFieldValue(dObject, field);
				for (DObject mFieldDObj : mFieldValues)
					clause += (++count > 1 ? ", " : "")
							+ DReflection.getFieldValueAsString(mFieldDObj,
									mFieldDObj.getIdFields()[0], true);
			} else if (DReflection.isCollection(fieldType)) {
				continue;
			} else if (DReflection.isDObject(fieldType)
					&& DReflection.isFieldUsed(dObject, field)) {

				DObject fdDObject = (DObject) DReflection.getFieldValue(
						dObject, field);
				clause += (++count > 1 ? ", " : " ")
						+ DReflection.getFieldValueAsString(fdDObject,
								fdDObject.getIdFields()[0], true);
			} else {
				clause += (++count > 1 ? ", " : " ")
						+ DReflection.getFieldValueAsString(dObject, field,
								true);
			}

		}
		return clause;
	}

	/**
	 * Creates a set clause for a SQL update operation based on the names and
	 * values of the non-id attributes of a DObject instance. For example, if
	 * the names of the non-id attributes of the instance are 'description' and
	 * 'year' and their values are 'foo' and '2011', respectively, then the
	 * update set clause will be "description = 'foo' and year = 2011". <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param dObject
	 *            an instance of a DObject subclass.
	 * @return a set clause for a SQL update operation.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public String getUpdateSetClause(DObject dObject) {

		String clause = "";
		int count = 0;

		String[] fields = DReflection.getAllFieldNames(dObject.getClass());

		for (String field : fields) {

			if (DReflection.arrayContains(dObject.getIdFields(), field))
				continue;

			Class<?> fieldType = DReflection.getFieldType(dObject.getClass(),
					field, false);

			if (DReflection.isDVariation(fieldType)) { // if the field is a
														// variation strategy
				DVariation fdDVariation = (DVariation) DReflection
						.getFieldValue(dObject, field);
				for (Field variationField : fdDVariation.getClass()
						.getDeclaredFields()) {
					String vfName = variationField.getName();
					String vfValue = DReflection.getFieldValueAsString(
							fdDVariation, vfName, true);
					clause += (++count > 1 ? ", " : " ") + vfName + " = "
							+ vfValue;
				}
				continue;
			}

			if (DReflection.isMultiple(dObject, field)) { // if the field is
															// multiple

				Class<?>[] mfClasses = DReflection
						.invokeGetMultipleFieldClasses(dObject, field);
				List<DObject> mfValues = (List<DObject>) DReflection
						.getFieldValue(dObject, field);

				for (int i = 0; i < mfClasses.length; i++) {
					String mfName = DReflection.lowerCaseFirst(mfClasses[i]
							.getSimpleName());
					String mfID = mfValues.get(i).getIdFields()[0];
					String mfValue = DReflection.getFieldValueAsString(
							mfValues.get(i), mfID, true);
					clause += (++count > 1 ? ", " : " ") + mfName + " = "
							+ mfValue;
				}
			} else if (DReflection.isCollection(fieldType)) {
				continue;
			} else if (DReflection.isDObject(fieldType)) {

				if (!DReflection.isFieldUsed(dObject, field))
					continue; // the field is ignored because it is not used by
								// the application

				DObject fdDObject = (DObject) DReflection.getFieldValue(
						dObject, field);
				clause += (++count > 1 ? ", " : " ")
						+ field
						+ " = "
						+ DReflection.getFieldValueAsString(fdDObject,
								fdDObject.getIdFields()[0], true);
			} else {
				clause += (++count > 1 ? ", " : " ")
						+ field
						+ " = "
						+ DReflection.getFieldValueAsString(dObject, field,
								true);
			}
		}
		return clause;
	}

	/**
	 * Creates a where clause for a SQL operation based on the id attribute of a
	 * DObject instance. For example, if the names of the id attributes are
	 * 'idx' and 'idy' and their values are '1' and '2', respectively, then the
	 * where clause will be "idx = 1 and idy = 2". <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param dObject
	 *            an instance of a DObject subclass.
	 * @return a where clause for a SQL operation.
	 * @generated
	 */
	public String getWhereClause(DObject dObject) {

		String clause = "";
		int count = 0;

		for (String field : dObject.getIdFields()) {

			Class<?> fieldType = DReflection.getFieldType(dObject.getClass(),
					field, false);

			if (DReflection.isDObject(fieldType)) {
				DObject fieldDObject = (DObject) DReflection.getFieldValue(
						dObject, field);
				clause += (++count > 1 ? " and " : " ")
						+ field
						+ " = "
						+ DReflection.getFieldValueAsString(fieldDObject,
								fieldDObject.getIdFields()[0], true);
			} else {
				clause += (++count > 1 ? " and " : " ")
						+ field
						+ " = "
						+ DReflection.getFieldValueAsString(dObject, field,
								true);
			}
		}
		return clause;
	}

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
	public boolean delete(String table, String whereClause) {

		String command = "DELETE FROM "
				+ table
				+ (whereClause == null || whereClause.equals("") ? ";"
						: " WHERE " + whereClause + ";");

		try {
			executeManipulationSQL(command);
			return true;
		} catch (SQLException e) {
			StackTraceElement[] stack = e.getStackTrace();
			if (stack.length > 0) {
				System.err.println("Message: " + e.getMessage());
				System.err.println("Class/Table: " + table);
				System.err.println("Command: " + command);
				System.err.println("Exception: " + e);
			}
			return false;
		}
	}

	/**
	 * Deletes registers in the database which corresponds to the DObject
	 * instance. In other words, it deletes the register whose id attributes
	 * have the same value of those of the DObject instance. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param dObjectDAO
	 *            the DObjectDAO which contain the DObject instance whose
	 *            register in the database must be deleted.
	 * @return true if the SQL delete operation was successful executed in the
	 *         database or false if not.
	 * @generated
	 */
	@Override
	public boolean delete(DObjectDAO dObjectDAO) {

		DObject dObject = dObjectDAO.getDObject();
		Class<? extends DObject> dObjectClass = dObject.getClass();
		boolean result = true;

		for (String fieldName : DReflection.getAllFieldNames(dObjectClass)) {

			Class<?> fieldType = DReflection.getFieldType(dObjectClass,
					fieldName, false);

			if (DReflection.isCollection(fieldType)
					&& !DReflection.isMultiple(dObject, fieldName)) {
				result &= deleteCollectionField(dObjectDAO, fieldName);
				if (!result)
					break;
			}
		}
		if (result) {
			delete(dObjectClass.getSimpleName(), getWhereClause(dObject));
		}
		return result;
	}

	/**
	 * Deletes registers in the database which corresponds to a Collection
	 * fields of a DObject instance. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param dObjectDAO
	 *            the DObjectDAO which contains the DObject instance whose
	 *            register in the database must be deleted.
	 * @param fieldName
	 *            the name of the Collection field.
	 * @return true if the SQL delete operation was successful executed in the
	 *         database or false if not.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private boolean deleteCollectionField(DObjectDAO dObjectDAO,
			String fieldName) {

		DObject dObject = dObjectDAO.getDObject();
		boolean result = true;
		Class<? extends DObject> superClass = DReflection
				.getFirstDObjectSubclass(dObject.getClass());
		Class<?> fieldRawType = DReflection.getFieldType(dObject.getClass(),
				fieldName, true);

		// if the raw type of the collection is a subclass of DObject
		if (DReflection.isDObject(fieldRawType)) {

			Class<? extends DObject> appClass = (Class<? extends DObject>) DReflection
					.getFieldDFeatureClass(dObject, fieldName);
			Collection<DObject> fieldValue = (Collection<DObject>) DReflection
					.getFieldValue(dObject, fieldName);

			// does the many to many table represent a DObject subclass
			// (containment)?
			if (DReflection.isDObjectContainment(appClass)) {
				for (DObject containment : fieldValue) {
					if (!delete(newDAO(containment)))
						result = false;
				}
			}
			// if the field is not a containment
			else {
				String table = dObject.getClass().getSimpleName()
						+ appClass.getSimpleName();
				String where = superClass.getSimpleName()
						+ " = "
						+ DReflection.getFieldValueAsString(dObject,
								dObject.getIdFields()[0], true);
				delete(table, where);
			}
		}
		// if the raw type of the collection is not a subclass of DObject
		else {
			String table = dObject.getClass().getSimpleName() + fieldName;
			String where = superClass.getSimpleName()
					+ " = "
					+ DReflection.getFieldValueAsString(dObject,
							dObject.getIdFields()[0], true);
			delete(table, where);
		}
		return result;
	}

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
	@Override
	public List<List<Object>> load(String fieldClause, String tables,
			String whereClause) {

		String command = "SELECT "
				+ (fieldClause == null || fieldClause.equals("") ? "* "
						: fieldClause)
				+ "FROM "
				+ tables
				+ (whereClause == null || whereClause.equals("") ? ";"
						: " WHERE " + whereClause + ";");

		try {
			ResultSet resultSet = executeQuerySQL(command);
			List<List<Object>> result = new ArrayList<List<Object>>();
			while (resultSet.next()) {
				ArrayList<Object> row = new ArrayList<Object>();
				for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
					row.add(resultSet.getObject(i));
				}
				result.add(row);
			}
			resultSet.getStatement().close();
			return result;

		} catch (SQLException e) {
			StackTraceElement[] stack = e.getStackTrace();
			if (stack.length > 0) {
				System.err.println("Message: " + e.getMessage());
				System.err.println("Classes/Tables: " + tables);
				System.err.println("Command: " + command);
				System.err.println("Exception: " + e);
			}
			return null;
		}
	}

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
	@SuppressWarnings("unchecked")
	@Override
	public List<DObject> load(Class<? extends DObject> clazz,
			Map<String, String> condition) {

		List<DObject> result = new ArrayList<DObject>();
		String command = "SELECT * FROM " + clazz.getSimpleName();

		if (condition != null && condition.size() > 0) {
			command += " WHERE ";
			String[] whereFields = condition.keySet().toArray(new String[] {});
			for (int i = 0; i < condition.size(); i++) {
				command += (i > 0 ? " AND " : "")
						+ whereFields[i]
						+ " = "
						+ DReflection.formatValue(
								condition.get(whereFields[i]), DReflection
										.getFieldType(clazz, whereFields[i],
												false));
			}
		}

		try {
			ResultSet resultSet = executeQuerySQL(command);
			while (resultSet.next()) {

				DObject dObject = (DObject) DReflection.newInstance(clazz);
				String[] fieldNames = DReflection.getAllFieldNames(clazz);

				for (String fieldName : fieldNames) {

					if (dObject.isContainment()
							&& dObject.getContainer().equals(fieldName)) {
						continue; // container field is not loaded in order to
									// avoid infinity loop
					}

					Class<?> fieldType = DReflection.getFieldType(clazz,
							fieldName, false);
					Object fieldValue = null;

					if (DReflection.isDVariation(fieldType)) { // variation
						DVariation fdDVariation = (DVariation) DReflection
								.getFieldValue(dObject, fieldName);
						for (Field variationField : fdDVariation.getClass()
								.getDeclaredFields()) {
							String vName = variationField.getName();
							DReflection.setFieldValue(fdDVariation, vName,
									resultSet.getObject(vName));
						}
						continue;
					}

					else if (DReflection.isMultiple(dObject, fieldName)) { // multiple

						Class<DObject>[] mfClasses = (Class<DObject>[]) DReflection
								.invokeGetMultipleFieldClasses(dObject,
										fieldName);
						List<DObject> mfField = new ArrayList<DObject>();
						for (Class<DObject> mfClass : mfClasses) {
							String mfClassFieldName = DReflection
									.lowerCaseFirst(mfClass.getSimpleName());
							Object mfFieldIDValue = resultSet
									.getObject(mfClassFieldName);
							DObject mfValue = (DObject) DReflection
									.newInstance(mfClass);
							newDAO(mfValue).load(
									new String[] { "" + mfFieldIDValue });
							mfField.add(mfValue);
						}
						fieldValue = mfField;
					}

					else if (DReflection.isDObject(fieldType)
							&& !DReflection.isFieldUsed(dObject, fieldName)) {
						continue;
					}

					else if (DReflection.isCollection(fieldType)) {
						fieldValue = loadCollectionField(dObject, fieldName);
					}

					else {
						fieldValue = resultSet.getObject(fieldName);
						if (DReflection.isDObject(fieldType)) {
							Class<? extends DFeature> fieldClass = DReflection
									.getFieldDFeatureClass(dObject, fieldName);
							DObject association = (DObject) DReflection
									.newInstance(fieldClass);
							newDAO(association).load(
									new String[] { "" + fieldValue });
							fieldValue = association;
						}
					}

					if (fieldValue != null) {
						DReflection.setFieldValue(dObject, fieldName,
								fieldValue);
					}
				}
				result.add(dObject);
			}
			resultSet.getStatement().close();
			return result;

		} catch (SQLException e) {
			StackTraceElement[] stack = e.getStackTrace();
			if (stack.length > 0) {
				System.err.println("Message: " + e.getMessage());
				System.err.println("Class/Table: " + clazz.getSimpleName());
				System.err.println("Command: " + command);
				System.err.println("Exception: " + e);
			}
			return null;
		}
	}

	/**
	 * Loads the values of a field which is a Collection. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param dObject
	 *            the DObject instance whose collection field value will be
	 *            loaded.
	 * @param fieldName
	 *            the name of the collection field whose value will be loaded.
	 * @return a collection containing the values of the field or null if the
	 *         values cannot be loaded.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Collection<?> loadCollectionField(DObject dObject, String fieldName) {

		Collection<?> fieldValue = null;

		Class<? extends DObject> superClass = DReflection
				.getFirstDObjectSubclass(dObject.getClass());
		Class<?> fieldRawType = DReflection.getFieldType(dObject.getClass(),
				fieldName, true);

		if (DReflection.isDObject(fieldRawType)
				&& !DReflection.isFieldUsed(dObject, fieldName)) {
			return null; // the field is a feature not used by the application
		}

		String idField = dObject.getIdFields()[0];
		String idFieldValue = DReflection.getFieldValueAsString(dObject,
				idField, false);

		// if the raw type of the collection is a subclass of DObject
		if (DObject.class.isAssignableFrom(fieldRawType)) {

			List<DObject> association = new ArrayList<DObject>();
			Class<? extends DObject> appClass = (Class<? extends DObject>) DReflection
					.getFieldDFeatureClass(dObject, fieldName);

			// does the many to many table represent a DObject subclass
			// (containment)?
			if (DReflection.isDObjectContainment(appClass)) {

				Map<String, String> fieldCondition = new HashMap<String, String>();
				fieldCondition.put(superClass.getSimpleName(), idFieldValue);
				association = load(appClass, fieldCondition);

				for (DObject containment : association) {
					DReflection.setFieldValue(containment, DReflection
							.lowerCaseFirst(superClass.getSimpleName()),
							dObject);
				}
			}
			// if the field is not a containment
			else {
				List<List<Object>> many2many = load(fieldName, dObject
						.getClass().getSimpleName() + appClass.getSimpleName(),
						idField + " = " + idFieldValue);
				for (List<Object> fieldLoads : many2many) {
					DObject fieldInstance = (DObject) DReflection
							.newInstance(appClass);
					newDAO(fieldInstance).load(
							new String[] { fieldLoads.get(0) + "" });
					association.add(fieldInstance);
				}
			}
			fieldValue = association;
		}
		// if the raw type of the collection is not a subclass of DObject
		else {
			List<Object> multiField = new ArrayList<Object>();
			List<List<Object>> multValues = load(fieldName, dObject.getClass()
					.getSimpleName() + fieldName, idField + " = "
					+ idFieldValue);
			for (List<Object> fieldLoads : multValues) {
				multiField.add(fieldLoads.get(0));
			}
			fieldValue = multiField;
		}

		return fieldValue;
	}

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
	 */
	public boolean save(String table, String fieldClause, String valueClause) {

		String command = "INSERT INTO " + table + " (" + fieldClause
				+ ") VALUES (" + valueClause + ");";

		try {
			executeManipulationSQL(command);
			return true;
		} catch (SQLException e) {
			StackTraceElement[] stack = e.getStackTrace();
			if (stack.length > 0) {
				System.err.println("Message: " + e.getMessage());
				System.err.println("Class/Table: " + table);
				System.err.println("Command: " + command);
				System.err.println("Exception: " + e);
			}
			return false;
		}
	}

	/**
	 * Inserts a register in the database which corresponds to the DObject
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param dObjectDAO
	 *            the DObjectDAO which contains the DObject instance whose data
	 *            must be stored as a register in the database.
	 * @return true if the SQL insert operation was successful executed in the
	 *         database or false if not.
	 * @generated
	 */
	@Override
	public boolean save(DObjectDAO dObjectDAO) {

		DObject dObject = dObjectDAO.getDObject();
		boolean result = save(dObject.getClass().getSimpleName(),
				getInsertFieldClause(dObject), getInsertValueClause(dObject));

		if (result) {
			for (String fieldName : DReflection.getAllFieldNames(dObject
					.getClass())) {

				Class<?> fieldType = DReflection.getFieldType(
						dObject.getClass(), fieldName, false);

				if (DReflection.isCollection(fieldType)
						&& !DReflection.isMultiple(dObject, fieldName)) {
					result &= saveCollectionField(dObjectDAO, fieldName);
				}

			}
		}
		return result;
	}

	/**
	 * Inserts registers in the database corresponding to a Collection field of
	 * a DObject instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param dObjectDAO
	 *            the DObjectDAO which contains the DObject instance whose data
	 *            must be stored as a register in the database.
	 * @param fieldName
	 *            the name of the Collection field.
	 * @return true if the SQL insert operation was successful executed in the
	 *         database or false if not.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private boolean saveCollectionField(DObjectDAO dObjectDAO, String fieldName) {

		DObject dObject = dObjectDAO.getDObject();
		boolean result = true;
		Class<? extends DObject> superClass = DReflection
				.getFirstDObjectSubclass(dObject.getClass());
		Class<?> fieldRawType = DReflection.getFieldType(dObject.getClass(),
				fieldName, true);

		// if the raw type of the collection is a subclass of DObject
		if (DObject.class.isAssignableFrom(fieldRawType)) {

			Class<? extends DObject> appClass = (Class<? extends DObject>) DReflection
					.getFieldDFeatureClass(dObject, fieldName);

			if (appClass == null) // the field is a association to an optional
									// feature
				return true; // and the application does not uses it.

			Collection<DObject> fieldValue = (Collection<DObject>) DReflection
					.getFieldValue(dObject, fieldName);

			// does the many to many table represent a DObject subclass
			// (containment)?
			if (DReflection.isDObjectContainment(appClass)) {
				for (DObject containment : fieldValue) {
					if (!save(newDAO(containment)))
						result = false;
				}
			}
			// if the field is not a containment
			else {
				for (DObject association : fieldValue) {
					String table = dObject.getClass().getSimpleName()
							+ appClass.getSimpleName();
					String field = superClass.getSimpleName() + ", "
							+ fieldName;
					String value = DReflection.getFieldValueAsString(dObject,
							dObject.getIdFields()[0], true)
							+ ", "
							+ DReflection.getFieldValueAsString(association,
									association.getIdFields()[0], true);
					result = save(table, field, value);
				}
			}
		}
		// if the raw type of the collection is not a subclass of DObject
		else {
			Collection<Object> fieldValue = (Collection<Object>) DReflection
					.getFieldValue(dObject, fieldName);
			for (Object multiFieldValue : fieldValue) {
				String table = dObject.getClass().getSimpleName() + fieldName;
				String field = superClass.getSimpleName() + ", " + fieldName;
				String value = DReflection.getFieldValueAsString(dObject,
						dObject.getIdFields()[0], true)
						+ ", "
						+ DReflection
								.formatValue(multiFieldValue, fieldRawType);
				result = save(table, field, value);
			}
		}
		return result;
	}

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
	public boolean update(String table, String setClause, String whereClause) {

		String command = "UPDATE "
				+ table
				+ " SET "
				+ setClause
				+ (whereClause == null || whereClause.equals("") ? ";"
						: " WHERE " + whereClause + ";");

		try {
			executeManipulationSQL(command);
			return true;
		} catch (SQLException e) {
			StackTraceElement[] stack = e.getStackTrace();
			if (stack.length > 0) {
				System.err.println("Message: " + e.getMessage());
				System.err.println("Class/Table: " + table);
				System.err.println("Command: " + command);
				System.err.println("Exception: " + e);
			}
			return false;
		}
	}

	/**
	 * Updates the register in the database which corresponds to the DObject
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param dObjectDAO
	 *            the DObjectDAO which contains the DObject instance whose
	 *            register in the database must be updated.
	 * @return true if the SQL update operation was successful executed in the
	 *         database or false if not.
	 * @generated
	 */
	@Override
	public boolean update(DObjectDAO dObjectDAO) {

		DObject dObject = dObjectDAO.getDObject();
		boolean result = update(dObject.getClass().getSimpleName(),
				getUpdateSetClause(dObject), getWhereClause(dObject));

		if (result) {
			for (String fieldName : DReflection.getAllFieldNames(dObject
					.getClass())) {

				Class<?> fieldType = DReflection.getFieldType(
						dObject.getClass(), fieldName, false);

				if (DReflection.isCollection(fieldType)
						&& !DReflection.isMultiple(dObject, fieldName)) {
					result &= updateCollectionField(dObjectDAO, fieldName);
				}
			}
		}
		return result;
	}

	/**
	 * Updates the registers in the database which corresponds to a Collection
	 * field of a DObject instance. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param dObjectDAO
	 *            the DObjectDAO which contains the DObject instance whose
	 *            register in the database must be updated.
	 * @param fieldName
	 *            the name of the Collection field.
	 * @return true if the SQL update operation was successful executed in the
	 *         database or false if not.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private boolean updateCollectionField(DObjectDAO dObjectDAO,
			String fieldName) {

		DObject dObject = dObjectDAO.getDObject();
		boolean result = true;
		Class<? extends DObject> superClass = DReflection
				.getFirstDObjectSubclass(dObject.getClass());
		Class<?> fieldRawType = DReflection.getFieldType(dObject.getClass(),
				fieldName, true);

		// if the raw type of the collection is a subclass of DObject
		if (DObject.class.isAssignableFrom(fieldRawType)) {

			Class<? extends DObject> appClass = (Class<? extends DObject>) DReflection
					.getFieldDFeatureClass(dObject, fieldName);

			if (appClass == null) // the field is a association to an optional
									// feature
				return true; // and the application does not uses it.

			Collection<DObject> fieldValue = (Collection<DObject>) DReflection
					.getFieldValue(dObject, fieldName);

			// does the many to many table represent a DObject subclass
			// (containment)?
			if (DReflection.isDObjectContainment(appClass)) {

				delete(appClass.getSimpleName(),
						superClass.getSimpleName()
								+ " = "
								+ DReflection.getFieldValueAsString(dObject,
										dObject.getIdFields()[0], true));

				for (DObject containment : fieldValue) {
					if (!save(newDAO(containment)))
						result = false;
				}
			}
			// if the field is not a containment
			else {
				String table = dObject.getClass().getSimpleName()
						+ appClass.getSimpleName();
				String where = superClass.getSimpleName()
						+ " = "
						+ DReflection.getFieldValueAsString(dObject,
								dObject.getIdFields()[0], true);

				delete(table, where);

				for (DObject association : fieldValue) {
					String field = superClass.getSimpleName() + ", "
							+ fieldName;
					String value = DReflection.getFieldValueAsString(dObject,
							dObject.getIdFields()[0], true)
							+ ", "
							+ DReflection.getFieldValueAsString(association,
									association.getIdFields()[0], true);
					result = save(table, field, value);
				}
			}
		}
		// if the raw type of the collection is not a subclass of DObject
		else {
			String table = dObject.getClass().getSimpleName() + fieldName;
			String where = superClass.getSimpleName()
					+ " = "
					+ DReflection.getFieldValueAsString(dObject,
							dObject.getIdFields()[0], true);

			delete(table, where);

			Collection<Object> fieldValue = (Collection<Object>) DReflection
					.getFieldValue(dObject, fieldName);
			for (Object multiFieldValue : fieldValue) {
				String field = superClass.getSimpleName() + ", " + fieldName;
				String value = DReflection.getFieldValueAsString(dObject,
						dObject.getIdFields()[0], true)
						+ ", "
						+ DReflection
								.formatValue(multiFieldValue, fieldRawType);
				result = save(table, field, value);
			}
		}
		return result;
	}

}
