package Academia.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MatriculaOperationsItemSemanticEditPolicy extends
		Academia.diagram.edit.policies.AcademiaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MatriculaOperationsItemSemanticEditPolicy() {
		super(Academia.diagram.providers.AcademiaElementTypes.Matricula_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Academia.diagram.providers.AcademiaElementTypes.AOperation_3002 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.AOperationCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
