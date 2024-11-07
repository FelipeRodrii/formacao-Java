package org.mockitoTests;

@ExtendWith(MockitoExtension.class)
public class ApiDosCorreiosTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @Test
    void retonaObjetoQuandoEspecificoValorEhPassado(){
        when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(null);

        Localizacao localizacao = apiDosCorreios.buscaDadosPorCep("161761");

        assertNull(localizacao);
    }

}
