package org.example;

public class NotificacaoEmail implements NotificacaoService{

    @Override
    public void enviarNotificacao() {
        System.out.printf("Enviando notiicação por Email...");
    }
}
