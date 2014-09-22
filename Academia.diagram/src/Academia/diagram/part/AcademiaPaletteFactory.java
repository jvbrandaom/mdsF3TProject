package Academia.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class AcademiaPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
	}

	/**
	 * Creates "Default" palette tool group
	 * @generated
	 */
	private PaletteContainer createDefault1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Academia.diagram.part.Messages.Default1Group_title);
		paletteContainer.setId("createDefault1Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(Academia.diagram.part.Messages.Default1Group_desc);
		paletteContainer.add(createAssociation1CreationTool());
		paletteContainer.add(createAttribute2CreationTool());
		paletteContainer.add(createOperation3CreationTool());
		paletteContainer.add(createParameter4CreationTool());
		paletteContainer.add(createApplication5CreationTool());
		paletteContainer.add(createMatricula6CreationTool());
		paletteContainer.add(createAluno7CreationTool());
		paletteContainer.add(createCurso8CreationTool());
		paletteContainer.add(createDepartamento9CreationTool());
		paletteContainer.add(createCampus10CreationTool());
		paletteContainer.add(createDisciplinaSemestre11CreationTool());
		paletteContainer.add(createDisciplinaPaga12CreationTool());
		paletteContainer.add(createDisciplinaGratis13CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociation1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Academia.diagram.part.Messages.Association1CreationTool_title,
				Academia.diagram.part.Messages.Association1CreationTool_desc,
				Collections
						.singletonList(Academia.diagram.providers.AcademiaElementTypes.AClassifierAChilds_4001));
		entry.setId("createAssociation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Academia.diagram.part.AcademiaDiagramEditorPlugin
				.findImageDescriptor("/Academia.edit/icons/full/obj16/AAssociation.gif")); //$NON-NLS-1$
		entry.setLargeIcon(Academia.diagram.part.AcademiaDiagramEditorPlugin
				.findImageDescriptor("/Academia.edit/icons/full/obj16/AAssociation.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(8);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AAttribute_3001);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AAttribute_3004);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AAttribute_3007);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AAttribute_3010);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AAttribute_3013);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AAttribute_3016);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AAttribute_3019);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AAttribute_3022);
		NodeToolEntry entry = new NodeToolEntry(
				Academia.diagram.part.Messages.Attribute2CreationTool_title,
				Academia.diagram.part.Messages.Attribute2CreationTool_desc,
				types);
		entry.setId("createAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Academia.diagram.providers.AcademiaElementTypes
				.getImageDescriptor(Academia.diagram.providers.AcademiaElementTypes.AAttribute_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(8);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AOperation_3002);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AOperation_3005);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AOperation_3008);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AOperation_3011);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AOperation_3014);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AOperation_3017);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AOperation_3020);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AOperation_3023);
		NodeToolEntry entry = new NodeToolEntry(
				Academia.diagram.part.Messages.Operation3CreationTool_title,
				Academia.diagram.part.Messages.Operation3CreationTool_desc,
				types);
		entry.setId("createOperation3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Academia.diagram.providers.AcademiaElementTypes
				.getImageDescriptor(Academia.diagram.providers.AcademiaElementTypes.AOperation_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParameter4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(8);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AParameter_3003);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AParameter_3006);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AParameter_3009);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AParameter_3012);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AParameter_3015);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AParameter_3018);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AParameter_3021);
		types.add(Academia.diagram.providers.AcademiaElementTypes.AParameter_3024);
		NodeToolEntry entry = new NodeToolEntry(
				Academia.diagram.part.Messages.Parameter4CreationTool_title,
				Academia.diagram.part.Messages.Parameter4CreationTool_desc,
				types);
		entry.setId("createParameter4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Academia.diagram.providers.AcademiaElementTypes
				.getImageDescriptor(Academia.diagram.providers.AcademiaElementTypes.AParameter_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplication5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Academia.diagram.part.Messages.Application5CreationTool_title,
				Academia.diagram.part.Messages.Application5CreationTool_desc,
				Collections
						.singletonList(Academia.diagram.providers.AcademiaElementTypes.AApplication_2001));
		entry.setId("createApplication5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Academia.diagram.providers.AcademiaElementTypes
				.getImageDescriptor(Academia.diagram.providers.AcademiaElementTypes.AApplication_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMatricula6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Academia.diagram.part.Messages.Matricula6CreationTool_title,
				Academia.diagram.part.Messages.Matricula6CreationTool_desc,
				Collections
						.singletonList(Academia.diagram.providers.AcademiaElementTypes.Matricula_2002));
		entry.setId("createMatricula6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Academia.diagram.providers.AcademiaElementTypes
				.getImageDescriptor(Academia.diagram.providers.AcademiaElementTypes.Matricula_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAluno7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Academia.diagram.part.Messages.Aluno7CreationTool_title,
				Academia.diagram.part.Messages.Aluno7CreationTool_desc,
				Collections
						.singletonList(Academia.diagram.providers.AcademiaElementTypes.Aluno_2003));
		entry.setId("createAluno7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Academia.diagram.providers.AcademiaElementTypes
				.getImageDescriptor(Academia.diagram.providers.AcademiaElementTypes.Aluno_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCurso8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Academia.diagram.part.Messages.Curso8CreationTool_title,
				Academia.diagram.part.Messages.Curso8CreationTool_desc,
				Collections
						.singletonList(Academia.diagram.providers.AcademiaElementTypes.Curso_2004));
		entry.setId("createCurso8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Academia.diagram.providers.AcademiaElementTypes
				.getImageDescriptor(Academia.diagram.providers.AcademiaElementTypes.Curso_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDepartamento9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Academia.diagram.part.Messages.Departamento9CreationTool_title,
				Academia.diagram.part.Messages.Departamento9CreationTool_desc,
				Collections
						.singletonList(Academia.diagram.providers.AcademiaElementTypes.Departamento_2005));
		entry.setId("createDepartamento9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Academia.diagram.providers.AcademiaElementTypes
				.getImageDescriptor(Academia.diagram.providers.AcademiaElementTypes.Departamento_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCampus10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Academia.diagram.part.Messages.Campus10CreationTool_title,
				Academia.diagram.part.Messages.Campus10CreationTool_desc,
				Collections
						.singletonList(Academia.diagram.providers.AcademiaElementTypes.Campus_2006));
		entry.setId("createCampus10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Academia.diagram.providers.AcademiaElementTypes
				.getImageDescriptor(Academia.diagram.providers.AcademiaElementTypes.Campus_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDisciplinaSemestre11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Academia.diagram.part.Messages.DisciplinaSemestre11CreationTool_title,
				Academia.diagram.part.Messages.DisciplinaSemestre11CreationTool_desc,
				Collections
						.singletonList(Academia.diagram.providers.AcademiaElementTypes.DisciplinaSemestre_2007));
		entry.setId("createDisciplinaSemestre11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Academia.diagram.providers.AcademiaElementTypes
				.getImageDescriptor(Academia.diagram.providers.AcademiaElementTypes.DisciplinaSemestre_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDisciplinaPaga12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Academia.diagram.part.Messages.DisciplinaPaga12CreationTool_title,
				Academia.diagram.part.Messages.DisciplinaPaga12CreationTool_desc,
				Collections
						.singletonList(Academia.diagram.providers.AcademiaElementTypes.DisciplinaPaga_2008));
		entry.setId("createDisciplinaPaga12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Academia.diagram.providers.AcademiaElementTypes
				.getImageDescriptor(Academia.diagram.providers.AcademiaElementTypes.DisciplinaPaga_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDisciplinaGratis13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Academia.diagram.part.Messages.DisciplinaGratis13CreationTool_title,
				Academia.diagram.part.Messages.DisciplinaGratis13CreationTool_desc,
				Collections
						.singletonList(Academia.diagram.providers.AcademiaElementTypes.DisciplinaGratis_2009));
		entry.setId("createDisciplinaGratis13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Academia.diagram.providers.AcademiaElementTypes
				.getImageDescriptor(Academia.diagram.providers.AcademiaElementTypes.DisciplinaGratis_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
