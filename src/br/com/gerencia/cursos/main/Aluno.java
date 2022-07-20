package br.com.gerencia.cursos.main;

public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        if (nome == null) {
            throw new NullPointerException(" O campo nome não pode ficar vazio");
        }
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Aluno: "
                + nome +
                ", número da matricula: " + matricula;
    }

    /* Se dois objetos são equals eles precisam ter o mesmo hashcode então se reescrever o equals, reescreva o hashcode
     * maira simples de implementar é:  Aluno outroAluno = (Aluno) obj; return this.nome.equals(outroAluno.nome); porém o códig abaixo
     * é mais preciso e funcional*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula && nome.equals(aluno.nome);
    }

    /* O hashcode é o ID unico do objeto, se você precisa que dois objetos seja equals é necessário reescrever esse metódo para que o hash de ambos seja
    iguais. A classe String já reescreve o metodo hashcode resolvendo possíveis colisões*/
    // PODE SER IMPLEMENTADO ASSIM:
    // Aluno outroAluno = (Aluno) obj;  return this.nome.equals(outroAluno.nome);}

    @Override
    public int hashCode() {

        return this.nome.hashCode();
    }

}

