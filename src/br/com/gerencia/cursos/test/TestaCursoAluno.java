package br.com.gerencia.cursos.test;

import br.com.gerencia.cursos.main.Aluno;
import br.com.gerencia.cursos.main.Aula;
import br.com.gerencia.cursos.main.Curso;

import java.util.HashSet;
import java.util.Set;

public class TestaCursoAluno {
    public static void main(String[] args) {
        Curso Colecoes = new Curso("Java Coleções", "Dantas");

        Colecoes.adiciona(new Aula("introdução", 22));
        Colecoes.adiciona(new Aula("Relacionamentos com coleções", 12));
        Colecoes.adiciona(new Aula("Modelando com coleções", 15));

        Set<Aluno> alunos = new HashSet<>();

        Aluno a1 = new Aluno("Carlo", 1585);
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

        // Colecoes.getAlunos().forEach(a -> System.out.println(a));


        System.out.println(Colecoes.BuscaMatriculado(115631));
        System.out.println(Colecoes.estaMatriculado(a5));
        Aluno flavin = new Aluno("flavin", 115631);
        System.out.println(flavin.equals(a5));

        //se dois objetos sao equals,seus hashs tem que ser iguais, portanto esse print tem que ser true.
        //  System.out.println(a5.hashCode() == flavin.hashCode());

    }

}
