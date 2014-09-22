/**
 */
package Academia.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Academia</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class AcademiaTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new AcademiaTests("Academia Tests");
		suite.addTestSuite(APackageTest.class);
		suite.addTestSuite(AApplicationTest.class);
		suite.addTestSuite(AObjectTest.class);
		suite.addTestSuite(AVariationTest.class);
		suite.addTestSuite(MatriculaTest.class);
		suite.addTestSuite(AlunoTest.class);
		suite.addTestSuite(CursoTest.class);
		suite.addTestSuite(DepartamentoTest.class);
		suite.addTestSuite(CampusTest.class);
		suite.addTestSuite(DisciplinaSemestreTest.class);
		suite.addTestSuite(DisciplinaPagaTest.class);
		suite.addTestSuite(DisciplinaGratisTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcademiaTests(String name) {
		super(name);
	}

} //AcademiaTests
