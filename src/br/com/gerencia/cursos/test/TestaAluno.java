package br.com.gerencia.cursos.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAluno {

    public static void main(String[] args) {
        /*o Set não tem ordem é um conjunto de objetos e não uma lista, o metodo contains substitui o get da List
        e é bem mais performatico pode ser substituido por collection já que é filho(conjuntos não recebem elementos repetidos
        não lança ecxeptions apenas ignora a instrução*/

            Set<String> alunos = new HashSet<>();
            alunos.add("luan");
            alunos.add("Dantas");
            alunos.add("Fela");
            alunos.add("Marcos Ramos");
            alunos.add("Marcel lopes");
            alunos.add("claudete ferroso");

            List<String> aluno = new ArrayList<>();
            aluno.add("luan");
            aluno.add("Dantas");
            aluno.add("Fela");
            aluno.add("Marcos Ramos");
            aluno.add("Marcel lopes");
            aluno.add("claudete ferroso");

            for (String alune : alunos) {
                System.out.println(alune);


            }
        }

    }


