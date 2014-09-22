package Academia.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DisciplinaGratisOperationsItemSemanticEditPolicy extends
		Academia.diagram.edit.policies.AcademiaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DisciplinaGratisOperationsItemSemanticEditPolicy() {
		super(
				Academia.diagram.providers.AcademiaElementTypes.DisciplinaGratis_2009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Academia.diagram.providers.AcademiaElementTypes.AOperation_3023 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.AOperation8CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
