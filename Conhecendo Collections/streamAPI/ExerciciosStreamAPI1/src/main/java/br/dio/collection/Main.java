package br.dio.collection;
import java.sql.Array;
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
        Set<Integer> numerosSet = new HashSet<>(Arrays.asList(5,12,17,23,45,60,80, 500, 102, 1010, 325));
        Set<String> nomesSet = new HashSet<>(Arrays.asList("Pedro", "Ana", "Carlos", "Fabiana", "Joana", "Amanda", "Alessandra"));
        Set<Aluno> alunosSet = new HashSet<>(){{
            add(new Aluno("Paulo", 101));
            add(new Aluno("Paulo", 105));
            add(new Aluno("Mariana", 102));
            add(new Aluno("Lucas", 103));
            add(new Aluno("Amanda", 104));
            add(new Aluno("Amanda", 106));
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
        System.out.println("____________________________________________________________________________________________");
        System.out.println(" ");


        System.out.print("Palavras para Maiúsculas: ");
        nomes.stream().map(String::toUpperCase).forEach(s -> System.out.print(s +", "));
        System.out.println(" ");
        System.out.println("____________________________________________________________________________________________");
        System.out.println(" ");


        System.out.println("Ordenar pessoa por idade: ");
        List<Pessoa> pessoasOrdenadoIdade= pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getIdade))
                .toList();

        pessoasOrdenadoIdade.forEach(p -> System.out.print(p +", "));
        System.out.println(" ");
        System.out.println("____________________________________________________________________________________________");
        System.out.println(" ");


        List<Integer> numerosSemDuplicatas= numeros.stream().distinct().toList();
        System.out.print("Numeros sem duplicatas ->");
        numerosSemDuplicatas.forEach(n -> System.out.print(n +" "));
        System.out.println(" ");
        System.out.println("____________________________________________________________________________________________");
        System.out.println(" ");


        long nomeComMenosDeCincoLetras= nomes.stream().filter(s -> (s.length() > 5 )).count();
        System.out.println("Nomes com mais de 5 letras->  "+ nomeComMenosDeCincoLetras);
        System.out.println("____________________________________________________________________________________________");
        System.out.println(" ");


        //Optional<Integer> maior= numeros.stream().max((n1,n2)-> Integer.compare(n1,n2));
        Optional<Integer> maior= numeros.stream().max(Integer::compare);
        System.out.println("O maior valor da lista é -> "+ maior.get());
        System.out.println("____________________________________________________________________________________________");
        System.out.println(" ");

        int somaTotal= numeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println("A soma dos números é -> " +somaTotal);
        System.out.println("____________________________________________________________________________________________");


        System.out.println("Concatenação da lista de Strings: ");
        //String nomesConcatenados = nomes.stream().collect(Collectors.joining());
        String nomesConcatenados = String.join("", nomes);
        System.out.println(nomesConcatenados);
        System.out.println("____________________________________________________________________________________________");



        System.out.println("Transformando a lista de produtos em um map: ");
        Map<Integer, String> produtoListToMap = new HashMap<>();
        //produtoListToMap = produtos.stream().collect(Collectors.toMap(p -> p.getId(), p -> p.getNome()));
        produtoListToMap = produtos.stream().collect(Collectors.toMap(Produto::getId, Produto::getNome));
        //produtoListToMap.entrySet().forEach(p-> System.out.print(p.getKey() + " "+ p.getValue()));
        produtoListToMap.forEach((key, value) -> System.out.print(key + " " + value + " "));
        System.out.println(" ");
        System.out.println("____________________________________________________________________________________________");
        System.out.println(" ");

        List<Integer> maioresQueDez = numeros.stream().filter(n -> n>10).toList();
        System.out.print("Numeros maiores que 10 -> ");
        maioresQueDez.forEach(n -> System.out.print(n +" "));
        System.out.println(" ");
        System.out.println("____________________________________________________________________________________________");
        System.out.println(" ");

        //Todo: Filtrar Set de inteiros os números menores que 50
        System.out.print("Filtrar Set de inteiros os números menores que 50 -> ");
        numerosSet.stream().filter(n -> (n < 50)).forEach(n -> System.out.print(n + " "));
        System.out.println(" ");
        System.out.println("____________________________________________________________________________________________");
        System.out.println(" ");

        //Todo: Mapear Set de Strings e criar um novo com todas as letras maiúsculas
        System.out.println("Novo Set com letras maiúsculas: ");
        Set<String> nomesSetMaiusculas= new HashSet<>();
        nomesSetMaiusculas= nomesSet.stream().map(String::toUpperCase).collect(Collectors.toSet());

        nomesSetMaiusculas.forEach(s-> System.out.print(s +" "));
        System.out.println(" ");
        System.out.println("____________________________________________________________________________________________");
        System.out.println(" ");

        //Todo: Verificar em um Set de inteiros se há um número maior que 100
        System.out.print("Numeros maiores que 100 -> ");
        numerosSet.stream().filter(n -> (n > 100)).forEach(n -> System.out.print(n + " "));
        System.out.println(" ");
        System.out.println("____________________________________________________________________________________________");
        System.out.println(" ");

        //Todo: Dado um set de Strings contar quantos elementos únicos existem
        long elementosUnicos= nomesSet.stream().distinct().count();
        System.out.println("Existem "+elementosUnicos+ " nomes únicos no set de nomes:");
        System.out.println("____________________________________________________________________________________________");
        System.out.println(" ");

        //Todo: Dado um Set de inteiros, tranformá-lo em uma List
        System.out.println("Transformando um set de inteiros em uma lista de inteiros:");
        List<Integer> setToList = new ArrayList<>();
        setToList= numerosSet.stream().toList();
        setToList.forEach(n-> System.out.print(n + " "));
        System.out.println(" ");
        System.out.println("____________________________________________________________________________________________");
        System.out.println(" ");

        //Todo: Dado um Set de String, encontre a primeira e todas as String que comecem com A
        System.out.println("Primeira String que começa com a Letra A -> "+ nomesSetMaiusculas.stream().filter(s -> s.startsWith("A")).findFirst().get());
        System.out.print("Todas String que começam com a Letra A -> ");
        nomesSetMaiusculas.stream().filter(s -> s.startsWith("A")).forEach(s-> System.out.print(s +" "));
        System.out.println(" ");
        System.out.println("____________________________________________________________________________________________");
        System.out.println(" ");

        //Todo: Dado um Set de inteiros, some todos os valores
        somaTotal = numerosSet.stream().mapToInt(Integer::intValue).sum();
        System.out.println("A soma total dos itens do nosso set de inteiros é -> " +somaTotal);
        System.out.println("____________________________________________________________________________________________");
        System.out.println(" ");

        //Todo: Dado um Set de Aluno, remova duplicatas com base no nome do aluno
        List<String> alunosExclusivos= new ArrayList<>();
        //alunosExclusivos= alunosSet.stream().map(s-> s.getNome()).distinct().toString();
        alunosExclusivos= alunosSet.stream().map(a -> a.getNome()).distinct().toList();
        System.out.println(alunosExclusivos);
        System.out.println("____________________________________________________________________________________________");
        System.out.println(" ");

        //Todo: Dado um Map<Integer, String> onde a chave é o id e valor nome, filtre alunos cujo nome comece com j
        System.out.println("Filtrando do nosso map apenas alunos que o nome comecesse com a letra J: ");
        alunosMap.entrySet().stream().filter(aluno -> aluno.getValue().startsWith("J")).forEach(aluno-> System.out.print(aluno.getKey() +" "+ aluno.getValue()+ " "));
        System.out.println(" ");
        System.out.println("____________________________________________________________________________________________");
        System.out.println(" ");


        //Todo: Dado um Map<Integer, String> crie uma nova stream que transforme todos os nomes em letras maiúsculas
        System.out.println("Deixando os nomes em Maiúscula: ");
        alunosMap.entrySet().stream().map(aluno -> aluno.getValue().toUpperCase()).forEach(System.out::println);

    }
}









