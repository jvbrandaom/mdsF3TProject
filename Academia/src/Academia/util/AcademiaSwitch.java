/**
 */
package Academia.util;

import Academia.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Academia.AcademiaPackage
 * @generated
 */
public class AcademiaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AcademiaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcademiaSwitch() {
		if (modelPackage == null) {
			modelPackage = AcademiaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AcademiaPackage.ABOUNDED_ELEMENT: {
				ABoundedElement aBoundedElement = (ABoundedElement)theEObject;
				T result = caseABoundedElement(aBoundedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.ADOCUMENTATED_ELEMENT: {
				ADocumentatedElement aDocumentatedElement = (ADocumentatedElement)theEObject;
				T result = caseADocumentatedElement(aDocumentatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.AMODELED_ELEMENT: {
				AModeledElement aModeledElement = (AModeledElement)theEObject;
				T result = caseAModeledElement(aModeledElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.ANAMED_ELEMENT: {
				ANamedElement aNamedElement = (ANamedElement)theEObject;
				T result = caseANamedElement(aNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.ATYPED_ELEMENT: {
				ATypedElement aTypedElement = (ATypedElement)theEObject;
				T result = caseATypedElement(aTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.APACKAGE: {
				APackage aPackage = (APackage)theEObject;
				T result = caseAPackage(aPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.ACLASSIFIER: {
				AClassifier aClassifier = (AClassifier)theEObject;
				T result = caseAClassifier(aClassifier);
				if (result == null) result = caseAModeledElement(aClassifier);
				if (result == null) result = caseADocumentatedElement(aClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.AAPPLICATION: {
				AApplication aApplication = (AApplication)theEObject;
				T result = caseAApplication(aApplication);
				if (result == null) result = caseAClassifier(aApplication);
				if (result == null) result = caseANamedElement(aApplication);
				if (result == null) result = caseAModeledElement(aApplication);
				if (result == null) result = caseADocumentatedElement(aApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.AFEATURE: {
				AFeature aFeature = (AFeature)theEObject;
				T result = caseAFeature(aFeature);
				if (result == null) result = caseAClassifier(aFeature);
				if (result == null) result = caseAModeledElement(aFeature);
				if (result == null) result = caseADocumentatedElement(aFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.AOBJECT: {
				AObject aObject = (AObject)theEObject;
				T result = caseAObject(aObject);
				if (result == null) result = caseAFeature(aObject);
				if (result == null) result = caseANamedElement(aObject);
				if (result == null) result = caseAClassifier(aObject);
				if (result == null) result = caseAModeledElement(aObject);
				if (result == null) result = caseADocumentatedElement(aObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.AVARIATION: {
				AVariation aVariation = (AVariation)theEObject;
				T result = caseAVariation(aVariation);
				if (result == null) result = caseAFeature(aVariation);
				if (result == null) result = caseAClassifier(aVariation);
				if (result == null) result = caseAModeledElement(aVariation);
				if (result == null) result = caseADocumentatedElement(aVariation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.AATTRIBUTE: {
				AAttribute aAttribute = (AAttribute)theEObject;
				T result = caseAAttribute(aAttribute);
				if (result == null) result = caseANamedElement(aAttribute);
				if (result == null) result = caseATypedElement(aAttribute);
				if (result == null) result = caseABoundedElement(aAttribute);
				if (result == null) result = caseAModeledElement(aAttribute);
				if (result == null) result = caseADocumentatedElement(aAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.AOPERATION: {
				AOperation aOperation = (AOperation)theEObject;
				T result = caseAOperation(aOperation);
				if (result == null) result = caseANamedElement(aOperation);
				if (result == null) result = caseATypedElement(aOperation);
				if (result == null) result = caseABoundedElement(aOperation);
				if (result == null) result = caseAModeledElement(aOperation);
				if (result == null) result = caseADocumentatedElement(aOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.APARAMETER: {
				AParameter aParameter = (AParameter)theEObject;
				T result = caseAParameter(aParameter);
				if (result == null) result = caseANamedElement(aParameter);
				if (result == null) result = caseATypedElement(aParameter);
				if (result == null) result = caseABoundedElement(aParameter);
				if (result == null) result = caseAModeledElement(aParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.MATRICULA: {
				Matricula matricula = (Matricula)theEObject;
				T result = caseMatricula(matricula);
				if (result == null) result = caseAObject(matricula);
				if (result == null) result = caseAFeature(matricula);
				if (result == null) result = caseANamedElement(matricula);
				if (result == null) result = caseAClassifier(matricula);
				if (result == null) result = caseAModeledElement(matricula);
				if (result == null) result = caseADocumentatedElement(matricula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.ALUNO: {
				Aluno aluno = (Aluno)theEObject;
				T result = caseAluno(aluno);
				if (result == null) result = caseAObject(aluno);
				if (result == null) result = caseAFeature(aluno);
				if (result == null) result = caseANamedElement(aluno);
				if (result == null) result = caseAClassifier(aluno);
				if (result == null) result = caseAModeledElement(aluno);
				if (result == null) result = caseADocumentatedElement(aluno);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.CURSO: {
				Curso curso = (Curso)theEObject;
				T result = caseCurso(curso);
				if (result == null) result = caseAObject(curso);
				if (result == null) result = caseAFeature(curso);
				if (result == null) result = caseANamedElement(curso);
				if (result == null) result = caseAClassifier(curso);
				if (result == null) result = caseAModeledElement(curso);
				if (result == null) result = caseADocumentatedElement(curso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.DEPARTAMENTO: {
				Departamento departamento = (Departamento)theEObject;
				T result = caseDepartamento(departamento);
				if (result == null) result = caseAObject(departamento);
				if (result == null) result = caseAFeature(departamento);
				if (result == null) result = caseANamedElement(departamento);
				if (result == null) result = caseAClassifier(departamento);
				if (result == null) result = caseAModeledElement(departamento);
				if (result == null) result = caseADocumentatedElement(departamento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.DISCIPLINA: {
				Disciplina disciplina = (Disciplina)theEObject;
				T result = caseDisciplina(disciplina);
				if (result == null) result = caseAObject(disciplina);
				if (result == null) result = caseAFeature(disciplina);
				if (result == null) result = caseANamedElement(disciplina);
				if (result == null) result = caseAClassifier(disciplina);
				if (result == null) result = caseAModeledElement(disciplina);
				if (result == null) result = caseADocumentatedElement(disciplina);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.CAMPUS: {
				Campus campus = (Campus)theEObject;
				T result = caseCampus(campus);
				if (result == null) result = caseAObject(campus);
				if (result == null) result = caseAFeature(campus);
				if (result == null) result = caseANamedElement(campus);
				if (result == null) result = caseAClassifier(campus);
				if (result == null) result = caseAModeledElement(campus);
				if (result == null) result = caseADocumentatedElement(campus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.DISCIPLINA_SEMESTRE: {
				DisciplinaSemestre disciplinaSemestre = (DisciplinaSemestre)theEObject;
				T result = caseDisciplinaSemestre(disciplinaSemestre);
				if (result == null) result = caseAObject(disciplinaSemestre);
				if (result == null) result = caseAFeature(disciplinaSemestre);
				if (result == null) result = caseANamedElement(disciplinaSemestre);
				if (result == null) result = caseAClassifier(disciplinaSemestre);
				if (result == null) result = caseAModeledElement(disciplinaSemestre);
				if (result == null) result = caseADocumentatedElement(disciplinaSemestre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.DISCIPLINA_PAGA: {
				DisciplinaPaga disciplinaPaga = (DisciplinaPaga)theEObject;
				T result = caseDisciplinaPaga(disciplinaPaga);
				if (result == null) result = caseDisciplina(disciplinaPaga);
				if (result == null) result = caseAObject(disciplinaPaga);
				if (result == null) result = caseAFeature(disciplinaPaga);
				if (result == null) result = caseANamedElement(disciplinaPaga);
				if (result == null) result = caseAClassifier(disciplinaPaga);
				if (result == null) result = caseAModeledElement(disciplinaPaga);
				if (result == null) result = caseADocumentatedElement(disciplinaPaga);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AcademiaPackage.DISCIPLINA_GRATIS: {
				DisciplinaGratis disciplinaGratis = (DisciplinaGratis)theEObject;
				T result = caseDisciplinaGratis(disciplinaGratis);
				if (result == null) result = caseDisciplina(disciplinaGratis);
				if (result == null) result = caseAObject(disciplinaGratis);
				if (result == null) result = caseAFeature(disciplinaGratis);
				if (result == null) result = caseANamedElement(disciplinaGratis);
				if (result == null) result = caseAClassifier(disciplinaGratis);
				if (result == null) result = caseAModeledElement(disciplinaGratis);
				if (result == null) result = caseADocumentatedElement(disciplinaGratis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ABounded Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ABounded Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseABoundedElement(ABoundedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADocumentated Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADocumentated Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADocumentatedElement(ADocumentatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AModeled Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AModeled Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAModeledElement(AModeledElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANamedElement(ANamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATyped Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATypedElement(ATypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPackage(APackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AClassifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAClassifier(AClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AApplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AApplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAApplication(AApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AFeature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AFeature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAFeature(AFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAObject(AObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AVariation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AVariation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAVariation(AVariation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAAttribute(AAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AOperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AOperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAOperation(AOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAParameter(AParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matricula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matricula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatricula(Matricula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aluno</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aluno</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAluno(Aluno object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurso(Curso object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Departamento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Departamento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepartamento(Departamento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disciplina</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disciplina</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisciplina(Disciplina object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Campus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Campus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCampus(Campus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disciplina Semestre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disciplina Semestre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisciplinaSemestre(DisciplinaSemestre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disciplina Paga</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disciplina Paga</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisciplinaPaga(DisciplinaPaga object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disciplina Gratis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disciplina Gratis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisciplinaGratis(DisciplinaGratis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AcademiaSwitch
