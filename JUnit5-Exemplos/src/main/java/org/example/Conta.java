package org.example;

public class Conta {

    private String numeroConta;
    private Double saldo;

    public Conta(String numeroConta, Double saldo){
        this.numeroConta= numeroConta;
        this.saldo= saldo;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void lancaCredito(Double valor){
        this.saldo += valor;
    }

    public void lancaDebito(Double valor){
        this.saldo -= valor;
    }
}
