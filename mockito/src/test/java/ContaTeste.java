import dio.course.Conta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTeste {

    @Spy
    private Conta conta = new Conta(3000d);

    @Test
    void verificaSeChamouMetodoDebita(){
        conta.pagarBoleto(300d);
        Mockito.verify(conta).debita(300d);
    }

    @Test
    void verificaAOrdemDasChamadas(){
        InOrder inOrder = Mockito.inOrder(conta);
        conta.pagarBoleto(300d);
        conta.debita(300d);
        conta.enviarCreditoParaEmissor(300);
        inOrder.verify(conta).pagarBoleto(300d);
        inOrder.verify(conta).debita(300d);
        inOrder.verify(conta).enviarCreditoParaEmissor(300);
    }

    @Test
    void validaQuantidadeDeVezesQueMetodoFoiChamado(){

        conta.validaSaldo(100);
        conta.validaSaldo(100);
        conta.validaSaldo(100);

        Mockito.verify(conta, Mockito.times(3)).validaSaldo(100);
    }
}
