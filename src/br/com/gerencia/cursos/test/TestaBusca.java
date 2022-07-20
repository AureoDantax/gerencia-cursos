package br.com.gerencia.cursos.test;

import br.com.gerencia.cursos.models.Aluno;
import br.com.gerencia.cursos.models.Aula;
import br.com.gerencia.cursos.models.Curso;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestaBusca {
    public static void main(String[] args) {
        Curso Colecoes = new Curso("Java Coleções","Dantas");

        Set<Aluno> alunos = new LinkedHashSet<>();
        Colecoes.adiciona(new Aula("introdução", 22));
        Colecoes.adiciona(new Aula("Relacionamentos com coleções", 12));
        Colecoes.adiciona(new Aula("Modelando com coleções", 15));

        Aluno a1 = new Aluno ("Carlo", 1585);
        Aluno a2 = new Aluno("manezin", 15596);
        Aluno a3 = new Aluno("ed", 12396);
        Aluno a4 = new Aluno("guila", 14833);
        Aluno a5 = new Aluno("flavin", 115631);

        Colecoes.matricula(a1);
        Colecoes.matricula(a2);
        Colecoes.matricula(a3);
        Colecoes.matricula(a3);
        Colecoes.matricula(a4);
        Colecoes.matricula(a5);

        Aluno aluno = Colecoes.BuscaMatriculado(4);
        System.out.println(aluno);

    }

}
