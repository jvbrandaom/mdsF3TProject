package Academia.model;

import dcore.core.DObject;

/**
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public abstract class DisciplinaSemestre extends DObject {

	/**
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private int ano;

	/**
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private int semestre;

	/**
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private int id;

	/**
	 * Constructor of the class DisciplinaSemestre. Initializes all attributes
	 * and associations which has lower bound equals "1" with default values
	 * based on their types. Attributes and associations with lower bound equals
	 * "0" are not initialized. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DisciplinaSemestre() {
		super();
		ano = 0;
		semestre = 0;
		id = 0;
	}

	/**
	 * Returns the current ano of the DisciplinaSemestre. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Set the current ano of the DisciplinaSemestre to a new value/instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAno(int newAno) {
		ano = newAno;
	}

	/**
	 * Returns the current semestre of the DisciplinaSemestre. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getSemestre() {
		return semestre;
	}

	/**
	 * Set the current semestre of the DisciplinaSemestre to a new
	 * value/instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSemestre(int newSemestre) {
		semestre = newSemestre;
	}

	/**
	 * Returns the current id of the DisciplinaSemestre. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the current id of the DisciplinaSemestre to a new value/instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(int newId) {
		id = newId;
	}

	/**
	 * Returns the names of the ID attributes of DisciplinaSemestre.
	 * 
	 * @generated
	 */
	public String[] getIdFields() {
		return new String[] { "id" };
	}

	/**
	 * Returns a list with the names of the multiple fields of
	 * DisciplinaSemestre or null if there is none.
	 * 
	 * @generated
	 */
	public String[] getMultipleFields() {
		return null;
	}

}

