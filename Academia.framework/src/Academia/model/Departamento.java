package Academia.model;

import dcore.core.DObject;

/**
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public abstract class Departamento extends DObject {

	/**
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private String Nome;

	/**
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private int id;

	/**
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private Campus campus;

	/**
	 * Constructor of the class Departamento. Initializes all attributes and
	 * associations which has lower bound equals "1" with default values based
	 * on their types. Attributes and associations with lower bound equals "0"
	 * are not initialized. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Departamento() {
		super();
		Nome = "";
		id = 0;
		campus = null;
	}

	/**
	 * Returns the current Nome of the Departamento. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getNome() {
		return Nome;
	}

	/**
	 * Set the current Nome of the Departamento to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNome(String newNome) {
		Nome = newNome;
	}

	/**
	 * Returns the current id of the Departamento. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the current id of the Departamento to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(int newId) {
		id = newId;
	}

	/**
	 * Returns the current Campus of the Departamento. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Campus getCampus() {
		return campus;
	}

	/**
	 * Set the current Campus of the Departamento to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCampus(Campus newCampus) {
		campus = newCampus;
	}

	/**
	 * Returns the class which represents the Campus of the Departamento in the
	 * application. If the feature is optional, the default implementation of
	 * this method returns null indicating that the application may not address
	 * Campus. Otherwise, this method is abstract. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public Class<? extends Campus> getCampusClass() {
		return null;
	}

	/**
	 * Returns the names of the ID attributes of Departamento.
	 * 
	 * @generated
	 */
	public String[] getIdFields() {
		return new String[] { "id" };
	}

	/**
	 * Returns a list with the names of the multiple fields of Departamento or
	 * null if there is none.
	 * 
	 * @generated
	 */
	public String[] getMultipleFields() {
		return null;
	}

}

