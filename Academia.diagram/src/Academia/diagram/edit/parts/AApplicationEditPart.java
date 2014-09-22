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
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class AApplicationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public AApplicationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new Academia.diagram.edit.policies.AApplicationItemSemanticEditPolicy());
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
		return primaryShape = new AApplicationFigure();
	}

	/**
	 * @generated
	 */
	public AApplicationFigure getPrimaryShape() {
		return (AApplicationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Academia.diagram.edit.parts.AApplicationNameEditPart) {
			((Academia.diagram.edit.parts.AApplicationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureAppNameLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Academia.diagram.edit.parts.AApplicationNameEditPart) {
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(80, 40);
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
				.getType(Academia.diagram.edit.parts.AApplicationNameEditPart.VISUAL_ID));
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
	public class AApplicationFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAppNameLabel;

		/**
		 * @generated
		 */
		public AApplicationFigure() {

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

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(6),
					getMapMode().DPtoLP(2)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure appNameArea0 = new RectangleFigure();

			appNameArea0.setOutline(false);
			appNameArea0.setLineWidth(0);

			this.add(appNameArea0);

			GridLayout layoutAppNameArea0 = new GridLayout();
			layoutAppNameArea0.numColumns = 1;
			layoutAppNameArea0.makeColumnsEqualWidth = true;
			appNameArea0.setLayoutManager(layoutAppNameArea0);

			fFigureAppNameLabel = new WrappingLabel();

			fFigureAppNameLabel.setText("");

			fFigureAppNameLabel.setFont(FFIGUREAPPNAMELABEL_FONT);

			GridData constraintFFigureAppNameLabel = new GridData();
			constraintFFigureAppNameLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureAppNameLabel.horizontalAlignment = GridData.CENTER;
			constraintFFigureAppNameLabel.horizontalIndent = 0;
			constraintFFigureAppNameLabel.horizontalSpan = 1;
			constraintFFigureAppNameLabel.verticalSpan = 1;
			constraintFFigureAppNameLabel.grabExcessHorizontalSpace = true;
			constraintFFigureAppNameLabel.grabExcessVerticalSpace = true;
			appNameArea0
					.add(fFigureAppNameLabel, constraintFFigureAppNameLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAppNameLabel() {
			return fFigureAppNameLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREAPPNAMELABEL_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9,
			SWT.BOLD);

}
