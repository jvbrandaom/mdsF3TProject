package Academia.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DepartamentoOperationsItemSemanticEditPolicy extends
		Academia.diagram.edit.policies.AcademiaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DepartamentoOperationsItemSemanticEditPolicy() {
		super(Academia.diagram.providers.AcademiaElementTypes.Departamento_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Academia.diagram.providers.AcademiaElementTypes.AOperation_3011 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.AOperation4CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
