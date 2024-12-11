package org.example;

public class NotificacaoSMS implements NotificacaoService{
    @Override
    public String enviarNotificacao() {
        String retorno = ("Enviando notificação por SMS...");

        return retorno;
    }
}
