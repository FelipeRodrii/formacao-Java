import org.example.Conta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTeste {

    @Test
    void validaSaldo(){
        Conta conta = new Conta("123456", 100d);
        Assertions.assertNotNull(conta);

        conta.lancaCredito(50d);

        Assertions.assertEquals(150d, conta.getSaldo());

        conta.lancaDebito(50d);

        Assertions.assertEquals(100, conta.getSaldo());

        conta.lancaCredito(1d);

        Assertions.assertEquals(101, conta.getSaldo());

        conta= null;
        Assertions.assertNull(conta);
    }
}
