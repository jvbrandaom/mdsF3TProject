/**
 */
package Academia.util;

import Academia.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Academia.AcademiaPackage
 * @generated
 */
public class AcademiaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AcademiaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcademiaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AcademiaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcademiaSwitch<Adapter> modelSwitch =
		new AcademiaSwitch<Adapter>() {
			@Override
			public Adapter caseABoundedElement(ABoundedElement object) {
				return createABoundedElementAdapter();
			}
			@Override
			public Adapter caseADocumentatedElement(ADocumentatedElement object) {
				return createADocumentatedElementAdapter();
			}
			@Override
			public Adapter caseAModeledElement(AModeledElement object) {
				return createAModeledElementAdapter();
			}
			@Override
			public Adapter caseANamedElement(ANamedElement object) {
				return createANamedElementAdapter();
			}
			@Override
			public Adapter caseATypedElement(ATypedElement object) {
				return createATypedElementAdapter();
			}
			@Override
			public Adapter caseAPackage(APackage object) {
				return createAPackageAdapter();
			}
			@Override
			public Adapter caseAClassifier(AClassifier object) {
				return createAClassifierAdapter();
			}
			@Override
			public Adapter caseAApplication(AApplication object) {
				return createAApplicationAdapter();
			}
			@Override
			public Adapter caseAFeature(AFeature object) {
				return createAFeatureAdapter();
			}
			@Override
			public Adapter caseAObject(AObject object) {
				return createAObjectAdapter();
			}
			@Override
			public Adapter caseAVariation(AVariation object) {
				return createAVariationAdapter();
			}
			@Override
			public Adapter caseAAttribute(AAttribute object) {
				return createAAttributeAdapter();
			}
			@Override
			public Adapter caseAOperation(AOperation object) {
				return createAOperationAdapter();
			}
			@Override
			public Adapter caseAParameter(AParameter object) {
				return createAParameterAdapter();
			}
			@Override
			public Adapter caseMatricula(Matricula object) {
				return createMatriculaAdapter();
			}
			@Override
			public Adapter caseAluno(Aluno object) {
				return createAlunoAdapter();
			}
			@Override
			public Adapter caseCurso(Curso object) {
				return createCursoAdapter();
			}
			@Override
			public Adapter caseDepartamento(Departamento object) {
				return createDepartamentoAdapter();
			}
			@Override
			public Adapter caseDisciplina(Disciplina object) {
				return createDisciplinaAdapter();
			}
			@Override
			public Adapter caseCampus(Campus object) {
				return createCampusAdapter();
			}
			@Override
			public Adapter caseDisciplinaSemestre(DisciplinaSemestre object) {
				return createDisciplinaSemestreAdapter();
			}
			@Override
			public Adapter caseDisciplinaPaga(DisciplinaPaga object) {
				return createDisciplinaPagaAdapter();
			}
			@Override
			public Adapter caseDisciplinaGratis(DisciplinaGratis object) {
				return createDisciplinaGratisAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Academia.ABoundedElement <em>ABounded Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.ABoundedElement
	 * @generated
	 */
	public Adapter createABoundedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.ADocumentatedElement <em>ADocumentated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.ADocumentatedElement
	 * @generated
	 */
	public Adapter createADocumentatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.AModeledElement <em>AModeled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.AModeledElement
	 * @generated
	 */
	public Adapter createAModeledElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.ANamedElement <em>ANamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.ANamedElement
	 * @generated
	 */
	public Adapter createANamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.ATypedElement <em>ATyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.ATypedElement
	 * @generated
	 */
	public Adapter createATypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.APackage <em>APackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.APackage
	 * @generated
	 */
	public Adapter createAPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.AClassifier <em>AClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.AClassifier
	 * @generated
	 */
	public Adapter createAClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.AApplication <em>AApplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.AApplication
	 * @generated
	 */
	public Adapter createAApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.AFeature <em>AFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.AFeature
	 * @generated
	 */
	public Adapter createAFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.AObject <em>AObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.AObject
	 * @generated
	 */
	public Adapter createAObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.AVariation <em>AVariation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.AVariation
	 * @generated
	 */
	public Adapter createAVariationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.AAttribute <em>AAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.AAttribute
	 * @generated
	 */
	public Adapter createAAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.AOperation <em>AOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.AOperation
	 * @generated
	 */
	public Adapter createAOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.AParameter <em>AParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.AParameter
	 * @generated
	 */
	public Adapter createAParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.Matricula <em>Matricula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.Matricula
	 * @generated
	 */
	public Adapter createMatriculaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.Aluno <em>Aluno</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.Aluno
	 * @generated
	 */
	public Adapter createAlunoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.Curso <em>Curso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.Curso
	 * @generated
	 */
	public Adapter createCursoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.Departamento <em>Departamento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.Departamento
	 * @generated
	 */
	public Adapter createDepartamentoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.Disciplina <em>Disciplina</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.Disciplina
	 * @generated
	 */
	public Adapter createDisciplinaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.Campus <em>Campus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.Campus
	 * @generated
	 */
	public Adapter createCampusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.DisciplinaSemestre <em>Disciplina Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.DisciplinaSemestre
	 * @generated
	 */
	public Adapter createDisciplinaSemestreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.DisciplinaPaga <em>Disciplina Paga</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.DisciplinaPaga
	 * @generated
	 */
	public Adapter createDisciplinaPagaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Academia.DisciplinaGratis <em>Disciplina Gratis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Academia.DisciplinaGratis
	 * @generated
	 */
	public Adapter createDisciplinaGratisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AcademiaAdapterFactory
