/**
 */
package Academia;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Academia.AcademiaPackage
 * @generated
 */
public interface AcademiaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AcademiaFactory eINSTANCE = Academia.impl.AcademiaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>APackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APackage</em>'.
	 * @generated
	 */
	APackage createAPackage();

	/**
	 * Returns a new object of class '<em>AApplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AApplication</em>'.
	 * @generated
	 */
	AApplication createAApplication();

	/**
	 * Returns a new object of class '<em>AObject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AObject</em>'.
	 * @generated
	 */
	AObject createAObject();

	/**
	 * Returns a new object of class '<em>AVariation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AVariation</em>'.
	 * @generated
	 */
	AVariation createAVariation();

	/**
	 * Returns a new object of class '<em>AAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AAttribute</em>'.
	 * @generated
	 */
	AAttribute createAAttribute();

	/**
	 * Returns a new object of class '<em>AOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AOperation</em>'.
	 * @generated
	 */
	AOperation createAOperation();

	/**
	 * Returns a new object of class '<em>AParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AParameter</em>'.
	 * @generated
	 */
	AParameter createAParameter();

	/**
	 * Returns a new object of class '<em>Matricula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matricula</em>'.
	 * @generated
	 */
	Matricula createMatricula();

	/**
	 * Returns a new object of class '<em>Aluno</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aluno</em>'.
	 * @generated
	 */
	Aluno createAluno();

	/**
	 * Returns a new object of class '<em>Curso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Curso</em>'.
	 * @generated
	 */
	Curso createCurso();

	/**
	 * Returns a new object of class '<em>Departamento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Departamento</em>'.
	 * @generated
	 */
	Departamento createDepartamento();

	/**
	 * Returns a new object of class '<em>Campus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campus</em>'.
	 * @generated
	 */
	Campus createCampus();

	/**
	 * Returns a new object of class '<em>Disciplina Semestre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disciplina Semestre</em>'.
	 * @generated
	 */
	DisciplinaSemestre createDisciplinaSemestre();

	/**
	 * Returns a new object of class '<em>Disciplina Paga</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disciplina Paga</em>'.
	 * @generated
	 */
	DisciplinaPaga createDisciplinaPaga();

	/**
	 * Returns a new object of class '<em>Disciplina Gratis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disciplina Gratis</em>'.
	 * @generated
	 */
	DisciplinaGratis createDisciplinaGratis();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AcademiaPackage getAcademiaPackage();

} //AcademiaFactory
