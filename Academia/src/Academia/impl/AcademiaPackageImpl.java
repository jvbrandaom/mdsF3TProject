/**
 */
package Academia.impl;

import Academia.AApplication;
import Academia.AAttribute;
import Academia.ABoundedElement;
import Academia.AClassifier;
import Academia.ADocumentatedElement;
import Academia.AFeature;
import Academia.AModeledElement;
import Academia.ANamedElement;
import Academia.AObject;
import Academia.AOperation;
import Academia.APackage;
import Academia.AParameter;
import Academia.ATypedElement;
import Academia.AVariation;
import Academia.AcademiaFactory;
import Academia.AcademiaPackage;
import Academia.Aluno;
import Academia.Campus;
import Academia.Curso;
import Academia.Departamento;
import Academia.Disciplina;
import Academia.DisciplinaGratis;
import Academia.DisciplinaPaga;
import Academia.DisciplinaSemestre;
import Academia.LoggingStrategy;
import Academia.Matricula;
import Academia.PersistenceStrategy;

import Academia.util.AcademiaValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AcademiaPackageImpl extends EPackageImpl implements AcademiaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aBoundedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aDocumentatedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aModeledElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aVariationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matriculaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alunoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cursoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departamentoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disciplinaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disciplinaSemestreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disciplinaPagaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disciplinaGratisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum persistenceStrategyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loggingStrategyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Academia.AcademiaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AcademiaPackageImpl() {
		super(eNS_URI, AcademiaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AcademiaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AcademiaPackage init() {
		if (isInited) return (AcademiaPackage)EPackage.Registry.INSTANCE.getEPackage(AcademiaPackage.eNS_URI);

		// Obtain or create and register package
		AcademiaPackageImpl theAcademiaPackage = (AcademiaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AcademiaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AcademiaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAcademiaPackage.createPackageContents();

		// Initialize created meta-data
		theAcademiaPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAcademiaPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AcademiaValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAcademiaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AcademiaPackage.eNS_URI, theAcademiaPackage);
		return theAcademiaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getABoundedElement() {
		return aBoundedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getABoundedElement_LowerBound() {
		return (EAttribute)aBoundedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getABoundedElement_UpperBound() {
		return (EAttribute)aBoundedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADocumentatedElement() {
		return aDocumentatedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADocumentatedElement_Documentation() {
		return (EAttribute)aDocumentatedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAModeledElement() {
		return aModeledElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANamedElement() {
		return aNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getANamedElement_Name() {
		return (EAttribute)aNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATypedElement() {
		return aTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATypedElement_TypeName() {
		return (EAttribute)aTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATypedElement_Changeable() {
		return (EAttribute)aTypedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATypedElement_Singleton() {
		return (EAttribute)aTypedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPackage() {
		return aPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPackage_Domain() {
		return (EAttribute)aPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPackage_DProject() {
		return (EAttribute)aPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPackage_AClassifiers() {
		return (EReference)aPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAClassifier() {
		return aClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAClassifier_TYPE() {
		return (EAttribute)aClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAClassifier_AChilds() {
		return (EReference)aClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAApplication() {
		return aApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAApplication_PersistenceStrategy() {
		return (EAttribute)aApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAApplication_LoggingStrategy() {
		return (EAttribute)aApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAApplication_DatabaseUser() {
		return (EAttribute)aApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAApplication_DatabasePassword() {
		return (EAttribute)aApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAFeature() {
		return aFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFeature_Stereo() {
		return (EAttribute)aFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAFeature_AParent() {
		return (EReference)aFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFeature_AAllParents() {
		return (EAttribute)aFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFeature_ProvidedAttributes() {
		return (EAttribute)aFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFeature_AttributesSQL() {
		return (EAttribute)aFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFeature_MultipleFields() {
		return (EAttribute)aFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAFeature_Associations() {
		return (EAttribute)aFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAObject() {
		return aObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAObject_Abstract() {
		return (EAttribute)aObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAObject_AAttributes() {
		return (EReference)aObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAObject_AOperations() {
		return (EReference)aObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAObject_PrimaryKey() {
		return (EAttribute)aObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAVariation() {
		return aVariationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVariation_LocalAttributes() {
		return (EAttribute)aVariationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAAttribute() {
		return aAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAAttribute_AContainer() {
		return (EReference)aAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAAttribute_DefaultValueLiteral() {
		return (EAttribute)aAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAAttribute_Unique() {
		return (EAttribute)aAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAOperation() {
		return aOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAOperation_AContainer() {
		return (EReference)aOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAOperation_AParameters() {
		return (EReference)aOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAParameter() {
		return aParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAParameter_AContainer() {
		return (EReference)aParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatricula() {
		return matriculaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAluno() {
		return alunoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurso() {
		return cursoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepartamento() {
		return departamentoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisciplina() {
		return disciplinaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCampus() {
		return campusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisciplinaSemestre() {
		return disciplinaSemestreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisciplinaPaga() {
		return disciplinaPagaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisciplinaGratis() {
		return disciplinaGratisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersistenceStrategy() {
		return persistenceStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLoggingStrategy() {
		return loggingStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcademiaFactory getAcademiaFactory() {
		return (AcademiaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aBoundedElementEClass = createEClass(ABOUNDED_ELEMENT);
		createEAttribute(aBoundedElementEClass, ABOUNDED_ELEMENT__LOWER_BOUND);
		createEAttribute(aBoundedElementEClass, ABOUNDED_ELEMENT__UPPER_BOUND);

		aDocumentatedElementEClass = createEClass(ADOCUMENTATED_ELEMENT);
		createEAttribute(aDocumentatedElementEClass, ADOCUMENTATED_ELEMENT__DOCUMENTATION);

		aModeledElementEClass = createEClass(AMODELED_ELEMENT);

		aNamedElementEClass = createEClass(ANAMED_ELEMENT);
		createEAttribute(aNamedElementEClass, ANAMED_ELEMENT__NAME);

		aTypedElementEClass = createEClass(ATYPED_ELEMENT);
		createEAttribute(aTypedElementEClass, ATYPED_ELEMENT__TYPE_NAME);
		createEAttribute(aTypedElementEClass, ATYPED_ELEMENT__CHANGEABLE);
		createEAttribute(aTypedElementEClass, ATYPED_ELEMENT__SINGLETON);

		aPackageEClass = createEClass(APACKAGE);
		createEAttribute(aPackageEClass, APACKAGE__DOMAIN);
		createEAttribute(aPackageEClass, APACKAGE__DPROJECT);
		createEReference(aPackageEClass, APACKAGE__ACLASSIFIERS);

		aClassifierEClass = createEClass(ACLASSIFIER);
		createEAttribute(aClassifierEClass, ACLASSIFIER__TYPE);
		createEReference(aClassifierEClass, ACLASSIFIER__ACHILDS);

		aApplicationEClass = createEClass(AAPPLICATION);
		createEAttribute(aApplicationEClass, AAPPLICATION__PERSISTENCE_STRATEGY);
		createEAttribute(aApplicationEClass, AAPPLICATION__LOGGING_STRATEGY);
		createEAttribute(aApplicationEClass, AAPPLICATION__DATABASE_USER);
		createEAttribute(aApplicationEClass, AAPPLICATION__DATABASE_PASSWORD);

		aFeatureEClass = createEClass(AFEATURE);
		createEAttribute(aFeatureEClass, AFEATURE__STEREO);
		createEReference(aFeatureEClass, AFEATURE__APARENT);
		createEAttribute(aFeatureEClass, AFEATURE__AALL_PARENTS);
		createEAttribute(aFeatureEClass, AFEATURE__PROVIDED_ATTRIBUTES);
		createEAttribute(aFeatureEClass, AFEATURE__ATTRIBUTES_SQL);
		createEAttribute(aFeatureEClass, AFEATURE__MULTIPLE_FIELDS);
		createEAttribute(aFeatureEClass, AFEATURE__ASSOCIATIONS);

		aObjectEClass = createEClass(AOBJECT);
		createEAttribute(aObjectEClass, AOBJECT__ABSTRACT);
		createEReference(aObjectEClass, AOBJECT__AATTRIBUTES);
		createEReference(aObjectEClass, AOBJECT__AOPERATIONS);
		createEAttribute(aObjectEClass, AOBJECT__PRIMARY_KEY);

		aVariationEClass = createEClass(AVARIATION);
		createEAttribute(aVariationEClass, AVARIATION__LOCAL_ATTRIBUTES);

		aAttributeEClass = createEClass(AATTRIBUTE);
		createEReference(aAttributeEClass, AATTRIBUTE__ACONTAINER);
		createEAttribute(aAttributeEClass, AATTRIBUTE__DEFAULT_VALUE_LITERAL);
		createEAttribute(aAttributeEClass, AATTRIBUTE__UNIQUE);

		aOperationEClass = createEClass(AOPERATION);
		createEReference(aOperationEClass, AOPERATION__ACONTAINER);
		createEReference(aOperationEClass, AOPERATION__APARAMETERS);

		aParameterEClass = createEClass(APARAMETER);
		createEReference(aParameterEClass, APARAMETER__ACONTAINER);

		matriculaEClass = createEClass(MATRICULA);

		alunoEClass = createEClass(ALUNO);

		cursoEClass = createEClass(CURSO);

		departamentoEClass = createEClass(DEPARTAMENTO);

		disciplinaEClass = createEClass(DISCIPLINA);

		campusEClass = createEClass(CAMPUS);

		disciplinaSemestreEClass = createEClass(DISCIPLINA_SEMESTRE);

		disciplinaPagaEClass = createEClass(DISCIPLINA_PAGA);

		disciplinaGratisEClass = createEClass(DISCIPLINA_GRATIS);

		// Create enums
		persistenceStrategyEEnum = createEEnum(PERSISTENCE_STRATEGY);
		loggingStrategyEEnum = createEEnum(LOGGING_STRATEGY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aClassifierEClass.getESuperTypes().add(this.getAModeledElement());
		aClassifierEClass.getESuperTypes().add(this.getADocumentatedElement());
		aApplicationEClass.getESuperTypes().add(this.getAClassifier());
		aApplicationEClass.getESuperTypes().add(this.getANamedElement());
		aFeatureEClass.getESuperTypes().add(this.getAClassifier());
		aObjectEClass.getESuperTypes().add(this.getAFeature());
		aObjectEClass.getESuperTypes().add(this.getANamedElement());
		aVariationEClass.getESuperTypes().add(this.getAFeature());
		aAttributeEClass.getESuperTypes().add(this.getANamedElement());
		aAttributeEClass.getESuperTypes().add(this.getATypedElement());
		aAttributeEClass.getESuperTypes().add(this.getABoundedElement());
		aAttributeEClass.getESuperTypes().add(this.getAModeledElement());
		aAttributeEClass.getESuperTypes().add(this.getADocumentatedElement());
		aOperationEClass.getESuperTypes().add(this.getANamedElement());
		aOperationEClass.getESuperTypes().add(this.getATypedElement());
		aOperationEClass.getESuperTypes().add(this.getABoundedElement());
		aOperationEClass.getESuperTypes().add(this.getAModeledElement());
		aOperationEClass.getESuperTypes().add(this.getADocumentatedElement());
		aParameterEClass.getESuperTypes().add(this.getANamedElement());
		aParameterEClass.getESuperTypes().add(this.getATypedElement());
		aParameterEClass.getESuperTypes().add(this.getABoundedElement());
		aParameterEClass.getESuperTypes().add(this.getAModeledElement());
		matriculaEClass.getESuperTypes().add(this.getAObject());
		alunoEClass.getESuperTypes().add(this.getAObject());
		cursoEClass.getESuperTypes().add(this.getAObject());
		departamentoEClass.getESuperTypes().add(this.getAObject());
		disciplinaEClass.getESuperTypes().add(this.getAObject());
		campusEClass.getESuperTypes().add(this.getAObject());
		disciplinaSemestreEClass.getESuperTypes().add(this.getAObject());
		disciplinaPagaEClass.getESuperTypes().add(this.getDisciplina());
		disciplinaGratisEClass.getESuperTypes().add(this.getDisciplina());

		// Initialize classes and features; add operations and parameters
		initEClass(aBoundedElementEClass, ABoundedElement.class, "ABoundedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getABoundedElement_LowerBound(), ecorePackage.getEString(), "lowerBound", "0", 1, 1, ABoundedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getABoundedElement_UpperBound(), ecorePackage.getEString(), "upperBound", "1", 1, 1, ABoundedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aDocumentatedElementEClass, ADocumentatedElement.class, "ADocumentatedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getADocumentatedElement_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, ADocumentatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aModeledElementEClass, AModeledElement.class, "AModeledElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aNamedElementEClass, ANamedElement.class, "ANamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getANamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ANamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aTypedElementEClass, ATypedElement.class, "ATypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATypedElement_TypeName(), ecorePackage.getEString(), "typeName", null, 1, 1, ATypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATypedElement_Changeable(), ecorePackage.getEBoolean(), "changeable", "true", 0, 1, ATypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATypedElement_Singleton(), ecorePackage.getEBoolean(), "singleton", "false", 0, 1, ATypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aPackageEClass, APackage.class, "APackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPackage_Domain(), ecorePackage.getEString(), "domain", "Academia", 1, 1, APackage.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPackage_DProject(), ecorePackage.getEString(), "dProject", "academia", 1, 1, APackage.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAPackage_AClassifiers(), this.getAClassifier(), null, "aClassifiers", null, 0, -1, APackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aClassifierEClass, AClassifier.class, "AClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAClassifier_TYPE(), ecorePackage.getEString(), "TYPE", null, 0, 1, AClassifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAClassifier_AChilds(), this.getAFeature(), this.getAFeature_AParent(), "aChilds", null, 0, -1, AClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aApplicationEClass, AApplication.class, "AApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAApplication_PersistenceStrategy(), this.getPersistenceStrategy(), "persistenceStrategy", null, 1, 1, AApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAApplication_LoggingStrategy(), this.getLoggingStrategy(), "loggingStrategy", null, 1, 1, AApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAApplication_DatabaseUser(), ecorePackage.getEString(), "databaseUser", "root", 0, 1, AApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAApplication_DatabasePassword(), ecorePackage.getEString(), "databasePassword", "root", 0, 1, AApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aFeatureEClass, AFeature.class, "AFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAFeature_Stereo(), ecorePackage.getEString(), "stereo", null, 1, 1, AFeature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAFeature_AParent(), this.getAClassifier(), this.getAClassifier_AChilds(), "aParent", null, 1, 1, AFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFeature_AAllParents(), ecorePackage.getEString(), "aAllParents", null, 0, 1, AFeature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFeature_ProvidedAttributes(), ecorePackage.getEString(), "providedAttributes", null, 1, 1, AFeature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFeature_AttributesSQL(), ecorePackage.getEString(), "attributesSQL", null, 1, 1, AFeature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFeature_MultipleFields(), ecorePackage.getEString(), "multipleFields", null, 0, 1, AFeature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAFeature_Associations(), ecorePackage.getEString(), "associations", null, 0, 1, AFeature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aObjectEClass, AObject.class, "AObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAObject_Abstract(), ecorePackage.getEBoolean(), "abstract", "false", 0, 1, AObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAObject_AAttributes(), this.getAAttribute(), this.getAAttribute_AContainer(), "aAttributes", null, 0, -1, AObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAObject_AOperations(), this.getAOperation(), this.getAOperation_AContainer(), "aOperations", null, 0, -1, AObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAObject_PrimaryKey(), ecorePackage.getEString(), "primaryKey", null, 1, 1, AObject.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(aVariationEClass, AVariation.class, "AVariation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAVariation_LocalAttributes(), ecorePackage.getEString(), "localAttributes", null, 0, 1, AVariation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aAttributeEClass, AAttribute.class, "AAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAAttribute_AContainer(), this.getAObject(), this.getAObject_AAttributes(), "aContainer", null, 1, 1, AAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAAttribute_DefaultValueLiteral(), ecorePackage.getEString(), "defaultValueLiteral", null, 0, 1, AAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAAttribute_Unique(), ecorePackage.getEBoolean(), "unique", "false", 0, 1, AAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aOperationEClass, AOperation.class, "AOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAOperation_AContainer(), this.getAObject(), this.getAObject_AOperations(), "aContainer", null, 1, 1, AOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAOperation_AParameters(), this.getAParameter(), this.getAParameter_AContainer(), "aParameters", null, 0, -1, AOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aParameterEClass, AParameter.class, "AParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAParameter_AContainer(), this.getAOperation(), this.getAOperation_AParameters(), "aContainer", null, 1, 1, AParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matriculaEClass, Matricula.class, "Matricula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alunoEClass, Aluno.class, "Aluno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cursoEClass, Curso.class, "Curso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(departamentoEClass, Departamento.class, "Departamento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disciplinaEClass, Disciplina.class, "Disciplina", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(campusEClass, Campus.class, "Campus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disciplinaSemestreEClass, DisciplinaSemestre.class, "DisciplinaSemestre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disciplinaPagaEClass, DisciplinaPaga.class, "DisciplinaPaga", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disciplinaGratisEClass, DisciplinaGratis.class, "DisciplinaGratis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(persistenceStrategyEEnum, PersistenceStrategy.class, "PersistenceStrategy");
		addEEnumLiteral(persistenceStrategyEEnum, PersistenceStrategy.JAVA);

		initEEnum(loggingStrategyEEnum, LoggingStrategy.class, "LoggingStrategy");
		addEEnumLiteral(loggingStrategyEEnum, LoggingStrategy.PROPERTIES_FILE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// GDMS
		createGDMSAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>GDMS</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGDMSAnnotations() {
		String source = "GDMS";		
		addAnnotation
		  (aBoundedElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "A Bounded Element is a element that has lower and upper bounds."
		   });			
		addAnnotation
		  (aDocumentatedElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "An Documented Element is an element that can have a text which describes this element."
		   });		
		addAnnotation
		  (aNamedElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "A Named Element is an element that has a name."
		   });			
		addAnnotation
		  (aTypedElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "A Typed Element is a Named Element that has a type. This type can be the name of a Feature or any programming language valid type."
		   });		
		addAnnotation
		  (aPackageEClass, 
		   source, 
		   new String[] {
			 "documentation", "A Package contains instances of the features of a sub-set of the domain. The features of the package specifies the features that form an application."
		   });				
		addAnnotation
		  (aFeatureEClass, 
		   source, 
		   new String[] {
			 "documentation", "A feature is a functional characteristic of the domain of a problem. A feature aggregates value to users."
		   });		
		addAnnotation
		  (aObjectEClass, 
		   source, 
		   new String[] {
			 "documentation", "A feature object is a domain feature that can be mandatory or optional. A set of Feature Objects composes the fuctionality of the applications."
		   });		
		addAnnotation
		  (aVariationEClass, 
		   source, 
		   new String[] {
			 "documentation", "A feature variation adds attributes and operations to feature objects, providing different behavior to them. Feature variation adds variability to feature objects, making slight changes in the application functionlity."
		   });		
		addAnnotation
		  (aAttributeEClass, 
		   source, 
		   new String[] {
			 "documentation", "An Attribute identifies a property which represents a desired information about the a feature."
		   });		
		addAnnotation
		  (aOperationEClass, 
		   source, 
		   new String[] {
			 "documentation", "A Operation is a function or an action associated to a feature."
		   });		
		addAnnotation
		  (aParameterEClass, 
		   source, 
		   new String[] {
			 "documentation", "A Parameter is a property of an operation. It is a value which must be passed to the operation so that it can be executed."
		   });									
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";			
		addAnnotation
		  (aBoundedElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "LowerBoundInvalidValue UpperBoundInvalidValue"
		   });				
		addAnnotation
		  (aNamedElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvalidName MissingName UniqueName"
		   });				
		addAnnotation
		  (aPackageEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueApplication MissingApplication"
		   });		
		addAnnotation
		  (aApplicationEClass, 
		   source, 
		   new String[] {
			 "constraints", "RootFeaturesOnly"
		   });								
		addAnnotation
		  (matriculaEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvalidAssociation AssociationDisciplinaSemestre AssociationAluno"
		   });		
		addAnnotation
		  (alunoEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvalidAssociation AssociationCurso"
		   });		
		addAnnotation
		  (cursoEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvalidAssociation AssociationDisciplina"
		   });		
		addAnnotation
		  (departamentoEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvalidAssociation"
		   });		
		addAnnotation
		  (disciplinaEClass, 
		   source, 
		   new String[] {
			 "constraints", " AssociationDisciplinaSemestre AssociationDepartamento"
		   });		
		addAnnotation
		  (campusEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvalidAssociation"
		   });		
		addAnnotation
		  (disciplinaSemestreEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvalidAssociation"
		   });		
		addAnnotation
		  (disciplinaPagaEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvalidAssociation"
		   });		
		addAnnotation
		  (disciplinaGratisEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvalidAssociation"
		   });
	}

} //AcademiaPackageImpl
