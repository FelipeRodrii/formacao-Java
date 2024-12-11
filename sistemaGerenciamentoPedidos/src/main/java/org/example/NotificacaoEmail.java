package org.example;

public class NotificacaoEmail implements NotificacaoService {

    @Override
    public String enviarNotificacao() {
        String retorno = ("Enviando notificação por Email...");
        return retorno;
    }
}

