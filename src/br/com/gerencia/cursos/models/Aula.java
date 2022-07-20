package br.com.gerencia.cursos.models;

public class Aula  implements Comparable<Aula>  {

    private String nome;
    private Integer duracao;

    public Aula (String nome, Integer duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Aula: " +
                this.nome  +
                ", duracao: " + this.duracao + " minutos";
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.nome.compareTo(outraAula.getNome());


    }
}

