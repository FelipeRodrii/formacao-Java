package org.example;

import java.time.LocalDate;

public class CadastrarPessoa {

    private ApiDosCorreios correios;

    public CadastrarPessoa(final ApiDosCorreios correios){
        this.correios= correios;
    }

    public Pessoa cadastrarPessoa(String nome, String documento, LocalDate nascimento, String cep){
        Pessoa pessoa = new Pessoa(nome, documento, nascimento);
        Localizacao localizacao = correios.buscaDadosPorCep(cep);
        pessoa.adicionarDadosEndereco(localizacao);
        return pessoa;
    }

}