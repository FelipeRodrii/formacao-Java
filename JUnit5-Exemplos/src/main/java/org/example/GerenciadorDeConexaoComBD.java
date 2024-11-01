package org.example;

import java.util.logging.Logger;

public class GerenciadorDeConexaoComBD {

    private static final Logger LOGGER = Logger.getLogger(GerenciadorDeConexaoComBD.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexao(){
        LOGGER.info("finalizou conexão");
    }

    public static void insereDados(Pessoa pessoa){
        LOGGER.info("inseriu dados");
    }

    public static void removeDados(Pessoa pessoa){
        LOGGER.info("removeu dados");
    }
}
