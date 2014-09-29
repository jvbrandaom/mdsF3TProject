package groelandia.model;

import Academia.model.*;

/**
 * 
 * @generated
 */
public class GDisciplinaGratis extends DisciplinaGratis {

	/**
	 * Constructor of the class GDisciplinaGratis. Initializes all attributes
	 * and associations which has lower bound equals "1" with default values
	 * based on their types. Attributes and associations with lower bound equals
	 * "0" are not initialized.
	 * 
	 * @generated
	 */
	public GDisciplinaGratis() {
		super();
	}

	@Override
	public Class<? extends DisciplinaSemestre> getDisciplinaSemestreClass() {
		return GDisciplinaSemestre.class;
	}

	@Override
	public Class<? extends Departamento> getDepartamentoClass() {
		// TODO Auto-generated method stub
		return GDepartamento.class;
	}

}
