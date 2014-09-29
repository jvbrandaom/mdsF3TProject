package groelandia.model;

import Academia.model.*;

/**
 * 
 * @generated
 */
public class GAluno extends Aluno {

	/**
	 * Constructor of the class GAluno. Initializes all attributes and
	 * associations which has lower bound equals "1" with default values based
	 * on their types. Attributes and associations with lower bound equals "0"
	 * are not initialized.
	 * 
	 * @generated
	 */
	public GAluno() {
		super();
	}

	@Override
	public Class<? extends Curso> getCursoClass() {		
		return GCurso.class;
	}

}
