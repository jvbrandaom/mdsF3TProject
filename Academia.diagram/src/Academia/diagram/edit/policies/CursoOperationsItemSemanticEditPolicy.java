package Academia.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CursoOperationsItemSemanticEditPolicy extends
		Academia.diagram.edit.policies.AcademiaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CursoOperationsItemSemanticEditPolicy() {
		super(Academia.diagram.providers.AcademiaElementTypes.Curso_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Academia.diagram.providers.AcademiaElementTypes.AOperation_3008 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.AOperation3CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
