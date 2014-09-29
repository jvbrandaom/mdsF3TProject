CREATE  TABLE `groelandia`.`GAluno` ( 
    `curso` INT, 
    `nome` VARCHAR(50), 
    `sobrenome` VARCHAR(50), 
    `id` INT,
	PRIMARY KEY (id)
);

CREATE  TABLE `groelandia`.`GCurso` ( 
    `departamento` INT, 
    `id` INT, 
    `nome` VARCHAR(50),
	PRIMARY KEY (id)
);

CREATE  TABLE `groelandia`.`GMatricula` ( 
    `aluno` INT, 
    `id` INT, 
    `data` DATE,
	PRIMARY KEY (id)
);

CREATE  TABLE `groelandia`.`GDisciplinaGratis` ( 
    `departamento` INT, 
    `id` INT, 
    `nome` VARCHAR(50),
	PRIMARY KEY (id)
);

CREATE  TABLE `groelandia`.`GDisciplinaSemestre` ( 
    `ano` INT, 
    `semestre` INT, 
    `id` INT,
	PRIMARY KEY (id)
);

CREATE  TABLE `groelandia`.`GDepartamento` ( 
    `campus` INT, 
    `Nome` VARCHAR(50), 
    `id` INT,
	PRIMARY KEY (id)
);


