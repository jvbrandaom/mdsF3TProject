package Academia.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class AcademiaEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Academia.diagram.part.AcademiaVisualIDRegistry
					.getVisualID(view)) {

			case Academia.diagram.edit.parts.APackageEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.APackageEditPart(view);

			case Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AApplicationEditPart(
						view);

			case Academia.diagram.edit.parts.AApplicationNameEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AApplicationNameEditPart(
						view);

			case Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.MatriculaEditPart(view);

			case Academia.diagram.edit.parts.MatriculaStereoEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.MatriculaStereoEditPart(
						view);

			case Academia.diagram.edit.parts.MatriculaNameEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.MatriculaNameEditPart(
						view);

			case Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AlunoEditPart(view);

			case Academia.diagram.edit.parts.AlunoStereoEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AlunoStereoEditPart(view);

			case Academia.diagram.edit.parts.AlunoNameEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AlunoNameEditPart(view);

			case Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.CursoEditPart(view);

			case Academia.diagram.edit.parts.CursoStereoEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.CursoStereoEditPart(view);

			case Academia.diagram.edit.parts.CursoNameEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.CursoNameEditPart(view);

			case Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DepartamentoEditPart(
						view);

			case Academia.diagram.edit.parts.DepartamentoStereoEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DepartamentoStereoEditPart(
						view);

			case Academia.diagram.edit.parts.DepartamentoNameEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DepartamentoNameEditPart(
						view);

			case Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.CampusEditPart(view);

			case Academia.diagram.edit.parts.CampusStereoEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.CampusStereoEditPart(
						view);

			case Academia.diagram.edit.parts.CampusNameEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.CampusNameEditPart(view);

			case Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DisciplinaSemestreEditPart(
						view);

			case Academia.diagram.edit.parts.DisciplinaSemestreStereoEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DisciplinaSemestreStereoEditPart(
						view);

			case Academia.diagram.edit.parts.DisciplinaSemestreNameEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DisciplinaSemestreNameEditPart(
						view);

			case Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DisciplinaPagaEditPart(
						view);

			case Academia.diagram.edit.parts.DisciplinaPagaStereoEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DisciplinaPagaStereoEditPart(
						view);

			case Academia.diagram.edit.parts.DisciplinaPagaNameEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DisciplinaPagaNameEditPart(
						view);

			case Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DisciplinaGratisEditPart(
						view);

			case Academia.diagram.edit.parts.DisciplinaGratisStereoEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DisciplinaGratisStereoEditPart(
						view);

			case Academia.diagram.edit.parts.DisciplinaGratisNameEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DisciplinaGratisNameEditPart(
						view);

			case Academia.diagram.edit.parts.AAttributeEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AAttributeEditPart(view);

			case Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperationEditPart(view);

			case Academia.diagram.edit.parts.AOperationNameEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperationNameEditPart(
						view);

			case Academia.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case Academia.diagram.edit.parts.AOperationTypeNameEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperationTypeNameEditPart(
						view);

			case Academia.diagram.edit.parts.AParameterEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AParameterEditPart(view);

			case Academia.diagram.edit.parts.AAttribute2EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AAttribute2EditPart(view);

			case Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperation2EditPart(view);

			case Academia.diagram.edit.parts.AOperationName2EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperationName2EditPart(
						view);

			case Academia.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case Academia.diagram.edit.parts.AOperationTypeName2EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperationTypeName2EditPart(
						view);

			case Academia.diagram.edit.parts.AParameter2EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AParameter2EditPart(view);

			case Academia.diagram.edit.parts.AAttribute3EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AAttribute3EditPart(view);

			case Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperation3EditPart(view);

			case Academia.diagram.edit.parts.AOperationName3EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperationName3EditPart(
						view);

			case Academia.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			case Academia.diagram.edit.parts.AOperationTypeName3EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperationTypeName3EditPart(
						view);

			case Academia.diagram.edit.parts.AParameter3EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AParameter3EditPart(view);

			case Academia.diagram.edit.parts.AAttribute4EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AAttribute4EditPart(view);

			case Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperation4EditPart(view);

			case Academia.diagram.edit.parts.AOperationName4EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperationName4EditPart(
						view);

			case Academia.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.WrappingLabel4EditPart(
						view);

			case Academia.diagram.edit.parts.AOperationTypeName4EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperationTypeName4EditPart(
						view);

			case Academia.diagram.edit.parts.AParameter4EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AParameter4EditPart(view);

			case Academia.diagram.edit.parts.AAttribute5EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AAttribute5EditPart(view);

			case Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperation5EditPart(view);

			case Academia.diagram.edit.parts.AOperationName5EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperationName5EditPart(
						view);

			case Academia.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.WrappingLabel5EditPart(
						view);

			case Academia.diagram.edit.parts.AOperationTypeName5EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperationTypeName5EditPart(
						view);

			case Academia.diagram.edit.parts.AParameter5EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AParameter5EditPart(view);

			case Academia.diagram.edit.parts.AAttribute6EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AAttribute6EditPart(view);

			case Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperation6EditPart(view);

			case Academia.diagram.edit.parts.AOperationName6EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperationName6EditPart(
						view);

			case Academia.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.WrappingLabel6EditPart(
						view);

			case Academia.diagram.edit.parts.AOperationTypeName6EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperationTypeName6EditPart(
						view);

			case Academia.diagram.edit.parts.AParameter6EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AParameter6EditPart(view);

			case Academia.diagram.edit.parts.AAttribute7EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AAttribute7EditPart(view);

			case Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperation7EditPart(view);

			case Academia.diagram.edit.parts.AOperationName7EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperationName7EditPart(
						view);

			case Academia.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.WrappingLabel7EditPart(
						view);

			case Academia.diagram.edit.parts.AOperationTypeName7EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperationTypeName7EditPart(
						view);

			case Academia.diagram.edit.parts.AParameter7EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AParameter7EditPart(view);

			case Academia.diagram.edit.parts.AAttribute8EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AAttribute8EditPart(view);

			case Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperation8EditPart(view);

			case Academia.diagram.edit.parts.AOperationName8EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperationName8EditPart(
						view);

			case Academia.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.WrappingLabel8EditPart(
						view);

			case Academia.diagram.edit.parts.AOperationTypeName8EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AOperationTypeName8EditPart(
						view);

			case Academia.diagram.edit.parts.AParameter8EditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AParameter8EditPart(view);

			case Academia.diagram.edit.parts.MatriculaAttributesEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.MatriculaAttributesEditPart(
						view);

			case Academia.diagram.edit.parts.MatriculaOperationsEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.MatriculaOperationsEditPart(
						view);

			case Academia.diagram.edit.parts.AlunoAttributesEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AlunoAttributesEditPart(
						view);

			case Academia.diagram.edit.parts.AlunoOperationsEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AlunoOperationsEditPart(
						view);

			case Academia.diagram.edit.parts.CursoAttributesEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.CursoAttributesEditPart(
						view);

			case Academia.diagram.edit.parts.CursoOperationsEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.CursoOperationsEditPart(
						view);

			case Academia.diagram.edit.parts.DepartamentoAttributesEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DepartamentoAttributesEditPart(
						view);

			case Academia.diagram.edit.parts.DepartamentoOperationsEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DepartamentoOperationsEditPart(
						view);

			case Academia.diagram.edit.parts.CampusAttributesEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.CampusAttributesEditPart(
						view);

			case Academia.diagram.edit.parts.CampusOperationsEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.CampusOperationsEditPart(
						view);

			case Academia.diagram.edit.parts.DisciplinaSemestreAttributesEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DisciplinaSemestreAttributesEditPart(
						view);

			case Academia.diagram.edit.parts.DisciplinaSemestreOperationsEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DisciplinaSemestreOperationsEditPart(
						view);

			case Academia.diagram.edit.parts.DisciplinaPagaAttributesEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DisciplinaPagaAttributesEditPart(
						view);

			case Academia.diagram.edit.parts.DisciplinaPagaOperationsEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DisciplinaPagaOperationsEditPart(
						view);

			case Academia.diagram.edit.parts.DisciplinaGratisAttributesEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DisciplinaGratisAttributesEditPart(
						view);

			case Academia.diagram.edit.parts.DisciplinaGratisOperationsEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.DisciplinaGratisOperationsEditPart(
						view);

			case Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID:
				return new Academia.diagram.edit.parts.AClassifierAChildsEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
