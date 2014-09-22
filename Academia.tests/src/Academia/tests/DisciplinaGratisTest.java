/**
 */
package Academia.tests;

import Academia.AcademiaFactory;
import Academia.DisciplinaGratis;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Disciplina Gratis</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DisciplinaGratisTest extends DisciplinaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DisciplinaGratisTest.class);
	}

	/**
	 * Constructs a new Disciplina Gratis test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisciplinaGratisTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Disciplina Gratis test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DisciplinaGratis getFixture() {
		return (DisciplinaGratis)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AcademiaFactory.eINSTANCE.createDisciplinaGratis());
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

} //DisciplinaGratisTest
