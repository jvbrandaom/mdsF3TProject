package Academia.model;

import java.util.List;
import java.util.ArrayList;

import java.sql.Date;

import dcore.core.DObject;
import dcore.core.DReflection;

/**
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public abstract class Matricula extends DObject {

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
	private Date data;

	/**
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private List<DisciplinaSemestre> disciplina;

	/**
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private Aluno aluno;

	/**
	 * Constructor of the class Matricula. Initializes all attributes and
	 * associations which has lower bound equals "1" with default values based
	 * on their types. Attributes and associations with lower bound equals "0"
	 * are not initialized. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Matricula() {
		super();
		id = 0;
		data = new Date(System.currentTimeMillis());
		disciplina = new ArrayList<DisciplinaSemestre>();
		aluno = (Aluno) DReflection.newInstance(getAlunoClass());
	}

	/**
	 * Returns the current id of the Matricula. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the current id of the Matricula to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(int newId) {
		id = newId;
	}

	/**
	 * Returns the current data of the Matricula. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public Date getData() {
		return data;
	}

	/**
	 * Set the current data of the Matricula to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setData(Date newData) {
		data = newData;
	}

	/**
	 * Returns the current list of DisciplinaSemestre of the Matricula. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List<DisciplinaSemestre> getDisciplina() {
		return disciplina;
	}

	/**
	 * Set the current list of DisciplinaSemestre of the Matricula to a new
	 * value/instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDisciplina(List<DisciplinaSemestre> newDisciplina) {
		disciplina = newDisciplina;
	}

	/**
	 * Returns the class which represents the DisciplinaSemestre of the
	 * Matricula in the application. If the feature is optional, the default
	 * implementation of this method returns null indicating that the
	 * application may not address DisciplinaSemestre. Otherwise, this method is
	 * abstract. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public abstract Class<? extends DisciplinaSemestre> getDisciplinaSemestreClass();

	/**
	 * Returns the current Aluno of the Matricula. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * Set the current Aluno of the Matricula to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAluno(Aluno newAluno) {
		aluno = newAluno;
	}

	/**
	 * Returns the class which represents the Aluno of the Matricula in the
	 * application. If the feature is optional, the default implementation of
	 * this method returns null indicating that the application may not address
	 * Aluno. Otherwise, this method is abstract. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public abstract Class<? extends Aluno> getAlunoClass();

	/**
	 * Returns the names of the ID attributes of Matricula.
	 * 
	 * @generated
	 */
	public String[] getIdFields() {
		return new String[] { "id" };
	}

	/**
	 * Returns a list with the names of the multiple fields of Matricula or null
	 * if there is none.
	 * 
	 * @generated
	 */
	public String[] getMultipleFields() {
		return null;
	}

}

