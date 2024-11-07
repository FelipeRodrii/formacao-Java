import dio.course.Email;
import dio.course.Formato;
import dio.course.PlataformaDeEnvio;
import dio.course.ServicoEnvioEmail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTeste {

    @Mock
    private PlataformaDeEnvio plataforma;

    @InjectMocks
    private ServicoEnvioEmail servico;

    @Captor
    private ArgumentCaptor<Email> emailCaptor;

    @Test
    public void validaSeEmailEstaComDadosCorretos(){

        String email = "jose.alve@provedor.com";
        String mensagem = "Mensagem fde Teste 123";

        servico.enviarEmail(email, mensagem, true);
        Mockito.verify(plataforma).enviarEmail(emailCaptor.capture());

        Email emailCapturado = emailCaptor.getValue();
        Assertions.assertEquals(Formato.HTML, emailCapturado.getFormato());

    }


}
