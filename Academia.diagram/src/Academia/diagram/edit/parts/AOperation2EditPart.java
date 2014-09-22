package Academia.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class AOperation2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3005;

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
	public AOperation2EditPart(View view) {
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
				new Academia.diagram.edit.policies.AOperation2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new Academia.diagram.edit.policies.AOperation2CanonicalEditPolicy());
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
		return primaryShape = new AOperationFigure();
	}

	/**
	 * @generated
	 */
	public AOperationFigure getPrimaryShape() {
		return (AOperationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Academia.diagram.edit.parts.AOperationName2EditPart) {
			((Academia.diagram.edit.parts.AOperationName2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureOperationNameLabel());
			return true;
		}
		if (childEditPart instanceof Academia.diagram.edit.parts.WrappingLabel2EditPart) {
			((Academia.diagram.edit.parts.WrappingLabel2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureOperationOpenParenthesesLabel());
			return true;
		}
		if (childEditPart instanceof Academia.diagram.edit.parts.AOperationTypeName2EditPart) {
			((Academia.diagram.edit.parts.AOperationTypeName2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureOperationCloseParenthesesLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Academia.diagram.edit.parts.AOperationName2EditPart) {
			return true;
		}
		if (childEditPart instanceof Academia.diagram.edit.parts.WrappingLabel2EditPart) {
			return true;
		}
		if (childEditPart instanceof Academia.diagram.edit.parts.AOperationTypeName2EditPart) {
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
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(30, 15);
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
				.getType(Academia.diagram.edit.parts.AOperationName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class AOperationFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureOperationNameLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOperationOpenParenthesesLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOperationCloseParenthesesLabel;

		/**
		 * @generated
		 */
		public AOperationFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutThis.setSpacing(0);
			layoutThis.setVertical(false);

			this.setLayoutManager(layoutThis);

			this.setOutline(false);
			this.setLineWidth(0);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure operationNameArea0 = new RectangleFigure();

			operationNameArea0.setOutline(false);
			operationNameArea0.setLineWidth(0);

			this.add(operationNameArea0);

			ToolbarLayout layoutOperationNameArea0 = new ToolbarLayout();
			layoutOperationNameArea0.setStretchMinorAxis(true);
			layoutOperationNameArea0
					.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutOperationNameArea0.setSpacing(0);
			layoutOperationNameArea0.setVertical(false);

			operationNameArea0.setLayoutManager(layoutOperationNameArea0);

			fFigureOperationNameLabel = new WrappingLabel();

			fFigureOperationNameLabel.setText("");

			operationNameArea0.add(fFigureOperationNameLabel);

			RectangleFigure operationOpenParenthesesArea0 = new RectangleFigure();

			operationOpenParenthesesArea0.setOutline(false);
			operationOpenParenthesesArea0.setLineWidth(0);

			this.add(operationOpenParenthesesArea0);

			ToolbarLayout layoutOperationOpenParenthesesArea0 = new ToolbarLayout();
			layoutOperationOpenParenthesesArea0.setStretchMinorAxis(true);
			layoutOperationOpenParenthesesArea0
					.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutOperationOpenParenthesesArea0.setSpacing(0);
			layoutOperationOpenParenthesesArea0.setVertical(false);

			operationOpenParenthesesArea0
					.setLayoutManager(layoutOperationOpenParenthesesArea0);

			fFigureOperationOpenParenthesesLabel = new WrappingLabel();

			fFigureOperationOpenParenthesesLabel.setText("(");

			operationOpenParenthesesArea0
					.add(fFigureOperationOpenParenthesesLabel);

			RectangleFigure operationCloseParenthesesArea0 = new RectangleFigure();

			operationCloseParenthesesArea0.setOutline(false);
			operationCloseParenthesesArea0.setLineWidth(0);

			this.add(operationCloseParenthesesArea0);

			ToolbarLayout layoutOperationCloseParenthesesArea0 = new ToolbarLayout();
			layoutOperationCloseParenthesesArea0.setStretchMinorAxis(true);
			layoutOperationCloseParenthesesArea0
					.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutOperationCloseParenthesesArea0.setSpacing(0);
			layoutOperationCloseParenthesesArea0.setVertical(false);

			operationCloseParenthesesArea0
					.setLayoutManager(layoutOperationCloseParenthesesArea0);

			fFigureOperationCloseParenthesesLabel = new WrappingLabel();

			fFigureOperationCloseParenthesesLabel.setText("");

			operationCloseParenthesesArea0
					.add(fFigureOperationCloseParenthesesLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOperationNameLabel() {
			return fFigureOperationNameLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOperationOpenParenthesesLabel() {
			return fFigureOperationOpenParenthesesLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOperationCloseParenthesesLabel() {
			return fFigureOperationCloseParenthesesLabel;
		}

	}

}
