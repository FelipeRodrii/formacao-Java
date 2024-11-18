package org.example;

public class NotificacaoSMS implements NotificacaoService{
    @Override
    public void enviarNotificacao() {
        System.out.printf("Enviando notificação por SMS...");
    }
}
