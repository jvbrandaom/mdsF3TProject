package Academia.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class AcademiaVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "Academia.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (Academia.diagram.edit.parts.APackageEditPart.MODEL_ID
					.equals(view.getType())) {
				return Academia.diagram.edit.parts.APackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return Academia.diagram.part.AcademiaVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
						.logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Academia.AcademiaPackage.eINSTANCE.getAPackage().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Academia.APackage) domainElement)) {
			return Academia.diagram.edit.parts.APackageEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = Academia.diagram.part.AcademiaVisualIDRegistry
				.getModelID(containerView);
		if (!Academia.diagram.edit.parts.APackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (Academia.diagram.edit.parts.APackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Academia.diagram.edit.parts.APackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case Academia.diagram.edit.parts.APackageEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAApplication()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID;
			}
			if (Academia.AcademiaPackage.eINSTANCE.getMatricula()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID;
			}
			if (Academia.AcademiaPackage.eINSTANCE.getAluno().isSuperTypeOf(
					domainElement.eClass())) {
				return Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID;
			}
			if (Academia.AcademiaPackage.eINSTANCE.getCurso().isSuperTypeOf(
					domainElement.eClass())) {
				return Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID;
			}
			if (Academia.AcademiaPackage.eINSTANCE.getDepartamento()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID;
			}
			if (Academia.AcademiaPackage.eINSTANCE.getCampus().isSuperTypeOf(
					domainElement.eClass())) {
				return Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID;
			}
			if (Academia.AcademiaPackage.eINSTANCE.getDisciplinaSemestre()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID;
			}
			if (Academia.AcademiaPackage.eINSTANCE.getDisciplinaPaga()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID;
			}
			if (Academia.AcademiaPackage.eINSTANCE.getDisciplinaGratis()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAParameter()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AParameterEditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAParameter()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AParameter2EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAParameter()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AParameter3EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAParameter()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AParameter4EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAParameter()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AParameter5EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAParameter()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AParameter6EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAParameter()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AParameter7EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAParameter()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AParameter8EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.MatriculaAttributesEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAAttribute()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AAttributeEditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.MatriculaOperationsEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAOperation()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.AlunoAttributesEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAAttribute()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AAttribute2EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.AlunoOperationsEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAOperation()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.CursoAttributesEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAAttribute()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AAttribute3EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.CursoOperationsEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAOperation()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.DepartamentoAttributesEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAAttribute()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AAttribute4EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.DepartamentoOperationsEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAOperation()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.CampusAttributesEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAAttribute()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AAttribute5EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.CampusOperationsEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAOperation()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.DisciplinaSemestreAttributesEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAAttribute()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AAttribute6EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.DisciplinaSemestreOperationsEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAOperation()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.DisciplinaPagaAttributesEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAAttribute()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AAttribute7EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.DisciplinaPagaOperationsEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAOperation()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.DisciplinaGratisAttributesEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAAttribute()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AAttribute8EditPart.VISUAL_ID;
			}
			break;
		case Academia.diagram.edit.parts.DisciplinaGratisOperationsEditPart.VISUAL_ID:
			if (Academia.AcademiaPackage.eINSTANCE.getAOperation()
					.isSuperTypeOf(domainElement.eClass())) {
				return Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = Academia.diagram.part.AcademiaVisualIDRegistry
				.getModelID(containerView);
		if (!Academia.diagram.edit.parts.APackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (Academia.diagram.edit.parts.APackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Academia.diagram.edit.parts.APackageEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case Academia.diagram.edit.parts.APackageEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AApplicationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.MatriculaStereoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.MatriculaNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.MatriculaAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.MatriculaOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AlunoStereoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AlunoNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AlunoAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AlunoOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.CursoStereoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.CursoNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.CursoAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.CursoOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.DepartamentoStereoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.DepartamentoNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.DepartamentoAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.DepartamentoOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.CampusStereoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.CampusNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.CampusAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.CampusOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.DisciplinaSemestreStereoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.DisciplinaSemestreNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.DisciplinaSemestreAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.DisciplinaSemestreOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.DisciplinaPagaStereoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.DisciplinaPagaNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.DisciplinaPagaAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.DisciplinaPagaOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.DisciplinaGratisStereoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.DisciplinaGratisNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.DisciplinaGratisAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.DisciplinaGratisOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AOperationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AOperationTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AOperationName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AOperationTypeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AParameter2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AOperationName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AOperationTypeName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AParameter3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AOperationName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AOperationTypeName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AParameter4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AOperationName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AOperationTypeName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AParameter5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AOperationName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AOperationTypeName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AParameter6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AOperationName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AOperationTypeName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AParameter7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AOperationName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AOperationTypeName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Academia.diagram.edit.parts.AParameter8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.MatriculaAttributesEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.MatriculaOperationsEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.AlunoAttributesEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AAttribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.AlunoOperationsEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.CursoAttributesEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AAttribute3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.CursoOperationsEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.DepartamentoAttributesEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AAttribute4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.DepartamentoOperationsEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.CampusAttributesEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AAttribute5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.CampusOperationsEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.DisciplinaSemestreAttributesEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AAttribute6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.DisciplinaSemestreOperationsEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.DisciplinaPagaAttributesEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AAttribute7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.DisciplinaPagaOperationsEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.DisciplinaGratisAttributesEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AAttribute8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Academia.diagram.edit.parts.DisciplinaGratisOperationsEditPart.VISUAL_ID:
			if (Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Academia.APackage element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case Academia.diagram.edit.parts.MatriculaAttributesEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.MatriculaOperationsEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AlunoAttributesEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AlunoOperationsEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.CursoAttributesEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.CursoOperationsEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.DepartamentoAttributesEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.DepartamentoOperationsEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.CampusAttributesEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.CampusOperationsEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.DisciplinaSemestreAttributesEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.DisciplinaSemestreOperationsEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.DisciplinaPagaAttributesEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.DisciplinaPagaOperationsEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.DisciplinaGratisAttributesEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.DisciplinaGratisOperationsEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case Academia.diagram.edit.parts.APackageEditPart.VISUAL_ID:
			return false;
		case Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AAttributeEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AParameterEditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AAttribute2EditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AParameter2EditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AAttribute3EditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AParameter3EditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AAttribute4EditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AParameter4EditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AAttribute5EditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AParameter5EditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AAttribute6EditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AParameter6EditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AAttribute7EditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AParameter7EditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AAttribute8EditPart.VISUAL_ID:
		case Academia.diagram.edit.parts.AParameter8EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return Academia.diagram.part.AcademiaVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return Academia.diagram.part.AcademiaVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return Academia.diagram.part.AcademiaVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return Academia.diagram.part.AcademiaVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return Academia.diagram.part.AcademiaVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
