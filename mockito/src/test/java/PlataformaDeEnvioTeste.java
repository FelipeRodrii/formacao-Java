import dio.course.Email;
import dio.course.Formato;
import dio.course.PlataformaDeEnvio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PlataformaDeEnvioTeste {

    @Mock
    private PlataformaDeEnvio plataformaDeEnvio;

    @Test
    void tentaEnviarEmailEFalaha(){
        Mockito.doThrow(IllegalStateException.class).when(plataformaDeEnvio).enviarEmail(Mockito.any());

        Assertions.assertThrows(IllegalStateException.class, () -> plataformaDeEnvio.enviarEmail(new Email("teste@teste.com", "Testo a ser enviado", Formato.TEXTO)));

    }
}
