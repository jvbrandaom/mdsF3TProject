
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Academia.impl;

import Academia.AcademiaPackage;
import Academia.Aluno;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Aluno</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AlunoImpl extends AObjectImpl implements Aluno {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlunoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcademiaPackage.Literals.ALUNO;
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
		return "nome, sobrenome, id, curso";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getAttributesSQL() {
		return "\n    `curso` INT, \n    `nome` VARCHAR(50), \n    `sobrenome` VARCHAR(50), \n    `id` INT";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getAssociations() {
		String sa = super.getAssociations();
		return sa + (sa.equals("") ? "" : ";") + "Curso:curso";
	}
} // AlunoImpl
