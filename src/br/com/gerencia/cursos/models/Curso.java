package br.com.gerencia.cursos.models;

import java.util.*;

public class Curso {

    private final String nome;
    private String instrutor;
    private List<Aula> aula = new LinkedList<Aula>();
    private Set<Aluno> alunos = new LinkedHashSet<>();
    private Map<Integer, Aluno> matriculaAluno = new HashMap();
    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aula);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adiciona(Aula aula) {
        this.aula.add(aula);
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaAluno.put(aluno.getMatricula(),aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }


    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno BuscaMatriculado(int matricula) {
        if(!matriculaAluno.containsKey(matricula))
            throw new NoSuchElementException("Não existe aluno com o número de matricula " + matricula);
        return matriculaAluno.get(matricula);

       /* forma conceitual de implementar um retorno basico do aluno matriculado
        for (Aluno aluno: alunos) {
            if (aluno.getMatricula() == matricula)
            return aluno;
        }
        throw new NoSuchElementException("Não existe aluno com o número de matricula " + matricula);*/
    }

}
