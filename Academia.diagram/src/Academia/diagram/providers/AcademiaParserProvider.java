package Academia.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AcademiaParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser aApplicationName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getAApplicationName_5001Parser() {
		if (aApplicationName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getANamedElement_Name() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			aApplicationName_5001Parser = parser;
		}
		return aApplicationName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser matriculaStereo_5005Parser;

	/**
	 * @generated
	 */
	private IParser getMatriculaStereo_5005Parser() {
		if (matriculaStereo_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getAFeature_Stereo() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Matricula"); //$NON-NLS-1$
			parser.setEditorPattern("Matricula"); //$NON-NLS-1$
			parser.setEditPattern("Matricula"); //$NON-NLS-1$
			matriculaStereo_5005Parser = parser;
		}
		return matriculaStereo_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser matriculaName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getMatriculaName_5006Parser() {
		if (matriculaName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getANamedElement_Name() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			matriculaName_5006Parser = parser;
		}
		return matriculaName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser alunoStereo_5010Parser;

	/**
	 * @generated
	 */
	private IParser getAlunoStereo_5010Parser() {
		if (alunoStereo_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getAFeature_Stereo() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Aluno"); //$NON-NLS-1$
			parser.setEditorPattern("Aluno"); //$NON-NLS-1$
			parser.setEditPattern("Aluno"); //$NON-NLS-1$
			alunoStereo_5010Parser = parser;
		}
		return alunoStereo_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser alunoName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getAlunoName_5011Parser() {
		if (alunoName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getANamedElement_Name() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			alunoName_5011Parser = parser;
		}
		return alunoName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser cursoStereo_5015Parser;

	/**
	 * @generated
	 */
	private IParser getCursoStereo_5015Parser() {
		if (cursoStereo_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getAFeature_Stereo() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Curso"); //$NON-NLS-1$
			parser.setEditorPattern("Curso"); //$NON-NLS-1$
			parser.setEditPattern("Curso"); //$NON-NLS-1$
			cursoStereo_5015Parser = parser;
		}
		return cursoStereo_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser cursoName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getCursoName_5016Parser() {
		if (cursoName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getANamedElement_Name() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			cursoName_5016Parser = parser;
		}
		return cursoName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser departamentoStereo_5020Parser;

	/**
	 * @generated
	 */
	private IParser getDepartamentoStereo_5020Parser() {
		if (departamentoStereo_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getAFeature_Stereo() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Departamento"); //$NON-NLS-1$
			parser.setEditorPattern("Departamento"); //$NON-NLS-1$
			parser.setEditPattern("Departamento"); //$NON-NLS-1$
			departamentoStereo_5020Parser = parser;
		}
		return departamentoStereo_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser departamentoName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getDepartamentoName_5021Parser() {
		if (departamentoName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getANamedElement_Name() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			departamentoName_5021Parser = parser;
		}
		return departamentoName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser campusStereo_5025Parser;

	/**
	 * @generated
	 */
	private IParser getCampusStereo_5025Parser() {
		if (campusStereo_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getAFeature_Stereo() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Campus"); //$NON-NLS-1$
			parser.setEditorPattern("Campus"); //$NON-NLS-1$
			parser.setEditPattern("Campus"); //$NON-NLS-1$
			campusStereo_5025Parser = parser;
		}
		return campusStereo_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser campusName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getCampusName_5026Parser() {
		if (campusName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getANamedElement_Name() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			campusName_5026Parser = parser;
		}
		return campusName_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser disciplinaSemestreStereo_5030Parser;

	/**
	 * @generated
	 */
	private IParser getDisciplinaSemestreStereo_5030Parser() {
		if (disciplinaSemestreStereo_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getAFeature_Stereo() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("DisciplinaSemestre"); //$NON-NLS-1$
			parser.setEditorPattern("DisciplinaSemestre"); //$NON-NLS-1$
			parser.setEditPattern("DisciplinaSemestre"); //$NON-NLS-1$
			disciplinaSemestreStereo_5030Parser = parser;
		}
		return disciplinaSemestreStereo_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser disciplinaSemestreName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getDisciplinaSemestreName_5031Parser() {
		if (disciplinaSemestreName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getANamedElement_Name() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			disciplinaSemestreName_5031Parser = parser;
		}
		return disciplinaSemestreName_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser disciplinaPagaStereo_5035Parser;

	/**
	 * @generated
	 */
	private IParser getDisciplinaPagaStereo_5035Parser() {
		if (disciplinaPagaStereo_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getAFeature_Stereo() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("DisciplinaPaga"); //$NON-NLS-1$
			parser.setEditorPattern("DisciplinaPaga"); //$NON-NLS-1$
			parser.setEditPattern("DisciplinaPaga"); //$NON-NLS-1$
			disciplinaPagaStereo_5035Parser = parser;
		}
		return disciplinaPagaStereo_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser disciplinaPagaName_5036Parser;

	/**
	 * @generated
	 */
	private IParser getDisciplinaPagaName_5036Parser() {
		if (disciplinaPagaName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getANamedElement_Name() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			disciplinaPagaName_5036Parser = parser;
		}
		return disciplinaPagaName_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser disciplinaGratisStereo_5040Parser;

	/**
	 * @generated
	 */
	private IParser getDisciplinaGratisStereo_5040Parser() {
		if (disciplinaGratisStereo_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getAFeature_Stereo() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("DisciplinaGratis"); //$NON-NLS-1$
			parser.setEditorPattern("DisciplinaGratis"); //$NON-NLS-1$
			parser.setEditPattern("DisciplinaGratis"); //$NON-NLS-1$
			disciplinaGratisStereo_5040Parser = parser;
		}
		return disciplinaGratisStereo_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser disciplinaGratisName_5041Parser;

	/**
	 * @generated
	 */
	private IParser getDisciplinaGratisName_5041Parser() {
		if (disciplinaGratisName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getANamedElement_Name() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			disciplinaGratisName_5041Parser = parser;
		}
		return disciplinaGratisName_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser aAttribute_3001Parser;

	/**
	 * @generated
	 */
	private IParser getAAttribute_3001Parser() {
		if (aAttribute_3001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					Academia.AcademiaPackage.eINSTANCE.getANamedElement_Name(),
					Academia.AcademiaPackage.eINSTANCE
							.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			aAttribute_3001Parser = parser;
		}
		return aAttribute_3001Parser;
	}

	/**
	 * @generated
	 */
	private IParser aOperationName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getAOperationName_5002Parser() {
		if (aOperationName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getANamedElement_Name() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			aOperationName_5002Parser = parser;
		}
		return aOperationName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser aOperationTypeName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getAOperationTypeName_5004Parser() {
		if (aOperationTypeName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern(") : {0}"); //$NON-NLS-1$
			parser.setEditorPattern(") : {0}"); //$NON-NLS-1$
			parser.setEditPattern(") : {0}"); //$NON-NLS-1$
			aOperationTypeName_5004Parser = parser;
		}
		return aOperationTypeName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser aParameter_3003Parser;

	/**
	 * @generated
	 */
	private IParser getAParameter_3003Parser() {
		if (aParameter_3003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					Academia.AcademiaPackage.eINSTANCE.getANamedElement_Name(),
					Academia.AcademiaPackage.eINSTANCE
							.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1},"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1},"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1},"); //$NON-NLS-1$
			aParameter_3003Parser = parser;
		}
		return aParameter_3003Parser;
	}

	/**
	 * @generated
	 */
	private IParser aAttribute_3004Parser;

	/**
	 * @generated
	 */
	private IParser getAAttribute_3004Parser() {
		if (aAttribute_3004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					Academia.AcademiaPackage.eINSTANCE.getANamedElement_Name(),
					Academia.AcademiaPackage.eINSTANCE
							.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			aAttribute_3004Parser = parser;
		}
		return aAttribute_3004Parser;
	}

	/**
	 * @generated
	 */
	private IParser aOperationName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getAOperationName_5007Parser() {
		if (aOperationName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getANamedElement_Name() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			aOperationName_5007Parser = parser;
		}
		return aOperationName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser aOperationTypeName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getAOperationTypeName_5009Parser() {
		if (aOperationTypeName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern(") : {0}"); //$NON-NLS-1$
			parser.setEditorPattern(") : {0}"); //$NON-NLS-1$
			parser.setEditPattern(") : {0}"); //$NON-NLS-1$
			aOperationTypeName_5009Parser = parser;
		}
		return aOperationTypeName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser aParameter_3006Parser;

	/**
	 * @generated
	 */
	private IParser getAParameter_3006Parser() {
		if (aParameter_3006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					Academia.AcademiaPackage.eINSTANCE.getANamedElement_Name(),
					Academia.AcademiaPackage.eINSTANCE
							.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1},"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1},"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1},"); //$NON-NLS-1$
			aParameter_3006Parser = parser;
		}
		return aParameter_3006Parser;
	}

	/**
	 * @generated
	 */
	private IParser aAttribute_3007Parser;

	/**
	 * @generated
	 */
	private IParser getAAttribute_3007Parser() {
		if (aAttribute_3007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					Academia.AcademiaPackage.eINSTANCE.getANamedElement_Name(),
					Academia.AcademiaPackage.eINSTANCE
							.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			aAttribute_3007Parser = parser;
		}
		return aAttribute_3007Parser;
	}

	/**
	 * @generated
	 */
	private IParser aOperationName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getAOperationName_5012Parser() {
		if (aOperationName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getANamedElement_Name() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			aOperationName_5012Parser = parser;
		}
		return aOperationName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser aOperationTypeName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getAOperationTypeName_5014Parser() {
		if (aOperationTypeName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern(") : {0}"); //$NON-NLS-1$
			parser.setEditorPattern(") : {0}"); //$NON-NLS-1$
			parser.setEditPattern(") : {0}"); //$NON-NLS-1$
			aOperationTypeName_5014Parser = parser;
		}
		return aOperationTypeName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser aParameter_3009Parser;

	/**
	 * @generated
	 */
	private IParser getAParameter_3009Parser() {
		if (aParameter_3009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					Academia.AcademiaPackage.eINSTANCE.getANamedElement_Name(),
					Academia.AcademiaPackage.eINSTANCE
							.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1},"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1},"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1},"); //$NON-NLS-1$
			aParameter_3009Parser = parser;
		}
		return aParameter_3009Parser;
	}

	/**
	 * @generated
	 */
	private IParser aAttribute_3010Parser;

	/**
	 * @generated
	 */
	private IParser getAAttribute_3010Parser() {
		if (aAttribute_3010Parser == null) {
			EAttribute[] features = new EAttribute[] {
					Academia.AcademiaPackage.eINSTANCE.getANamedElement_Name(),
					Academia.AcademiaPackage.eINSTANCE
							.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			aAttribute_3010Parser = parser;
		}
		return aAttribute_3010Parser;
	}

	/**
	 * @generated
	 */
	private IParser aOperationName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getAOperationName_5017Parser() {
		if (aOperationName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getANamedElement_Name() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			aOperationName_5017Parser = parser;
		}
		return aOperationName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser aOperationTypeName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getAOperationTypeName_5019Parser() {
		if (aOperationTypeName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern(") : {0}"); //$NON-NLS-1$
			parser.setEditorPattern(") : {0}"); //$NON-NLS-1$
			parser.setEditPattern(") : {0}"); //$NON-NLS-1$
			aOperationTypeName_5019Parser = parser;
		}
		return aOperationTypeName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser aParameter_3012Parser;

	/**
	 * @generated
	 */
	private IParser getAParameter_3012Parser() {
		if (aParameter_3012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					Academia.AcademiaPackage.eINSTANCE.getANamedElement_Name(),
					Academia.AcademiaPackage.eINSTANCE
							.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1},"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1},"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1},"); //$NON-NLS-1$
			aParameter_3012Parser = parser;
		}
		return aParameter_3012Parser;
	}

	/**
	 * @generated
	 */
	private IParser aAttribute_3013Parser;

	/**
	 * @generated
	 */
	private IParser getAAttribute_3013Parser() {
		if (aAttribute_3013Parser == null) {
			EAttribute[] features = new EAttribute[] {
					Academia.AcademiaPackage.eINSTANCE.getANamedElement_Name(),
					Academia.AcademiaPackage.eINSTANCE
							.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			aAttribute_3013Parser = parser;
		}
		return aAttribute_3013Parser;
	}

	/**
	 * @generated
	 */
	private IParser aOperationName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getAOperationName_5022Parser() {
		if (aOperationName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getANamedElement_Name() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			aOperationName_5022Parser = parser;
		}
		return aOperationName_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser aOperationTypeName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getAOperationTypeName_5024Parser() {
		if (aOperationTypeName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern(") : {0}"); //$NON-NLS-1$
			parser.setEditorPattern(") : {0}"); //$NON-NLS-1$
			parser.setEditPattern(") : {0}"); //$NON-NLS-1$
			aOperationTypeName_5024Parser = parser;
		}
		return aOperationTypeName_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser aParameter_3015Parser;

	/**
	 * @generated
	 */
	private IParser getAParameter_3015Parser() {
		if (aParameter_3015Parser == null) {
			EAttribute[] features = new EAttribute[] {
					Academia.AcademiaPackage.eINSTANCE.getANamedElement_Name(),
					Academia.AcademiaPackage.eINSTANCE
							.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1},"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1},"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1},"); //$NON-NLS-1$
			aParameter_3015Parser = parser;
		}
		return aParameter_3015Parser;
	}

	/**
	 * @generated
	 */
	private IParser aAttribute_3016Parser;

	/**
	 * @generated
	 */
	private IParser getAAttribute_3016Parser() {
		if (aAttribute_3016Parser == null) {
			EAttribute[] features = new EAttribute[] {
					Academia.AcademiaPackage.eINSTANCE.getANamedElement_Name(),
					Academia.AcademiaPackage.eINSTANCE
							.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			aAttribute_3016Parser = parser;
		}
		return aAttribute_3016Parser;
	}

	/**
	 * @generated
	 */
	private IParser aOperationName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getAOperationName_5027Parser() {
		if (aOperationName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getANamedElement_Name() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			aOperationName_5027Parser = parser;
		}
		return aOperationName_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser aOperationTypeName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getAOperationTypeName_5029Parser() {
		if (aOperationTypeName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern(") : {0}"); //$NON-NLS-1$
			parser.setEditorPattern(") : {0}"); //$NON-NLS-1$
			parser.setEditPattern(") : {0}"); //$NON-NLS-1$
			aOperationTypeName_5029Parser = parser;
		}
		return aOperationTypeName_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser aParameter_3018Parser;

	/**
	 * @generated
	 */
	private IParser getAParameter_3018Parser() {
		if (aParameter_3018Parser == null) {
			EAttribute[] features = new EAttribute[] {
					Academia.AcademiaPackage.eINSTANCE.getANamedElement_Name(),
					Academia.AcademiaPackage.eINSTANCE
							.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1},"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1},"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1},"); //$NON-NLS-1$
			aParameter_3018Parser = parser;
		}
		return aParameter_3018Parser;
	}

	/**
	 * @generated
	 */
	private IParser aAttribute_3019Parser;

	/**
	 * @generated
	 */
	private IParser getAAttribute_3019Parser() {
		if (aAttribute_3019Parser == null) {
			EAttribute[] features = new EAttribute[] {
					Academia.AcademiaPackage.eINSTANCE.getANamedElement_Name(),
					Academia.AcademiaPackage.eINSTANCE
							.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			aAttribute_3019Parser = parser;
		}
		return aAttribute_3019Parser;
	}

	/**
	 * @generated
	 */
	private IParser aOperationName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getAOperationName_5032Parser() {
		if (aOperationName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getANamedElement_Name() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			aOperationName_5032Parser = parser;
		}
		return aOperationName_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser aOperationTypeName_5034Parser;

	/**
	 * @generated
	 */
	private IParser getAOperationTypeName_5034Parser() {
		if (aOperationTypeName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern(") : {0}"); //$NON-NLS-1$
			parser.setEditorPattern(") : {0}"); //$NON-NLS-1$
			parser.setEditPattern(") : {0}"); //$NON-NLS-1$
			aOperationTypeName_5034Parser = parser;
		}
		return aOperationTypeName_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser aParameter_3021Parser;

	/**
	 * @generated
	 */
	private IParser getAParameter_3021Parser() {
		if (aParameter_3021Parser == null) {
			EAttribute[] features = new EAttribute[] {
					Academia.AcademiaPackage.eINSTANCE.getANamedElement_Name(),
					Academia.AcademiaPackage.eINSTANCE
							.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1},"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1},"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1},"); //$NON-NLS-1$
			aParameter_3021Parser = parser;
		}
		return aParameter_3021Parser;
	}

	/**
	 * @generated
	 */
	private IParser aAttribute_3022Parser;

	/**
	 * @generated
	 */
	private IParser getAAttribute_3022Parser() {
		if (aAttribute_3022Parser == null) {
			EAttribute[] features = new EAttribute[] {
					Academia.AcademiaPackage.eINSTANCE.getANamedElement_Name(),
					Academia.AcademiaPackage.eINSTANCE
							.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			aAttribute_3022Parser = parser;
		}
		return aAttribute_3022Parser;
	}

	/**
	 * @generated
	 */
	private IParser aOperationName_5037Parser;

	/**
	 * @generated
	 */
	private IParser getAOperationName_5037Parser() {
		if (aOperationName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getANamedElement_Name() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			aOperationName_5037Parser = parser;
		}
		return aOperationName_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser aOperationTypeName_5039Parser;

	/**
	 * @generated
	 */
	private IParser getAOperationTypeName_5039Parser() {
		if (aOperationTypeName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { Academia.AcademiaPackage.eINSTANCE
					.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern(") : {0}"); //$NON-NLS-1$
			parser.setEditorPattern(") : {0}"); //$NON-NLS-1$
			parser.setEditPattern(") : {0}"); //$NON-NLS-1$
			aOperationTypeName_5039Parser = parser;
		}
		return aOperationTypeName_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser aParameter_3024Parser;

	/**
	 * @generated
	 */
	private IParser getAParameter_3024Parser() {
		if (aParameter_3024Parser == null) {
			EAttribute[] features = new EAttribute[] {
					Academia.AcademiaPackage.eINSTANCE.getANamedElement_Name(),
					Academia.AcademiaPackage.eINSTANCE
							.getATypedElement_TypeName() };
			Academia.diagram.parsers.MessageFormatParser parser = new Academia.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1},"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1},"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1},"); //$NON-NLS-1$
			aParameter_3024Parser = parser;
		}
		return aParameter_3024Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case Academia.diagram.edit.parts.AApplicationNameEditPart.VISUAL_ID:
			return getAApplicationName_5001Parser();
		case Academia.diagram.edit.parts.MatriculaStereoEditPart.VISUAL_ID:
			return getMatriculaStereo_5005Parser();
		case Academia.diagram.edit.parts.MatriculaNameEditPart.VISUAL_ID:
			return getMatriculaName_5006Parser();
		case Academia.diagram.edit.parts.AlunoStereoEditPart.VISUAL_ID:
			return getAlunoStereo_5010Parser();
		case Academia.diagram.edit.parts.AlunoNameEditPart.VISUAL_ID:
			return getAlunoName_5011Parser();
		case Academia.diagram.edit.parts.CursoStereoEditPart.VISUAL_ID:
			return getCursoStereo_5015Parser();
		case Academia.diagram.edit.parts.CursoNameEditPart.VISUAL_ID:
			return getCursoName_5016Parser();
		case Academia.diagram.edit.parts.DepartamentoStereoEditPart.VISUAL_ID:
			return getDepartamentoStereo_5020Parser();
		case Academia.diagram.edit.parts.DepartamentoNameEditPart.VISUAL_ID:
			return getDepartamentoName_5021Parser();
		case Academia.diagram.edit.parts.CampusStereoEditPart.VISUAL_ID:
			return getCampusStereo_5025Parser();
		case Academia.diagram.edit.parts.CampusNameEditPart.VISUAL_ID:
			return getCampusName_5026Parser();
		case Academia.diagram.edit.parts.DisciplinaSemestreStereoEditPart.VISUAL_ID:
			return getDisciplinaSemestreStereo_5030Parser();
		case Academia.diagram.edit.parts.DisciplinaSemestreNameEditPart.VISUAL_ID:
			return getDisciplinaSemestreName_5031Parser();
		case Academia.diagram.edit.parts.DisciplinaPagaStereoEditPart.VISUAL_ID:
			return getDisciplinaPagaStereo_5035Parser();
		case Academia.diagram.edit.parts.DisciplinaPagaNameEditPart.VISUAL_ID:
			return getDisciplinaPagaName_5036Parser();
		case Academia.diagram.edit.parts.DisciplinaGratisStereoEditPart.VISUAL_ID:
			return getDisciplinaGratisStereo_5040Parser();
		case Academia.diagram.edit.parts.DisciplinaGratisNameEditPart.VISUAL_ID:
			return getDisciplinaGratisName_5041Parser();
		case Academia.diagram.edit.parts.AAttributeEditPart.VISUAL_ID:
			return getAAttribute_3001Parser();
		case Academia.diagram.edit.parts.AOperationNameEditPart.VISUAL_ID:
			return getAOperationName_5002Parser();
		case Academia.diagram.edit.parts.AOperationTypeNameEditPart.VISUAL_ID:
			return getAOperationTypeName_5004Parser();
		case Academia.diagram.edit.parts.AParameterEditPart.VISUAL_ID:
			return getAParameter_3003Parser();
		case Academia.diagram.edit.parts.AAttribute2EditPart.VISUAL_ID:
			return getAAttribute_3004Parser();
		case Academia.diagram.edit.parts.AOperationName2EditPart.VISUAL_ID:
			return getAOperationName_5007Parser();
		case Academia.diagram.edit.parts.AOperationTypeName2EditPart.VISUAL_ID:
			return getAOperationTypeName_5009Parser();
		case Academia.diagram.edit.parts.AParameter2EditPart.VISUAL_ID:
			return getAParameter_3006Parser();
		case Academia.diagram.edit.parts.AAttribute3EditPart.VISUAL_ID:
			return getAAttribute_3007Parser();
		case Academia.diagram.edit.parts.AOperationName3EditPart.VISUAL_ID:
			return getAOperationName_5012Parser();
		case Academia.diagram.edit.parts.AOperationTypeName3EditPart.VISUAL_ID:
			return getAOperationTypeName_5014Parser();
		case Academia.diagram.edit.parts.AParameter3EditPart.VISUAL_ID:
			return getAParameter_3009Parser();
		case Academia.diagram.edit.parts.AAttribute4EditPart.VISUAL_ID:
			return getAAttribute_3010Parser();
		case Academia.diagram.edit.parts.AOperationName4EditPart.VISUAL_ID:
			return getAOperationName_5017Parser();
		case Academia.diagram.edit.parts.AOperationTypeName4EditPart.VISUAL_ID:
			return getAOperationTypeName_5019Parser();
		case Academia.diagram.edit.parts.AParameter4EditPart.VISUAL_ID:
			return getAParameter_3012Parser();
		case Academia.diagram.edit.parts.AAttribute5EditPart.VISUAL_ID:
			return getAAttribute_3013Parser();
		case Academia.diagram.edit.parts.AOperationName5EditPart.VISUAL_ID:
			return getAOperationName_5022Parser();
		case Academia.diagram.edit.parts.AOperationTypeName5EditPart.VISUAL_ID:
			return getAOperationTypeName_5024Parser();
		case Academia.diagram.edit.parts.AParameter5EditPart.VISUAL_ID:
			return getAParameter_3015Parser();
		case Academia.diagram.edit.parts.AAttribute6EditPart.VISUAL_ID:
			return getAAttribute_3016Parser();
		case Academia.diagram.edit.parts.AOperationName6EditPart.VISUAL_ID:
			return getAOperationName_5027Parser();
		case Academia.diagram.edit.parts.AOperationTypeName6EditPart.VISUAL_ID:
			return getAOperationTypeName_5029Parser();
		case Academia.diagram.edit.parts.AParameter6EditPart.VISUAL_ID:
			return getAParameter_3018Parser();
		case Academia.diagram.edit.parts.AAttribute7EditPart.VISUAL_ID:
			return getAAttribute_3019Parser();
		case Academia.diagram.edit.parts.AOperationName7EditPart.VISUAL_ID:
			return getAOperationName_5032Parser();
		case Academia.diagram.edit.parts.AOperationTypeName7EditPart.VISUAL_ID:
			return getAOperationTypeName_5034Parser();
		case Academia.diagram.edit.parts.AParameter7EditPart.VISUAL_ID:
			return getAParameter_3021Parser();
		case Academia.diagram.edit.parts.AAttribute8EditPart.VISUAL_ID:
			return getAAttribute_3022Parser();
		case Academia.diagram.edit.parts.AOperationName8EditPart.VISUAL_ID:
			return getAOperationName_5037Parser();
		case Academia.diagram.edit.parts.AOperationTypeName8EditPart.VISUAL_ID:
			return getAOperationTypeName_5039Parser();
		case Academia.diagram.edit.parts.AParameter8EditPart.VISUAL_ID:
			return getAParameter_3024Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(Academia.diagram.part.AcademiaVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(Academia.diagram.part.AcademiaVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (Academia.diagram.providers.AcademiaElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
