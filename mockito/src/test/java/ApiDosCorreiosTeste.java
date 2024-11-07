
import dio.course.ApiDosCorreios;
import dio.course.DadosLocalizacao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static  org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
public class ApiDosCorreiosTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @Test
    void retornaIbjetoQuandoEspecificoValorEhPassado(){
        when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(null);

        DadosLocalizacao dadosLocalizacao= apiDosCorreios.buscaDadosComBaseNoCep("161761");

        assertNull(dadosLocalizacao);
    }

    @Test
    void retornoObjetoQuandoEspecificoValorEhPassado2(){
        when(apiDosCorreios.buscaDadosComBaseNoCep("787878")).thenReturn(new DadosLocalizacao("AM", "Manaus", "Rua Grajaúna", "casa", "Lago Azul"));

        DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscaDadosComBaseNoCep("78787878");

        assertEquals("AM", dadosLocalizacao.getUf());
    } 
}
