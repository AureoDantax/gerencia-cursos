package br.com.gerencia.cursos.test;

import br.com.gerencia.cursos.models.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {
    public static void main(String[] args) {
        Aula aula1= new Aula( "introdução",21);
        Aula aula2 = new Aula( "Avançando em listas", 25);
        Aula aula3 = new Aula( "Relacionamentos entre listas e objetos", 9);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        Collections.sort(aulas);
        aulas.forEach(aula -> System.out.println(aula));
        aulas.sort(Comparator.comparing(Aula::getDuracao));
        System.out.println(aulas);

        /*Metodo na interface Collecion que devolve um stream do Objeto que o chama no caso aqui "aulas", possui um design pattern de
        interface fluente, onde voce concatena varias invocações de método seguidas atraves do ponto.
        o stream não impacta na collection, pois é da interface Stream que não tem nada a ver com Collection apesar de possuir métodos semelhantes*/
        aulas.stream()
                .filter(aula -> aula.getDuracao() >=10)
                .map(Aula::toString)
                .forEach(totalAulas -> System.out.println(totalAulas.toString()));


        /*o map tem variações de tipo de Numbers, como toInt que devolve um IntStream e toDouble um DoubleStream que ajuda a trabalhar melhor com esses tipos, podemos somar os valores
        recebidos por exemmplo.

         int sum =  aulas.stream()
                .filter(aula -> aula.getDuracao() >=10)
                .mapToInt(Aula::getDuracao)
                .sum();
        System.out.println(sum);
        */
    }

}
