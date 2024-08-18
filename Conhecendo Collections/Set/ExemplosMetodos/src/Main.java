import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         * O HashSet não deixa que adicionemos items duplicados, e tudo que adicionarmos aqui será armazenado de
         * forma totalmente aleatória e também não possui qualquer método de pesquisa ou inserção em posições
         * especificas,(GET's e SET's) porém tem uma ótima performance.
         */

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println("Confira se a nota 5.0 está no conjunto: "+ notas.contains(5d));

        System.out.println("Exiba a menor nota:" + Collections.min(notas));
        System.out.println("Exiba a maior nota:" + Collections.max(notas));

        /*
         * O Iterador é uma classe que nos permite percorrer nossas coleções, List, Set Map etc... podemos percorrer
         * de outras formas  Claro, mas o Iterator está aqui para facilitar o processo .
         * Seus dois principais métodos são: hasNext() ---> Verifica se ainda possuí elementos dentro de nossa
         * coleção e retorna um booleano(True or False).
         * next() ---> Esse método retorna o próximo valor da coleção
         */
        Iterator<Double> iterator = notas.iterator();
        Double soma= 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A soma dos valores é: "+  String.format("%.2f", soma));

        System.out.println("A média das notas: "+ String.format("%.2f", (soma/ notas.size())));

        System.out.println("Remova as notas menores do que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() < 7d) iterator1.remove();
        }
        System.out.println(notas);

        /* O LinkedHashSet, também não aceita duplicatas porém, aceita que guardemos os dados na ordem que o
         * inserirmos (bem mais tolerante), sua performance é um pouco inferior ao Hashset normal, também não possuí
         * métodos(Get's e Set's).
         * Tudo que fizemos acima pode ser feito aqui,então vamos poupar linhas(estou com preguiça papai...)
         */

        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(8d);
        notas2.add(3.6);
        System.out.println("Impressão do LinkedHashSet");
        System.out.println(notas2);

        /* E aqui teremos a ultima versão, nosso TreeSet, diferente dos outros 3 esse é o certinho, ele sempre irá
         * guardar nossos dados de maneira ordenada, se forem numeros do menor para o maior e se String's de maneira
         * alfabetica.
         * Vale lembrar, por ele guardar os dados de forma ordenada, ele apenas funciona para objetos que tenham um
         * Comparator implementado nele(é o caso do nosso tipo Double). Um bom desafio é tentar criar um objeto com
         * um comparator e tentar criar uma TreeSet.
         */

        System.out.println("Exibindo os dados em ordem crescente utilizando o Treeset");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apagando todo um conjunto com o método 'clear'");
        notas2.clear();

        System.out.println("Confirindo se o conjunto está vázio: " + notas2.isEmpty());
    }
}