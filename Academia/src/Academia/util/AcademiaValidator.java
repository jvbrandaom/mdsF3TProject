/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Academia.util;

import Academia.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see Academia.AcademiaPackage
 * @generated
 */
public class AcademiaValidator extends EObjectValidator {

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AcademiaValidator INSTANCE = new AcademiaValidator();
	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Academia";
	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;
	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcademiaValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AcademiaPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AcademiaPackage.ABOUNDED_ELEMENT:
				return validateABoundedElement((ABoundedElement)value, diagnostics, context);
			case AcademiaPackage.ADOCUMENTATED_ELEMENT:
				return validateADocumentatedElement((ADocumentatedElement)value, diagnostics, context);
			case AcademiaPackage.AMODELED_ELEMENT:
				return validateAModeledElement((AModeledElement)value, diagnostics, context);
			case AcademiaPackage.ANAMED_ELEMENT:
				return validateANamedElement((ANamedElement)value, diagnostics, context);
			case AcademiaPackage.ATYPED_ELEMENT:
				return validateATypedElement((ATypedElement)value, diagnostics, context);
			case AcademiaPackage.APACKAGE:
				return validateAPackage((APackage)value, diagnostics, context);
			case AcademiaPackage.ACLASSIFIER:
				return validateAClassifier((AClassifier)value, diagnostics, context);
			case AcademiaPackage.AAPPLICATION:
				return validateAApplication((AApplication)value, diagnostics, context);
			case AcademiaPackage.AFEATURE:
				return validateAFeature((AFeature)value, diagnostics, context);
			case AcademiaPackage.AOBJECT:
				return validateAObject((AObject)value, diagnostics, context);
			case AcademiaPackage.AVARIATION:
				return validateAVariation((AVariation)value, diagnostics, context);
			case AcademiaPackage.AATTRIBUTE:
				return validateAAttribute((AAttribute)value, diagnostics, context);
			case AcademiaPackage.AOPERATION:
				return validateAOperation((AOperation)value, diagnostics, context);
			case AcademiaPackage.APARAMETER:
				return validateAParameter((AParameter)value, diagnostics, context);
			case AcademiaPackage.MATRICULA:
				return validateMatricula((Matricula)value, diagnostics, context);
			case AcademiaPackage.ALUNO:
				return validateAluno((Aluno)value, diagnostics, context);
			case AcademiaPackage.CURSO:
				return validateCurso((Curso)value, diagnostics, context);
			case AcademiaPackage.DEPARTAMENTO:
				return validateDepartamento((Departamento)value, diagnostics, context);
			case AcademiaPackage.DISCIPLINA:
				return validateDisciplina((Disciplina)value, diagnostics, context);
			case AcademiaPackage.CAMPUS:
				return validateCampus((Campus)value, diagnostics, context);
			case AcademiaPackage.DISCIPLINA_SEMESTRE:
				return validateDisciplinaSemestre((DisciplinaSemestre)value, diagnostics, context);
			case AcademiaPackage.DISCIPLINA_PAGA:
				return validateDisciplinaPaga((DisciplinaPaga)value, diagnostics, context);
			case AcademiaPackage.DISCIPLINA_GRATIS:
				return validateDisciplinaGratis((DisciplinaGratis)value, diagnostics, context);
			case AcademiaPackage.PERSISTENCE_STRATEGY:
				return validatePersistenceStrategy((PersistenceStrategy)value, diagnostics, context);
			case AcademiaPackage.LOGGING_STRATEGY:
				return validateLoggingStrategy((LoggingStrategy)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateABoundedElement(ABoundedElement aBoundedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aBoundedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aBoundedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aBoundedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aBoundedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aBoundedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aBoundedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aBoundedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aBoundedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aBoundedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateABoundedElement_LowerBoundInvalidValue(aBoundedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateABoundedElement_UpperBoundInvalidValue(aBoundedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the LowerBoundInvalidValue constraint of '
	 * <em>ABounded Element</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateABoundedElement_LowerBoundInvalidValue(
			ABoundedElement aBoundedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (aBoundedElement.getLowerBound() == null
				|| !(aBoundedElement.getLowerBound().equals("0") || aBoundedElement
						.getLowerBound().equals("1"))) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "LowerBoundInvalidValue",
								getObjectLabel(aBoundedElement, context) },
						new Object[] { aBoundedElement }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UpperBoundInvalidValue constraint of '
	 * <em>ABounded Element</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateABoundedElement_UpperBoundInvalidValue(
			ABoundedElement aBoundedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (aBoundedElement.getUpperBound() == null
				|| !(aBoundedElement.getUpperBound().equals("1") || aBoundedElement
						.getUpperBound().equals("*"))) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "UpperBoundInvalidValue",
								getObjectLabel(aBoundedElement, context) },
						new Object[] { aBoundedElement }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateADocumentatedElement(ADocumentatedElement aDocumentatedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aDocumentatedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAModeledElement(AModeledElement aModeledElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aModeledElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateANamedElement(ANamedElement aNamedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aNamedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_InvalidName(aNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_MissingName(aNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_UniqueName(aNamedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InvalidName constraint of '<em>ANamed Element</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateANamedElement_InvalidName(
			ANamedElement aNamedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!aNamedElement.getName().matches("([a-zA-z&&[^_]])([\\w])*")) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(
						Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "InvalidName",
								getObjectLabel(aNamedElement, context) },
						new Object[] { aNamedElement }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the MissingName constraint of '<em>ANamed Element</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateANamedElement_MissingName(
			ANamedElement aNamedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (aNamedElement.getName() == null
				|| aNamedElement.getName().trim().equals("")) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(
						Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "MissingName",
								getObjectLabel(aNamedElement, context) },
						new Object[] { aNamedElement }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the UniqueName constraint of '<em>ANamed Element</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateANamedElement_UniqueName(
			ANamedElement aNamedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (aNamedElement instanceof APackage
				|| aNamedElement instanceof AOperation) {
			return true; // this constraint is not applicable to APackage and
							// AOperation
		}
		boolean uniqueName = true;
		for (EObject element : aNamedElement.eContainer().eContents()) {
			if (aNamedElement != element
					&& aNamedElement.getClass().equals(element.getClass())
					&& aNamedElement.getName().equalsIgnoreCase(
							((ANamedElement) element).getName())) {
				uniqueName = false;
				break;
			}
		}
		if (!uniqueName) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(
						Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "UniqueName",
								getObjectLabel(aNamedElement, context) },
						new Object[] { aNamedElement }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateATypedElement(ATypedElement aTypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aTypedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPackage(APackage aPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aPackage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateAPackage_UniqueApplication(aPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateAPackage_MissingApplication(aPackage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueApplication constraint of '<em>APackage</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateAPackage_UniqueApplication(APackage aPackage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		int nroApplications = 0;
		for (AClassifier aClassifier : aPackage.getAClassifiers()) {
			if (aClassifier instanceof AApplication) {
				nroApplications++;
			}
		}
		if (nroApplications > 1) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(
						Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "UniqueApplication",
								getObjectLabel(aPackage, context) },
						new Object[] { aPackage }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the MissingApplication constraint of '<em>APackage</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateAPackage_MissingApplication(APackage aPackage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean hasApplication = false;
		for (AClassifier aClassifier : aPackage.getAClassifiers()) {
			if (aClassifier instanceof AApplication) {
				hasApplication = true;
				break;
			}
		}
		if (!hasApplication) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(
						Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "MissingApplication",
								getObjectLabel(aPackage, context) },
						new Object[] { aPackage }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAClassifier(AClassifier aClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aClassifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAApplication(AApplication aApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aApplication, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_InvalidName(aApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_MissingName(aApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_UniqueName(aApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateAApplication_RootFeaturesOnly(aApplication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the RootFeaturesOnly constraint of '<em>AApplication</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateAApplication_RootFeaturesOnly(
			AApplication aApplication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean hasNonRootFeat = false;
		for (AFeature aFeature : aApplication.getAChilds()) {
			if (!(aFeature instanceof Matricula)) {
				hasNonRootFeat = true;
				break;
			}
		}
		if (hasNonRootFeat) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(
						Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "RootFeaturesOnly",
								getObjectLabel(aApplication, context) },
						new Object[] { aApplication }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAFeature(AFeature aFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAObject(AObject aObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aObject, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_InvalidName(aObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_MissingName(aObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_UniqueName(aObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAVariation(AVariation aVariation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aVariation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAAttribute(AAttribute aAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_InvalidName(aAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_MissingName(aAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_UniqueName(aAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateABoundedElement_LowerBoundInvalidValue(aAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateABoundedElement_UpperBoundInvalidValue(aAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAOperation(AOperation aOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_InvalidName(aOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_MissingName(aOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_UniqueName(aOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateABoundedElement_LowerBoundInvalidValue(aOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateABoundedElement_UpperBoundInvalidValue(aOperation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAParameter(AParameter aParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_InvalidName(aParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_MissingName(aParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_UniqueName(aParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateABoundedElement_LowerBoundInvalidValue(aParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateABoundedElement_UpperBoundInvalidValue(aParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatricula(Matricula matricula, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(matricula, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(matricula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(matricula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(matricula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(matricula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(matricula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(matricula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(matricula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(matricula, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_InvalidName(matricula, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_MissingName(matricula, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_UniqueName(matricula, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatricula_InvalidAssociation(matricula, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatricula_AssociationDisciplinaSemestre(matricula, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatricula_AssociationAluno(matricula, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InvalidAssociation constraint of '<em>Matricula</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateMatricula_InvalidAssociation(Matricula matricula,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		String invalidAssociation = null;

		if (matricula.getAChilds() != null) {

			List<String> validAssociations = new ArrayList<String>();
			validAssociations.add("Academia.impl.DisciplinaSemestreImpl");
			validAssociations.add("Academia.impl.AlunoImpl");

			try {
				for (AFeature aChild : matricula.getAChilds()) {
					boolean isValid = false;
					for (String validAssociationClassName : validAssociations) {
						Class<?> validAssociationClass = Class
								.forName(validAssociationClassName);
						Class<?> currentAssociationClass = Class.forName(aChild
								.getClass().getName());
						if (validAssociationClass
								.isAssignableFrom(currentAssociationClass)) {
							isValid = true;
							break;
						}
					}
					if (!isValid) {
						invalidAssociation = aChild.eClass().getName();
						break;
					}
				}
			} catch (ClassNotFoundException e) {
				invalidAssociation = " the class not found " + e.getMessage();
			}
		}
		if (invalidAssociation != null) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] {
								"InvalidAssociation",
								"the association between Matricula and "
										+ invalidAssociation },
						new Object[] { matricula }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AssociationDisciplina constraint of '<em>Matricula</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateMatricula_AssociationDisciplinaSemestre(
			Matricula matricula, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean noAssociation = false;
		boolean hasValidChild = false;
		if (matricula.getAChilds() == null
				|| matricula.getAChilds().size() == 0) {
			noAssociation = true;
		} else {
			for (AFeature aChild : matricula.getAChilds()) {
				if (aChild instanceof DisciplinaSemestre) {
					hasValidChild = true;
					break;
				}
			}
		}
		if (noAssociation || !hasValidChild) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(
						Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "AssociationDisciplina",
								getObjectLabel(matricula, context) },
						new Object[] { matricula }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AssociationAluno constraint of '<em>Matricula</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateMatricula_AssociationAluno(Matricula matricula,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean noAssociation = false;
		boolean hasValidChild = false;
		if (matricula.getAChilds() == null
				|| matricula.getAChilds().size() == 0) {
			noAssociation = true;
		} else {
			for (AFeature aChild : matricula.getAChilds()) {
				if (aChild instanceof Aluno) {
					hasValidChild = true;
					break;
				}
			}
		}
		if (noAssociation || !hasValidChild) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(
						Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "AssociationAluno",
								getObjectLabel(matricula, context) },
						new Object[] { matricula }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAluno(Aluno aluno, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aluno, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aluno, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aluno, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aluno, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aluno, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aluno, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aluno, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aluno, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aluno, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_InvalidName(aluno, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_MissingName(aluno, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_UniqueName(aluno, diagnostics, context);
		if (result || diagnostics != null) result &= validateAluno_InvalidAssociation(aluno, diagnostics, context);
		if (result || diagnostics != null) result &= validateAluno_AssociationCurso(aluno, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InvalidAssociation constraint of '<em>Aluno</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateAluno_InvalidAssociation(Aluno aluno,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		String invalidAssociation = null;

		if (aluno.getAChilds() != null) {

			List<String> validAssociations = new ArrayList<String>();
			validAssociations.add("Academia.impl.CursoImpl");

			try {
				for (AFeature aChild : aluno.getAChilds()) {
					boolean isValid = false;
					for (String validAssociationClassName : validAssociations) {
						Class<?> validAssociationClass = Class
								.forName(validAssociationClassName);
						Class<?> currentAssociationClass = Class.forName(aChild
								.getClass().getName());
						if (validAssociationClass
								.isAssignableFrom(currentAssociationClass)) {
							isValid = true;
							break;
						}
					}
					if (!isValid) {
						invalidAssociation = aChild.eClass().getName();
						break;
					}
				}
			} catch (ClassNotFoundException e) {
				invalidAssociation = " the class not found " + e.getMessage();
			}
		}
		if (invalidAssociation != null) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] {
								"InvalidAssociation",
								"the association between Aluno and "
										+ invalidAssociation },
						new Object[] { aluno }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AssociationCurso constraint of '<em>Aluno</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateAluno_AssociationCurso(Aluno aluno,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean noAssociation = false;
		boolean hasValidChild = false;
		if (aluno.getAChilds() == null || aluno.getAChilds().size() == 0) {
			noAssociation = true;
		} else {
			for (AFeature aChild : aluno.getAChilds()) {
				if (aChild instanceof Curso) {
					hasValidChild = true;
					break;
				}
			}
		}
		if (noAssociation || !hasValidChild) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(
						Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "AssociationCurso",
								getObjectLabel(aluno, context) },
						new Object[] { aluno }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurso(Curso curso, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(curso, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(curso, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(curso, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(curso, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(curso, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(curso, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(curso, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(curso, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(curso, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_InvalidName(curso, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_MissingName(curso, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_UniqueName(curso, diagnostics, context);
		if (result || diagnostics != null) result &= validateCurso_InvalidAssociation(curso, diagnostics, context);
		if (result || diagnostics != null) result &= validateCurso_AssociationDisciplina(curso, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InvalidAssociation constraint of '<em>Curso</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateCurso_InvalidAssociation(Curso curso,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		String invalidAssociation = null;

		if (curso.getAChilds() != null) {

			List<String> validAssociations = new ArrayList<String>();
			validAssociations.add("Academia.impl.DisciplinaImpl");
			validAssociations.add("Academia.impl.DepartamentoImpl");

			try {
				for (AFeature aChild : curso.getAChilds()) {
					boolean isValid = false;
					for (String validAssociationClassName : validAssociations) {
						Class<?> validAssociationClass = Class
								.forName(validAssociationClassName);
						Class<?> currentAssociationClass = Class.forName(aChild
								.getClass().getName());
						if (validAssociationClass
								.isAssignableFrom(currentAssociationClass)) {
							isValid = true;
							break;
						}
					}
					if (!isValid) {
						invalidAssociation = aChild.eClass().getName();
						break;
					}
				}
			} catch (ClassNotFoundException e) {
				invalidAssociation = " the class not found " + e.getMessage();
			}
		}
		if (invalidAssociation != null) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] {
								"InvalidAssociation",
								"the association between Curso and "
										+ invalidAssociation },
						new Object[] { curso }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AssociationGrade constraint of '<em>Curso</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateCurso_AssociationDisciplina(Curso curso,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean noAssociation = false;
		boolean hasValidChild = false;
		if (curso.getAChilds() == null || curso.getAChilds().size() == 0) {
			noAssociation = true;
		} else {
			for (AFeature aChild : curso.getAChilds()) {
				if (aChild instanceof Disciplina) {
					hasValidChild = true;
					break;
				}
			}
		}
		if (noAssociation || !hasValidChild) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(
						Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE,
						0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "AssociationGrade",
								getObjectLabel(curso, context) },
						new Object[] { curso }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartamento(Departamento departamento, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(departamento, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(departamento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(departamento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(departamento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(departamento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(departamento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(departamento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(departamento, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(departamento, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_InvalidName(departamento, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_MissingName(departamento, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_UniqueName(departamento, diagnostics, context);
		if (result || diagnostics != null) result &= validateDepartamento_InvalidAssociation(departamento, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InvalidAssociation constraint of '<em>Departamento</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateDepartamento_InvalidAssociation(
			Departamento departamento, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		String invalidAssociation = null;

		if (departamento.getAChilds() != null) {

			List<String> validAssociations = new ArrayList<String>();
			validAssociations.add("Academia.impl.CampusImpl");

			try {
				for (AFeature aChild : departamento.getAChilds()) {
					boolean isValid = false;
					for (String validAssociationClassName : validAssociations) {
						Class<?> validAssociationClass = Class
								.forName(validAssociationClassName);
						Class<?> currentAssociationClass = Class.forName(aChild
								.getClass().getName());
						if (validAssociationClass
								.isAssignableFrom(currentAssociationClass)) {
							isValid = true;
							break;
						}
					}
					if (!isValid) {
						invalidAssociation = aChild.eClass().getName();
						break;
					}
				}
			} catch (ClassNotFoundException e) {
				invalidAssociation = " the class not found " + e.getMessage();
			}
		}
		if (invalidAssociation != null) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] {
								"InvalidAssociation",
								"the association between Departamento and "
										+ invalidAssociation },
						new Object[] { departamento }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisciplina(Disciplina disciplina, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(disciplina, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(disciplina, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(disciplina, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(disciplina, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(disciplina, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(disciplina, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(disciplina, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(disciplina, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(disciplina, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_InvalidName(disciplina, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_MissingName(disciplina, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_UniqueName(disciplina, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisciplina_AssociationDisciplinaSemestre(disciplina, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisciplina_AssociationDepartamento(disciplina, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AssociationDisciplinasSemestre constraint of '
	 * <em>Disciplina</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateDisciplina_AssociationDisciplinaSemestre(
			Disciplina disciplina, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean noAssociation = false;
		boolean hasValidChild = false;
		if (disciplina.getAChilds() == null
				|| disciplina.getAChilds().size() == 0) {
			noAssociation = true;
		} else {
			for (AFeature aChild : disciplina.getAChilds()) {
				if (aChild instanceof DisciplinaSemestre) {
					hasValidChild = true;
					break;
				}
			}
		}
		if (noAssociation || !hasValidChild) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] {
								"AssociationDisciplinasSemestre",
								getObjectLabel(disciplina, context) },
						new Object[] { disciplina }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AssociationDepartamento constraint of '<em>Disciplina</em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateDisciplina_AssociationDepartamento(
			Disciplina disciplina, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean noAssociation = false;
		boolean hasValidChild = false;
		if (disciplina.getAChilds() == null
				|| disciplina.getAChilds().size() == 0) {
			noAssociation = true;
		} else {
			for (AFeature aChild : disciplina.getAChilds()) {
				if (aChild instanceof Departamento) {
					hasValidChild = true;
					break;
				}
			}
		}
		if (noAssociation || !hasValidChild) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "AssociationDepartamento",
								getObjectLabel(disciplina, context) },
						new Object[] { disciplina }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCampus(Campus campus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(campus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(campus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(campus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(campus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(campus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(campus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(campus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(campus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(campus, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_InvalidName(campus, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_MissingName(campus, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_UniqueName(campus, diagnostics, context);
		if (result || diagnostics != null) result &= validateCampus_InvalidAssociation(campus, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InvalidAssociation constraint of '<em>Campus</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateCampus_InvalidAssociation(Campus campus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		String invalidAssociation = null;

		if (campus.getAChilds() != null) {

			List<String> validAssociations = new ArrayList<String>();

			try {
				for (AFeature aChild : campus.getAChilds()) {
					boolean isValid = false;
					for (String validAssociationClassName : validAssociations) {
						Class<?> validAssociationClass = Class
								.forName(validAssociationClassName);
						Class<?> currentAssociationClass = Class.forName(aChild
								.getClass().getName());
						if (validAssociationClass
								.isAssignableFrom(currentAssociationClass)) {
							isValid = true;
							break;
						}
					}
					if (!isValid) {
						invalidAssociation = aChild.eClass().getName();
						break;
					}
				}
			} catch (ClassNotFoundException e) {
				invalidAssociation = " the class not found " + e.getMessage();
			}
		}
		if (invalidAssociation != null) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] {
								"InvalidAssociation",
								"the association between Campus and "
										+ invalidAssociation },
						new Object[] { campus }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisciplinaSemestre(DisciplinaSemestre disciplinaSemestre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(disciplinaSemestre, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(disciplinaSemestre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(disciplinaSemestre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(disciplinaSemestre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(disciplinaSemestre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(disciplinaSemestre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(disciplinaSemestre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(disciplinaSemestre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(disciplinaSemestre, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_InvalidName(disciplinaSemestre, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_MissingName(disciplinaSemestre, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_UniqueName(disciplinaSemestre, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisciplinaSemestre_InvalidAssociation(disciplinaSemestre, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InvalidAssociation constraint of '
	 * <em>DisciplinaSemestre</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated NOT
	 */
	public boolean validateDisciplinaSemestre_InvalidAssociation(
			DisciplinaSemestre disciplinaSemestre, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		String invalidAssociation = null;

		if (disciplinaSemestre.getAChilds() != null) {

			List<String> validAssociations = new ArrayList<String>();

			try {
				for (AFeature aChild : disciplinaSemestre.getAChilds()) {
					boolean isValid = false;
					for (String validAssociationClassName : validAssociations) {
						Class<?> validAssociationClass = Class
								.forName(validAssociationClassName);
						Class<?> currentAssociationClass = Class.forName(aChild
								.getClass().getName());
						if (validAssociationClass
								.isAssignableFrom(currentAssociationClass)) {
							isValid = true;
							break;
						}
					}
					if (!isValid) {
						invalidAssociation = aChild.eClass().getName();
						break;
					}
				}
			} catch (ClassNotFoundException e) {
				invalidAssociation = " the class not found " + e.getMessage();
			}
		}
		if (invalidAssociation != null) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] {
								"InvalidAssociation",
								"the association between DisciplinaSemestre and "
										+ invalidAssociation },
						new Object[] { disciplinaSemestre }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisciplinaPaga(DisciplinaPaga disciplinaPaga, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(disciplinaPaga, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(disciplinaPaga, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(disciplinaPaga, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(disciplinaPaga, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(disciplinaPaga, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(disciplinaPaga, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(disciplinaPaga, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(disciplinaPaga, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(disciplinaPaga, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_InvalidName(disciplinaPaga, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_MissingName(disciplinaPaga, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_UniqueName(disciplinaPaga, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisciplina_AssociationDisciplinaSemestre(disciplinaPaga, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisciplina_AssociationDepartamento(disciplinaPaga, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisciplinaPaga_InvalidAssociation(disciplinaPaga, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InvalidAssociation constraint of '<em>DisciplinaPaga</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateDisciplinaPaga_InvalidAssociation(
			DisciplinaPaga disciplinaPaga, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		String invalidAssociation = null;

		if (disciplinaPaga.getAChilds() != null) {

			List<String> validAssociations = new ArrayList<String>();
			validAssociations.add("Academia.impl.DisciplinaSemestreImpl");
			validAssociations.add("Academia.impl.DepartamentoImpl");

			try {
				for (AFeature aChild : disciplinaPaga.getAChilds()) {
					boolean isValid = false;
					for (String validAssociationClassName : validAssociations) {
						Class<?> validAssociationClass = Class
								.forName(validAssociationClassName);
						Class<?> currentAssociationClass = Class.forName(aChild
								.getClass().getName());
						if (validAssociationClass
								.isAssignableFrom(currentAssociationClass)) {
							isValid = true;
							break;
						}
					}
					if (!isValid) {
						invalidAssociation = aChild.eClass().getName();
						break;
					}
				}
			} catch (ClassNotFoundException e) {
				invalidAssociation = " the class not found " + e.getMessage();
			}
		}
		if (invalidAssociation != null) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] {
								"InvalidAssociation",
								"the association between DisciplinaPaga and "
										+ invalidAssociation },
						new Object[] { disciplinaPaga }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisciplinaGratis(DisciplinaGratis disciplinaGratis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(disciplinaGratis, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(disciplinaGratis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(disciplinaGratis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(disciplinaGratis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(disciplinaGratis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(disciplinaGratis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(disciplinaGratis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(disciplinaGratis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(disciplinaGratis, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_InvalidName(disciplinaGratis, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_MissingName(disciplinaGratis, diagnostics, context);
		if (result || diagnostics != null) result &= validateANamedElement_UniqueName(disciplinaGratis, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisciplina_AssociationDisciplinaSemestre(disciplinaGratis, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisciplina_AssociationDepartamento(disciplinaGratis, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisciplinaGratis_InvalidAssociation(disciplinaGratis, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InvalidAssociation constraint of '<em>DisciplinaGratis</em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateDisciplinaGratis_InvalidAssociation(
			DisciplinaGratis disciplinaGratis, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		String invalidAssociation = null;

		if (disciplinaGratis.getAChilds() != null) {

			List<String> validAssociations = new ArrayList<String>();
			validAssociations.add("Academia.impl.DisciplinaSemestreImpl");
			validAssociations.add("Academia.impl.DepartamentoImpl");

			try {
				for (AFeature aChild : disciplinaGratis.getAChilds()) {
					boolean isValid = false;
					for (String validAssociationClassName : validAssociations) {
						Class<?> validAssociationClass = Class
								.forName(validAssociationClassName);
						Class<?> currentAssociationClass = Class.forName(aChild
								.getClass().getName());
						if (validAssociationClass
								.isAssignableFrom(currentAssociationClass)) {
							isValid = true;
							break;
						}
					}
					if (!isValid) {
						invalidAssociation = aChild.eClass().getName();
						break;
					}
				}
			} catch (ClassNotFoundException e) {
				invalidAssociation = " the class not found " + e.getMessage();
			}
		}
		if (invalidAssociation != null) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR,
						DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] {
								"InvalidAssociation",
								"the association between DisciplinaGratis and "
										+ invalidAssociation },
						new Object[] { disciplinaGratis }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceStrategy(PersistenceStrategy persistenceStrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoggingStrategy(LoggingStrategy loggingStrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // AcademiaValidator
