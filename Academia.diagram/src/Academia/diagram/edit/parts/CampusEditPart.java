package Academia.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class CampusEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2006;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public CampusEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						Academia.diagram.part.AcademiaVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new Academia.diagram.edit.policies.CampusItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new Academia.diagram.edit.policies.AcademiaTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new AObjectFigure();
	}

	/**
	 * @generated
	 */
	public AObjectFigure getPrimaryShape() {
		return (AObjectFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Academia.diagram.edit.parts.CampusStereoEditPart) {
			((Academia.diagram.edit.parts.CampusStereoEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureFeatureStereoLabel());
			return true;
		}
		if (childEditPart instanceof Academia.diagram.edit.parts.CampusNameEditPart) {
			((Academia.diagram.edit.parts.CampusNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureFeatureNameLabel());
			return true;
		}
		if (childEditPart instanceof Academia.diagram.edit.parts.CampusAttributesEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureFeaturePropertiesCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((Academia.diagram.edit.parts.CampusAttributesEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof Academia.diagram.edit.parts.CampusOperationsEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureFeatureOperationsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((Academia.diagram.edit.parts.CampusOperationsEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Academia.diagram.edit.parts.CampusStereoEditPart) {
			return true;
		}
		if (childEditPart instanceof Academia.diagram.edit.parts.CampusNameEditPart) {
			return true;
		}
		if (childEditPart instanceof Academia.diagram.edit.parts.CampusAttributesEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureFeaturePropertiesCompartment();
			pane.remove(((Academia.diagram.edit.parts.CampusAttributesEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof Academia.diagram.edit.parts.CampusOperationsEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureFeatureOperationsCompartment();
			pane.remove(((Academia.diagram.edit.parts.CampusOperationsEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof Academia.diagram.edit.parts.CampusAttributesEditPart) {
			return getPrimaryShape().getFigureFeaturePropertiesCompartment();
		}
		if (editPart instanceof Academia.diagram.edit.parts.CampusOperationsEditPart) {
			return getPrimaryShape().getFigureFeatureOperationsCompartment();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 60);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(Academia.diagram.part.AcademiaVisualIDRegistry
				.getType(Academia.diagram.edit.parts.CampusStereoEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AClassifierAChilds_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof Academia.diagram.edit.parts.MatriculaEditPart) {
			types.add(Academia.diagram.providers.AcademiaElementTypes.AClassifierAChilds_4001);
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.AlunoEditPart) {
			types.add(Academia.diagram.providers.AcademiaElementTypes.AClassifierAChilds_4001);
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.CursoEditPart) {
			types.add(Academia.diagram.providers.AcademiaElementTypes.AClassifierAChilds_4001);
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.DepartamentoEditPart) {
			types.add(Academia.diagram.providers.AcademiaElementTypes.AClassifierAChilds_4001);
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.CampusEditPart) {
			types.add(Academia.diagram.providers.AcademiaElementTypes.AClassifierAChilds_4001);
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.DisciplinaSemestreEditPart) {
			types.add(Academia.diagram.providers.AcademiaElementTypes.AClassifierAChilds_4001);
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.DisciplinaPagaEditPart) {
			types.add(Academia.diagram.providers.AcademiaElementTypes.AClassifierAChilds_4001);
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.DisciplinaGratisEditPart) {
			types.add(Academia.diagram.providers.AcademiaElementTypes.AClassifierAChilds_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == Academia.diagram.providers.AcademiaElementTypes.AClassifierAChilds_4001) {
			types.add(Academia.diagram.providers.AcademiaElementTypes.Matricula_2002);
			types.add(Academia.diagram.providers.AcademiaElementTypes.Aluno_2003);
			types.add(Academia.diagram.providers.AcademiaElementTypes.Curso_2004);
			types.add(Academia.diagram.providers.AcademiaElementTypes.Departamento_2005);
			types.add(Academia.diagram.providers.AcademiaElementTypes.Campus_2006);
			types.add(Academia.diagram.providers.AcademiaElementTypes.DisciplinaSemestre_2007);
			types.add(Academia.diagram.providers.AcademiaElementTypes.DisciplinaPaga_2008);
			types.add(Academia.diagram.providers.AcademiaElementTypes.DisciplinaGratis_2009);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AClassifierAChilds_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == Academia.diagram.providers.AcademiaElementTypes.AClassifierAChilds_4001) {
			types.add(Academia.diagram.providers.AcademiaElementTypes.AApplication_2001);
			types.add(Academia.diagram.providers.AcademiaElementTypes.Matricula_2002);
			types.add(Academia.diagram.providers.AcademiaElementTypes.Aluno_2003);
			types.add(Academia.diagram.providers.AcademiaElementTypes.Curso_2004);
			types.add(Academia.diagram.providers.AcademiaElementTypes.Departamento_2005);
			types.add(Academia.diagram.providers.AcademiaElementTypes.Campus_2006);
			types.add(Academia.diagram.providers.AcademiaElementTypes.DisciplinaSemestre_2007);
			types.add(Academia.diagram.providers.AcademiaElementTypes.DisciplinaPaga_2008);
			types.add(Academia.diagram.providers.AcademiaElementTypes.DisciplinaGratis_2009);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == Academia.diagram.providers.AcademiaElementTypes.AAttribute_3013) {
				return getChildBySemanticHint(Academia.diagram.part.AcademiaVisualIDRegistry
						.getType(Academia.diagram.edit.parts.CampusAttributesEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class AObjectFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFeatureStereoLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFeatureNameLabel;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureFeaturePropertiesCompartment;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureFeatureOperationsCompartment;

		/**
		 * @generated
		 */
		public AObjectFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutThis.setSpacing(0);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(12)));
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(6),
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(6),
					getMapMode().DPtoLP(2)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure featureInnerArea0 = new RectangleFigure();

			featureInnerArea0.setOutline(false);
			featureInnerArea0.setLineWidth(0);

			this.add(featureInnerArea0);

			ToolbarLayout layoutFeatureInnerArea0 = new ToolbarLayout();
			layoutFeatureInnerArea0.setStretchMinorAxis(true);
			layoutFeatureInnerArea0
					.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutFeatureInnerArea0.setSpacing(0);
			layoutFeatureInnerArea0.setVertical(true);

			featureInnerArea0.setLayoutManager(layoutFeatureInnerArea0);

			RectangleFigure featureStereoArea1 = new RectangleFigure();

			featureStereoArea1.setOutline(false);
			featureStereoArea1.setLineWidth(0);

			featureInnerArea0.add(featureStereoArea1);

			GridLayout layoutFeatureStereoArea1 = new GridLayout();
			layoutFeatureStereoArea1.numColumns = 1;
			layoutFeatureStereoArea1.makeColumnsEqualWidth = true;
			featureStereoArea1.setLayoutManager(layoutFeatureStereoArea1);

			fFigureFeatureStereoLabel = new WrappingLabel();

			fFigureFeatureStereoLabel.setText("");

			fFigureFeatureStereoLabel.setFont(FFIGUREFEATURESTEREOLABEL_FONT);

			GridData constraintFFigureFeatureStereoLabel = new GridData();
			constraintFFigureFeatureStereoLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureFeatureStereoLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureFeatureStereoLabel.horizontalIndent = 0;
			constraintFFigureFeatureStereoLabel.horizontalSpan = 1;
			constraintFFigureFeatureStereoLabel.verticalSpan = 1;
			constraintFFigureFeatureStereoLabel.grabExcessHorizontalSpace = true;
			constraintFFigureFeatureStereoLabel.grabExcessVerticalSpace = true;
			featureStereoArea1.add(fFigureFeatureStereoLabel,
					constraintFFigureFeatureStereoLabel);

			RectangleFigure featureNameArea1 = new RectangleFigure();

			featureNameArea1.setOutline(false);
			featureNameArea1.setLineWidth(0);

			featureInnerArea0.add(featureNameArea1);

			GridLayout layoutFeatureNameArea1 = new GridLayout();
			layoutFeatureNameArea1.numColumns = 1;
			layoutFeatureNameArea1.makeColumnsEqualWidth = true;
			featureNameArea1.setLayoutManager(layoutFeatureNameArea1);

			fFigureFeatureNameLabel = new WrappingLabel();

			fFigureFeatureNameLabel.setText("");

			fFigureFeatureNameLabel.setFont(FFIGUREFEATURENAMELABEL_FONT);

			GridData constraintFFigureFeatureNameLabel = new GridData();
			constraintFFigureFeatureNameLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureFeatureNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureFeatureNameLabel.horizontalIndent = 0;
			constraintFFigureFeatureNameLabel.horizontalSpan = 1;
			constraintFFigureFeatureNameLabel.verticalSpan = 1;
			constraintFFigureFeatureNameLabel.grabExcessHorizontalSpace = true;
			constraintFFigureFeatureNameLabel.grabExcessVerticalSpace = true;
			featureNameArea1.add(fFigureFeatureNameLabel,
					constraintFFigureFeatureNameLabel);

			fFigureFeaturePropertiesCompartment = new RectangleFigure();

			fFigureFeaturePropertiesCompartment.setOutline(false);
			fFigureFeaturePropertiesCompartment.setLineWidth(0);

			this.add(fFigureFeaturePropertiesCompartment);

			StackLayout layoutFFigureFeaturePropertiesCompartment = new StackLayout();
			layoutFFigureFeaturePropertiesCompartment
					.setObserveVisibility(true);
			fFigureFeaturePropertiesCompartment
					.setLayoutManager(layoutFFigureFeaturePropertiesCompartment);

			fFigureFeatureOperationsCompartment = new RectangleFigure();

			fFigureFeatureOperationsCompartment.setOutline(false);
			fFigureFeatureOperationsCompartment.setLineWidth(0);

			this.add(fFigureFeatureOperationsCompartment);

			StackLayout layoutFFigureFeatureOperationsCompartment = new StackLayout();
			layoutFFigureFeatureOperationsCompartment
					.setObserveVisibility(true);
			fFigureFeatureOperationsCompartment
					.setLayoutManager(layoutFFigureFeatureOperationsCompartment);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFeatureStereoLabel() {
			return fFigureFeatureStereoLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFeatureNameLabel() {
			return fFigureFeatureNameLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureFeaturePropertiesCompartment() {
			return fFigureFeaturePropertiesCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureFeatureOperationsCompartment() {
			return fFigureFeatureOperationsCompartment;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREFEATURESTEREOLABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Font FFIGUREFEATURENAMELABEL_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
