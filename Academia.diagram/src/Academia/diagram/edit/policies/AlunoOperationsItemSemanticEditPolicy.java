package Academia.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AlunoOperationsItemSemanticEditPolicy extends
		Academia.diagram.edit.policies.AcademiaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AlunoOperationsItemSemanticEditPolicy() {
		super(Academia.diagram.providers.AcademiaElementTypes.Aluno_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Academia.diagram.providers.AcademiaElementTypes.AOperation_3005 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.AOperation2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
