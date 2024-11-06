package org.example;

import javax.swing.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private String documento;
    private LocalDate nascimento;
    private Localizacao endereco;

    public Pessoa(final String nome, final String documento, final LocalDate nascimento){
        this.nome= nome;
        this.documento= documento;
        this.nascimento= nascimento;
    }

    public void adicionarDadosEndereco(Localizacao endereco){
        this.endereco= endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public Localizacao getLocalizacao() {
        return endereco;
    }
    public boolean maioridade(){
        return ChronoUnit.YEARS.between(this.nascimento, LocalDate.now()) > 18L;
    }
}
