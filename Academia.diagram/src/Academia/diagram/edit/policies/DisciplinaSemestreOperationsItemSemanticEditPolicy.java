package Academia.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DisciplinaSemestreOperationsItemSemanticEditPolicy extends
		Academia.diagram.edit.policies.AcademiaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DisciplinaSemestreOperationsItemSemanticEditPolicy() {
		super(
				Academia.diagram.providers.AcademiaElementTypes.DisciplinaSemestre_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Academia.diagram.providers.AcademiaElementTypes.AOperation_3017 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.AOperation6CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
