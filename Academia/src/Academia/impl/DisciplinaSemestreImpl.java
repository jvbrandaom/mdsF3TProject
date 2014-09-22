
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Academia.impl;

import Academia.AcademiaPackage;
import Academia.DisciplinaSemestre;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>DisciplinaSemestre</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DisciplinaSemestreImpl extends AObjectImpl implements
		DisciplinaSemestre {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisciplinaSemestreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcademiaPackage.Literals.DISCIPLINA_SEMESTRE;
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
		return "ano, semestre, id";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getAttributesSQL() {
		return "\n    `ano` INT, \n    `semestre` INT, \n    `id` INT";
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
} // DisciplinaSemestreImpl
