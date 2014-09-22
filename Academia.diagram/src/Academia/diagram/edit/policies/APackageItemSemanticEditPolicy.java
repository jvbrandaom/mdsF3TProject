package Academia.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class APackageItemSemanticEditPolicy extends
		Academia.diagram.edit.policies.AcademiaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public APackageItemSemanticEditPolicy() {
		super(Academia.diagram.providers.AcademiaElementTypes.APackage_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Academia.diagram.providers.AcademiaElementTypes.AApplication_2001 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.AApplicationCreateCommand(
					req));
		}
		if (Academia.diagram.providers.AcademiaElementTypes.Matricula_2002 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.MatriculaCreateCommand(
					req));
		}
		if (Academia.diagram.providers.AcademiaElementTypes.Aluno_2003 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.AlunoCreateCommand(
					req));
		}
		if (Academia.diagram.providers.AcademiaElementTypes.Curso_2004 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.CursoCreateCommand(
					req));
		}
		if (Academia.diagram.providers.AcademiaElementTypes.Departamento_2005 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.DepartamentoCreateCommand(
					req));
		}
		if (Academia.diagram.providers.AcademiaElementTypes.Campus_2006 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.CampusCreateCommand(
					req));
		}
		if (Academia.diagram.providers.AcademiaElementTypes.DisciplinaSemestre_2007 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.DisciplinaSemestreCreateCommand(
					req));
		}
		if (Academia.diagram.providers.AcademiaElementTypes.DisciplinaPaga_2008 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.DisciplinaPagaCreateCommand(
					req));
		}
		if (Academia.diagram.providers.AcademiaElementTypes.DisciplinaGratis_2009 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.DisciplinaGratisCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
