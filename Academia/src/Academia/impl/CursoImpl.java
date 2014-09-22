
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Academia.impl;

import Academia.AcademiaPackage;
import Academia.Curso;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Curso</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CursoImpl extends AObjectImpl implements Curso {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CursoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcademiaPackage.Literals.CURSO;
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
		return "id, nome, departamento";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getAttributesSQL() {
		return "\n    `departamento` INT, \n    `id` INT, \n    `nome` VARCHAR(50)";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getAssociations() {
		String sa = super.getAssociations();
		return sa + (sa.equals("") ? "" : ";")
				+ "Disciplina:grade;Departamento:departamento";
	}
} // CursoImpl
