import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Desafio:
        // Crie um sistema para gerenciar uma coleção de livros. Cada deve ter atributos como título, autor, ano de
        // publicação e gênero. O sistema deve permitir adicionar livros, remover dulicatas (livros com o mesmo
        // título e autor), e ordenar a coleção por ano de publicação.

        boolean start= true;
        Scanner scan = new Scanner(System.in);
        List<Livro> meusLivros = new ArrayList<>();
        int escolha;

        while (start) {
            System.out.println("-----------------------------------------------------");
            System.out.println("|\tBem-vindo ao sistema de gerenciamento de livros\t|");
            System.out.println("|\t0 ---> Encerrar sistema\t\t\t\t\t\t\t|");
            System.out.println("|\t1 ---> Adicionar um livro ao sistema\t\t\t|");
            System.out.println("|\t2 ---> Remover livros pelo índice\t\t\t\t|");
            System.out.println("|\t3 ---> Listar livros\t\t\t\t\t\t\t|");
            System.out.println("|\t4 ---> Listar livros em ordem alfabética\t\t|");
            System.out.println("|\t5 ---> Listar livros por autor\t\t\t\t\t|");
            System.out.println("|\t6 ---> Listar livros por ano de lançamento\t\t|");
            System.out.println("|\t7 ---> Alterar dados de um livro por índice \t|");
            System.out.println("-----------------------------------------------------");

            System.out.print("Informa sua opção: ");
            escolha= scan.nextInt();
            scan.nextLine();

            switch (escolha) {
                case 0:
                    start= false;
                    break;
                case 1:
                    System.out.println("Informe o titulo:" );
                    String nomeLivro = scan.nextLine();

                    System.out.println("Informe o autor:");
                    String autorLivro = scan.nextLine();

                    System.out.println("Informe o gênero:");
                    String generoLivro = scan.nextLine();

                    System.out.println("Informe o ano de publicação:");
                    int anoLivro = scan.nextInt();
                    scan.nextLine();

                    meusLivros.add(new Livro(nomeLivro, autorLivro, generoLivro, anoLivro));
                    System.out.println("Livro Adicionado com sucesso!");
                    break;

                case 2:
                    for (int i=0; i< meusLivros.size(); i++){
                        System.out.println("Índice: "+i+ " Livro: " +meusLivros.get(i).getTitulo());
                    }
                    System.out.print("Informe o Indice do Livros para remover: ");
                    int indice = scan.nextInt();
                    System.out.println("Livro removido:"+ meusLivros.get(indice));
                    meusLivros.remove(indice);
                    break;

                case 3:
                    System.out.println(meusLivros);
                    break;

                case 4:
                    Set<Livro> meusLivrosAlfabeticamente = new TreeSet<>(meusLivros);
                    System.out.println(meusLivrosAlfabeticamente);
                    break;

                case 5:
                    Set<Livro> meusLivrosPorAutor = new TreeSet<>(new ComparadorAutor());
                    meusLivrosPorAutor.addAll(meusLivros);
                    System.out.println(meusLivrosPorAutor);
                    break;

                case 6:
                    List<Livro> meusLivrosPorAnoLancamento = new ArrayList<>();
                    meusLivrosPorAnoLancamento.addAll(meusLivros);
                    meusLivrosPorAnoLancamento.sort(new ComparatorAno());

                    System.out.println(meusLivrosPorAnoLancamento);
                    break;
                case 7:
                    for (int i=0; i< meusLivros.size(); i++){
                        System.out.print("Índice: "+i+ " Livro: " +meusLivros.get(i).getTitulo()+"\n");
                    }
                    System.out.print("Informe o Indice do Livro para alterar dados");
                    String novoTitulo, novoAutor, novoGenero;
                    int novoAnoPublicacao, index;
                    index= scan.nextInt();
                    scan.nextLine();

                    System.out.println("Informe o novo Titulo:");
                    novoTitulo = scan.nextLine();

                    System.out.println("Informe o novo Autor:");
                    novoAutor = scan.nextLine();

                    System.out.println("Informe o novo Gênero:");
                    novoGenero = scan.nextLine();

                    System.out.println("Informe o novo Ano de Publicação :");

                    novoAnoPublicacao = scan.nextInt();
                    scan.nextLine();

                    meusLivros.set(index, new Livro(novoTitulo,novoAutor,novoGenero,novoAnoPublicacao));
                    break;

                default:
                System.out.println("Escolha não valida !!");
                    break;
            }
        }

    }
}