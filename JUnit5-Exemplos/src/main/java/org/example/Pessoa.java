package org.example;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Pessoa {
    private String nome;
    private LocalDateTime dataNascimento;

    public Pessoa(String nome, LocalDateTime dataNascimento){
        this.nome= nome;
        this.dataNascimento = dataNascimento;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(dataNascimento, LocalDateTime.now());
    }

    public boolean ehMaiorDeIdade(){
        return getIdade() >= 18;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(dataNascimento, pessoa.dataNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dataNascimento);
    }
}
