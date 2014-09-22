package Academia.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = Academia.diagram.part.AcademiaDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
