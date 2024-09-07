package br.dio.collection;
import java.util.*;
import java.util.stream.Collectors;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Dados List
        List<Integer> numeros = Arrays.asList(1,5,8,10,15,21,33,40,55,68);
        List<String> nomes = Arrays.asList("Alice", "Bruno", "Carlos", "Daniela", "Elisa", "Fabio", "Giulia" );
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("João", 23),
                new Pessoa("Maria", 35),
                new Pessoa("Ana", 29),
                new Pessoa("Carlos", 18),
                new Pessoa("Lucia", 40)
        );
        List<Produto> produtos = Arrays.asList(
             new Produto(1,"Notebook"),
             new Produto(2,"Smartphone"),
             new Produto(3,"Teclado"),
             new Produto(4,"Monitor"),
             new Produto(5,"Mouse")
        );
        //Dados Set
        Set<Integer> numerosSet = new HashSet<>(Arrays.asList(5,12,17,23,45,60,80));
        Set<String> nomesSet = new HashSet<>(Arrays.asList("Pedro", "Ana", "Carlos", "Fabiana", "Joana"));
        Set<Aluno> alunosSet = new HashSet<>(){{
            add(new Aluno("Paulo", 101));
            add(new Aluno("Mariana", 102));
            add(new Aluno("Lucas", 103));
            add(new Aluno("Amanda", 104));
        }};
        //Dados Map
        Map<Integer, String> alunosMap = new HashMap<>(){{
            put(1, "João");
            put(2, "Maria");
            put(3, "José");
            put(4, "Ana");
            put(5, "Carlos");
        }};
        Map<Integer, Produto> produtosMap = new HashMap<>(){{
            put(1, new Produto(1, "Cadeira"));
            put(2, new Produto(2, "Mesa"));
            put(3, new Produto(3, "Lâmpada"));
            put(4, new Produto(4, "Ventilador"));
            put(5, new Produto(5, "Sofá"));
        }};

        // Lista
        System.out.print("NumerosPares: ");
        numeros.stream().filter(i -> (i%2==0)).forEach(i -> System.out.print(i + " "));
        System.out.println(" ");


        System.out.print("Palavras para Maiúsculas: ");
        nomes.stream().map(String::toUpperCase).forEach(s -> System.out.print(s +", "));
        System.out.println(" ");


        System.out.println("Ordenar pessoa por idade: ");
        List<Pessoa> pessoasOrdenadoIdade= pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getIdade))
                .toList();

        pessoasOrdenadoIdade.forEach(p -> System.out.print(p +", "));
        System.out.println(" ");


        List<Integer> numerosSemDuplicatas= numeros.stream().distinct().toList();
        System.out.print("Numeros sem duplicatas ->");
        numerosSemDuplicatas.forEach(n -> System.out.print(n +" "));
        System.out.println(" ");


        long nomeComMenosDeCincoLetras= nomes.stream().filter(s -> (s.length() > 5 )).count();
        System.out.print("Nomes com mais de 5 letras->  "+ nomeComMenosDeCincoLetras);
        System.out.println(" ");


        //Optional<Integer> maior= numeros.stream().max((n1,n2)-> Integer.compare(n1,n2));
        Optional<Integer> maior= numeros.stream().max(Integer::compare);
        System.out.print("O maior valor da lista é -> "+ maior.get());
        System.out.println(" ");

        int somaTotal= numeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println("A soma dos números é -> " +somaTotal);

        //Todo: Concatenar strings da lista de strings em uma única
        String nomesConcatenados = nomes.stream().collect(Collectors.joining());
        System.out.println(nomesConcatenados);


        //Todo: Transformar uma lista de produtos em um map onde o id é a chave e nome o valor
        Map<Integer, String> produtoListToMap = new HashMap<>();
        //produtoListToMap = produtos.stream().collect(Collectors.toMap(p -> p.getId(), p -> p.getNome()));
        produtoListToMap = produtos.stream().collect(Collectors.toMap(Produto::getId, Produto::getNome));
        //produtoListToMap.entrySet().forEach(p-> System.out.print(p.getKey() + " "+ p.getValue()));
        produtoListToMap.forEach((key, value) -> System.out.print(key + " " + value + " "));
        System.out.println(" ");


        //Todo: Filtrar os números maiores que 10 da lista de inteiros e coletar em uma nova lista
        List<Integer> maioresQueDez = numeros.stream().filter(n -> n>10).toList();
        System.out.print("Numeros maiores que 10 -> ");
        maioresQueDez.forEach(n -> System.out.print(n +" "));
        System.out.println(" ");


        //Todo: Filtrar Set de inteiros os números menores que 50

        //Todo: Mapear Set de Strings e criar um novo com todas as letras maiúsculas

        //Todo: Verificar em um Set de inteiros se há um número maior que 100

        //Todo: Dado um set de Strings contar quantos elementos únicos existem

        //Todo: Dado um Set de inteiros, tranformá-lo em uma List

        //Todo: Dado um Set de String, encontre a primeira e todas as String que comecem com A

        //Todo: Dado um Set de inteiros, some todos os valores

        //Todo: Dado um Set de Aluno, remova duplicatas com base no nome do aluno


        //Todo: Dado um Map<Integer, String> onde a chave é o id e valor nome, filtre alunos cujo nome comece com j

        //Todo: Dado um Map<Integer, String> crie uma nova stream que transforme todos os nomes em letras maiúsculas

    }
}









