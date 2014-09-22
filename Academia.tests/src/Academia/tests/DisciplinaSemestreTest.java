/**
 */
package Academia.tests;

import Academia.AcademiaFactory;
import Academia.DisciplinaSemestre;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Disciplina Semestre</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DisciplinaSemestreTest extends AObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DisciplinaSemestreTest.class);
	}

	/**
	 * Constructs a new Disciplina Semestre test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisciplinaSemestreTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Disciplina Semestre test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DisciplinaSemestre getFixture() {
		return (DisciplinaSemestre)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AcademiaFactory.eINSTANCE.createDisciplinaSemestre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DisciplinaSemestreTest
