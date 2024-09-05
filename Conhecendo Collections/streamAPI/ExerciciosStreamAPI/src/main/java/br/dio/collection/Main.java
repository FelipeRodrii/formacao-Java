package br.dio.collection;

import java.util.*;

//Todo: Fazer anotações finais no projeto
public class Main {
    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        //numerosAleatorios.stream().forEach(s -> System.out.println(s +" "));
        System.out.println("Elementos desta lista: ");
        numerosAleatorios.forEach(s -> System.out.print(s +" "));
        System.out.println(" ");

        System.out.println("5 Primeiros valores: ");
        numerosAleatorios.stream().limit(5).forEach( s -> System.out.print(s +" "));

        System.out.println("Tipo e Valor: ");
        List<Integer> numerosAleatoriosInteiros = new ArrayList<>(numerosAleatorios.stream().map(Integer::parseInt).toList());
        numerosAleatoriosInteiros.forEach(i -> System.out.println(i.getClass() + " " +i));

        System.out.print("Numeros pares maiores que 2:");
        List<Integer> numerosaleatoriosParesMaiorDois =
                numerosAleatoriosInteiros.stream()
                        .filter(s -> (s % 2 == 0 && s > 2))
                        .toList(); // Poderia tamber ser .collectors(Collector.toList());

                numerosaleatoriosParesMaiorDois.forEach(s -> System.out.print(s +" "));
                System.out.println();

        // O mapToInt, além de fazer a conversão dos tipos igual o map, permite que usemos outras funções para numeros, como sum() e average()
        //Integer::parseInt -> Tranforma Strings em objetos do tiopo Integer
        System.out.print("Média: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        List<Integer> numerosAleatorios1 = new ArrayList<>(numerosAleatoriosInteiros);
        System.out.println("Removendo impares");
        numerosAleatorios1.removeIf(s -> (s % 2 != 0));
        numerosAleatorios1.forEach(s -> System.out.print(s +" "));
        System.out.println(" ");

        System.out.println("Ignorando os 3 primeiros: ");
        numerosAleatoriosInteiros.stream().skip(3).forEach(s -> System.out.print(s +" "));
        System.out.println(" ");

        long totalDistintos= numerosAleatoriosInteiros.stream().distinct().count();
        System.out.println("O total de apo´s retirada as cópias são: " +totalDistintos);
        numerosAleatoriosInteiros.stream().distinct().forEach(s-> System.out.print(s +" "));
        System.out.println(" ");


        // Integer::IntValue -> Retorna o valor do objeto Integer(O tipo primitivo)
        numerosAleatoriosInteiros.stream().mapToInt(Integer::intValue).min().ifPresent(s -> System.out.println("Menor valor da Lista -> "+ s));

        numerosAleatoriosInteiros.stream().mapToInt(Integer::intValue).max().ifPresent(s -> System.out.println("Maior valor da Lista -> "+ s));

        int somaDosnumerosPares= numerosAleatoriosInteiros.stream().filter(i -> (i%2==0)).mapToInt(Integer::intValue).sum();
        System.out.println("Soma dos números pares -> " +somaDosnumerosPares);

        System.out.println("Ordem númerica natural");
        List<Integer> numerosNaturais= numerosAleatoriosInteiros.stream().sorted(Comparator.naturalOrder()).toList();
        numerosNaturais.forEach(i -> System.out.print(i +" "));
        System.out.println(" ");

        System.out.println("Valores múltiplos de 3 ou 5");
        numerosAleatoriosInteiros.stream().filter(i -> ((i%3 == 0) || (i%5==0))).toList().forEach(i -> System.out.print(i +" "));

    }
}