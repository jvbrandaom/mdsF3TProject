package Academia.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class AcademiaModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof Academia.diagram.edit.parts.APackageEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(9);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AApplication_2001);
			types.add(Academia.diagram.providers.AcademiaElementTypes.Matricula_2002);
			types.add(Academia.diagram.providers.AcademiaElementTypes.Aluno_2003);
			types.add(Academia.diagram.providers.AcademiaElementTypes.Curso_2004);
			types.add(Academia.diagram.providers.AcademiaElementTypes.Departamento_2005);
			types.add(Academia.diagram.providers.AcademiaElementTypes.Campus_2006);
			types.add(Academia.diagram.providers.AcademiaElementTypes.DisciplinaSemestre_2007);
			types.add(Academia.diagram.providers.AcademiaElementTypes.DisciplinaPaga_2008);
			types.add(Academia.diagram.providers.AcademiaElementTypes.DisciplinaGratis_2009);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.MatriculaEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AAttribute_3001);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.AlunoEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AAttribute_3004);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.CursoEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AAttribute_3007);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.DepartamentoEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AAttribute_3010);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.CampusEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AAttribute_3013);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.DisciplinaSemestreEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AAttribute_3016);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.DisciplinaPagaEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AAttribute_3019);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.DisciplinaGratisEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AAttribute_3022);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.AOperationEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AParameter_3003);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.AOperation2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AParameter_3006);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.AOperation3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AParameter_3009);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.AOperation4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AParameter_3012);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.AOperation5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AParameter_3015);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.AOperation6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AParameter_3018);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.AOperation7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AParameter_3021);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.AOperation8EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AParameter_3024);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.MatriculaOperationsEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AOperation_3002);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.AlunoOperationsEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AOperation_3005);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.CursoOperationsEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AOperation_3008);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.DepartamentoOperationsEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AOperation_3011);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.CampusOperationsEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AOperation_3014);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.DisciplinaSemestreOperationsEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AOperation_3017);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.DisciplinaPagaOperationsEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AOperation_3020);
			return types;
		}
		if (editPart instanceof Academia.diagram.edit.parts.DisciplinaGratisOperationsEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(Academia.diagram.providers.AcademiaElementTypes.AOperation_3023);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof Academia.diagram.edit.parts.AApplicationEditPart) {
			return ((Academia.diagram.edit.parts.AApplicationEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.MatriculaEditPart) {
			return ((Academia.diagram.edit.parts.MatriculaEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.AlunoEditPart) {
			return ((Academia.diagram.edit.parts.AlunoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.CursoEditPart) {
			return ((Academia.diagram.edit.parts.CursoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.DepartamentoEditPart) {
			return ((Academia.diagram.edit.parts.DepartamentoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.CampusEditPart) {
			return ((Academia.diagram.edit.parts.CampusEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.DisciplinaSemestreEditPart) {
			return ((Academia.diagram.edit.parts.DisciplinaSemestreEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.DisciplinaPagaEditPart) {
			return ((Academia.diagram.edit.parts.DisciplinaPagaEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.DisciplinaGratisEditPart) {
			return ((Academia.diagram.edit.parts.DisciplinaGratisEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof Academia.diagram.edit.parts.MatriculaEditPart) {
			return ((Academia.diagram.edit.parts.MatriculaEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.AlunoEditPart) {
			return ((Academia.diagram.edit.parts.AlunoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.CursoEditPart) {
			return ((Academia.diagram.edit.parts.CursoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.DepartamentoEditPart) {
			return ((Academia.diagram.edit.parts.DepartamentoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.CampusEditPart) {
			return ((Academia.diagram.edit.parts.CampusEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.DisciplinaSemestreEditPart) {
			return ((Academia.diagram.edit.parts.DisciplinaSemestreEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.DisciplinaPagaEditPart) {
			return ((Academia.diagram.edit.parts.DisciplinaPagaEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.DisciplinaGratisEditPart) {
			return ((Academia.diagram.edit.parts.DisciplinaGratisEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof Academia.diagram.edit.parts.AApplicationEditPart) {
			return ((Academia.diagram.edit.parts.AApplicationEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.MatriculaEditPart) {
			return ((Academia.diagram.edit.parts.MatriculaEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.AlunoEditPart) {
			return ((Academia.diagram.edit.parts.AlunoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.CursoEditPart) {
			return ((Academia.diagram.edit.parts.CursoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.DepartamentoEditPart) {
			return ((Academia.diagram.edit.parts.DepartamentoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.CampusEditPart) {
			return ((Academia.diagram.edit.parts.CampusEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.DisciplinaSemestreEditPart) {
			return ((Academia.diagram.edit.parts.DisciplinaSemestreEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.DisciplinaPagaEditPart) {
			return ((Academia.diagram.edit.parts.DisciplinaPagaEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.DisciplinaGratisEditPart) {
			return ((Academia.diagram.edit.parts.DisciplinaGratisEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof Academia.diagram.edit.parts.MatriculaEditPart) {
			return ((Academia.diagram.edit.parts.MatriculaEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.AlunoEditPart) {
			return ((Academia.diagram.edit.parts.AlunoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.CursoEditPart) {
			return ((Academia.diagram.edit.parts.CursoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.DepartamentoEditPart) {
			return ((Academia.diagram.edit.parts.DepartamentoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.CampusEditPart) {
			return ((Academia.diagram.edit.parts.CampusEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.DisciplinaSemestreEditPart) {
			return ((Academia.diagram.edit.parts.DisciplinaSemestreEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.DisciplinaPagaEditPart) {
			return ((Academia.diagram.edit.parts.DisciplinaPagaEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Academia.diagram.edit.parts.DisciplinaGratisEditPart) {
			return ((Academia.diagram.edit.parts.DisciplinaGratisEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof Academia.diagram.edit.parts.AApplicationEditPart) {
			return ((Academia.diagram.edit.parts.AApplicationEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.MatriculaEditPart) {
			return ((Academia.diagram.edit.parts.MatriculaEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.AlunoEditPart) {
			return ((Academia.diagram.edit.parts.AlunoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.CursoEditPart) {
			return ((Academia.diagram.edit.parts.CursoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.DepartamentoEditPart) {
			return ((Academia.diagram.edit.parts.DepartamentoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.CampusEditPart) {
			return ((Academia.diagram.edit.parts.CampusEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.DisciplinaSemestreEditPart) {
			return ((Academia.diagram.edit.parts.DisciplinaSemestreEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.DisciplinaPagaEditPart) {
			return ((Academia.diagram.edit.parts.DisciplinaPagaEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Academia.diagram.edit.parts.DisciplinaGratisEditPart) {
			return ((Academia.diagram.edit.parts.DisciplinaGratisEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				Academia.diagram.part.AcademiaDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Academia.diagram.part.Messages.AcademiaModelingAssistantProviderMessage);
		dialog.setTitle(Academia.diagram.part.Messages.AcademiaModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
