package Academia.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DisciplinaSemestreAttributesItemSemanticEditPolicy extends
		Academia.diagram.edit.policies.AcademiaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DisciplinaSemestreAttributesItemSemanticEditPolicy() {
		super(
				Academia.diagram.providers.AcademiaElementTypes.DisciplinaSemestre_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Academia.diagram.providers.AcademiaElementTypes.AAttribute_3016 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.AAttribute6CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
