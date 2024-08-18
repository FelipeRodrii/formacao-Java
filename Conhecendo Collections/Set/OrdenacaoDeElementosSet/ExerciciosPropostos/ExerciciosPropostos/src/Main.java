import Ex1.ArcoIris;
import Ex1.Cor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* Crie um conjunto contendo as cores do arco-íris e:
        A: Exiba todas as cores uma abaixo da outra
        B: A quantidade de cores que o arco-íris tem
        C: Exiba as cores em ordem alfabética
        D: Exiba as cores na ordem inversa da que foi informada
        E: Exiba todas as cores que começam com a letra "V"
        F: Remova todas as cores que não começam com a letra "V"
        G: Limpe o conjunto
        H: Confira se o conjunto está vazio
        */

        ArcoIris meuArcoIris = new ArcoIris(){{
            add(new Cor("Vermelho"));
            add(new Cor("Laranja"));
            add(new Cor("Amarelho"));
            add(new Cor("Verde"));
            add(new Cor("Azul"));
            add(new Cor("Anil"));
            add(new Cor("Violeta"));
        }};

        System.out.println("\t--Exiba todas as cores uma abaixo da outra--\t");
        System.out.println(meuArcoIris.impressaoCores());

        System.out.println("\t--Quantidade de Cores--\t");
        System.out.println(meuArcoIris.size());

        System.out.println("\t--Ordem Alfabetica--\t");
        System.out.println(meuArcoIris.ordemAlfabetica());

        System.out.println("\t--Ordem Inversa--\t");
        System.out.println(meuArcoIris.ordemInversa());
    }
}