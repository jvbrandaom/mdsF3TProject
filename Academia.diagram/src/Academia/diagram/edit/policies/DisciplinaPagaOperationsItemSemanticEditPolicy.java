package Academia.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DisciplinaPagaOperationsItemSemanticEditPolicy extends
		Academia.diagram.edit.policies.AcademiaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DisciplinaPagaOperationsItemSemanticEditPolicy() {
		super(
				Academia.diagram.providers.AcademiaElementTypes.DisciplinaPaga_2008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Academia.diagram.providers.AcademiaElementTypes.AOperation_3020 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.AOperation7CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
