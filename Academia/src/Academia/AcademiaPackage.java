/**
 */
package Academia;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Academia.AcademiaFactory
 * @model kind="package"
 * @generated
 */
public interface AcademiaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Academia";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Academia";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Academia";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AcademiaPackage eINSTANCE = Academia.impl.AcademiaPackageImpl.init();

	/**
	 * The meta object id for the '{@link Academia.impl.ABoundedElementImpl <em>ABounded Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.ABoundedElementImpl
	 * @see Academia.impl.AcademiaPackageImpl#getABoundedElement()
	 * @generated
	 */
	int ABOUNDED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUNDED_ELEMENT__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUNDED_ELEMENT__UPPER_BOUND = 1;

	/**
	 * The number of structural features of the '<em>ABounded Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUNDED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Academia.impl.ADocumentatedElementImpl <em>ADocumentated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.ADocumentatedElementImpl
	 * @see Academia.impl.AcademiaPackageImpl#getADocumentatedElement()
	 * @generated
	 */
	int ADOCUMENTATED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTATED_ELEMENT__DOCUMENTATION = 0;

	/**
	 * The number of structural features of the '<em>ADocumentated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOCUMENTATED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Academia.impl.AModeledElementImpl <em>AModeled Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.AModeledElementImpl
	 * @see Academia.impl.AcademiaPackageImpl#getAModeledElement()
	 * @generated
	 */
	int AMODELED_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>AModeled Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMODELED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link Academia.impl.ANamedElementImpl <em>ANamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.ANamedElementImpl
	 * @see Academia.impl.AcademiaPackageImpl#getANamedElement()
	 * @generated
	 */
	int ANAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>ANamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Academia.impl.ATypedElementImpl <em>ATyped Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.ATypedElementImpl
	 * @see Academia.impl.AcademiaPackageImpl#getATypedElement()
	 * @generated
	 */
	int ATYPED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPED_ELEMENT__TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPED_ELEMENT__CHANGEABLE = 1;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPED_ELEMENT__SINGLETON = 2;

	/**
	 * The number of structural features of the '<em>ATyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Academia.impl.APackageImpl <em>APackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.APackageImpl
	 * @see Academia.impl.AcademiaPackageImpl#getAPackage()
	 * @generated
	 */
	int APACKAGE = 5;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACKAGE__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>DProject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACKAGE__DPROJECT = 1;

	/**
	 * The feature id for the '<em><b>AClassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACKAGE__ACLASSIFIERS = 2;

	/**
	 * The number of structural features of the '<em>APackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACKAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Academia.impl.AClassifierImpl <em>AClassifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.AClassifierImpl
	 * @see Academia.impl.AcademiaPackageImpl#getAClassifier()
	 * @generated
	 */
	int ACLASSIFIER = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASSIFIER__DOCUMENTATION = AMODELED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASSIFIER__TYPE = AMODELED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>AChilds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASSIFIER__ACHILDS = AMODELED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>AClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASSIFIER_FEATURE_COUNT = AMODELED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Academia.impl.AApplicationImpl <em>AApplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.AApplicationImpl
	 * @see Academia.impl.AcademiaPackageImpl#getAApplication()
	 * @generated
	 */
	int AAPPLICATION = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPPLICATION__DOCUMENTATION = ACLASSIFIER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPPLICATION__TYPE = ACLASSIFIER__TYPE;

	/**
	 * The feature id for the '<em><b>AChilds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPPLICATION__ACHILDS = ACLASSIFIER__ACHILDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPPLICATION__NAME = ACLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Persistence Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPPLICATION__PERSISTENCE_STRATEGY = ACLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logging Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPPLICATION__LOGGING_STRATEGY = ACLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Database User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPPLICATION__DATABASE_USER = ACLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Database Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPPLICATION__DATABASE_PASSWORD = ACLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>AApplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAPPLICATION_FEATURE_COUNT = ACLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link Academia.impl.AFeatureImpl <em>AFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.AFeatureImpl
	 * @see Academia.impl.AcademiaPackageImpl#getAFeature()
	 * @generated
	 */
	int AFEATURE = 8;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFEATURE__DOCUMENTATION = ACLASSIFIER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFEATURE__TYPE = ACLASSIFIER__TYPE;

	/**
	 * The feature id for the '<em><b>AChilds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFEATURE__ACHILDS = ACLASSIFIER__ACHILDS;

	/**
	 * The feature id for the '<em><b>Stereo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFEATURE__STEREO = ACLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>AParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFEATURE__APARENT = ACLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>AAll Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFEATURE__AALL_PARENTS = ACLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provided Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFEATURE__PROVIDED_ATTRIBUTES = ACLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attributes SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFEATURE__ATTRIBUTES_SQL = ACLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Multiple Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFEATURE__MULTIPLE_FIELDS = ACLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFEATURE__ASSOCIATIONS = ACLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>AFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFEATURE_FEATURE_COUNT = ACLASSIFIER_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link Academia.impl.AObjectImpl <em>AObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.AObjectImpl
	 * @see Academia.impl.AcademiaPackageImpl#getAObject()
	 * @generated
	 */
	int AOBJECT = 9;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__DOCUMENTATION = AFEATURE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__TYPE = AFEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>AChilds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__ACHILDS = AFEATURE__ACHILDS;

	/**
	 * The feature id for the '<em><b>Stereo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__STEREO = AFEATURE__STEREO;

	/**
	 * The feature id for the '<em><b>AParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__APARENT = AFEATURE__APARENT;

	/**
	 * The feature id for the '<em><b>AAll Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__AALL_PARENTS = AFEATURE__AALL_PARENTS;

	/**
	 * The feature id for the '<em><b>Provided Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__PROVIDED_ATTRIBUTES = AFEATURE__PROVIDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__ATTRIBUTES_SQL = AFEATURE__ATTRIBUTES_SQL;

	/**
	 * The feature id for the '<em><b>Multiple Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__MULTIPLE_FIELDS = AFEATURE__MULTIPLE_FIELDS;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__ASSOCIATIONS = AFEATURE__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__NAME = AFEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__ABSTRACT = AFEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>AAttributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__AATTRIBUTES = AFEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>AOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__AOPERATIONS = AFEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__PRIMARY_KEY = AFEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>AObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT_FEATURE_COUNT = AFEATURE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link Academia.impl.AVariationImpl <em>AVariation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.AVariationImpl
	 * @see Academia.impl.AcademiaPackageImpl#getAVariation()
	 * @generated
	 */
	int AVARIATION = 10;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVARIATION__DOCUMENTATION = AFEATURE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVARIATION__TYPE = AFEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>AChilds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVARIATION__ACHILDS = AFEATURE__ACHILDS;

	/**
	 * The feature id for the '<em><b>Stereo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVARIATION__STEREO = AFEATURE__STEREO;

	/**
	 * The feature id for the '<em><b>AParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVARIATION__APARENT = AFEATURE__APARENT;

	/**
	 * The feature id for the '<em><b>AAll Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVARIATION__AALL_PARENTS = AFEATURE__AALL_PARENTS;

	/**
	 * The feature id for the '<em><b>Provided Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVARIATION__PROVIDED_ATTRIBUTES = AFEATURE__PROVIDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVARIATION__ATTRIBUTES_SQL = AFEATURE__ATTRIBUTES_SQL;

	/**
	 * The feature id for the '<em><b>Multiple Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVARIATION__MULTIPLE_FIELDS = AFEATURE__MULTIPLE_FIELDS;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVARIATION__ASSOCIATIONS = AFEATURE__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Local Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVARIATION__LOCAL_ATTRIBUTES = AFEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AVariation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVARIATION_FEATURE_COUNT = AFEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Academia.impl.AAttributeImpl <em>AAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.AAttributeImpl
	 * @see Academia.impl.AcademiaPackageImpl#getAAttribute()
	 * @generated
	 */
	int AATTRIBUTE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AATTRIBUTE__NAME = ANAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AATTRIBUTE__TYPE_NAME = ANAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AATTRIBUTE__CHANGEABLE = ANAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AATTRIBUTE__SINGLETON = ANAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AATTRIBUTE__LOWER_BOUND = ANAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AATTRIBUTE__UPPER_BOUND = ANAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AATTRIBUTE__DOCUMENTATION = ANAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>AContainer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AATTRIBUTE__ACONTAINER = ANAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AATTRIBUTE__DEFAULT_VALUE_LITERAL = ANAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AATTRIBUTE__UNIQUE = ANAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>AAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AATTRIBUTE_FEATURE_COUNT = ANAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link Academia.impl.AOperationImpl <em>AOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.AOperationImpl
	 * @see Academia.impl.AcademiaPackageImpl#getAOperation()
	 * @generated
	 */
	int AOPERATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERATION__NAME = ANAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERATION__TYPE_NAME = ANAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERATION__CHANGEABLE = ANAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERATION__SINGLETON = ANAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERATION__LOWER_BOUND = ANAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERATION__UPPER_BOUND = ANAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERATION__DOCUMENTATION = ANAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>AContainer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERATION__ACONTAINER = ANAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>AParameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERATION__APARAMETERS = ANAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>AOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOPERATION_FEATURE_COUNT = ANAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link Academia.impl.AParameterImpl <em>AParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.AParameterImpl
	 * @see Academia.impl.AcademiaPackageImpl#getAParameter()
	 * @generated
	 */
	int APARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARAMETER__NAME = ANAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARAMETER__TYPE_NAME = ANAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARAMETER__CHANGEABLE = ANAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARAMETER__SINGLETON = ANAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARAMETER__LOWER_BOUND = ANAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARAMETER__UPPER_BOUND = ANAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>AContainer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARAMETER__ACONTAINER = ANAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>AParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARAMETER_FEATURE_COUNT = ANAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link Academia.impl.MatriculaImpl <em>Matricula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.MatriculaImpl
	 * @see Academia.impl.AcademiaPackageImpl#getMatricula()
	 * @generated
	 */
	int MATRICULA = 14;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__DOCUMENTATION = AOBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__TYPE = AOBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>AChilds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__ACHILDS = AOBJECT__ACHILDS;

	/**
	 * The feature id for the '<em><b>Stereo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__STEREO = AOBJECT__STEREO;

	/**
	 * The feature id for the '<em><b>AParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__APARENT = AOBJECT__APARENT;

	/**
	 * The feature id for the '<em><b>AAll Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__AALL_PARENTS = AOBJECT__AALL_PARENTS;

	/**
	 * The feature id for the '<em><b>Provided Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__PROVIDED_ATTRIBUTES = AOBJECT__PROVIDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__ATTRIBUTES_SQL = AOBJECT__ATTRIBUTES_SQL;

	/**
	 * The feature id for the '<em><b>Multiple Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__MULTIPLE_FIELDS = AOBJECT__MULTIPLE_FIELDS;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__ASSOCIATIONS = AOBJECT__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__NAME = AOBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__ABSTRACT = AOBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>AAttributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__AATTRIBUTES = AOBJECT__AATTRIBUTES;

	/**
	 * The feature id for the '<em><b>AOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__AOPERATIONS = AOBJECT__AOPERATIONS;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA__PRIMARY_KEY = AOBJECT__PRIMARY_KEY;

	/**
	 * The number of structural features of the '<em>Matricula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRICULA_FEATURE_COUNT = AOBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Academia.impl.AlunoImpl <em>Aluno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.AlunoImpl
	 * @see Academia.impl.AcademiaPackageImpl#getAluno()
	 * @generated
	 */
	int ALUNO = 15;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__DOCUMENTATION = AOBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__TYPE = AOBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>AChilds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ACHILDS = AOBJECT__ACHILDS;

	/**
	 * The feature id for the '<em><b>Stereo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__STEREO = AOBJECT__STEREO;

	/**
	 * The feature id for the '<em><b>AParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__APARENT = AOBJECT__APARENT;

	/**
	 * The feature id for the '<em><b>AAll Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__AALL_PARENTS = AOBJECT__AALL_PARENTS;

	/**
	 * The feature id for the '<em><b>Provided Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__PROVIDED_ATTRIBUTES = AOBJECT__PROVIDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ATTRIBUTES_SQL = AOBJECT__ATTRIBUTES_SQL;

	/**
	 * The feature id for the '<em><b>Multiple Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__MULTIPLE_FIELDS = AOBJECT__MULTIPLE_FIELDS;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ASSOCIATIONS = AOBJECT__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__NAME = AOBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ABSTRACT = AOBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>AAttributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__AATTRIBUTES = AOBJECT__AATTRIBUTES;

	/**
	 * The feature id for the '<em><b>AOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__AOPERATIONS = AOBJECT__AOPERATIONS;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__PRIMARY_KEY = AOBJECT__PRIMARY_KEY;

	/**
	 * The number of structural features of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_FEATURE_COUNT = AOBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Academia.impl.CursoImpl <em>Curso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.CursoImpl
	 * @see Academia.impl.AcademiaPackageImpl#getCurso()
	 * @generated
	 */
	int CURSO = 16;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO__DOCUMENTATION = AOBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO__TYPE = AOBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>AChilds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO__ACHILDS = AOBJECT__ACHILDS;

	/**
	 * The feature id for the '<em><b>Stereo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO__STEREO = AOBJECT__STEREO;

	/**
	 * The feature id for the '<em><b>AParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO__APARENT = AOBJECT__APARENT;

	/**
	 * The feature id for the '<em><b>AAll Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO__AALL_PARENTS = AOBJECT__AALL_PARENTS;

	/**
	 * The feature id for the '<em><b>Provided Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO__PROVIDED_ATTRIBUTES = AOBJECT__PROVIDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO__ATTRIBUTES_SQL = AOBJECT__ATTRIBUTES_SQL;

	/**
	 * The feature id for the '<em><b>Multiple Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO__MULTIPLE_FIELDS = AOBJECT__MULTIPLE_FIELDS;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO__ASSOCIATIONS = AOBJECT__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO__NAME = AOBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO__ABSTRACT = AOBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>AAttributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO__AATTRIBUTES = AOBJECT__AATTRIBUTES;

	/**
	 * The feature id for the '<em><b>AOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO__AOPERATIONS = AOBJECT__AOPERATIONS;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO__PRIMARY_KEY = AOBJECT__PRIMARY_KEY;

	/**
	 * The number of structural features of the '<em>Curso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO_FEATURE_COUNT = AOBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Academia.impl.DepartamentoImpl <em>Departamento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.DepartamentoImpl
	 * @see Academia.impl.AcademiaPackageImpl#getDepartamento()
	 * @generated
	 */
	int DEPARTAMENTO = 17;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__DOCUMENTATION = AOBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__TYPE = AOBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>AChilds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__ACHILDS = AOBJECT__ACHILDS;

	/**
	 * The feature id for the '<em><b>Stereo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__STEREO = AOBJECT__STEREO;

	/**
	 * The feature id for the '<em><b>AParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__APARENT = AOBJECT__APARENT;

	/**
	 * The feature id for the '<em><b>AAll Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__AALL_PARENTS = AOBJECT__AALL_PARENTS;

	/**
	 * The feature id for the '<em><b>Provided Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__PROVIDED_ATTRIBUTES = AOBJECT__PROVIDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__ATTRIBUTES_SQL = AOBJECT__ATTRIBUTES_SQL;

	/**
	 * The feature id for the '<em><b>Multiple Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__MULTIPLE_FIELDS = AOBJECT__MULTIPLE_FIELDS;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__ASSOCIATIONS = AOBJECT__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__NAME = AOBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__ABSTRACT = AOBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>AAttributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__AATTRIBUTES = AOBJECT__AATTRIBUTES;

	/**
	 * The feature id for the '<em><b>AOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__AOPERATIONS = AOBJECT__AOPERATIONS;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__PRIMARY_KEY = AOBJECT__PRIMARY_KEY;

	/**
	 * The number of structural features of the '<em>Departamento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO_FEATURE_COUNT = AOBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Academia.impl.DisciplinaImpl <em>Disciplina</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.DisciplinaImpl
	 * @see Academia.impl.AcademiaPackageImpl#getDisciplina()
	 * @generated
	 */
	int DISCIPLINA = 18;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__DOCUMENTATION = AOBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__TYPE = AOBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>AChilds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__ACHILDS = AOBJECT__ACHILDS;

	/**
	 * The feature id for the '<em><b>Stereo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__STEREO = AOBJECT__STEREO;

	/**
	 * The feature id for the '<em><b>AParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__APARENT = AOBJECT__APARENT;

	/**
	 * The feature id for the '<em><b>AAll Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__AALL_PARENTS = AOBJECT__AALL_PARENTS;

	/**
	 * The feature id for the '<em><b>Provided Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__PROVIDED_ATTRIBUTES = AOBJECT__PROVIDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__ATTRIBUTES_SQL = AOBJECT__ATTRIBUTES_SQL;

	/**
	 * The feature id for the '<em><b>Multiple Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__MULTIPLE_FIELDS = AOBJECT__MULTIPLE_FIELDS;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__ASSOCIATIONS = AOBJECT__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__NAME = AOBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__ABSTRACT = AOBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>AAttributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__AATTRIBUTES = AOBJECT__AATTRIBUTES;

	/**
	 * The feature id for the '<em><b>AOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__AOPERATIONS = AOBJECT__AOPERATIONS;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA__PRIMARY_KEY = AOBJECT__PRIMARY_KEY;

	/**
	 * The number of structural features of the '<em>Disciplina</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_FEATURE_COUNT = AOBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Academia.impl.CampusImpl <em>Campus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.CampusImpl
	 * @see Academia.impl.AcademiaPackageImpl#getCampus()
	 * @generated
	 */
	int CAMPUS = 19;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__DOCUMENTATION = AOBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__TYPE = AOBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>AChilds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__ACHILDS = AOBJECT__ACHILDS;

	/**
	 * The feature id for the '<em><b>Stereo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__STEREO = AOBJECT__STEREO;

	/**
	 * The feature id for the '<em><b>AParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__APARENT = AOBJECT__APARENT;

	/**
	 * The feature id for the '<em><b>AAll Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__AALL_PARENTS = AOBJECT__AALL_PARENTS;

	/**
	 * The feature id for the '<em><b>Provided Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__PROVIDED_ATTRIBUTES = AOBJECT__PROVIDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__ATTRIBUTES_SQL = AOBJECT__ATTRIBUTES_SQL;

	/**
	 * The feature id for the '<em><b>Multiple Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__MULTIPLE_FIELDS = AOBJECT__MULTIPLE_FIELDS;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__ASSOCIATIONS = AOBJECT__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__NAME = AOBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__ABSTRACT = AOBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>AAttributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__AATTRIBUTES = AOBJECT__AATTRIBUTES;

	/**
	 * The feature id for the '<em><b>AOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__AOPERATIONS = AOBJECT__AOPERATIONS;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__PRIMARY_KEY = AOBJECT__PRIMARY_KEY;

	/**
	 * The number of structural features of the '<em>Campus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_FEATURE_COUNT = AOBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Academia.impl.DisciplinaSemestreImpl <em>Disciplina Semestre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.DisciplinaSemestreImpl
	 * @see Academia.impl.AcademiaPackageImpl#getDisciplinaSemestre()
	 * @generated
	 */
	int DISCIPLINA_SEMESTRE = 20;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_SEMESTRE__DOCUMENTATION = AOBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_SEMESTRE__TYPE = AOBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>AChilds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_SEMESTRE__ACHILDS = AOBJECT__ACHILDS;

	/**
	 * The feature id for the '<em><b>Stereo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_SEMESTRE__STEREO = AOBJECT__STEREO;

	/**
	 * The feature id for the '<em><b>AParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_SEMESTRE__APARENT = AOBJECT__APARENT;

	/**
	 * The feature id for the '<em><b>AAll Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_SEMESTRE__AALL_PARENTS = AOBJECT__AALL_PARENTS;

	/**
	 * The feature id for the '<em><b>Provided Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_SEMESTRE__PROVIDED_ATTRIBUTES = AOBJECT__PROVIDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_SEMESTRE__ATTRIBUTES_SQL = AOBJECT__ATTRIBUTES_SQL;

	/**
	 * The feature id for the '<em><b>Multiple Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_SEMESTRE__MULTIPLE_FIELDS = AOBJECT__MULTIPLE_FIELDS;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_SEMESTRE__ASSOCIATIONS = AOBJECT__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_SEMESTRE__NAME = AOBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_SEMESTRE__ABSTRACT = AOBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>AAttributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_SEMESTRE__AATTRIBUTES = AOBJECT__AATTRIBUTES;

	/**
	 * The feature id for the '<em><b>AOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_SEMESTRE__AOPERATIONS = AOBJECT__AOPERATIONS;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_SEMESTRE__PRIMARY_KEY = AOBJECT__PRIMARY_KEY;

	/**
	 * The number of structural features of the '<em>Disciplina Semestre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_SEMESTRE_FEATURE_COUNT = AOBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Academia.impl.DisciplinaPagaImpl <em>Disciplina Paga</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.DisciplinaPagaImpl
	 * @see Academia.impl.AcademiaPackageImpl#getDisciplinaPaga()
	 * @generated
	 */
	int DISCIPLINA_PAGA = 21;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_PAGA__DOCUMENTATION = DISCIPLINA__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_PAGA__TYPE = DISCIPLINA__TYPE;

	/**
	 * The feature id for the '<em><b>AChilds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_PAGA__ACHILDS = DISCIPLINA__ACHILDS;

	/**
	 * The feature id for the '<em><b>Stereo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_PAGA__STEREO = DISCIPLINA__STEREO;

	/**
	 * The feature id for the '<em><b>AParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_PAGA__APARENT = DISCIPLINA__APARENT;

	/**
	 * The feature id for the '<em><b>AAll Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_PAGA__AALL_PARENTS = DISCIPLINA__AALL_PARENTS;

	/**
	 * The feature id for the '<em><b>Provided Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_PAGA__PROVIDED_ATTRIBUTES = DISCIPLINA__PROVIDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_PAGA__ATTRIBUTES_SQL = DISCIPLINA__ATTRIBUTES_SQL;

	/**
	 * The feature id for the '<em><b>Multiple Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_PAGA__MULTIPLE_FIELDS = DISCIPLINA__MULTIPLE_FIELDS;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_PAGA__ASSOCIATIONS = DISCIPLINA__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_PAGA__NAME = DISCIPLINA__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_PAGA__ABSTRACT = DISCIPLINA__ABSTRACT;

	/**
	 * The feature id for the '<em><b>AAttributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_PAGA__AATTRIBUTES = DISCIPLINA__AATTRIBUTES;

	/**
	 * The feature id for the '<em><b>AOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_PAGA__AOPERATIONS = DISCIPLINA__AOPERATIONS;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_PAGA__PRIMARY_KEY = DISCIPLINA__PRIMARY_KEY;

	/**
	 * The number of structural features of the '<em>Disciplina Paga</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_PAGA_FEATURE_COUNT = DISCIPLINA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Academia.impl.DisciplinaGratisImpl <em>Disciplina Gratis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.impl.DisciplinaGratisImpl
	 * @see Academia.impl.AcademiaPackageImpl#getDisciplinaGratis()
	 * @generated
	 */
	int DISCIPLINA_GRATIS = 22;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_GRATIS__DOCUMENTATION = DISCIPLINA__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_GRATIS__TYPE = DISCIPLINA__TYPE;

	/**
	 * The feature id for the '<em><b>AChilds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_GRATIS__ACHILDS = DISCIPLINA__ACHILDS;

	/**
	 * The feature id for the '<em><b>Stereo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_GRATIS__STEREO = DISCIPLINA__STEREO;

	/**
	 * The feature id for the '<em><b>AParent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_GRATIS__APARENT = DISCIPLINA__APARENT;

	/**
	 * The feature id for the '<em><b>AAll Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_GRATIS__AALL_PARENTS = DISCIPLINA__AALL_PARENTS;

	/**
	 * The feature id for the '<em><b>Provided Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_GRATIS__PROVIDED_ATTRIBUTES = DISCIPLINA__PROVIDED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Attributes SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_GRATIS__ATTRIBUTES_SQL = DISCIPLINA__ATTRIBUTES_SQL;

	/**
	 * The feature id for the '<em><b>Multiple Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_GRATIS__MULTIPLE_FIELDS = DISCIPLINA__MULTIPLE_FIELDS;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_GRATIS__ASSOCIATIONS = DISCIPLINA__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_GRATIS__NAME = DISCIPLINA__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_GRATIS__ABSTRACT = DISCIPLINA__ABSTRACT;

	/**
	 * The feature id for the '<em><b>AAttributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_GRATIS__AATTRIBUTES = DISCIPLINA__AATTRIBUTES;

	/**
	 * The feature id for the '<em><b>AOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_GRATIS__AOPERATIONS = DISCIPLINA__AOPERATIONS;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_GRATIS__PRIMARY_KEY = DISCIPLINA__PRIMARY_KEY;

	/**
	 * The number of structural features of the '<em>Disciplina Gratis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINA_GRATIS_FEATURE_COUNT = DISCIPLINA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Academia.PersistenceStrategy <em>Persistence Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.PersistenceStrategy
	 * @see Academia.impl.AcademiaPackageImpl#getPersistenceStrategy()
	 * @generated
	 */
	int PERSISTENCE_STRATEGY = 23;

	/**
	 * The meta object id for the '{@link Academia.LoggingStrategy <em>Logging Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Academia.LoggingStrategy
	 * @see Academia.impl.AcademiaPackageImpl#getLoggingStrategy()
	 * @generated
	 */
	int LOGGING_STRATEGY = 24;


	/**
	 * Returns the meta object for class '{@link Academia.ABoundedElement <em>ABounded Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ABounded Element</em>'.
	 * @see Academia.ABoundedElement
	 * @generated
	 */
	EClass getABoundedElement();

	/**
	 * Returns the meta object for the attribute '{@link Academia.ABoundedElement#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see Academia.ABoundedElement#getLowerBound()
	 * @see #getABoundedElement()
	 * @generated
	 */
	EAttribute getABoundedElement_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link Academia.ABoundedElement#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see Academia.ABoundedElement#getUpperBound()
	 * @see #getABoundedElement()
	 * @generated
	 */
	EAttribute getABoundedElement_UpperBound();

	/**
	 * Returns the meta object for class '{@link Academia.ADocumentatedElement <em>ADocumentated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADocumentated Element</em>'.
	 * @see Academia.ADocumentatedElement
	 * @generated
	 */
	EClass getADocumentatedElement();

	/**
	 * Returns the meta object for the attribute '{@link Academia.ADocumentatedElement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see Academia.ADocumentatedElement#getDocumentation()
	 * @see #getADocumentatedElement()
	 * @generated
	 */
	EAttribute getADocumentatedElement_Documentation();

	/**
	 * Returns the meta object for class '{@link Academia.AModeledElement <em>AModeled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AModeled Element</em>'.
	 * @see Academia.AModeledElement
	 * @generated
	 */
	EClass getAModeledElement();

	/**
	 * Returns the meta object for class '{@link Academia.ANamedElement <em>ANamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANamed Element</em>'.
	 * @see Academia.ANamedElement
	 * @generated
	 */
	EClass getANamedElement();

	/**
	 * Returns the meta object for the attribute '{@link Academia.ANamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Academia.ANamedElement#getName()
	 * @see #getANamedElement()
	 * @generated
	 */
	EAttribute getANamedElement_Name();

	/**
	 * Returns the meta object for class '{@link Academia.ATypedElement <em>ATyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATyped Element</em>'.
	 * @see Academia.ATypedElement
	 * @generated
	 */
	EClass getATypedElement();

	/**
	 * Returns the meta object for the attribute '{@link Academia.ATypedElement#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see Academia.ATypedElement#getTypeName()
	 * @see #getATypedElement()
	 * @generated
	 */
	EAttribute getATypedElement_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link Academia.ATypedElement#isChangeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable</em>'.
	 * @see Academia.ATypedElement#isChangeable()
	 * @see #getATypedElement()
	 * @generated
	 */
	EAttribute getATypedElement_Changeable();

	/**
	 * Returns the meta object for the attribute '{@link Academia.ATypedElement#isSingleton <em>Singleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Singleton</em>'.
	 * @see Academia.ATypedElement#isSingleton()
	 * @see #getATypedElement()
	 * @generated
	 */
	EAttribute getATypedElement_Singleton();

	/**
	 * Returns the meta object for class '{@link Academia.APackage <em>APackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APackage</em>'.
	 * @see Academia.APackage
	 * @generated
	 */
	EClass getAPackage();

	/**
	 * Returns the meta object for the attribute '{@link Academia.APackage#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see Academia.APackage#getDomain()
	 * @see #getAPackage()
	 * @generated
	 */
	EAttribute getAPackage_Domain();

	/**
	 * Returns the meta object for the attribute '{@link Academia.APackage#getDProject <em>DProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DProject</em>'.
	 * @see Academia.APackage#getDProject()
	 * @see #getAPackage()
	 * @generated
	 */
	EAttribute getAPackage_DProject();

	/**
	 * Returns the meta object for the containment reference list '{@link Academia.APackage#getAClassifiers <em>AClassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AClassifiers</em>'.
	 * @see Academia.APackage#getAClassifiers()
	 * @see #getAPackage()
	 * @generated
	 */
	EReference getAPackage_AClassifiers();

	/**
	 * Returns the meta object for class '{@link Academia.AClassifier <em>AClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AClassifier</em>'.
	 * @see Academia.AClassifier
	 * @generated
	 */
	EClass getAClassifier();

	/**
	 * Returns the meta object for the attribute '{@link Academia.AClassifier#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TYPE</em>'.
	 * @see Academia.AClassifier#getTYPE()
	 * @see #getAClassifier()
	 * @generated
	 */
	EAttribute getAClassifier_TYPE();

	/**
	 * Returns the meta object for the reference list '{@link Academia.AClassifier#getAChilds <em>AChilds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>AChilds</em>'.
	 * @see Academia.AClassifier#getAChilds()
	 * @see #getAClassifier()
	 * @generated
	 */
	EReference getAClassifier_AChilds();

	/**
	 * Returns the meta object for class '{@link Academia.AApplication <em>AApplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AApplication</em>'.
	 * @see Academia.AApplication
	 * @generated
	 */
	EClass getAApplication();

	/**
	 * Returns the meta object for the attribute '{@link Academia.AApplication#getPersistenceStrategy <em>Persistence Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence Strategy</em>'.
	 * @see Academia.AApplication#getPersistenceStrategy()
	 * @see #getAApplication()
	 * @generated
	 */
	EAttribute getAApplication_PersistenceStrategy();

	/**
	 * Returns the meta object for the attribute '{@link Academia.AApplication#getLoggingStrategy <em>Logging Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logging Strategy</em>'.
	 * @see Academia.AApplication#getLoggingStrategy()
	 * @see #getAApplication()
	 * @generated
	 */
	EAttribute getAApplication_LoggingStrategy();

	/**
	 * Returns the meta object for the attribute '{@link Academia.AApplication#getDatabaseUser <em>Database User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database User</em>'.
	 * @see Academia.AApplication#getDatabaseUser()
	 * @see #getAApplication()
	 * @generated
	 */
	EAttribute getAApplication_DatabaseUser();

	/**
	 * Returns the meta object for the attribute '{@link Academia.AApplication#getDatabasePassword <em>Database Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Password</em>'.
	 * @see Academia.AApplication#getDatabasePassword()
	 * @see #getAApplication()
	 * @generated
	 */
	EAttribute getAApplication_DatabasePassword();

	/**
	 * Returns the meta object for class '{@link Academia.AFeature <em>AFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AFeature</em>'.
	 * @see Academia.AFeature
	 * @generated
	 */
	EClass getAFeature();

	/**
	 * Returns the meta object for the attribute '{@link Academia.AFeature#getStereo <em>Stereo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereo</em>'.
	 * @see Academia.AFeature#getStereo()
	 * @see #getAFeature()
	 * @generated
	 */
	EAttribute getAFeature_Stereo();

	/**
	 * Returns the meta object for the reference '{@link Academia.AFeature#getAParent <em>AParent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>AParent</em>'.
	 * @see Academia.AFeature#getAParent()
	 * @see #getAFeature()
	 * @generated
	 */
	EReference getAFeature_AParent();

	/**
	 * Returns the meta object for the attribute '{@link Academia.AFeature#getAAllParents <em>AAll Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AAll Parents</em>'.
	 * @see Academia.AFeature#getAAllParents()
	 * @see #getAFeature()
	 * @generated
	 */
	EAttribute getAFeature_AAllParents();

	/**
	 * Returns the meta object for the attribute '{@link Academia.AFeature#getProvidedAttributes <em>Provided Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provided Attributes</em>'.
	 * @see Academia.AFeature#getProvidedAttributes()
	 * @see #getAFeature()
	 * @generated
	 */
	EAttribute getAFeature_ProvidedAttributes();

	/**
	 * Returns the meta object for the attribute '{@link Academia.AFeature#getAttributesSQL <em>Attributes SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributes SQL</em>'.
	 * @see Academia.AFeature#getAttributesSQL()
	 * @see #getAFeature()
	 * @generated
	 */
	EAttribute getAFeature_AttributesSQL();

	/**
	 * Returns the meta object for the attribute '{@link Academia.AFeature#getMultipleFields <em>Multiple Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Fields</em>'.
	 * @see Academia.AFeature#getMultipleFields()
	 * @see #getAFeature()
	 * @generated
	 */
	EAttribute getAFeature_MultipleFields();

	/**
	 * Returns the meta object for the attribute '{@link Academia.AFeature#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associations</em>'.
	 * @see Academia.AFeature#getAssociations()
	 * @see #getAFeature()
	 * @generated
	 */
	EAttribute getAFeature_Associations();

	/**
	 * Returns the meta object for class '{@link Academia.AObject <em>AObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AObject</em>'.
	 * @see Academia.AObject
	 * @generated
	 */
	EClass getAObject();

	/**
	 * Returns the meta object for the attribute '{@link Academia.AObject#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see Academia.AObject#isAbstract()
	 * @see #getAObject()
	 * @generated
	 */
	EAttribute getAObject_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link Academia.AObject#getAAttributes <em>AAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AAttributes</em>'.
	 * @see Academia.AObject#getAAttributes()
	 * @see #getAObject()
	 * @generated
	 */
	EReference getAObject_AAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link Academia.AObject#getAOperations <em>AOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AOperations</em>'.
	 * @see Academia.AObject#getAOperations()
	 * @see #getAObject()
	 * @generated
	 */
	EReference getAObject_AOperations();

	/**
	 * Returns the meta object for the attribute '{@link Academia.AObject#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key</em>'.
	 * @see Academia.AObject#getPrimaryKey()
	 * @see #getAObject()
	 * @generated
	 */
	EAttribute getAObject_PrimaryKey();

	/**
	 * Returns the meta object for class '{@link Academia.AVariation <em>AVariation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVariation</em>'.
	 * @see Academia.AVariation
	 * @generated
	 */
	EClass getAVariation();

	/**
	 * Returns the meta object for the attribute '{@link Academia.AVariation#getLocalAttributes <em>Local Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Attributes</em>'.
	 * @see Academia.AVariation#getLocalAttributes()
	 * @see #getAVariation()
	 * @generated
	 */
	EAttribute getAVariation_LocalAttributes();

	/**
	 * Returns the meta object for class '{@link Academia.AAttribute <em>AAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AAttribute</em>'.
	 * @see Academia.AAttribute
	 * @generated
	 */
	EClass getAAttribute();

	/**
	 * Returns the meta object for the container reference '{@link Academia.AAttribute#getAContainer <em>AContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>AContainer</em>'.
	 * @see Academia.AAttribute#getAContainer()
	 * @see #getAAttribute()
	 * @generated
	 */
	EReference getAAttribute_AContainer();

	/**
	 * Returns the meta object for the attribute '{@link Academia.AAttribute#getDefaultValueLiteral <em>Default Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Literal</em>'.
	 * @see Academia.AAttribute#getDefaultValueLiteral()
	 * @see #getAAttribute()
	 * @generated
	 */
	EAttribute getAAttribute_DefaultValueLiteral();

	/**
	 * Returns the meta object for the attribute '{@link Academia.AAttribute#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see Academia.AAttribute#isUnique()
	 * @see #getAAttribute()
	 * @generated
	 */
	EAttribute getAAttribute_Unique();

	/**
	 * Returns the meta object for class '{@link Academia.AOperation <em>AOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AOperation</em>'.
	 * @see Academia.AOperation
	 * @generated
	 */
	EClass getAOperation();

	/**
	 * Returns the meta object for the container reference '{@link Academia.AOperation#getAContainer <em>AContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>AContainer</em>'.
	 * @see Academia.AOperation#getAContainer()
	 * @see #getAOperation()
	 * @generated
	 */
	EReference getAOperation_AContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link Academia.AOperation#getAParameters <em>AParameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AParameters</em>'.
	 * @see Academia.AOperation#getAParameters()
	 * @see #getAOperation()
	 * @generated
	 */
	EReference getAOperation_AParameters();

	/**
	 * Returns the meta object for class '{@link Academia.AParameter <em>AParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AParameter</em>'.
	 * @see Academia.AParameter
	 * @generated
	 */
	EClass getAParameter();

	/**
	 * Returns the meta object for the container reference '{@link Academia.AParameter#getAContainer <em>AContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>AContainer</em>'.
	 * @see Academia.AParameter#getAContainer()
	 * @see #getAParameter()
	 * @generated
	 */
	EReference getAParameter_AContainer();

	/**
	 * Returns the meta object for class '{@link Academia.Matricula <em>Matricula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matricula</em>'.
	 * @see Academia.Matricula
	 * @generated
	 */
	EClass getMatricula();

	/**
	 * Returns the meta object for class '{@link Academia.Aluno <em>Aluno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aluno</em>'.
	 * @see Academia.Aluno
	 * @generated
	 */
	EClass getAluno();

	/**
	 * Returns the meta object for class '{@link Academia.Curso <em>Curso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curso</em>'.
	 * @see Academia.Curso
	 * @generated
	 */
	EClass getCurso();

	/**
	 * Returns the meta object for class '{@link Academia.Departamento <em>Departamento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Departamento</em>'.
	 * @see Academia.Departamento
	 * @generated
	 */
	EClass getDepartamento();

	/**
	 * Returns the meta object for class '{@link Academia.Disciplina <em>Disciplina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disciplina</em>'.
	 * @see Academia.Disciplina
	 * @generated
	 */
	EClass getDisciplina();

	/**
	 * Returns the meta object for class '{@link Academia.Campus <em>Campus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campus</em>'.
	 * @see Academia.Campus
	 * @generated
	 */
	EClass getCampus();

	/**
	 * Returns the meta object for class '{@link Academia.DisciplinaSemestre <em>Disciplina Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disciplina Semestre</em>'.
	 * @see Academia.DisciplinaSemestre
	 * @generated
	 */
	EClass getDisciplinaSemestre();

	/**
	 * Returns the meta object for class '{@link Academia.DisciplinaPaga <em>Disciplina Paga</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disciplina Paga</em>'.
	 * @see Academia.DisciplinaPaga
	 * @generated
	 */
	EClass getDisciplinaPaga();

	/**
	 * Returns the meta object for class '{@link Academia.DisciplinaGratis <em>Disciplina Gratis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disciplina Gratis</em>'.
	 * @see Academia.DisciplinaGratis
	 * @generated
	 */
	EClass getDisciplinaGratis();

	/**
	 * Returns the meta object for enum '{@link Academia.PersistenceStrategy <em>Persistence Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Persistence Strategy</em>'.
	 * @see Academia.PersistenceStrategy
	 * @generated
	 */
	EEnum getPersistenceStrategy();

	/**
	 * Returns the meta object for enum '{@link Academia.LoggingStrategy <em>Logging Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logging Strategy</em>'.
	 * @see Academia.LoggingStrategy
	 * @generated
	 */
	EEnum getLoggingStrategy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AcademiaFactory getAcademiaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Academia.impl.ABoundedElementImpl <em>ABounded Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.ABoundedElementImpl
		 * @see Academia.impl.AcademiaPackageImpl#getABoundedElement()
		 * @generated
		 */
		EClass ABOUNDED_ELEMENT = eINSTANCE.getABoundedElement();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABOUNDED_ELEMENT__LOWER_BOUND = eINSTANCE.getABoundedElement_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABOUNDED_ELEMENT__UPPER_BOUND = eINSTANCE.getABoundedElement_UpperBound();

		/**
		 * The meta object literal for the '{@link Academia.impl.ADocumentatedElementImpl <em>ADocumentated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.ADocumentatedElementImpl
		 * @see Academia.impl.AcademiaPackageImpl#getADocumentatedElement()
		 * @generated
		 */
		EClass ADOCUMENTATED_ELEMENT = eINSTANCE.getADocumentatedElement();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADOCUMENTATED_ELEMENT__DOCUMENTATION = eINSTANCE.getADocumentatedElement_Documentation();

		/**
		 * The meta object literal for the '{@link Academia.impl.AModeledElementImpl <em>AModeled Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.AModeledElementImpl
		 * @see Academia.impl.AcademiaPackageImpl#getAModeledElement()
		 * @generated
		 */
		EClass AMODELED_ELEMENT = eINSTANCE.getAModeledElement();

		/**
		 * The meta object literal for the '{@link Academia.impl.ANamedElementImpl <em>ANamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.ANamedElementImpl
		 * @see Academia.impl.AcademiaPackageImpl#getANamedElement()
		 * @generated
		 */
		EClass ANAMED_ELEMENT = eINSTANCE.getANamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANAMED_ELEMENT__NAME = eINSTANCE.getANamedElement_Name();

		/**
		 * The meta object literal for the '{@link Academia.impl.ATypedElementImpl <em>ATyped Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.ATypedElementImpl
		 * @see Academia.impl.AcademiaPackageImpl#getATypedElement()
		 * @generated
		 */
		EClass ATYPED_ELEMENT = eINSTANCE.getATypedElement();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPED_ELEMENT__TYPE_NAME = eINSTANCE.getATypedElement_TypeName();

		/**
		 * The meta object literal for the '<em><b>Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPED_ELEMENT__CHANGEABLE = eINSTANCE.getATypedElement_Changeable();

		/**
		 * The meta object literal for the '<em><b>Singleton</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPED_ELEMENT__SINGLETON = eINSTANCE.getATypedElement_Singleton();

		/**
		 * The meta object literal for the '{@link Academia.impl.APackageImpl <em>APackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.APackageImpl
		 * @see Academia.impl.AcademiaPackageImpl#getAPackage()
		 * @generated
		 */
		EClass APACKAGE = eINSTANCE.getAPackage();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACKAGE__DOMAIN = eINSTANCE.getAPackage_Domain();

		/**
		 * The meta object literal for the '<em><b>DProject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APACKAGE__DPROJECT = eINSTANCE.getAPackage_DProject();

		/**
		 * The meta object literal for the '<em><b>AClassifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APACKAGE__ACLASSIFIERS = eINSTANCE.getAPackage_AClassifiers();

		/**
		 * The meta object literal for the '{@link Academia.impl.AClassifierImpl <em>AClassifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.AClassifierImpl
		 * @see Academia.impl.AcademiaPackageImpl#getAClassifier()
		 * @generated
		 */
		EClass ACLASSIFIER = eINSTANCE.getAClassifier();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACLASSIFIER__TYPE = eINSTANCE.getAClassifier_TYPE();

		/**
		 * The meta object literal for the '<em><b>AChilds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACLASSIFIER__ACHILDS = eINSTANCE.getAClassifier_AChilds();

		/**
		 * The meta object literal for the '{@link Academia.impl.AApplicationImpl <em>AApplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.AApplicationImpl
		 * @see Academia.impl.AcademiaPackageImpl#getAApplication()
		 * @generated
		 */
		EClass AAPPLICATION = eINSTANCE.getAApplication();

		/**
		 * The meta object literal for the '<em><b>Persistence Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AAPPLICATION__PERSISTENCE_STRATEGY = eINSTANCE.getAApplication_PersistenceStrategy();

		/**
		 * The meta object literal for the '<em><b>Logging Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AAPPLICATION__LOGGING_STRATEGY = eINSTANCE.getAApplication_LoggingStrategy();

		/**
		 * The meta object literal for the '<em><b>Database User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AAPPLICATION__DATABASE_USER = eINSTANCE.getAApplication_DatabaseUser();

		/**
		 * The meta object literal for the '<em><b>Database Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AAPPLICATION__DATABASE_PASSWORD = eINSTANCE.getAApplication_DatabasePassword();

		/**
		 * The meta object literal for the '{@link Academia.impl.AFeatureImpl <em>AFeature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.AFeatureImpl
		 * @see Academia.impl.AcademiaPackageImpl#getAFeature()
		 * @generated
		 */
		EClass AFEATURE = eINSTANCE.getAFeature();

		/**
		 * The meta object literal for the '<em><b>Stereo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFEATURE__STEREO = eINSTANCE.getAFeature_Stereo();

		/**
		 * The meta object literal for the '<em><b>AParent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFEATURE__APARENT = eINSTANCE.getAFeature_AParent();

		/**
		 * The meta object literal for the '<em><b>AAll Parents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFEATURE__AALL_PARENTS = eINSTANCE.getAFeature_AAllParents();

		/**
		 * The meta object literal for the '<em><b>Provided Attributes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFEATURE__PROVIDED_ATTRIBUTES = eINSTANCE.getAFeature_ProvidedAttributes();

		/**
		 * The meta object literal for the '<em><b>Attributes SQL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFEATURE__ATTRIBUTES_SQL = eINSTANCE.getAFeature_AttributesSQL();

		/**
		 * The meta object literal for the '<em><b>Multiple Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFEATURE__MULTIPLE_FIELDS = eINSTANCE.getAFeature_MultipleFields();

		/**
		 * The meta object literal for the '<em><b>Associations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFEATURE__ASSOCIATIONS = eINSTANCE.getAFeature_Associations();

		/**
		 * The meta object literal for the '{@link Academia.impl.AObjectImpl <em>AObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.AObjectImpl
		 * @see Academia.impl.AcademiaPackageImpl#getAObject()
		 * @generated
		 */
		EClass AOBJECT = eINSTANCE.getAObject();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AOBJECT__ABSTRACT = eINSTANCE.getAObject_Abstract();

		/**
		 * The meta object literal for the '<em><b>AAttributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AOBJECT__AATTRIBUTES = eINSTANCE.getAObject_AAttributes();

		/**
		 * The meta object literal for the '<em><b>AOperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AOBJECT__AOPERATIONS = eINSTANCE.getAObject_AOperations();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AOBJECT__PRIMARY_KEY = eINSTANCE.getAObject_PrimaryKey();

		/**
		 * The meta object literal for the '{@link Academia.impl.AVariationImpl <em>AVariation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.AVariationImpl
		 * @see Academia.impl.AcademiaPackageImpl#getAVariation()
		 * @generated
		 */
		EClass AVARIATION = eINSTANCE.getAVariation();

		/**
		 * The meta object literal for the '<em><b>Local Attributes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVARIATION__LOCAL_ATTRIBUTES = eINSTANCE.getAVariation_LocalAttributes();

		/**
		 * The meta object literal for the '{@link Academia.impl.AAttributeImpl <em>AAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.AAttributeImpl
		 * @see Academia.impl.AcademiaPackageImpl#getAAttribute()
		 * @generated
		 */
		EClass AATTRIBUTE = eINSTANCE.getAAttribute();

		/**
		 * The meta object literal for the '<em><b>AContainer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AATTRIBUTE__ACONTAINER = eINSTANCE.getAAttribute_AContainer();

		/**
		 * The meta object literal for the '<em><b>Default Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AATTRIBUTE__DEFAULT_VALUE_LITERAL = eINSTANCE.getAAttribute_DefaultValueLiteral();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AATTRIBUTE__UNIQUE = eINSTANCE.getAAttribute_Unique();

		/**
		 * The meta object literal for the '{@link Academia.impl.AOperationImpl <em>AOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.AOperationImpl
		 * @see Academia.impl.AcademiaPackageImpl#getAOperation()
		 * @generated
		 */
		EClass AOPERATION = eINSTANCE.getAOperation();

		/**
		 * The meta object literal for the '<em><b>AContainer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AOPERATION__ACONTAINER = eINSTANCE.getAOperation_AContainer();

		/**
		 * The meta object literal for the '<em><b>AParameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AOPERATION__APARAMETERS = eINSTANCE.getAOperation_AParameters();

		/**
		 * The meta object literal for the '{@link Academia.impl.AParameterImpl <em>AParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.AParameterImpl
		 * @see Academia.impl.AcademiaPackageImpl#getAParameter()
		 * @generated
		 */
		EClass APARAMETER = eINSTANCE.getAParameter();

		/**
		 * The meta object literal for the '<em><b>AContainer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APARAMETER__ACONTAINER = eINSTANCE.getAParameter_AContainer();

		/**
		 * The meta object literal for the '{@link Academia.impl.MatriculaImpl <em>Matricula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.MatriculaImpl
		 * @see Academia.impl.AcademiaPackageImpl#getMatricula()
		 * @generated
		 */
		EClass MATRICULA = eINSTANCE.getMatricula();

		/**
		 * The meta object literal for the '{@link Academia.impl.AlunoImpl <em>Aluno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.AlunoImpl
		 * @see Academia.impl.AcademiaPackageImpl#getAluno()
		 * @generated
		 */
		EClass ALUNO = eINSTANCE.getAluno();

		/**
		 * The meta object literal for the '{@link Academia.impl.CursoImpl <em>Curso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.CursoImpl
		 * @see Academia.impl.AcademiaPackageImpl#getCurso()
		 * @generated
		 */
		EClass CURSO = eINSTANCE.getCurso();

		/**
		 * The meta object literal for the '{@link Academia.impl.DepartamentoImpl <em>Departamento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.DepartamentoImpl
		 * @see Academia.impl.AcademiaPackageImpl#getDepartamento()
		 * @generated
		 */
		EClass DEPARTAMENTO = eINSTANCE.getDepartamento();

		/**
		 * The meta object literal for the '{@link Academia.impl.DisciplinaImpl <em>Disciplina</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.DisciplinaImpl
		 * @see Academia.impl.AcademiaPackageImpl#getDisciplina()
		 * @generated
		 */
		EClass DISCIPLINA = eINSTANCE.getDisciplina();

		/**
		 * The meta object literal for the '{@link Academia.impl.CampusImpl <em>Campus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.CampusImpl
		 * @see Academia.impl.AcademiaPackageImpl#getCampus()
		 * @generated
		 */
		EClass CAMPUS = eINSTANCE.getCampus();

		/**
		 * The meta object literal for the '{@link Academia.impl.DisciplinaSemestreImpl <em>Disciplina Semestre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.DisciplinaSemestreImpl
		 * @see Academia.impl.AcademiaPackageImpl#getDisciplinaSemestre()
		 * @generated
		 */
		EClass DISCIPLINA_SEMESTRE = eINSTANCE.getDisciplinaSemestre();

		/**
		 * The meta object literal for the '{@link Academia.impl.DisciplinaPagaImpl <em>Disciplina Paga</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.DisciplinaPagaImpl
		 * @see Academia.impl.AcademiaPackageImpl#getDisciplinaPaga()
		 * @generated
		 */
		EClass DISCIPLINA_PAGA = eINSTANCE.getDisciplinaPaga();

		/**
		 * The meta object literal for the '{@link Academia.impl.DisciplinaGratisImpl <em>Disciplina Gratis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.impl.DisciplinaGratisImpl
		 * @see Academia.impl.AcademiaPackageImpl#getDisciplinaGratis()
		 * @generated
		 */
		EClass DISCIPLINA_GRATIS = eINSTANCE.getDisciplinaGratis();

		/**
		 * The meta object literal for the '{@link Academia.PersistenceStrategy <em>Persistence Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.PersistenceStrategy
		 * @see Academia.impl.AcademiaPackageImpl#getPersistenceStrategy()
		 * @generated
		 */
		EEnum PERSISTENCE_STRATEGY = eINSTANCE.getPersistenceStrategy();

		/**
		 * The meta object literal for the '{@link Academia.LoggingStrategy <em>Logging Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Academia.LoggingStrategy
		 * @see Academia.impl.AcademiaPackageImpl#getLoggingStrategy()
		 * @generated
		 */
		EEnum LOGGING_STRATEGY = eINSTANCE.getLoggingStrategy();

	}

} //AcademiaPackage
