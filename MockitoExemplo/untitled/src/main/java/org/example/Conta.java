package org.example;

public class Conta {

    private double saldo;
    private String conta;

    public Conta(String conta, double saldo){
        this.conta= conta;
        this.saldo= saldo;
    }

    private void validarSaldo(double valorApagar){
        if (valorApagar > saldo){
            throw new IllegalStateException("Saldo insuficiente");
        }
    }

    public void debita(double valorApagar){
        validarSaldo(valorApagar);
        this.saldo -= valorApagar;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    public void enviarCreditoParaEmissor(Conta conta, double valor){
        //enviar valor para emissor do boleto
        debita(valor);
        conta.debita(valor);
        System.out.printf("Valor %d debitado na conta %s", valor, conta);
    }
}
