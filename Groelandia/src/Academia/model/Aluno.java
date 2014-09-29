package Academia.model;

import dcore.core.DObject;
import dcore.core.DReflection;

/**
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public abstract class Aluno extends DObject {

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
	private String sobrenome;

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
	private Curso curso;

	/**
	 * Constructor of the class Aluno. Initializes all attributes and
	 * associations which has lower bound equals "1" with default values based
	 * on their types. Attributes and associations with lower bound equals "0"
	 * are not initialized. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Aluno() {
		super();
		nome = "";
		sobrenome = "";
		id = 0;
		curso = (Curso) DReflection.newInstance(getCursoClass());
	}

	/**
	 * Returns the current nome of the Aluno. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Set the current nome of the Aluno to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNome(String newNome) {
		nome = newNome;
	}

	/**
	 * Returns the current sobrenome of the Aluno. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * Set the current sobrenome of the Aluno to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSobrenome(String newSobrenome) {
		sobrenome = newSobrenome;
	}

	/**
	 * Returns the current id of the Aluno. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the current id of the Aluno to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(int newId) {
		id = newId;
	}

	/**
	 * Returns the current Curso of the Aluno. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public Curso getCurso() {
		return curso;
	}

	/**
	 * Set the current Curso of the Aluno to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCurso(Curso newCurso) {
		curso = newCurso;
	}

	/**
	 * Returns the class which represents the Curso of the Aluno in the
	 * application. If the feature is optional, the default implementation of
	 * this method returns null indicating that the application may not address
	 * Curso. Otherwise, this method is abstract. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public abstract Class<? extends Curso> getCursoClass();

	/**
	 * Returns the names of the ID attributes of Aluno.
	 * 
	 * @generated
	 */
	public String[] getIdFields() {
		return new String[] { "id" };
	}

	/**
	 * Returns a list with the names of the multiple fields of Aluno or null if
	 * there is none.
	 * 
	 * @generated
	 */
	public String[] getMultipleFields() {
		return null;
	}

}

