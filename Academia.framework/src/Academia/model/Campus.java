package Academia.model;

import dcore.core.DObject;

/**
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public abstract class Campus extends DObject {

	/**
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private String nome;

	/**
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private int id;

	/**
	 * Constructor of the class Campus. Initializes all attributes and
	 * associations which has lower bound equals "1" with default values based
	 * on their types. Attributes and associations with lower bound equals "0"
	 * are not initialized. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Campus() {
		super();
		nome = "";
		id = 0;
	}

	/**
	 * Returns the current nome of the Campus. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Set the current nome of the Campus to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNome(String newNome) {
		nome = newNome;
	}

	/**
	 * Returns the current id of the Campus. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the current id of the Campus to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(int newId) {
		id = newId;
	}

	/**
	 * Returns the names of the ID attributes of Campus.
	 * 
	 * @generated
	 */
	public String[] getIdFields() {
		return new String[] { "id" };
	}

	/**
	 * Returns a list with the names of the multiple fields of Campus or null if
	 * there is none.
	 * 
	 * @generated
	 */
	public String[] getMultipleFields() {
		return null;
	}

}

