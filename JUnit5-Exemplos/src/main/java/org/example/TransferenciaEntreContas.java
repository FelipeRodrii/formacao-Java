package org.example;

public class TransferenciaEntreContas {

    public void transfere(Conta contaOrigem, Conta contaDestino, Double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("valor dve ser maior que zero");
        }

        contaDestino.lancaCredito(valor);
        contaOrigem.lancaDebito(valor);
    }
}
