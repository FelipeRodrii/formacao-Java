import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         * Exibindo (Nome Autor - Nome Livro):
         *
         * Autor = Hawking, Stephen - Livro = nome: uma Breve Historia do Tempo, páginas: 256
         * Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, página: 408
         * Autor = Harari, Yuval Noah - Livro = 21 Lições Para o Século 21, páginas: 432
         */

        // Usando o HashMap que imprime os dados em ordem aleatória
        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("HawKing, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        System.out.println(meusLivros +"\n");

        // Usando o LinkedHashMap que imprime os dados em ordem de inserção
        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Steohen", new Livro("Uma Breve Historia do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));

        }};
        System.out.println(meusLivros1 +"\n");

        // Podemos guardar os dados direto em uma arvore TreeMap para a ordenação
        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros);
        System.out.println(meusLivros2 +"\n");

        // Para podermos aplicar um Comparator utilizamos um TreeSet no lugar de um TreeMap, sendo um TreeSet de Map
        // .Entry ou Entradas de uma Map, onde cada Entry é um dado de um Map (Entendi assim pelo menos :))
        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNomeLivros());
        meusLivros3.addAll(meusLivros.entrySet());
        System.out.println(meusLivros3 +"\n");


        System.out.println("--\tOrdem número de página\t--");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPagina());
        meusLivros4.addAll(meusLivros.entrySet());
        System.out.println(meusLivros4 +"\n");
    }

}
// Comparadores
class ComparatorNomeLivros implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareTo(l2.getValue().getNome());
    }
}
class ComparatorPagina implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
    }
}
