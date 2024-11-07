package dio.course;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GeradorDeNumeros {
    
    private static Random random = new Random();

    public static List<Integer> gerarNumerosAleatorios(int tamanhoLista){
        return random.ints().boxed().limit(tamanhoLista).collect(Collectors.toList());
    } 
    public static List<Integer> gerarNumerosAleatorios(){
        return random.ints().boxed().limit(10).collect(Collectors.toList());
    }
}
