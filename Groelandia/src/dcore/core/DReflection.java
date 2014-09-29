package dcore.core;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;

/**
 * Provides reflection function to DFeature subclasses, such as to return the
 * names and type of classes, attributes and methods, besides other auxiliary
 * functions. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @see #DFeature
 * @see #DObject
 * @see #DVariation
 * @generated
 */
public class DReflection {

	/**
	 * Standard date format used by DObjectReflection class. Its value is
	 * <b>yyyy-MM-dd</b>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final String DATE_FORMAT = "yyyy-MM-dd";

	/**
	 * Returns the same String with the first character in upper case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            is the String to be capitalized.
	 * @return the same String with the first character in upper case.
	 * @generated
	 */
	public static String upperCaseFirst(String str) {
		return Character.toUpperCase(str.charAt(0)) + str.substring(1);
	}

	/**
	 * Returns the same String with the first character in lower case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param nameis
	 *            the String to be uncapitalized.
	 * @return the same String with the first character in lower case.
	 * @generated
	 */
	public static String lowerCaseFirst(String str) {
		return Character.toLowerCase(str.charAt(0)) + str.substring(1);
	}

	/**
	 * Creates a new instance of a class that extends DObject. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param clazz
	 *            a <b>Class</b> instance of a class that extends DObject.
	 * @return a new instance of the class passed as parameter or null if such
	 *         class is not recognized.
	 * @generated
	 */
	public static DFeature newInstance(Class<? extends DFeature> clazz) {
		try {
			return (DFeature) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Returns the a String representation of a DObject instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param dObject
	 *            the dObject instance to be read and returned as String.
	 * @return the same String with the first character in lower case.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static String toString(DObject dObject) {

		String result = dObject.getClass().getSimpleName() + "[";
		String[] fieldNames = DReflection.getAllFieldNames(dObject.getClass());

		for (String fieldName : fieldNames) {

			if (dObject.isContainment()
					&& dObject.getContainer().equals(fieldName)) {
				continue; // container field is not loaded in order to avoid
							// infinity loop
			}

			Class<?> fieldType = DReflection.getFieldType(dObject.getClass(),
					fieldName, false);

			if (DReflection.isDVariation(fieldType)) { // if the field is a
														// variation strategy
				DVariation fdDVariation = (DVariation) DReflection
						.getFieldValue(dObject, fieldName);
				for (Field variationField : fdDVariation.getClass()
						.getDeclaredFields()) {
					String vfName = variationField.getName();
					String vfValue = DReflection.getFieldValueAsString(
							fdDVariation, vfName, false);
					result += "\n  " + vfName + ": " + vfValue;
				}
				continue;
			}

			if (DReflection.isMultiple(dObject, fieldName)) { // if the field is
																// multiple

				Class<?>[] mfClasses = DReflection
						.invokeGetMultipleFieldClasses(dObject, fieldName);
				List<DObject> mfValues = (List<DObject>) DReflection
						.getFieldValue(dObject, fieldName);

				for (int i = 0; i < mfClasses.length; i++) {
					String mfName = DReflection.lowerCaseFirst(mfClasses[i]
							.getSimpleName());
					String mfID = mfValues.get(i).getIdFields()[0];
					String mfValue = DReflection.getFieldValueAsString(
							mfValues.get(i), mfID, false);
					result += "\n  " + mfName + ": " + mfValue;
				}
			}

			else if (DReflection.isDObject(fieldType)
					&& DReflection.isFieldUsed(dObject, fieldName)) {
				DObject fdDObject = (DObject) DReflection.getFieldValue(
						dObject, fieldName);
				result += "\n  "
						+ fieldName
						+ ": "
						+ DReflection.getFieldValueAsString(fdDObject,
								fdDObject.getIdFields()[0], false);
			}

			else {
				result += "\n  "
						+ fieldName
						+ ": "
						+ DReflection.getFieldValueAsString(dObject, fieldName,
								false);
			}
		}
		return result + "\n]";
	}

	/**
	 * Verifies whether or not an array contains a certain object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param array
	 *            an array of the same class or superclass of the object to be
	 *            found.
	 * @param object
	 *            the Object instance to be found in the array.
	 * @return true if the object is found in the array or false if not.
	 * @generated
	 */
	public static boolean arrayContains(Object[] array, Object object) {
		if (array != null && array.length > 0) {
			for (Object a : array) {
				if (a.equals(object))
					return true;
			}
		}
		return false;
	}

	/**
	 * Verifies whether or not a Class instance is a Collection. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param clazz
	 *            the Class instance to be verified.
	 * @return true if the class instance is a Collection, or false if not.
	 * @generated
	 */
	public static boolean isCollection(Class<?> type) {
		return Collection.class.isAssignableFrom(type);
	}

	/**
	 * Verifies whether or not a Class instance is a DObject. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param clazz
	 *            the Class instance to be verified.
	 * @return true if the class instance is a DObject, or false if not.
	 * @generated
	 */
	public static boolean isDObject(Class<?> clazz) {
		return DObject.class.isAssignableFrom(clazz);
	}

	/**
	 * Verifies whether or not a Class instance is a DVariation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param clazz
	 *            the Class instance to be verified.
	 * @return true if the class instance is a DVariation, or false if not.
	 * @generated
	 */
	public static boolean isDVariation(Class<?> clazz) {
		return DVariation.class.isAssignableFrom(clazz);
	}

	/**
	 * Verifies whether or not a field is multiple. A multiple field is a
	 * Collection that can store different instances of DObject subclasses. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param clazz
	 *            a Class instance which represents a DFeature subclass and
	 *            contains the field to be verified.
	 * @param fieldName
	 *            the name of the field to be verified.
	 * @return true if the field is multiple, or false if not.
	 * @generated
	 */
	public static boolean isMultiple(Class<? extends DFeature> clazz,
			String fieldName) {
		return DReflection.arrayContains(
				newInstance(clazz).getMultipleFields(), fieldName);
	}

	/**
	 * Verifies whether or not a field is multiple. A multiple field is a
	 * Collection that can store different instances of DObject subclasses. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param Dfeature
	 *            the instance of a DFeature subclass which contains the field
	 *            to be verified.
	 * @param fieldName
	 *            the name of the field to be verified.
	 * @return true if the field is multiple, or false if not.
	 * @generated
	 */
	public static boolean isMultiple(DFeature dFeature, String fieldName) {
		return DReflection.arrayContains(dFeature.getMultipleFields(),
				fieldName);
	}

	/**
	 * Turns the value passed as parameter into a formatted String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            a Object instance which corresponds to the value that must be
	 *            formatted.
	 * @param type
	 *            the original type of the value that must be formatted.
	 * @return a String which contains the value formatted according to its
	 *         type. If there is no known format for that type, the the result
	 *         of the toString method of the value is returned.
	 * @generated
	 */
	public static String formatValue(Object value, Class<?> type) {

		if (type == String.class) {
			return "'" + value + "'";
		}

		if (type == Date.class) {
			SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
			return "'" + sdf.format((Date) value) + "'";
		}

		return value.toString();
	}

	/**
	 * Verifies whether or not a field that represents a optional feature is
	 * being used in the application. Equivalent to verify whether or not the
	 * <code>getFieldDFeatureClass</code> method returns null. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param dObject
	 *            the DObject instance which contains the field.
	 * @param fieldName
	 *            the name of the field.
	 * @return true is the field is being used by the application or false if
	 *         not.
	 * @generated
	 */
	public static boolean isFieldUsed(DObject dObject, String fieldName) {
		return getFieldDFeatureClass(dObject, fieldName) != null;
	}

	/**
	 * Obtains the type of a field as a Class instance. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param clazz
	 *            a Class instance that represents the class which contains the
	 *            field.
	 * @param fieldName
	 *            the name of the field whose type is wanted to be known.
	 * @param isRawType
	 *            if the field type is a Collection, true indicates that its raw
	 *            type must be returned instead of a Collection type.
	 * @return a Class instance which represents the type of the field or null
	 *         if there is no such field in the class or if the field cannot be
	 *         accessed.
	 * @generated
	 */
	public static Class<?> getFieldType(Class<? extends DFeature> clazz,
			String fieldName, boolean isRawType) {

		String getterMethodName = "get" + upperCaseFirst(fieldName);

		try {
			Class<?> fieldType = clazz.getMethod(getterMethodName)
					.getReturnType();
			if (isRawType && isCollection(fieldType)) {
				Type type = clazz.getMethod(getterMethodName)
						.getGenericReturnType();
				String ptName = ((ParameterizedType) type)
						.getActualTypeArguments()[0].toString();
				ptName = ptName.substring(ptName.trim().lastIndexOf(" ") + 1);
				fieldType = Class.forName(ptName);
			}
			return fieldType;
		} catch (SecurityException e) {
			System.err.println("The method '" + getterMethodName
					+ "' must be public.");
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			System.err.println("There is no field called '" + fieldName
					+ "' in the class '" + clazz.getSimpleName()
					+ "' or there is no getter method for it.");
			e.printStackTrace();
		} catch (Exception e) {
			System.err
					.println("It is not possible to access the type of the field '"
							+ fieldName
							+ "' in the class "
							+ clazz.getSimpleName() + ".");
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Calls the Class Getter method in order to identify the DFeature subclass
	 * of a DObject subclass field in an application that reuses the framework.
	 * A Class Getter method is an abstract method in the classes of the
	 * framework that must be overridden in their respective
	 * application-specific classes. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param dObject
	 *            an instance of a application-specific class.
	 * @param fieldName
	 *            the name of the field whose real type is wanted to be known.
	 * @return a Class instance corresponding to a concrete DObject subclass in
	 *         the application.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static Class<? extends DFeature> getFieldDFeatureClass(
			DObject dObject, String fieldName) {

		// obtain the domain (framework) class of the field
		Class<?> fieldType = getFieldType(dObject.getClass(), fieldName, true);

		String getClassMethodName = "get"
				+ upperCaseFirst(fieldType.getSimpleName()) + "Class";

		try { // getClassMethod is invoked to return the correspondent class in
				// the application
			Method getClassMethod = dObject.getClass().getMethod(
					getClassMethodName);
			return (Class<? extends DFeature>) getClassMethod.invoke(dObject);
		} catch (SecurityException e) {
			System.err
					.println("It was not possible to recover the Class of the field "
							+ fieldName + ".");
			System.err.println("The method '" + getClassMethodName
					+ "' must be public.");
			e.printStackTrace();
			return null;
		} catch (NoSuchMethodException e) {
			System.err
					.println("It was not possible to recover the Class of the field "
							+ fieldName + ".");
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			System.err
					.println("It was not possible to recover the Class of the field "
							+ fieldName + ".");
			System.err.println("It is not possible to invoke the '"
					+ getClassMethodName + "' method in the class "
					+ dObject.getClass().getSimpleName() + ".");
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Returns the name of all persisted fields of a DObject subclass. The
	 * persisted fields are all fields of that class, except those inherited
	 * from DObject. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param clazz
	 *            a DOBject subclass whose the name of fields must be returned.
	 * @return a String array with the names of all persisted fields of a
	 *         DObject subclass.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static Class<?>[] getAllFieldTypes(Class<? extends DObject> clazz) {

		Class<?>[] inheritedFieldTypes = new Class<?>[0];
		Class<DObject> superClass = (Class<DObject>) clazz.getSuperclass();

		if (superClass != DObject.class)
			inheritedFieldTypes = getAllFieldTypes(superClass);

		Field[] declaredFields = clazz.getDeclaredFields();
		int qttyFields = inheritedFieldTypes.length + declaredFields.length;
		Class<?>[] allFieldTypes = new Class<?>[qttyFields];

		for (int i = 0; i < declaredFields.length; i++) {
			allFieldTypes[inheritedFieldTypes.length + i] = declaredFields[i]
					.getType();
		}

		System.arraycopy(inheritedFieldTypes, 0, allFieldTypes, 0,
				inheritedFieldTypes.length);
		return allFieldTypes;
	}

	/**
	 * Returns the value of a field of a DObject instance. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param dFeature
	 *            the DFeature instance whose field value must be returned.
	 * @param fieldName
	 *            the name of the field whose value must be returned.
	 * @return the value of a field of a DObject instance or null if the
	 *         DFeature instance is null or the field is non-existent or
	 *         unaccessible.
	 * @generated
	 */
	public static Object getFieldValue(DFeature dFeature, String fieldName) {

		if (dFeature == null)
			return null;

		Object fieldValue = null;
		String getterMethodName = "get" + upperCaseFirst(fieldName);
		Method getterMethod;

		try {
			getterMethod = dFeature.getClass().getMethod(getterMethodName);
			fieldValue = getterMethod.invoke(dFeature);
		} catch (SecurityException e) {
			System.err.println("The method '" + getterMethodName
					+ "' must be public.");
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			System.err.println("There is no field called '" + fieldName
					+ "' in the class '" + dFeature.getClass().getSimpleName()
					+ "' or there is no getter method for it.");
			e.printStackTrace();
		} catch (Exception e) {
			System.err
					.println("It is not possible to access the value of the field '"
							+ fieldName
							+ "' in the class "
							+ dFeature.getClass().getSimpleName() + ".");
			e.printStackTrace();
		}
		return fieldValue;
	}

	/**
	 * Returns a String corresponding to the value of a field of a DObject
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param dObject
	 *            the DObject instance whose field value must be returned.
	 * @param fieldName
	 *            the name of the field whose value must be returned.
	 * @param formatByType
	 *            indicates whether the value returned must be formatted
	 *            according to its original type. For example, the formatted
	 *            value of a Date field is 'yyyy-MM-dd'.
	 * @return a String corresponding the value of a field of a DObject
	 *         instance.
	 * @generated
	 */
	public static String getFieldValueAsString(DFeature dFeature,
			String fieldName, boolean formatByType) {
		if (dFeature == null)
			return null;

		Object fieldValue = getFieldValue(dFeature, fieldName);
		if (formatByType) {
			return formatValue(fieldValue,
					getFieldType(dFeature.getClass(), fieldName, false));
		}

		return fieldValue.toString();
	}

	/**
	 * Set a field of a DObject instance with the value passed as parameter. If
	 * the type of the field is not String, then the value will be converted to
	 * the correct type. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param dFeature
	 *            the DFeature instance whose field will be set.
	 * @param fieldName
	 *            the name of the field whose value will be set.
	 * @param fieldValue
	 *            the value that will be stored in the field.
	 * @generated
	 */
	public static void setFieldValue(DFeature dFeature, String fieldName,
			Object fieldValue) {

		if (dFeature == null)
			return;

		Method getterMethod;
		Method setterMethod;
		try {
			getterMethod = dFeature.getClass().getMethod(
					"get" + upperCaseFirst(fieldName));
			Class<?> fieldType = getterMethod.getReturnType();
			Class<?>[] params = { fieldType };
			setterMethod = dFeature.getClass().getMethod(
					"set" + upperCaseFirst(fieldName), params);
			setterMethod.invoke(dFeature, fieldValue);
		} catch (SecurityException e) {
			System.err.println("The method 'set" + upperCaseFirst(fieldName)
					+ "' must be public.");
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			System.err.println("There is no field called '" + fieldName
					+ "' in the class '" + dFeature.getClass().getSimpleName()
					+ "' or there is no getter/setter method for it.");
			e.printStackTrace();
		} catch (Exception e) {
			System.err
					.println("It is not possible to set the value of the field '"
							+ fieldName
							+ "' in the class "
							+ dFeature.getClass().getSimpleName() + ".");
			e.printStackTrace();
		}
	}

	/**
	 * Returns the name of all persisted fields of a DObject subclass. The
	 * persisted fields are all fields of that class, except those inherited
	 * from DObject. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param clazz
	 *            a DFeature subclass whose the name of fields must be returned.
	 * @return a String array with the names of all persisted fields of a
	 *         DObject subclass.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static String[] getAllFieldNames(Class<? extends DObject> clazz) {

		String[] inheritedFieldNames = new String[0];
		Class<DObject> superClass = (Class<DObject>) clazz.getSuperclass();

		if (superClass != DObject.class)
			inheritedFieldNames = getAllFieldNames(superClass);

		Field[] declaredFields = clazz.getDeclaredFields();
		int qttyFields = inheritedFieldNames.length + declaredFields.length;
		String[] allFieldNames = new String[qttyFields];

		for (int i = 0; i < declaredFields.length; i++) {
			allFieldNames[inheritedFieldNames.length + i] = declaredFields[i]
					.getName();
		}

		System.arraycopy(inheritedFieldNames, 0, allFieldNames, 0,
				inheritedFieldNames.length);
		return allFieldNames;
	}

	/**
	 * Copy the values from a DObject instance to another one. It is equivalent
	 * to <code>copyValues(copyFrom, copyTo, copyTo.getClass())</code>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param copyFrom
	 *            a DObject instance whose values are copied from.
	 * @param copyTo
	 *            a DObject instance which will receive the values copied from
	 *            the other instance.
	 * @generated
	 */
	public static void copyValues(DObject copyFrom, DObject copyTo) {
		copyValues(copyFrom, copyTo, copyTo.getClass());
	}

	/**
	 * Copy the values from a DObject instance to another one. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param copyFrom
	 *            a DObject instance whose values are copied from.
	 * @param copyTo
	 *            a DObject instance which will receive the values copied from
	 *            the other instance.
	 * @param clazz
	 *            used to identify the fields whose values will be copied from.
	 *            It must be a Class instance of copyTo parameter or one of its
	 *            superclasses.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static void copyValues(DObject copyFrom, DObject copyTo,
			Class<? extends DObject> clazz) {

		Class<DObject> superClass = (Class<DObject>) clazz.getSuperclass();
		if (!superClass.equals(DObject.class))
			copyValues(copyFrom, copyTo, superClass);

		String fieldName = null;
		try {
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				fieldName = upperCaseFirst(field.getName());
				Method getterMethod = clazz.getMethod("get" + fieldName);
				Class<?>[] params = { getterMethod.getReturnType() };
				Method setterMethod = clazz
						.getMethod("set" + fieldName, params);
				setterMethod.invoke(copyTo, getterMethod.invoke(copyFrom));
			}
		} catch (SecurityException e) {
			System.err.println("The getter/setter methods of '" + fieldName
					+ "' must be public.");
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			System.err.println("There is no field called '" + fieldName
					+ "' in the class '" + clazz.getSimpleName()
					+ "' or there is no getter/setter method for it.");
			e.printStackTrace();
		} catch (Exception e) {
			System.err
					.println("It is not possible to set the value of the field '"
							+ fieldName
							+ "' in the class "
							+ clazz.getSimpleName() + ".");
			e.printStackTrace();
		}
	}

	/**
	 * Indicates whether a DObject subclass is a containment or not. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param clazz
	 *            a DOBject subclass
	 * @return true if a DObject instance is a containment or false otherwise.
	 * @generated
	 */
	public static boolean isDObjectContainment(Class<? extends DObject> clazz) {
		return ((DObject) newInstance(clazz)).isContainment();
	}

	/**
	 * Identifies the first DObject subclass which is a superclass of the class
	 * passed as parameter. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param clazz
	 *            a Class instance representing a DObject subclass.
	 * @return a Class instance corresponding to a directly subclass of DObject
	 *         which is a superclass of the class passed as parameter. If the
	 *         Class instance represents a direct subclass of DOBject, then
	 *         Class instance itself is returned.
	 */
	@SuppressWarnings("unchecked")
	public static Class<? extends DObject> getFirstDObjectSubclass(
			Class<? extends DObject> clazz) {

		Class<? extends DObject> firstDObjectSubclass = clazz;

		while (!firstDObjectSubclass.getSuperclass().equals(DObject.class)) {
			firstDObjectSubclass = (Class<DObject>) firstDObjectSubclass
					.getSuperclass();
		}

		return firstDObjectSubclass;
	}

	/**
	 * Invokes a multiple field getClasses Method from a DObject instance and
	 * returns its result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param dObject
	 *            a DObject instance which contains the multiple field.
	 * @param multipleField
	 *            a String with the name of the multiple field.
	 * @return the result of the multiple field getClass method or null if an
	 *         exception occurs.
	 * @generated
	 */
	public static Class<?>[] invokeGetMultipleFieldClasses(DObject dObject,
			String multipleField) {

		Class<?> mFieldType = getFieldType(dObject.getClass(), multipleField,
				true);
		String methodName = "get" + mFieldType.getSimpleName() + "Classes";

		try {
			Method getClassMethod = dObject.getClass().getMethod(methodName);
			return (Class<?>[]) getClassMethod.invoke(dObject);
		} catch (SecurityException e) {
			System.err.println("It was not possible to invoke the "
					+ methodName + " method because it is not public.");
			e.printStackTrace();
			return null;
		} catch (NoSuchMethodException e) {
			System.err.println("There is no " + methodName + " method in the "
					+ dObject.getClass().getSimpleName() + " class.");
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			System.err.println("It is not possible to invoke the '"
					+ methodName + "' method in the "
					+ dObject.getClass().getSimpleName() + " class.");
			e.printStackTrace();
			return null;
		}
	}

}
