import ListaDuplamenteEncadeada.ListaDupla;
import ListaEncadeada.ListaEncadeada;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<String>();

        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");

        System.out.println(minhaListaEncadeada.getIndex(0));
        System.out.println(minhaListaEncadeada.getIndex(1));
        System.out.println(minhaListaEncadeada.getIndex(2));
        System.out.println(minhaListaEncadeada.getIndex(3));

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(3);

        System.out.println(minhaListaEncadeada);
 */

        ListaDupla<String> minhalistaDupla = new ListaDupla<>();

        minhalistaDupla.add("c1");
        minhalistaDupla.add("c2");
        minhalistaDupla.add("c3");
        minhalistaDupla.add("c4");
        minhalistaDupla.add("c5");
        minhalistaDupla.add("c6");
        minhalistaDupla.add("c7");

        System.out.println(minhalistaDupla);

        minhalistaDupla.remove(3);
        minhalistaDupla.add(3, "99");

        System.out.println(minhalistaDupla);
        System.out.println(minhalistaDupla.get(3));
    }
}