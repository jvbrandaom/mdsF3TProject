package Academia.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CampusOperationsItemSemanticEditPolicy extends
		Academia.diagram.edit.policies.AcademiaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CampusOperationsItemSemanticEditPolicy() {
		super(Academia.diagram.providers.AcademiaElementTypes.Campus_2006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Academia.diagram.providers.AcademiaElementTypes.AOperation_3014 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.AOperation5CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
