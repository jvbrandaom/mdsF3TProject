
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Academia.impl;

import Academia.AcademiaPackage;
import Academia.Matricula;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Matricula</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MatriculaImpl extends AObjectImpl implements Matricula {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatriculaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcademiaPackage.Literals.MATRICULA;
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
		return "id, data, aluno";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getAttributesSQL() {
		return "\n    `aluno` INT, \n    `id` INT, \n    `data` DATE";
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
				+ "DisciplinaSemestre:disciplina;Aluno:aluno";
	}
} // MatriculaImpl
