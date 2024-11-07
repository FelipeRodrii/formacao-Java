import dio.course.Pessoa;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PessoaTeste {

    @Mock
    private Pessoa pessoa;

    @Test
    void escolherRetorno(){
        when(pessoa.getNome()).thenReturn("Will");
        assertEquals("Will", pessoa.getNome());
    }

    @Test
    void outraFormaDeEscolherRetorno(){
        doReturn("Will").when(pessoa).getNome();
        assertEquals("Will", pessoa.getNome());
    }

    @Test
    void retornaQueEhMaiorDeIdade(){
        when(pessoa.ehMaiorDeIdade()).thenReturn(true);
        assertTrue(pessoa.ehMaiorDeIdade());
    }

    @Test
    void retornaQueEhmaiorDeIdadeDeUmaOutraForma(){
        doAnswer(invocation -> true).when(pessoa).ehMaiorDeIdade();
        assertTrue(pessoa.ehMaiorDeIdade());
    }
}
