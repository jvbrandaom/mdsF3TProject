package groelandia.model;

import Academia.model.*;

/**
 * 
 * @generated
 */
public class GMatricula extends Matricula {

	/**
	 * Constructor of the class GMatricula. Initializes all attributes and
	 * associations which has lower bound equals "1" with default values based
	 * on their types. Attributes and associations with lower bound equals "0"
	 * are not initialized.
	 * 
	 * @generated
	 */
	public GMatricula() {
		super();
	}

	/**
	 * Returns the class which represents the DisciplinaSemestre of GMatricula
	 * in the application.
	 * 
	 * @generated
	 */
	public Class<? extends DisciplinaSemestre> getDisciplinaSemestreClass() {
		return GDisciplinaSemestre.class;
	}

	/**
	 * Returns the class which represents the Aluno of GMatricula in the
	 * application.
	 * 
	 * @generated
	 */
	public Class<? extends Aluno> getAlunoClass() {
		return GAluno.class;
	}

}
