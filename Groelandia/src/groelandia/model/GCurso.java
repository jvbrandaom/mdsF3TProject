package groelandia.model;

import Academia.model.*;

/**
 * 
 * @generated
 */
public class GCurso extends Curso {

	/**
	 * Constructor of the class GCurso. Initializes all attributes and
	 * associations which has lower bound equals "1" with default values based
	 * on their types. Attributes and associations with lower bound equals "0"
	 * are not initialized.
	 * 
	 * @generated
	 */
	public GCurso() {
		super();
	}

	/**
	 * Returns the class which represents the Disciplina of GCurso in the
	 * application.
	 * 
	 * @generated
	 */
	public Class<? extends Disciplina> getDisciplinaClass() {
		return GDisciplinaGratis.class;
	}

	/**
	 * Returns the class which represents the Departamento of GCurso in the
	 * application.
	 * 
	 * @generated
	 */
	public Class<? extends Departamento> getDepartamentoClass() {
		return GDepartamento.class;
	}

}
