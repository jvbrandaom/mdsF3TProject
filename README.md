mdsF3TProject
===========

# Introdução

Projeto desenvolvido utilizando a ferramenta F3T, para a disciplina de Metodologias de Desenvolvimento de Sistemas.

## Especificação dominio

### Academico

Matrícula é uma transação que registra os alunos nas disciplinas. Uma matricula está relacionada a uma aluno. Aluno está relacionado a um curso e o curso a um departamento. Os departamentos podem, ou não, estar ligados a um campus. Uma disciplina é oferecida por um departamento e cada curso tem uma lista das disciplinas que pertencem a sua grade. O sistema pode trabalhar com disciplinas gratuitas ou com valor. Existe a lista de disciplina que cada departamento oferece em um determinado semestre. Os alunos só podem se matricular nas disciplinas oferecidas no semestre corrente. Pode, ou não, ser registrado o funcionário que registrou a matricula.

## Aplicação

### Universidade da Groelandia

O sistema de matrículas para a Universidade da Groelandia é a aplicação escolhida. Este sistema consiste de 6 (seis) arquivos: GAluno, que extende a classe Aluno gerada pelo framework, que possui um Curso; GCurso, que extende a classe Curso, gerada pelo framework, e GCurso possui Disciplnas e um departamento; GDepartamento, que extende a classe Departamento, gerada pelo framework; GDisciplina Gratis, que extende a classe DisciplinaGratis, que foi geirada pelo framework, que possui DisiplinasSemestre e Departamento; GDisciplinaSemestre, que extende a classe DisciplinaSemestre; e GMatricula, que extende a classe Matricula, e possui DisciplinaSemestre e Aluno. Esta aplicação permite que um objeto aluno da classe GAluno possa se matricular em disciplinas (da classe GDisciplinaSemstre) que são abertas no semestre, sejam essas disciplinas gratuitas ou não, que estão vinculadas a um departamento. Essa aplicação possui persistência de dados e utiliza o SGBD MySQL + o driver jdbc.
