package Academia.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class AcademiaDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getSemanticChildren(
			View view) {
		switch (Academia.diagram.part.AcademiaVisualIDRegistry
				.getVisualID(view)) {
		case Academia.diagram.edit.parts.APackageEditPart.VISUAL_ID:
			return getAPackage_1000SemanticChildren(view);
		case Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID:
			return getAOperation_3002SemanticChildren(view);
		case Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID:
			return getAOperation_3005SemanticChildren(view);
		case Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID:
			return getAOperation_3008SemanticChildren(view);
		case Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID:
			return getAOperation_3011SemanticChildren(view);
		case Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID:
			return getAOperation_3014SemanticChildren(view);
		case Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID:
			return getAOperation_3017SemanticChildren(view);
		case Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID:
			return getAOperation_3020SemanticChildren(view);
		case Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID:
			return getAOperation_3023SemanticChildren(view);
		case Academia.diagram.edit.parts.MatriculaAttributesEditPart.VISUAL_ID:
			return getMatriculaAttributes_7001SemanticChildren(view);
		case Academia.diagram.edit.parts.MatriculaOperationsEditPart.VISUAL_ID:
			return getMatriculaOperations_7002SemanticChildren(view);
		case Academia.diagram.edit.parts.AlunoAttributesEditPart.VISUAL_ID:
			return getAlunoAttributes_7003SemanticChildren(view);
		case Academia.diagram.edit.parts.AlunoOperationsEditPart.VISUAL_ID:
			return getAlunoOperations_7004SemanticChildren(view);
		case Academia.diagram.edit.parts.CursoAttributesEditPart.VISUAL_ID:
			return getCursoAttributes_7005SemanticChildren(view);
		case Academia.diagram.edit.parts.CursoOperationsEditPart.VISUAL_ID:
			return getCursoOperations_7006SemanticChildren(view);
		case Academia.diagram.edit.parts.DepartamentoAttributesEditPart.VISUAL_ID:
			return getDepartamentoAttributes_7007SemanticChildren(view);
		case Academia.diagram.edit.parts.DepartamentoOperationsEditPart.VISUAL_ID:
			return getDepartamentoOperations_7008SemanticChildren(view);
		case Academia.diagram.edit.parts.CampusAttributesEditPart.VISUAL_ID:
			return getCampusAttributes_7009SemanticChildren(view);
		case Academia.diagram.edit.parts.CampusOperationsEditPart.VISUAL_ID:
			return getCampusOperations_7010SemanticChildren(view);
		case Academia.diagram.edit.parts.DisciplinaSemestreAttributesEditPart.VISUAL_ID:
			return getDisciplinaSemestreAttributes_7011SemanticChildren(view);
		case Academia.diagram.edit.parts.DisciplinaSemestreOperationsEditPart.VISUAL_ID:
			return getDisciplinaSemestreOperations_7012SemanticChildren(view);
		case Academia.diagram.edit.parts.DisciplinaPagaAttributesEditPart.VISUAL_ID:
			return getDisciplinaPagaAttributes_7013SemanticChildren(view);
		case Academia.diagram.edit.parts.DisciplinaPagaOperationsEditPart.VISUAL_ID:
			return getDisciplinaPagaOperations_7014SemanticChildren(view);
		case Academia.diagram.edit.parts.DisciplinaGratisAttributesEditPart.VISUAL_ID:
			return getDisciplinaGratisAttributes_7015SemanticChildren(view);
		case Academia.diagram.edit.parts.DisciplinaGratisOperationsEditPart.VISUAL_ID:
			return getDisciplinaGratisOperations_7016SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getAPackage_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.APackage modelElement = (Academia.APackage) view.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAClassifiers().iterator(); it
				.hasNext();) {
			Academia.AClassifier childElement = (Academia.AClassifier) it
					.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getAOperation_3002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.AOperation modelElement = (Academia.AOperation) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAParameters().iterator(); it
				.hasNext();) {
			Academia.AParameter childElement = (Academia.AParameter) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AParameterEditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getAOperation_3005SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.AOperation modelElement = (Academia.AOperation) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAParameters().iterator(); it
				.hasNext();) {
			Academia.AParameter childElement = (Academia.AParameter) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AParameter2EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getAOperation_3008SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.AOperation modelElement = (Academia.AOperation) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAParameters().iterator(); it
				.hasNext();) {
			Academia.AParameter childElement = (Academia.AParameter) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AParameter3EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getAOperation_3011SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.AOperation modelElement = (Academia.AOperation) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAParameters().iterator(); it
				.hasNext();) {
			Academia.AParameter childElement = (Academia.AParameter) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AParameter4EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getAOperation_3014SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.AOperation modelElement = (Academia.AOperation) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAParameters().iterator(); it
				.hasNext();) {
			Academia.AParameter childElement = (Academia.AParameter) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AParameter5EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getAOperation_3017SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.AOperation modelElement = (Academia.AOperation) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAParameters().iterator(); it
				.hasNext();) {
			Academia.AParameter childElement = (Academia.AParameter) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AParameter6EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getAOperation_3020SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.AOperation modelElement = (Academia.AOperation) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAParameters().iterator(); it
				.hasNext();) {
			Academia.AParameter childElement = (Academia.AParameter) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AParameter7EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getAOperation_3023SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.AOperation modelElement = (Academia.AOperation) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAParameters().iterator(); it
				.hasNext();) {
			Academia.AParameter childElement = (Academia.AParameter) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AParameter8EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getMatriculaAttributes_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.Matricula modelElement = (Academia.Matricula) containerView
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAAttributes().iterator(); it
				.hasNext();) {
			Academia.AAttribute childElement = (Academia.AAttribute) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AAttributeEditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getMatriculaOperations_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.Matricula modelElement = (Academia.Matricula) containerView
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAOperations().iterator(); it
				.hasNext();) {
			Academia.AOperation childElement = (Academia.AOperation) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getAlunoAttributes_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.Aluno modelElement = (Academia.Aluno) containerView
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAAttributes().iterator(); it
				.hasNext();) {
			Academia.AAttribute childElement = (Academia.AAttribute) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AAttribute2EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getAlunoOperations_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.Aluno modelElement = (Academia.Aluno) containerView
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAOperations().iterator(); it
				.hasNext();) {
			Academia.AOperation childElement = (Academia.AOperation) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getCursoAttributes_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.Curso modelElement = (Academia.Curso) containerView
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAAttributes().iterator(); it
				.hasNext();) {
			Academia.AAttribute childElement = (Academia.AAttribute) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AAttribute3EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getCursoOperations_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.Curso modelElement = (Academia.Curso) containerView
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAOperations().iterator(); it
				.hasNext();) {
			Academia.AOperation childElement = (Academia.AOperation) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getDepartamentoAttributes_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.Departamento modelElement = (Academia.Departamento) containerView
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAAttributes().iterator(); it
				.hasNext();) {
			Academia.AAttribute childElement = (Academia.AAttribute) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AAttribute4EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getDepartamentoOperations_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.Departamento modelElement = (Academia.Departamento) containerView
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAOperations().iterator(); it
				.hasNext();) {
			Academia.AOperation childElement = (Academia.AOperation) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getCampusAttributes_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.Campus modelElement = (Academia.Campus) containerView
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAAttributes().iterator(); it
				.hasNext();) {
			Academia.AAttribute childElement = (Academia.AAttribute) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AAttribute5EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getCampusOperations_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.Campus modelElement = (Academia.Campus) containerView
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAOperations().iterator(); it
				.hasNext();) {
			Academia.AOperation childElement = (Academia.AOperation) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getDisciplinaSemestreAttributes_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.DisciplinaSemestre modelElement = (Academia.DisciplinaSemestre) containerView
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAAttributes().iterator(); it
				.hasNext();) {
			Academia.AAttribute childElement = (Academia.AAttribute) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AAttribute6EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getDisciplinaSemestreOperations_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.DisciplinaSemestre modelElement = (Academia.DisciplinaSemestre) containerView
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAOperations().iterator(); it
				.hasNext();) {
			Academia.AOperation childElement = (Academia.AOperation) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getDisciplinaPagaAttributes_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.DisciplinaPaga modelElement = (Academia.DisciplinaPaga) containerView
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAAttributes().iterator(); it
				.hasNext();) {
			Academia.AAttribute childElement = (Academia.AAttribute) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AAttribute7EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getDisciplinaPagaOperations_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.DisciplinaPaga modelElement = (Academia.DisciplinaPaga) containerView
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAOperations().iterator(); it
				.hasNext();) {
			Academia.AOperation childElement = (Academia.AOperation) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getDisciplinaGratisAttributes_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.DisciplinaGratis modelElement = (Academia.DisciplinaGratis) containerView
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAAttributes().iterator(); it
				.hasNext();) {
			Academia.AAttribute childElement = (Academia.AAttribute) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AAttribute8EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaNodeDescriptor> getDisciplinaGratisOperations_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Academia.DisciplinaGratis modelElement = (Academia.DisciplinaGratis) containerView
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaNodeDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAOperations().iterator(); it
				.hasNext();) {
			Academia.AOperation childElement = (Academia.AOperation) it.next();
			int visualID = Academia.diagram.part.AcademiaVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID) {
				result.add(new Academia.diagram.part.AcademiaNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getContainedLinks(
			View view) {
		switch (Academia.diagram.part.AcademiaVisualIDRegistry
				.getVisualID(view)) {
		case Academia.diagram.edit.parts.APackageEditPart.VISUAL_ID:
			return getAPackage_1000ContainedLinks(view);
		case Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID:
			return getAApplication_2001ContainedLinks(view);
		case Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID:
			return getMatricula_2002ContainedLinks(view);
		case Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID:
			return getAluno_2003ContainedLinks(view);
		case Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID:
			return getCurso_2004ContainedLinks(view);
		case Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID:
			return getDepartamento_2005ContainedLinks(view);
		case Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID:
			return getCampus_2006ContainedLinks(view);
		case Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID:
			return getDisciplinaSemestre_2007ContainedLinks(view);
		case Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID:
			return getDisciplinaPaga_2008ContainedLinks(view);
		case Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID:
			return getDisciplinaGratis_2009ContainedLinks(view);
		case Academia.diagram.edit.parts.AAttributeEditPart.VISUAL_ID:
			return getAAttribute_3001ContainedLinks(view);
		case Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID:
			return getAOperation_3002ContainedLinks(view);
		case Academia.diagram.edit.parts.AParameterEditPart.VISUAL_ID:
			return getAParameter_3003ContainedLinks(view);
		case Academia.diagram.edit.parts.AAttribute2EditPart.VISUAL_ID:
			return getAAttribute_3004ContainedLinks(view);
		case Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID:
			return getAOperation_3005ContainedLinks(view);
		case Academia.diagram.edit.parts.AParameter2EditPart.VISUAL_ID:
			return getAParameter_3006ContainedLinks(view);
		case Academia.diagram.edit.parts.AAttribute3EditPart.VISUAL_ID:
			return getAAttribute_3007ContainedLinks(view);
		case Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID:
			return getAOperation_3008ContainedLinks(view);
		case Academia.diagram.edit.parts.AParameter3EditPart.VISUAL_ID:
			return getAParameter_3009ContainedLinks(view);
		case Academia.diagram.edit.parts.AAttribute4EditPart.VISUAL_ID:
			return getAAttribute_3010ContainedLinks(view);
		case Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID:
			return getAOperation_3011ContainedLinks(view);
		case Academia.diagram.edit.parts.AParameter4EditPart.VISUAL_ID:
			return getAParameter_3012ContainedLinks(view);
		case Academia.diagram.edit.parts.AAttribute5EditPart.VISUAL_ID:
			return getAAttribute_3013ContainedLinks(view);
		case Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID:
			return getAOperation_3014ContainedLinks(view);
		case Academia.diagram.edit.parts.AParameter5EditPart.VISUAL_ID:
			return getAParameter_3015ContainedLinks(view);
		case Academia.diagram.edit.parts.AAttribute6EditPart.VISUAL_ID:
			return getAAttribute_3016ContainedLinks(view);
		case Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID:
			return getAOperation_3017ContainedLinks(view);
		case Academia.diagram.edit.parts.AParameter6EditPart.VISUAL_ID:
			return getAParameter_3018ContainedLinks(view);
		case Academia.diagram.edit.parts.AAttribute7EditPart.VISUAL_ID:
			return getAAttribute_3019ContainedLinks(view);
		case Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID:
			return getAOperation_3020ContainedLinks(view);
		case Academia.diagram.edit.parts.AParameter7EditPart.VISUAL_ID:
			return getAParameter_3021ContainedLinks(view);
		case Academia.diagram.edit.parts.AAttribute8EditPart.VISUAL_ID:
			return getAAttribute_3022ContainedLinks(view);
		case Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID:
			return getAOperation_3023ContainedLinks(view);
		case Academia.diagram.edit.parts.AParameter8EditPart.VISUAL_ID:
			return getAParameter_3024ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getIncomingLinks(
			View view) {
		switch (Academia.diagram.part.AcademiaVisualIDRegistry
				.getVisualID(view)) {
		case Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID:
			return getAApplication_2001IncomingLinks(view);
		case Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID:
			return getMatricula_2002IncomingLinks(view);
		case Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID:
			return getAluno_2003IncomingLinks(view);
		case Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID:
			return getCurso_2004IncomingLinks(view);
		case Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID:
			return getDepartamento_2005IncomingLinks(view);
		case Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID:
			return getCampus_2006IncomingLinks(view);
		case Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID:
			return getDisciplinaSemestre_2007IncomingLinks(view);
		case Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID:
			return getDisciplinaPaga_2008IncomingLinks(view);
		case Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID:
			return getDisciplinaGratis_2009IncomingLinks(view);
		case Academia.diagram.edit.parts.AAttributeEditPart.VISUAL_ID:
			return getAAttribute_3001IncomingLinks(view);
		case Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID:
			return getAOperation_3002IncomingLinks(view);
		case Academia.diagram.edit.parts.AParameterEditPart.VISUAL_ID:
			return getAParameter_3003IncomingLinks(view);
		case Academia.diagram.edit.parts.AAttribute2EditPart.VISUAL_ID:
			return getAAttribute_3004IncomingLinks(view);
		case Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID:
			return getAOperation_3005IncomingLinks(view);
		case Academia.diagram.edit.parts.AParameter2EditPart.VISUAL_ID:
			return getAParameter_3006IncomingLinks(view);
		case Academia.diagram.edit.parts.AAttribute3EditPart.VISUAL_ID:
			return getAAttribute_3007IncomingLinks(view);
		case Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID:
			return getAOperation_3008IncomingLinks(view);
		case Academia.diagram.edit.parts.AParameter3EditPart.VISUAL_ID:
			return getAParameter_3009IncomingLinks(view);
		case Academia.diagram.edit.parts.AAttribute4EditPart.VISUAL_ID:
			return getAAttribute_3010IncomingLinks(view);
		case Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID:
			return getAOperation_3011IncomingLinks(view);
		case Academia.diagram.edit.parts.AParameter4EditPart.VISUAL_ID:
			return getAParameter_3012IncomingLinks(view);
		case Academia.diagram.edit.parts.AAttribute5EditPart.VISUAL_ID:
			return getAAttribute_3013IncomingLinks(view);
		case Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID:
			return getAOperation_3014IncomingLinks(view);
		case Academia.diagram.edit.parts.AParameter5EditPart.VISUAL_ID:
			return getAParameter_3015IncomingLinks(view);
		case Academia.diagram.edit.parts.AAttribute6EditPart.VISUAL_ID:
			return getAAttribute_3016IncomingLinks(view);
		case Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID:
			return getAOperation_3017IncomingLinks(view);
		case Academia.diagram.edit.parts.AParameter6EditPart.VISUAL_ID:
			return getAParameter_3018IncomingLinks(view);
		case Academia.diagram.edit.parts.AAttribute7EditPart.VISUAL_ID:
			return getAAttribute_3019IncomingLinks(view);
		case Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID:
			return getAOperation_3020IncomingLinks(view);
		case Academia.diagram.edit.parts.AParameter7EditPart.VISUAL_ID:
			return getAParameter_3021IncomingLinks(view);
		case Academia.diagram.edit.parts.AAttribute8EditPart.VISUAL_ID:
			return getAAttribute_3022IncomingLinks(view);
		case Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID:
			return getAOperation_3023IncomingLinks(view);
		case Academia.diagram.edit.parts.AParameter8EditPart.VISUAL_ID:
			return getAParameter_3024IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (Academia.diagram.part.AcademiaVisualIDRegistry
				.getVisualID(view)) {
		case Academia.diagram.edit.parts.AApplicationEditPart.VISUAL_ID:
			return getAApplication_2001OutgoingLinks(view);
		case Academia.diagram.edit.parts.MatriculaEditPart.VISUAL_ID:
			return getMatricula_2002OutgoingLinks(view);
		case Academia.diagram.edit.parts.AlunoEditPart.VISUAL_ID:
			return getAluno_2003OutgoingLinks(view);
		case Academia.diagram.edit.parts.CursoEditPart.VISUAL_ID:
			return getCurso_2004OutgoingLinks(view);
		case Academia.diagram.edit.parts.DepartamentoEditPart.VISUAL_ID:
			return getDepartamento_2005OutgoingLinks(view);
		case Academia.diagram.edit.parts.CampusEditPart.VISUAL_ID:
			return getCampus_2006OutgoingLinks(view);
		case Academia.diagram.edit.parts.DisciplinaSemestreEditPart.VISUAL_ID:
			return getDisciplinaSemestre_2007OutgoingLinks(view);
		case Academia.diagram.edit.parts.DisciplinaPagaEditPart.VISUAL_ID:
			return getDisciplinaPaga_2008OutgoingLinks(view);
		case Academia.diagram.edit.parts.DisciplinaGratisEditPart.VISUAL_ID:
			return getDisciplinaGratis_2009OutgoingLinks(view);
		case Academia.diagram.edit.parts.AAttributeEditPart.VISUAL_ID:
			return getAAttribute_3001OutgoingLinks(view);
		case Academia.diagram.edit.parts.AOperationEditPart.VISUAL_ID:
			return getAOperation_3002OutgoingLinks(view);
		case Academia.diagram.edit.parts.AParameterEditPart.VISUAL_ID:
			return getAParameter_3003OutgoingLinks(view);
		case Academia.diagram.edit.parts.AAttribute2EditPart.VISUAL_ID:
			return getAAttribute_3004OutgoingLinks(view);
		case Academia.diagram.edit.parts.AOperation2EditPart.VISUAL_ID:
			return getAOperation_3005OutgoingLinks(view);
		case Academia.diagram.edit.parts.AParameter2EditPart.VISUAL_ID:
			return getAParameter_3006OutgoingLinks(view);
		case Academia.diagram.edit.parts.AAttribute3EditPart.VISUAL_ID:
			return getAAttribute_3007OutgoingLinks(view);
		case Academia.diagram.edit.parts.AOperation3EditPart.VISUAL_ID:
			return getAOperation_3008OutgoingLinks(view);
		case Academia.diagram.edit.parts.AParameter3EditPart.VISUAL_ID:
			return getAParameter_3009OutgoingLinks(view);
		case Academia.diagram.edit.parts.AAttribute4EditPart.VISUAL_ID:
			return getAAttribute_3010OutgoingLinks(view);
		case Academia.diagram.edit.parts.AOperation4EditPart.VISUAL_ID:
			return getAOperation_3011OutgoingLinks(view);
		case Academia.diagram.edit.parts.AParameter4EditPart.VISUAL_ID:
			return getAParameter_3012OutgoingLinks(view);
		case Academia.diagram.edit.parts.AAttribute5EditPart.VISUAL_ID:
			return getAAttribute_3013OutgoingLinks(view);
		case Academia.diagram.edit.parts.AOperation5EditPart.VISUAL_ID:
			return getAOperation_3014OutgoingLinks(view);
		case Academia.diagram.edit.parts.AParameter5EditPart.VISUAL_ID:
			return getAParameter_3015OutgoingLinks(view);
		case Academia.diagram.edit.parts.AAttribute6EditPart.VISUAL_ID:
			return getAAttribute_3016OutgoingLinks(view);
		case Academia.diagram.edit.parts.AOperation6EditPart.VISUAL_ID:
			return getAOperation_3017OutgoingLinks(view);
		case Academia.diagram.edit.parts.AParameter6EditPart.VISUAL_ID:
			return getAParameter_3018OutgoingLinks(view);
		case Academia.diagram.edit.parts.AAttribute7EditPart.VISUAL_ID:
			return getAAttribute_3019OutgoingLinks(view);
		case Academia.diagram.edit.parts.AOperation7EditPart.VISUAL_ID:
			return getAOperation_3020OutgoingLinks(view);
		case Academia.diagram.edit.parts.AParameter7EditPart.VISUAL_ID:
			return getAParameter_3021OutgoingLinks(view);
		case Academia.diagram.edit.parts.AAttribute8EditPart.VISUAL_ID:
			return getAAttribute_3022OutgoingLinks(view);
		case Academia.diagram.edit.parts.AOperation8EditPart.VISUAL_ID:
			return getAOperation_3023OutgoingLinks(view);
		case Academia.diagram.edit.parts.AParameter8EditPart.VISUAL_ID:
			return getAParameter_3024OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAPackage_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAApplication_2001ContainedLinks(
			View view) {
		Academia.AApplication modelElement = (Academia.AApplication) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getMatricula_2002ContainedLinks(
			View view) {
		Academia.Matricula modelElement = (Academia.Matricula) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAluno_2003ContainedLinks(
			View view) {
		Academia.Aluno modelElement = (Academia.Aluno) view.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getCurso_2004ContainedLinks(
			View view) {
		Academia.Curso modelElement = (Academia.Curso) view.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getDepartamento_2005ContainedLinks(
			View view) {
		Academia.Departamento modelElement = (Academia.Departamento) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getCampus_2006ContainedLinks(
			View view) {
		Academia.Campus modelElement = (Academia.Campus) view.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getDisciplinaSemestre_2007ContainedLinks(
			View view) {
		Academia.DisciplinaSemestre modelElement = (Academia.DisciplinaSemestre) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getDisciplinaPaga_2008ContainedLinks(
			View view) {
		Academia.DisciplinaPaga modelElement = (Academia.DisciplinaPaga) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getDisciplinaGratis_2009ContainedLinks(
			View view) {
		Academia.DisciplinaGratis modelElement = (Academia.DisciplinaGratis) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAApplication_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getMatricula_2002IncomingLinks(
			View view) {
		Academia.Matricula modelElement = (Academia.Matricula) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AClassifier_AChilds_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAluno_2003IncomingLinks(
			View view) {
		Academia.Aluno modelElement = (Academia.Aluno) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AClassifier_AChilds_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getCurso_2004IncomingLinks(
			View view) {
		Academia.Curso modelElement = (Academia.Curso) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AClassifier_AChilds_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getDepartamento_2005IncomingLinks(
			View view) {
		Academia.Departamento modelElement = (Academia.Departamento) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AClassifier_AChilds_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getCampus_2006IncomingLinks(
			View view) {
		Academia.Campus modelElement = (Academia.Campus) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AClassifier_AChilds_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getDisciplinaSemestre_2007IncomingLinks(
			View view) {
		Academia.DisciplinaSemestre modelElement = (Academia.DisciplinaSemestre) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AClassifier_AChilds_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getDisciplinaPaga_2008IncomingLinks(
			View view) {
		Academia.DisciplinaPaga modelElement = (Academia.DisciplinaPaga) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AClassifier_AChilds_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getDisciplinaGratis_2009IncomingLinks(
			View view) {
		Academia.DisciplinaGratis modelElement = (Academia.DisciplinaGratis) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AClassifier_AChilds_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3020IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3021IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3023IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3024IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAApplication_2001OutgoingLinks(
			View view) {
		Academia.AApplication modelElement = (Academia.AApplication) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getMatricula_2002OutgoingLinks(
			View view) {
		Academia.Matricula modelElement = (Academia.Matricula) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAluno_2003OutgoingLinks(
			View view) {
		Academia.Aluno modelElement = (Academia.Aluno) view.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getCurso_2004OutgoingLinks(
			View view) {
		Academia.Curso modelElement = (Academia.Curso) view.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getDepartamento_2005OutgoingLinks(
			View view) {
		Academia.Departamento modelElement = (Academia.Departamento) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getCampus_2006OutgoingLinks(
			View view) {
		Academia.Campus modelElement = (Academia.Campus) view.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getDisciplinaSemestre_2007OutgoingLinks(
			View view) {
		Academia.DisciplinaSemestre modelElement = (Academia.DisciplinaSemestre) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getDisciplinaPaga_2008OutgoingLinks(
			View view) {
		Academia.DisciplinaPaga modelElement = (Academia.DisciplinaPaga) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getDisciplinaGratis_2009OutgoingLinks(
			View view) {
		Academia.DisciplinaGratis modelElement = (Academia.DisciplinaGratis) view
				.getElement();
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3020OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3021OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAAttribute_3022OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAOperation_3023OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Academia.diagram.part.AcademiaLinkDescriptor> getAParameter_3024OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<Academia.diagram.part.AcademiaLinkDescriptor> getIncomingFeatureModelFacetLinks_AClassifier_AChilds_4001(
			Academia.AFeature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Academia.AcademiaPackage.eINSTANCE
					.getAClassifier_AChilds()) {
				result.add(new Academia.diagram.part.AcademiaLinkDescriptor(
						setting.getEObject(),
						target,
						Academia.diagram.providers.AcademiaElementTypes.AClassifierAChilds_4001,
						Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Academia.diagram.part.AcademiaLinkDescriptor> getOutgoingFeatureModelFacetLinks_AClassifier_AChilds_4001(
			Academia.AClassifier source) {
		LinkedList<Academia.diagram.part.AcademiaLinkDescriptor> result = new LinkedList<Academia.diagram.part.AcademiaLinkDescriptor>();
		for (Iterator<?> destinations = source.getAChilds().iterator(); destinations
				.hasNext();) {
			Academia.AFeature destination = (Academia.AFeature) destinations
					.next();
			result.add(new Academia.diagram.part.AcademiaLinkDescriptor(
					source,
					destination,
					Academia.diagram.providers.AcademiaElementTypes.AClassifierAChilds_4001,
					Academia.diagram.edit.parts.AClassifierAChildsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<Academia.diagram.part.AcademiaNodeDescriptor> getSemanticChildren(
				View view) {
			return AcademiaDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Academia.diagram.part.AcademiaLinkDescriptor> getContainedLinks(
				View view) {
			return AcademiaDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Academia.diagram.part.AcademiaLinkDescriptor> getIncomingLinks(
				View view) {
			return AcademiaDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Academia.diagram.part.AcademiaLinkDescriptor> getOutgoingLinks(
				View view) {
			return AcademiaDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
