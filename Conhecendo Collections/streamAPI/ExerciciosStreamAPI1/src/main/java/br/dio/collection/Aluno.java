package br.dio.collection;

import java.util.Objects;

public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula){
        this.nome= nome;
        this.matricula= matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Aluno -> " + "nome= " +nome+ " Matricula= " + matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
}
