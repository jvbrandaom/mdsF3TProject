package Academia.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		Academia.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		Academia.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		Academia.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		Academia.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		Academia.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
				.getPreferenceStore();
	}
}
