
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Academia.impl;

import Academia.AcademiaPackage;
import Academia.DisciplinaPaga;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>DisciplinaPaga</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DisciplinaPagaImpl extends DisciplinaImpl implements DisciplinaPaga {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisciplinaPagaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcademiaPackage.Literals.DISCIPLINA_PAGA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getPrimaryKey() {
		return "id";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getProvidedAttributes() {
		return "id, nome, preco";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getAttributesSQL() {
		return "\n    `departamento` INT, \n    `id` INT, \n    `nome` VARCHAR(50), \n    `preco` FLOAT";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getAssociations() {
		String sa = super.getAssociations();
		return sa + (sa.equals("") ? "" : ";") + "";
	}
} // DisciplinaPagaImpl
