package org.example;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public final class GeradorDeNumeros {
    static Random random = new Random();
    public static List<Integer> geraNumerosAleatorios(int tamanhoLista){
        return random.ints().boxed().limit(tamanhoLista).collect(Collectors.toList());
    }
    public static List<Integer> geraNumerosAleatorios(){
        return random.ints().boxed().limit(random.nextInt(10)).collect(Collectors.toList());
    }
}