package Academia.model;

/**
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public abstract class DisciplinaPaga extends Disciplina {

	/**
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private float preco;

	/**
	 * Constructor of the class DisciplinaPaga. Initializes all attributes and
	 * associations which has lower bound equals "1" with default values based
	 * on their types. Attributes and associations with lower bound equals "0"
	 * are not initialized. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DisciplinaPaga() {
		super();
		preco = 0.0F;
	}

	/**
	 * Returns the current preco of the DisciplinaPaga. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public float getPreco() {
		return preco;
	}

	/**
	 * Set the current preco of the DisciplinaPaga to a new value/instance. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPreco(float newPreco) {
		preco = newPreco;
	}

	/**
	 * Returns a list with the names of the multiple fields of DisciplinaPaga or
	 * null if there is none.
	 * 
	 * @generated
	 */
	public String[] getMultipleFields() {
		return null;
	}

}

