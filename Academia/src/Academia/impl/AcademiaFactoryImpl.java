/**
 */
package Academia.impl;

import Academia.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AcademiaFactoryImpl extends EFactoryImpl implements AcademiaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AcademiaFactory init() {
		try {
			AcademiaFactory theAcademiaFactory = (AcademiaFactory)EPackage.Registry.INSTANCE.getEFactory("Academia"); 
			if (theAcademiaFactory != null) {
				return theAcademiaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AcademiaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcademiaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AcademiaPackage.APACKAGE: return createAPackage();
			case AcademiaPackage.AAPPLICATION: return createAApplication();
			case AcademiaPackage.AOBJECT: return createAObject();
			case AcademiaPackage.AVARIATION: return createAVariation();
			case AcademiaPackage.AATTRIBUTE: return createAAttribute();
			case AcademiaPackage.AOPERATION: return createAOperation();
			case AcademiaPackage.APARAMETER: return createAParameter();
			case AcademiaPackage.MATRICULA: return createMatricula();
			case AcademiaPackage.ALUNO: return createAluno();
			case AcademiaPackage.CURSO: return createCurso();
			case AcademiaPackage.DEPARTAMENTO: return createDepartamento();
			case AcademiaPackage.CAMPUS: return createCampus();
			case AcademiaPackage.DISCIPLINA_SEMESTRE: return createDisciplinaSemestre();
			case AcademiaPackage.DISCIPLINA_PAGA: return createDisciplinaPaga();
			case AcademiaPackage.DISCIPLINA_GRATIS: return createDisciplinaGratis();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AcademiaPackage.PERSISTENCE_STRATEGY:
				return createPersistenceStrategyFromString(eDataType, initialValue);
			case AcademiaPackage.LOGGING_STRATEGY:
				return createLoggingStrategyFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AcademiaPackage.PERSISTENCE_STRATEGY:
				return convertPersistenceStrategyToString(eDataType, instanceValue);
			case AcademiaPackage.LOGGING_STRATEGY:
				return convertLoggingStrategyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APackage createAPackage() {
		APackageImpl aPackage = new APackageImpl();
		return aPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AApplication createAApplication() {
		AApplicationImpl aApplication = new AApplicationImpl();
		return aApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AObject createAObject() {
		AObjectImpl aObject = new AObjectImpl();
		return aObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVariation createAVariation() {
		AVariationImpl aVariation = new AVariationImpl();
		return aVariation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AAttribute createAAttribute() {
		AAttributeImpl aAttribute = new AAttributeImpl();
		return aAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AOperation createAOperation() {
		AOperationImpl aOperation = new AOperationImpl();
		return aOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AParameter createAParameter() {
		AParameterImpl aParameter = new AParameterImpl();
		return aParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matricula createMatricula() {
		MatriculaImpl matricula = new MatriculaImpl();
		return matricula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aluno createAluno() {
		AlunoImpl aluno = new AlunoImpl();
		return aluno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curso createCurso() {
		CursoImpl curso = new CursoImpl();
		return curso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Departamento createDepartamento() {
		DepartamentoImpl departamento = new DepartamentoImpl();
		return departamento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Campus createCampus() {
		CampusImpl campus = new CampusImpl();
		return campus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisciplinaSemestre createDisciplinaSemestre() {
		DisciplinaSemestreImpl disciplinaSemestre = new DisciplinaSemestreImpl();
		return disciplinaSemestre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisciplinaPaga createDisciplinaPaga() {
		DisciplinaPagaImpl disciplinaPaga = new DisciplinaPagaImpl();
		return disciplinaPaga;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisciplinaGratis createDisciplinaGratis() {
		DisciplinaGratisImpl disciplinaGratis = new DisciplinaGratisImpl();
		return disciplinaGratis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceStrategy createPersistenceStrategyFromString(EDataType eDataType, String initialValue) {
		PersistenceStrategy result = PersistenceStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingStrategy createLoggingStrategyFromString(EDataType eDataType, String initialValue) {
		LoggingStrategy result = LoggingStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoggingStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcademiaPackage getAcademiaPackage() {
		return (AcademiaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AcademiaPackage getPackage() {
		return AcademiaPackage.eINSTANCE;
	}

} //AcademiaFactoryImpl
