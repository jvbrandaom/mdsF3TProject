package Academia.diagram.providers;

import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

/**
 * @generated
 */
public class AcademiaViewProvider extends AbstractProvider implements
		IViewProvider {

	/**
	 * @generated
	 */
	public final boolean provides(IOperation operation) {
		if (operation instanceof CreateViewForKindOperation) {
			return provides((CreateViewForKindOperation) operation);
		}
		assert operation instanceof CreateViewOperation;
		if (operation instanceof CreateDiagramViewOperation) {
			return provides((CreateDiagramViewOperation) operation);
		} else if (operation instanceof CreateEdgeViewOperation) {
			return provides((CreateEdgeViewOperation) operation);
		} else if (operation instanceof CreateNodeViewOperation) {
			return provides((CreateNodeViewOperation) operation);
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateViewForKindOperation op) {
		/*
		 if (op.getViewKind() == Node.class)
		 return getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 if (op.getViewKind() == Edge.class)
		 return getEdgeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 */
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateDiagramViewOperation op) {
		return Academia.diagram.edit.parts.APackageEditPart.MODEL_ID.equals(op
				.getSemanticHint())
				&& Academia.diagram.part.AcademiaVisualIDRegistry
						.getDiagramVisualID(getSemanticElement(op
								.getSemanticAdapter())) != -1;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateNodeViewOperation op) {
		if (op.getContainerView() == null) {
			return false;
		}
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		int visualID;
		if (op.getSemanticHint() == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return false;
			}
			visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(op.getContainerView(), domainElement);
		} else {
			visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getVisualID(op.getSemanticHint());
			if (elementType != null) {
				if (!Academia.diagram.providers.AcademiaElementTypes
						.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return false; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!op.getSemanticHint().equals(elementTypeHint)) {
					return false; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != Academia.diagram.part.AcademiaVisualIDRegistry
								.getNodeVisualID(op.getContainerView(),
										domainElement)) {
					return false; // visual id for node EClass should match visual id from element type
				}
			} else {
				if (!Academia.diagram.edit.parts.APackageEditPart.MODEL_ID
						.equals(Academia.diagram.part.AcademiaVisualIDRegistry
								.getModelID(op.getContainerView()))) {
					return false; // foreign diagram
				}
				switch (visualID) {
				case Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AAttributeEditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AParameterEditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AAttribute2EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AParameter2EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AAttribute3EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AParameter3EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AAttribute4EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AParameter4EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AAttribute5EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AParameter5EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AAttribute6EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AParameter6EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AAttribute7EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AParameter7EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AAttribute8EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID:
				case Academia.diagram.edit.parts.AParameter8EditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != Academia.diagram.part.AcademiaVisualIDRegistry
									.getNodeVisualID(op.getContainerView(),
											domainElement)) {
						return false; // visual id in semantic hint should match visual id for domain element
					}
					break;
				default:
					return false;
				}
			}
		}
		return Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AAttributeEditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AParameterEditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AAttribute2EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AParameter2EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AAttribute3EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AParameter3EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AAttribute4EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AParameter4EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AAttribute5EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AParameter5EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AAttribute6EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AParameter6EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AAttribute7EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AParameter7EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AAttribute8EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID == visualID
				|| Academia.diagram.edit.parts.AParameter8EditPart.VISUAL_ID == visualID;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateEdgeViewOperation op) {
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		if (!Academia.diagram.providers.AcademiaElementTypes
				.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return false; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null
				|| (op.getSemanticHint() != null && !elementTypeHint.equals(op
						.getSemanticHint()))) {
			return false; // our hint is visual id and must be specified, and it should be the same as in element type
		}
		int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
				.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		if (domainElement != null
				&& visualID != Academia.diagram.part.AcademiaVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return false; // visual id for link EClass should match visual id from element type
		}
		return true;
	}

	/**
	 * @generated
	 */
	public Diagram createDiagram(IAdaptable semanticAdapter,
			String diagramKind, PreferencesHint preferencesHint) {
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
		diagram.setType(Academia.diagram.edit.parts.APackageEditPart.MODEL_ID);
		diagram.setElement(getSemanticElement(semanticAdapter));
		diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
		return diagram;
	}

	/**
	 * @generated
	 */
	public Node createNode(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		final EObject domainElement = getSemanticElement(semanticAdapter);
		final int visualID;
		if (semanticHint == null) {
			visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getVisualID(semanticHint);
		}
		switch (visualID) {
		case Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID:
			return createAApplication_2001(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID:
			return createMatricula_2002(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID:
			return createAluno_2003(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID:
			return createCurso_2004(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID:
			return createDepartamento_2005(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID:
			return createCampus_2006(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID:
			return createDisciplinaSemestre_2007(domainElement, containerView,
					index, persisted, preferencesHint);
		case Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID:
			return createDisciplinaPaga_2008(domainElement, containerView,
					index, persisted, preferencesHint);
		case Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID:
			return createDisciplinaGratis_2009(domainElement, containerView,
					index, persisted, preferencesHint);
		case Academia.diagram.edit.parts.AAttributeEditPart.VISUAL_ID:
			return createAAttribute_3001(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID:
			return createAOperation_3002(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AParameterEditPart.VISUAL_ID:
			return createAParameter_3003(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AAttribute2EditPart.VISUAL_ID:
			return createAAttribute_3004(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID:
			return createAOperation_3005(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AParameter2EditPart.VISUAL_ID:
			return createAParameter_3006(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AAttribute3EditPart.VISUAL_ID:
			return createAAttribute_3007(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID:
			return createAOperation_3008(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AParameter3EditPart.VISUAL_ID:
			return createAParameter_3009(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AAttribute4EditPart.VISUAL_ID:
			return createAAttribute_3010(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID:
			return createAOperation_3011(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AParameter4EditPart.VISUAL_ID:
			return createAParameter_3012(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AAttribute5EditPart.VISUAL_ID:
			return createAAttribute_3013(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID:
			return createAOperation_3014(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AParameter5EditPart.VISUAL_ID:
			return createAParameter_3015(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AAttribute6EditPart.VISUAL_ID:
			return createAAttribute_3016(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID:
			return createAOperation_3017(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AParameter6EditPart.VISUAL_ID:
			return createAParameter_3018(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AAttribute7EditPart.VISUAL_ID:
			return createAAttribute_3019(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID:
			return createAOperation_3020(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AParameter7EditPart.VISUAL_ID:
			return createAParameter_3021(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AAttribute8EditPart.VISUAL_ID:
			return createAAttribute_3022(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID:
			return createAOperation_3023(domainElement, containerView, index,
					persisted, preferencesHint);
		case Academia.diagram.edit.parts.AParameter8EditPart.VISUAL_ID:
			return createAParameter_3024(domainElement, containerView, index,
					persisted, preferencesHint);
		}
		// can't happen, provided #provides(CreateNodeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Edge createEdge(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		switch (Academia.diagram.part.AcademiaVisualIDRegistry
				.getVisualID(elementTypeHint)) {
		case Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID:
			return createAClassifierAChilds_4001(containerView, index,
					persisted, preferencesHint);
		}
		// can never happen, provided #provides(CreateEdgeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Node createAApplication_2001(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFillStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5001 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AApplicationNameEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createMatricula_2002(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFillStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5005 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.MatriculaStereoEditPart.VISUAL_ID));
		Node label5006 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.MatriculaNameEditPart.VISUAL_ID));
		createCompartment(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.MatriculaAttributesEditPart.VISUAL_ID),
				true, false, true, true);
		createCompartment(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.MatriculaOperationsEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAluno_2003(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFillStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5010 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AlunoStereoEditPart.VISUAL_ID));
		Node label5011 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AlunoNameEditPart.VISUAL_ID));
		createCompartment(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AlunoAttributesEditPart.VISUAL_ID),
				true, false, true, true);
		createCompartment(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AlunoOperationsEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createCurso_2004(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFillStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5015 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.CursoStereoEditPart.VISUAL_ID));
		Node label5016 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.CursoNameEditPart.VISUAL_ID));
		createCompartment(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.CursoAttributesEditPart.VISUAL_ID),
				true, false, true, true);
		createCompartment(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.CursoOperationsEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createDepartamento_2005(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFillStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5020 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.DepartamentoStereoEditPart.VISUAL_ID));
		Node label5021 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.DepartamentoNameEditPart.VISUAL_ID));
		createCompartment(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.DepartamentoAttributesEditPart.VISUAL_ID),
				true, false, true, true);
		createCompartment(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.DepartamentoOperationsEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createCampus_2006(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFillStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5025 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.CampusStereoEditPart.VISUAL_ID));
		Node label5026 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.CampusNameEditPart.VISUAL_ID));
		createCompartment(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.CampusAttributesEditPart.VISUAL_ID),
				true, false, true, true);
		createCompartment(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.CampusOperationsEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createDisciplinaSemestre_2007(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFillStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5030 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.DisciplinaSemestreStereoEditPart.VISUAL_ID));
		Node label5031 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.DisciplinaSemestreNameEditPart.VISUAL_ID));
		createCompartment(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.DisciplinaSemestreAttributesEditPart.VISUAL_ID),
				true, false, true, true);
		createCompartment(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.DisciplinaSemestreOperationsEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createDisciplinaPaga_2008(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFillStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5035 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.DisciplinaPagaStereoEditPart.VISUAL_ID));
		Node label5036 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.DisciplinaPagaNameEditPart.VISUAL_ID));
		createCompartment(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.DisciplinaPagaAttributesEditPart.VISUAL_ID),
				true, false, true, true);
		createCompartment(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.DisciplinaPagaOperationsEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createDisciplinaGratis_2009(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFillStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5040 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.DisciplinaGratisStereoEditPart.VISUAL_ID));
		Node label5041 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.DisciplinaGratisNameEditPart.VISUAL_ID));
		createCompartment(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.DisciplinaGratisAttributesEditPart.VISUAL_ID),
				true, false, true, true);
		createCompartment(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.DisciplinaGratisOperationsEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAAttribute_3001(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AAttributeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAOperation_3002(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5002 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AOperationNameEditPart.VISUAL_ID));
		Node label5003 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		Node label5004 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AOperationTypeNameEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAParameter_3003(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AParameterEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAAttribute_3004(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AAttribute2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAOperation_3005(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5007 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AOperationName2EditPart.VISUAL_ID));
		Node label5008 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID));
		Node label5009 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AOperationTypeName2EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAParameter_3006(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AParameter2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAAttribute_3007(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AAttribute3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAOperation_3008(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5012 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AOperationName3EditPart.VISUAL_ID));
		Node label5013 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID));
		Node label5014 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AOperationTypeName3EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAParameter_3009(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AParameter3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAAttribute_3010(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AAttribute4EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAOperation_3011(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5017 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AOperationName4EditPart.VISUAL_ID));
		Node label5018 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID));
		Node label5019 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AOperationTypeName4EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAParameter_3012(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AParameter4EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAAttribute_3013(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AAttribute5EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAOperation_3014(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5022 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AOperationName5EditPart.VISUAL_ID));
		Node label5023 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID));
		Node label5024 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AOperationTypeName5EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAParameter_3015(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AParameter5EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAAttribute_3016(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AAttribute6EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAOperation_3017(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5027 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AOperationName6EditPart.VISUAL_ID));
		Node label5028 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID));
		Node label5029 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AOperationTypeName6EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAParameter_3018(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AParameter6EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAAttribute_3019(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AAttribute7EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAOperation_3020(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5032 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AOperationName7EditPart.VISUAL_ID));
		Node label5033 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID));
		Node label5034 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AOperationTypeName7EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAParameter_3021(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AParameter7EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAAttribute_3022(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AAttribute8EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAOperation_3023(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label5037 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AOperationName8EditPart.VISUAL_ID));
		Node label5038 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID));
		Node label5039 = createLabel(
				node,
				Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.AOperationTypeName8EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAParameter_3024(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createLocation());
		node.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AParameter8EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		return node;
	}

	/**
	 * @generated
	 */
	public Edge createAClassifierAChilds_4001(View containerView, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		Edge edge = NotationFactory.eINSTANCE.createEdge();
		edge.getStyles().add(NotationFactory.eINSTANCE.createRoutingStyle());
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		return edge;
	}

	/**
	 * @generated
	 */
	private void stampShortcut(View containerView, Node target) {
		if (!Academia.diagram.edit.parts.APackageEditPart.MODEL_ID
				.equals(Academia.diagram.part.AcademiaVisualIDRegistry
						.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation
					.getDetails()
					.put("modelID", Academia.diagram.edit.parts.APackageEditPart.MODEL_ID); //$NON-NLS-1$
			target.getEAnnotations().add(shortcutAnnotation);
		}
	}

	/**
	 * @generated
	 */
	private Node createLabel(View owner, String hint) {
		DecorationNode rv = NotationFactory.eINSTANCE.createDecorationNode();
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	 * @generated
	 */
	private Node createCompartment(View owner, String hint,
			boolean canCollapse, boolean hasTitle, boolean canSort,
			boolean canFilter) {
		//SemanticListCompartment rv = NotationFactory.eINSTANCE.createSemanticListCompartment();
		//rv.setShowTitle(showTitle);
		//rv.setCollapsed(isCollapsed);
		Node rv;
		if (canCollapse) {
			rv = NotationFactory.eINSTANCE.createBasicCompartment();
		} else {
			rv = NotationFactory.eINSTANCE.createDecorationNode();
		}
		if (hasTitle) {
			TitleStyle ts = NotationFactory.eINSTANCE.createTitleStyle();
			ts.setShowTitle(true);
			rv.getStyles().add(ts);
		}
		if (canSort) {
			rv.getStyles().add(NotationFactory.eINSTANCE.createSortingStyle());
		}
		if (canFilter) {
			rv.getStyles()
					.add(NotationFactory.eINSTANCE.createFilteringStyle());
		}
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	 * @generated
	 */
	private EObject getSemanticElement(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			return EMFCoreUtil.resolve(
					TransactionUtil.getEditingDomain(eObject), eObject);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
