import ListaCircular.ListaCircular;
import ListaDuplamenteEncadeada.ListaDupla;
import ListaEncadeada.ListaEncadeada;
import arvoreBinaria.ArvoreBinaria;
import arvoreBinaria.model.Obj;

import java.util.Objects;

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

        /*
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

         */

        /*
        ListaCircular<String> minhaListaCircular = new ListaCircular<String>();

        minhaListaCircular.add("c0");
        minhaListaCircular.add("c1");
        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        minhaListaCircular.add("c4");
        minhaListaCircular.add("c5");
        minhaListaCircular.add("c6");
        minhaListaCircular.add("c7");
        minhaListaCircular.add("c8");
        minhaListaCircular.add("c9");

        System.out.println(minhaListaCircular);
         */

        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));
        minhaArvore.inserir(new Obj(32));
        minhaArvore.remover(new Obj(32));

        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPostOrdem();

    }
}