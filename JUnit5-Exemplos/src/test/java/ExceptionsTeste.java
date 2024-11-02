import org.example.Conta;
import org.example.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 0d);
        Conta contadestino = new Conta("45678", 100d);

        TransferenciaEntreContas tranferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> tranferenciaEntreContas.transfere(contaOrigem, contadestino, 20d));
    }
}
