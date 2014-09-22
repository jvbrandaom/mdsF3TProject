/**
 */
package Academia.tests;

import Academia.AcademiaFactory;
import Academia.DisciplinaPaga;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Disciplina Paga</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DisciplinaPagaTest extends DisciplinaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DisciplinaPagaTest.class);
	}

	/**
	 * Constructs a new Disciplina Paga test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisciplinaPagaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Disciplina Paga test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DisciplinaPaga getFixture() {
		return (DisciplinaPaga)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AcademiaFactory.eINSTANCE.createDisciplinaPaga());
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

} //DisciplinaPagaTest
