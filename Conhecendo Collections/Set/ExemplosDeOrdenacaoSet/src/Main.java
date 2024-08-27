import com.sun.security.jgss.GSSUtil;

import java.util.*;

/* Dadas as seguinte informações sobre minhas séries favoritas, crie um conjunto e ordene este conjunto
exibindo: (nome - genero - tempo de episódio);

Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = Nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = Nome: that '70s show, genero: comédia, tempoEpisodio: 25

 */
public class Main {
    public static void main(String[] args) {

    // HashSet, aqui dentro nossos dados serão armazenados de forma aleatória como já vimos.
        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
            add(new Serie("B99", "comédia", 20));
        }};
        for (Serie serie : minhasSeries)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpidodio());

        // LinkedHashSet, aqui nossos dados serão armazenados na ordem que foram inseridos.
        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
            add(new Serie("B99", "coméia", 20));
        }};
        for (Serie serie :
                minhasSeries1)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpidodio());

        //TreeSet, diferente dos outros este armazena os nossos dados em uma forma natural ou seja uma ordenação dos
        // dados inseridos, um detalhe importante é, o TreeSet só funciona com métodos que possuem um
        // Comparable/Comparator, ou teremos que criar esse Comparable e Comparator na Classe alvo.
        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");

        //Neste caso nossa classe Serie possuí um Comparable
        Set<Serie> minhasSeries2 = new TreeSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
            add(new Serie("B99", "comédia", 20));
        }};
        for (Serie serie :
                minhasSeries2)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpidodio());

        //Esse Treeset utiliza o ComparatonomegeneroTempoEpisodio criado em uma classe separada
        System.out.println("--\tOrdem nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio()){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
            add(new Serie("B99", "comédia", 20));
        }};
        for (Serie serie :
        minhasSeries3)
    System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpidodio());


    }
}

     class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie> {

        @Override
        public int compare(Serie s1, Serie s2) {
            int nome = Integer.compare(s1.getTempoEpidodio(), s2.getTempoEpidodio());
            if (nome != 0) return nome;

            int genero = s1.getGenero().compareTo(s2.getGenero());
            if (genero != 0) return genero;

            return Integer.compare(s1.getTempoEpidodio(), s2.getTempoEpidodio());
        }
    }

