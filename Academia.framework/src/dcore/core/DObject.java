package dcore.core;

/**
 * The superclass of all domain feature objects. A DObject represents a
 * mandatory or optional feature in a domain. A DObject subclass can associate
 * with DObject or DVariation subclasses and depend on other DObject subclasses.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @see #DFeature
 * @generated
 */
public abstract class DObject extends DFeature {

	/**
	 * Indicates the fields which identify each DObject instance as being unique
	 * and are used as the primary key of the registers of the type of the
	 * DOBject in the database. This method must be overwritten in a DObject
	 * subclass. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the names of the fields which are the primary key of the DObject
	 *         instance.
	 * @generated
	 */
	public abstract String[] getIdFields();

	/**
	 * Indicates the field which references to the container of the containment
	 * class. This field is not persisted. The default return of this method is
	 * null, which means that by default a DObject class is not a containment.
	 * This method must be overridden to return the name of the attribute which
	 * is the container in order to indicate that the class is a containment.
	 * The return of <code>isContainment</code> method is based on the return of
	 * <code>getContainer</code> method. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a String with the name of the field which references the
	 *         container of the containment class instance or null if the class
	 *         is not a containment.
	 * @generated
	 */
	public String getContainer() {
		return null;
	}

	/**
	 * Indicates whether the DObject subclass is a containment or not. A
	 * containment is a composition class whose instances exists only as a value
	 * of a field of another class. Its return is based on
	 * <code>getContainer</code> method. If there is an attribute which
	 * references a container for the class, then it returns true. Otherwise, it
	 * returns false. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return true if the class is a containment or false if not.
	 * @generated
	 */
	public boolean isContainment() {
		return getContainer() != null && !getContainer().equals("");
	}

	/**
	 * Returns a String representation of the DObject instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a String containing the name and the value of the fields of the
	 *         DObject instance.
	 * @generated
	 */
	public String toString() {
		return DReflection.toString(this);
	}

}
