package Academia.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class AcademiaNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		Academia.diagram.part.AcademiaDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		Academia.diagram.part.AcademiaDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof Academia.diagram.navigator.AcademiaNavigatorItem
				&& !isOwnView(((Academia.diagram.navigator.AcademiaNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof Academia.diagram.navigator.AcademiaNavigatorGroup) {
			Academia.diagram.navigator.AcademiaNavigatorGroup group = (Academia.diagram.navigator.AcademiaNavigatorGroup) element;
			return Academia.diagram.part.AcademiaDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof Academia.diagram.navigator.AcademiaNavigatorItem) {
			Academia.diagram.navigator.AcademiaNavigatorItem navigatorItem = (Academia.diagram.navigator.AcademiaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (Academia.diagram.part.AcademiaVisualIDRegistry
				.getVisualID(view)) {
		case Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?Academia?DisciplinaGratis", Academia.diagram.providers.AcademiaElementTypes.DisciplinaGratis_2009); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AOperation", Academia.diagram.providers.AcademiaElementTypes.AOperation_3017); //$NON-NLS-1$
		case Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?Academia?Curso", Academia.diagram.providers.AcademiaElementTypes.Curso_2004); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AParameter7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AParameter", Academia.diagram.providers.AcademiaElementTypes.AParameter_3021); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?Academia?AClassifier?aChilds", Academia.diagram.providers.AcademiaElementTypes.AClassifierAChilds_4001); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AAttribute2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AAttribute", Academia.diagram.providers.AcademiaElementTypes.AAttribute_3004); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AParameter3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AParameter", Academia.diagram.providers.AcademiaElementTypes.AParameter_3009); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AOperation", Academia.diagram.providers.AcademiaElementTypes.AOperation_3008); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?Academia?AApplication", Academia.diagram.providers.AcademiaElementTypes.AApplication_2001); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AAttribute3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AAttribute", Academia.diagram.providers.AcademiaElementTypes.AAttribute_3007); //$NON-NLS-1$
		case Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?Academia?Matricula", Academia.diagram.providers.AcademiaElementTypes.Matricula_2002); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AParameter6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AParameter", Academia.diagram.providers.AcademiaElementTypes.AParameter_3018); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AOperation", Academia.diagram.providers.AcademiaElementTypes.AOperation_3005); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AAttribute4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AAttribute", Academia.diagram.providers.AcademiaElementTypes.AAttribute_3010); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?Academia?Aluno", Academia.diagram.providers.AcademiaElementTypes.Aluno_2003); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AAttribute8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AAttribute", Academia.diagram.providers.AcademiaElementTypes.AAttribute_3022); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AParameter2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AParameter", Academia.diagram.providers.AcademiaElementTypes.AParameter_3006); //$NON-NLS-1$
		case Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?Academia?Campus", Academia.diagram.providers.AcademiaElementTypes.Campus_2006); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AOperation", Academia.diagram.providers.AcademiaElementTypes.AOperation_3023); //$NON-NLS-1$
		case Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?Academia?DisciplinaSemestre", Academia.diagram.providers.AcademiaElementTypes.DisciplinaSemestre_2007); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AAttribute7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AAttribute", Academia.diagram.providers.AcademiaElementTypes.AAttribute_3019); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AOperation", Academia.diagram.providers.AcademiaElementTypes.AOperation_3002); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AParameter5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AParameter", Academia.diagram.providers.AcademiaElementTypes.AParameter_3015); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AParameter8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AParameter", Academia.diagram.providers.AcademiaElementTypes.AParameter_3024); //$NON-NLS-1$
		case Academia.diagram.edit.parts.APackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?Academia?APackage", Academia.diagram.providers.AcademiaElementTypes.APackage_1000); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AOperation", Academia.diagram.providers.AcademiaElementTypes.AOperation_3014); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AParameter", Academia.diagram.providers.AcademiaElementTypes.AParameter_3003); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AAttribute", Academia.diagram.providers.AcademiaElementTypes.AAttribute_3001); //$NON-NLS-1$
		case Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?Academia?Departamento", Academia.diagram.providers.AcademiaElementTypes.Departamento_2005); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AAttribute6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AAttribute", Academia.diagram.providers.AcademiaElementTypes.AAttribute_3016); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AAttribute5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AAttribute", Academia.diagram.providers.AcademiaElementTypes.AAttribute_3013); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AOperation", Academia.diagram.providers.AcademiaElementTypes.AOperation_3020); //$NON-NLS-1$
		case Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?Academia?DisciplinaPaga", Academia.diagram.providers.AcademiaElementTypes.DisciplinaPaga_2008); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AParameter4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AParameter", Academia.diagram.providers.AcademiaElementTypes.AParameter_3012); //$NON-NLS-1$
		case Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?Academia?AOperation", Academia.diagram.providers.AcademiaElementTypes.AOperation_3011); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = Academia.diagram.part.AcademiaDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& Academia.diagram.providers.AcademiaElementTypes
						.isKnownElementType(elementType)) {
			image = Academia.diagram.providers.AcademiaElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof Academia.diagram.navigator.AcademiaNavigatorGroup) {
			Academia.diagram.navigator.AcademiaNavigatorGroup group = (Academia.diagram.navigator.AcademiaNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof Academia.diagram.navigator.AcademiaNavigatorItem) {
			Academia.diagram.navigator.AcademiaNavigatorItem navigatorItem = (Academia.diagram.navigator.AcademiaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (Academia.diagram.part.AcademiaVisualIDRegistry
				.getVisualID(view)) {
		case Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID:
			return getDisciplinaGratis_2009Text(view);
		case Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID:
			return getAOperation_3017Text(view);
		case Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID:
			return getCurso_2004Text(view);
		case Academia.diagram.edit.parts.AParameter7EditPart.VISUAL_ID:
			return getAParameter_3021Text(view);
		case Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID:
			return getAClassifierAChilds_4001Text(view);
		case Academia.diagram.edit.parts.AAttribute2EditPart.VISUAL_ID:
			return getAAttribute_3004Text(view);
		case Academia.diagram.edit.parts.AParameter3EditPart.VISUAL_ID:
			return getAParameter_3009Text(view);
		case Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID:
			return getAOperation_3008Text(view);
		case Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID:
			return getAApplication_2001Text(view);
		case Academia.diagram.edit.parts.AAttribute3EditPart.VISUAL_ID:
			return getAAttribute_3007Text(view);
		case Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID:
			return getMatricula_2002Text(view);
		case Academia.diagram.edit.parts.AParameter6EditPart.VISUAL_ID:
			return getAParameter_3018Text(view);
		case Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID:
			return getAOperation_3005Text(view);
		case Academia.diagram.edit.parts.AAttribute4EditPart.VISUAL_ID:
			return getAAttribute_3010Text(view);
		case Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID:
			return getAluno_2003Text(view);
		case Academia.diagram.edit.parts.AAttribute8EditPart.VISUAL_ID:
			return getAAttribute_3022Text(view);
		case Academia.diagram.edit.parts.AParameter2EditPart.VISUAL_ID:
			return getAParameter_3006Text(view);
		case Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID:
			return getCampus_2006Text(view);
		case Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID:
			return getAOperation_3023Text(view);
		case Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID:
			return getDisciplinaSemestre_2007Text(view);
		case Academia.diagram.edit.parts.AAttribute7EditPart.VISUAL_ID:
			return getAAttribute_3019Text(view);
		case Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID:
			return getAOperation_3002Text(view);
		case Academia.diagram.edit.parts.AParameter5EditPart.VISUAL_ID:
			return getAParameter_3015Text(view);
		case Academia.diagram.edit.parts.AParameter8EditPart.VISUAL_ID:
			return getAParameter_3024Text(view);
		case Academia.diagram.edit.parts.APackageEditPart.VISUAL_ID:
			return getAPackage_1000Text(view);
		case Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID:
			return getAOperation_3014Text(view);
		case Academia.diagram.edit.parts.AParameterEditPart.VISUAL_ID:
			return getAParameter_3003Text(view);
		case Academia.diagram.edit.parts.AAttributeEditPart.VISUAL_ID:
			return getAAttribute_3001Text(view);
		case Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID:
			return getDepartamento_2005Text(view);
		case Academia.diagram.edit.parts.AAttribute6EditPart.VISUAL_ID:
			return getAAttribute_3016Text(view);
		case Academia.diagram.edit.parts.AAttribute5EditPart.VISUAL_ID:
			return getAAttribute_3013Text(view);
		case Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID:
			return getAOperation_3020Text(view);
		case Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID:
			return getDisciplinaPaga_2008Text(view);
		case Academia.diagram.edit.parts.AParameter4EditPart.VISUAL_ID:
			return getAParameter_3012Text(view);
		case Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID:
			return getAOperation_3011Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDisciplinaGratis_2009Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.DisciplinaGratis_2009,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.DisciplinaGratisStereoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAOperation_3017Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AOperation_3017,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AOperationName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCurso_2004Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.Curso_2004,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.CursoStereoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAParameter_3021Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AParameter_3021,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AParameter7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAClassifierAChilds_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAAttribute_3004Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AAttribute_3004,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AAttribute2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAParameter_3009Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AParameter_3009,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AParameter3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAOperation_3008Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AOperation_3008,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AOperationName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAApplication_2001Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AApplication_2001,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AApplicationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAAttribute_3007Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AAttribute_3007,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AAttribute3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMatricula_2002Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.Matricula_2002,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.MatriculaStereoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAParameter_3018Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AParameter_3018,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AParameter6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAOperation_3005Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AOperation_3005,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AOperationName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAAttribute_3010Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AAttribute_3010,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AAttribute4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAluno_2003Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.Aluno_2003,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AlunoStereoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAAttribute_3022Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AAttribute_3022,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AAttribute8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAParameter_3006Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AParameter_3006,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AParameter2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCampus_2006Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.Campus_2006,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.CampusStereoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAOperation_3023Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AOperation_3023,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AOperationName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDisciplinaSemestre_2007Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.DisciplinaSemestre_2007,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.DisciplinaSemestreStereoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAAttribute_3019Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AAttribute_3019,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AAttribute7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAOperation_3002Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AOperation_3002,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AOperationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAParameter_3015Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AParameter_3015,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AParameter5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAParameter_3024Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AParameter_3024,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AParameter8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAPackage_1000Text(View view) {
		Academia.APackage domainModelElement = (Academia.APackage) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDomain();
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAOperation_3014Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AOperation_3014,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AOperationName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAParameter_3003Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AParameter_3003,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AParameterEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAAttribute_3001Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AAttribute_3001,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AAttributeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDepartamento_2005Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.Departamento_2005,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.DepartamentoStereoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAAttribute_3016Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AAttribute_3016,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AAttribute6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAAttribute_3013Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AAttribute_3013,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AAttribute5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAOperation_3020Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AOperation_3020,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AOperationName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDisciplinaPaga_2008Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.DisciplinaPaga_2008,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.DisciplinaPagaStereoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAParameter_3012Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AParameter_3012,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AParameter4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 3012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAOperation_3011Text(View view) {
		IParser parser = Academia.diagram.providers.AcademiaParserProvider
				.getParser(
						Academia.diagram.providers.AcademiaElementTypes.AOperation_3011,
						view.getElement() != null ? view.getElement() : view,
						Academia.diagram.part.AcademiaVisualIDRegistry
								.getType(Academia.diagram.edit.parts.AOperationName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return Academia.diagram.edit.parts.APackageEditPart.MODEL_ID
				.equals(Academia.diagram.part.AcademiaVisualIDRegistry
						.getModelID(view));
	}

}
