package Academia.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MatriculaAttributesItemSemanticEditPolicy extends
		Academia.diagram.edit.policies.AcademiaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MatriculaAttributesItemSemanticEditPolicy() {
		super(Academia.diagram.providers.AcademiaElementTypes.Matricula_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Academia.diagram.providers.AcademiaElementTypes.AAttribute_3001 == req
				.getElementType()) {
			return getGEFWrapper(new Academia.diagram.edit.commands.AAttributeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
