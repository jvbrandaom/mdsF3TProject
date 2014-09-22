package Academia.model;

import java.util.List;
import java.util.ArrayList;

import dcore.core.DObject;
import dcore.core.DReflection;

/**
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public abstract class Disciplina extends DObject {

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
	private List<DisciplinaSemestre> disciplinasSemestre;

	/**
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private Departamento departamento;

	/**
	 * Constructor of the class Disciplina. Initializes all attributes and
	 * associations which has lower bound equals "1" with default values based
	 * on their types. Attributes and associations with lower bound equals "0"
	 * are not initialized. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Disciplina() {
		super();
		id = 0;
		nome = "";
		disciplinasSemestre = new ArrayList<DisciplinaSemestre>();
		departamento = (Departamento) DReflection
				.newInstance(getDepartamentoClass());
	}

	/**
	 * Returns the current id of the Disciplina. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the current id of the Disciplina to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(int newId) {
		id = newId;
	}

	/**
	 * Returns the current nome of the Disciplina. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Set the current nome of the Disciplina to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNome(String newNome) {
		nome = newNome;
	}

	/**
	 * Returns the current list of DisciplinaSemestre of the Disciplina. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List<DisciplinaSemestre> getDisciplinasSemestre() {
		return disciplinasSemestre;
	}

	/**
	 * Set the current list of DisciplinaSemestre of the Disciplina to a new
	 * value/instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDisciplinasSemestre(
			List<DisciplinaSemestre> newDisciplinasSemestre) {
		disciplinasSemestre = newDisciplinasSemestre;
	}

	/**
	 * Returns the class which represents the DisciplinaSemestre of the
	 * Disciplina in the application. If the feature is optional, the default
	 * implementation of this method returns null indicating that the
	 * application may not address DisciplinaSemestre. Otherwise, this method is
	 * abstract. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public abstract Class<? extends DisciplinaSemestre> getDisciplinaSemestreClass();

	/**
	 * Returns the current Departamento of the Disciplina. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Departamento getDepartamento() {
		return departamento;
	}

	/**
	 * Set the current Departamento of the Disciplina to a new value/instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDepartamento(Departamento newDepartamento) {
		departamento = newDepartamento;
	}

	/**
	 * Returns the class which represents the Departamento of the Disciplina in
	 * the application. If the feature is optional, the default implementation
	 * of this method returns null indicating that the application may not
	 * address Departamento. Otherwise, this method is abstract. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public abstract Class<? extends Departamento> getDepartamentoClass();

	/**
	 * Returns the names of the ID attributes of Disciplina.
	 * 
	 * @generated
	 */
	public String[] getIdFields() {
		return new String[] { "id" };
	}

	/**
	 * Returns a list with the names of the multiple fields of Disciplina or
	 * null if there is none.
	 * 
	 * @generated
	 */
	public String[] getMultipleFields() {
		return null;
	}

}

