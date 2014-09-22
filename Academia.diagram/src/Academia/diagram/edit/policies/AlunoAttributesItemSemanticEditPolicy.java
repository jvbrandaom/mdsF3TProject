package Academia.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AlunoAttributesItemSemanticEditPolicy extends
		Academia.diagram.edit.policies.AcademiaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AlunoAttributesItemSemanticEditPolicy() {
		super(Academia.diagram.providers.AcademiaElementTypes.Aluno_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Academia.diagram.providers.AcademiaElementTypes.AAttribute_3004 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.AAttribute2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
