import org.example.GerenciadorDeConexaoComBD;
import org.example.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class AfterBeforeTeste {

    @BeforeAll
    static void configurar(){
        GerenciadorDeConexaoComBD.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        GerenciadorDeConexaoComBD.insereDados(new Pessoa("João", LocalDateTime.of(2000,1,1,13,0,0)));
    }

    @AfterEach
    void remodeDadosDoTeste(){
        GerenciadorDeConexaoComBD.removeDados(new Pessoa("João", LocalDateTime.of(2000,1,1,13,0,0)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosRetorno2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static  void finalizarConexao(){
        GerenciadorDeConexaoComBD.finalizarConexao();
    }
}
