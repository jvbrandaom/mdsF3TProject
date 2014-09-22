package Academia.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class AcademiaNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public AcademiaNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<Academia.diagram.navigator.AcademiaNavigatorItem> result = new ArrayList<Academia.diagram.navigator.AcademiaNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							Academia.diagram.edit.parts.APackageEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof Academia.diagram.navigator.AcademiaNavigatorGroup) {
			Academia.diagram.navigator.AcademiaNavigatorGroup group = (Academia.diagram.navigator.AcademiaNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof Academia.diagram.navigator.AcademiaNavigatorItem) {
			Academia.diagram.navigator.AcademiaNavigatorItem navigatorItem = (Academia.diagram.navigator.AcademiaNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (Academia.diagram.part.AcademiaVisualIDRegistry
				.getVisualID(view)) {

		case Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Academia.diagram.navigator.AcademiaNavigatorGroup incominglinks = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_DisciplinaGratis_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Academia.diagram.navigator.AcademiaNavigatorGroup outgoinglinks = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_DisciplinaGratis_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DisciplinaGratisAttributesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AAttribute8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DisciplinaGratisOperationsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AParameter6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Academia.diagram.navigator.AcademiaNavigatorGroup incominglinks = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_Curso_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Academia.diagram.navigator.AcademiaNavigatorGroup outgoinglinks = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_Curso_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.CursoAttributesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AAttribute3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.CursoOperationsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Academia.diagram.navigator.AcademiaNavigatorGroup target = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_AClassifierAChilds_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Academia.diagram.navigator.AcademiaNavigatorGroup source = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_AClassifierAChilds_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AParameter3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Academia.diagram.navigator.AcademiaNavigatorGroup outgoinglinks = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_AApplication_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Academia.diagram.navigator.AcademiaNavigatorGroup incominglinks = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_Matricula_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Academia.diagram.navigator.AcademiaNavigatorGroup outgoinglinks = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_Matricula_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.MatriculaAttributesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.MatriculaOperationsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AParameter2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Academia.diagram.navigator.AcademiaNavigatorGroup incominglinks = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_Aluno_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Academia.diagram.navigator.AcademiaNavigatorGroup outgoinglinks = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_Aluno_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AlunoAttributesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AAttribute2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AlunoOperationsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Academia.diagram.navigator.AcademiaNavigatorGroup incominglinks = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_Campus_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Academia.diagram.navigator.AcademiaNavigatorGroup outgoinglinks = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_Campus_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.CampusAttributesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AAttribute5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.CampusOperationsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AParameter8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Academia.diagram.navigator.AcademiaNavigatorGroup incominglinks = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_DisciplinaSemestre_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Academia.diagram.navigator.AcademiaNavigatorGroup outgoinglinks = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_DisciplinaSemestre_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DisciplinaSemestreAttributesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AAttribute6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DisciplinaSemestreOperationsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Academia.diagram.edit.parts.APackageEditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			Academia.diagram.navigator.AcademiaNavigatorGroup links = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_APackage_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AParameter5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Academia.diagram.navigator.AcademiaNavigatorGroup incominglinks = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_Departamento_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Academia.diagram.navigator.AcademiaNavigatorGroup outgoinglinks = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_Departamento_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DepartamentoAttributesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AAttribute4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DepartamentoOperationsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AParameter7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Academia.diagram.navigator.AcademiaNavigatorGroup incominglinks = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_DisciplinaPaga_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Academia.diagram.navigator.AcademiaNavigatorGroup outgoinglinks = new Academia.diagram.navigator.AcademiaNavigatorGroup(
					Academia.diagram.part.Messages.NavigatorGroupName_DisciplinaPaga_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DisciplinaPagaAttributesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AAttribute7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.DisciplinaPagaOperationsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID: {
			LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem> result = new LinkedList<Academia.diagram.navigator.AcademiaAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Academia.diagram.part.AcademiaVisualIDRegistry
							.getType(Academia.diagram.edit.parts.AParameter4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return Academia.diagram.edit.parts.APackageEditPart.MODEL_ID
				.equals(Academia.diagram.part.AcademiaVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<Academia.diagram.navigator.AcademiaNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<Academia.diagram.navigator.AcademiaNavigatorItem> result = new ArrayList<Academia.diagram.navigator.AcademiaNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new Academia.diagram.navigator.AcademiaNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof Academia.diagram.navigator.AcademiaAbstractNavigatorItem) {
			Academia.diagram.navigator.AcademiaAbstractNavigatorItem abstractNavigatorItem = (Academia.diagram.navigator.AcademiaAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
