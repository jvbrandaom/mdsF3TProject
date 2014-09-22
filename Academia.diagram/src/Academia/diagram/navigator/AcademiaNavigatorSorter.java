package Academia.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class AcademiaNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7018;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof Academia.diagram.navigator.AcademiaNavigatorItem) {
			Academia.diagram.navigator.AcademiaNavigatorItem item = (Academia.diagram.navigator.AcademiaNavigatorItem) element;
			return Academia.diagram.part.AcademiaVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
