package Academia.model;

import java.util.List;
import java.util.ArrayList;

import dcore.core.DObject;

/**
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public abstract class Curso extends DObject {

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
	private String nome;

	/**
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private List<Disciplina> grade;

	/**
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private Departamento departamento;

	/**
	 * Constructor of the class Curso. Initializes all attributes and
	 * associations which has lower bound equals "1" with default values based
	 * on their types. Attributes and associations with lower bound equals "0"
	 * are not initialized. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Curso() {
		super();
		id = 0;
		nome = "";
		grade = new ArrayList<Disciplina>();
		departamento = null;
	}

	/**
	 * Returns the current id of the Curso. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the current id of the Curso to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(int newId) {
		id = newId;
	}

	/**
	 * Returns the current nome of the Curso. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Set the current nome of the Curso to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNome(String newNome) {
		nome = newNome;
	}

	/**
	 * Returns the current list of Disciplina of the Curso. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List<Disciplina> getGrade() {
		return grade;
	}

	/**
	 * Set the current list of Disciplina of the Curso to a new value/instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setGrade(List<Disciplina> newGrade) {
		grade = newGrade;
	}

	/**
	 * Returns the class which represents the Disciplina of the Curso in the
	 * application. If the feature is optional, the default implementation of
	 * this method returns null indicating that the application may not address
	 * Disciplina. Otherwise, this method is abstract. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public abstract Class<? extends Disciplina> getDisciplinaClass();

	/**
	 * Returns the current Departamento of the Curso. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Departamento getDepartamento() {
		return departamento;
	}

	/**
	 * Set the current Departamento of the Curso to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDepartamento(Departamento newDepartamento) {
		departamento = newDepartamento;
	}

	/**
	 * Returns the class which represents the Departamento of the Curso in the
	 * application. If the feature is optional, the default implementation of
	 * this method returns null indicating that the application may not address
	 * Departamento. Otherwise, this method is abstract. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Class<? extends Departamento> getDepartamentoClass() {
		return null;
	}

	/**
	 * Returns the names of the ID attributes of Curso.
	 * 
	 * @generated
	 */
	public String[] getIdFields() {
		return new String[] { "id" };
	}

	/**
	 * Returns a list with the names of the multiple fields of Curso or null if
	 * there is none.
	 * 
	 * @generated
	 */
	public String[] getMultipleFields() {
		return null;
	}

}

