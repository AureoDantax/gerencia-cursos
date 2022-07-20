package br.com.gerencia.cursos.test;

import br.com.gerencia.cursos.models.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {
    public static void main(String[] args) {
        Aula aula1= new Aula( "introdução",21);
        Aula aula2 = new Aula( "Avançando em listas", 25);
        Aula aula3 = new Aula( "Relacionamentos entre listas e objetos", 25);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);


        Collections.sort(aulas);
        aulas.forEach(aula -> System.out.println( aula));
        aulas.sort(Comparator.comparing(Aula::getDuracao));
        System.out.println(aulas);
    }

}
