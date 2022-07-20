package br.com.gerencia.cursos.test;

import br.com.gerencia.cursos.main.Aula;
import br.com.gerencia.cursos.main.Curso;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso Colecoes = new Curso("Java Coleções","Dantas");

        List<Aula> Cursoaulas = Colecoes.getAulas();
        Colecoes.adiciona(new Aula("introdução", 22));
        Colecoes.adiciona(new Aula("Relacionamentos com coleções", 12));
        Colecoes.adiciona(new Aula("Modelando com coleções", 15));

        System.out.println(Cursoaulas);

    }

}
