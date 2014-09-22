package Academia.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DisciplinaPagaAttributesItemSemanticEditPolicy extends
		Academia.diagram.edit.policies.AcademiaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DisciplinaPagaAttributesItemSemanticEditPolicy() {
		super(
				Academia.diagram.providers.AcademiaElementTypes.DisciplinaPaga_2008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Academia.diagram.providers.AcademiaElementTypes.AAttribute_3019 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.AAttribute7CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
