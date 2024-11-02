import org.example.Pessoa;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {

    @Test
    void validarValoresDeOperacoes(){

        /* Validar soma */
        int resultado = 10;
        assertEquals(resultado, (5+5));

        /*Validar igualdade de valores*/
        double valor1 = 5d;
        double valor2 = 5d;
        assertEquals(valor1, valor2);
    }

    @Test
    void validarSeArraysSaoIguaus(){
        //Validarndose os arrays são iguais, comparando um a um
        int[] primeroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {10,20,30,40,50};
        assertArrayEquals(primeroLancamento, segundoLancamento);

        //utilizando arrays de diferentes tipos, começando por boolean[]
        boolean[] flags = {true, false, false};
        assertArrayEquals(new boolean[]{true, false,false}, flags);

        //utilizando arrays de diferentes tipos, começando por double[]
        double[] valores = {5d, 10.5, 50d, 46d};
        assertArrayEquals(new double[]{5.0, 10.5,50d, 46d}, valores);
    }

    @Test
    void valiarSeObjetoEstaNuloOuNao(){

        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Luciado", LocalDateTime.now());
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosdeTiposDiferentes(){

        double valor1 = 5.0;
        double valor2 = 5d ;

        assertEquals(valor1, valor2);
    }

    @Test
    void validarQueValoresSaoDiferentes(){
        int x = 5;
        int y = 6;

        assertNotEquals(x,y);
    }

    @Test
    void validarQueAlgumaCondicaoEhFalsa(){
        boolean condicao = 5+6 == 12;

        assertFalse(condicao);
    }

    @Test
    void validarQueAlgumaCondicaoEhVerdadeira(){
        boolean condicao = 6+6 == 12;

        assertTrue(condicao);
    }














}
