import Ex1.*;
import Ex2.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* Proposta 1 - Crie um conjunto contendo as cores do arco-íris e:
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

        System.out.println("\t--Exiba todas as cores que começam com a letra 'V'--\t");
        System.out.println(meuArcoIris.coresComV());

        System.out.println("Remova todas as cores que não começam com a letra 'V'");
        meuArcoIris.removerSemLetraV();
        System.out.println(meuArcoIris.impressaoCores());

        System.out.println("Verifica se a Coleção está vazia");
        meuArcoIris.limpaCollecao();

        System.out.println(meuArcoIris.isEmpty());

        /* Proposta 2 - Crie uma Classe Linguagem Favorita que possua os atributosnome,anoDeCriacao e ide. Em seguida,
        crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
        A: Ordem de inserçao
        B: Ordem Natural (noem)
        C: IDE
        D: Ano de criação e nome
        E: Nome, ano de criação e IDE
        Ao final, exiba as linguagens no console, um abaixo da outra
         */

        Set<LinguagemFavorita> minhasLinguagens = new LinkedHashSet<>();
        minhasLinguagens.add(new LinguagemFavorita("Java", 1996, "Intellij"));
        minhasLinguagens.add(new LinguagemFavorita("Python", 1989, "VSCode"));
        minhasLinguagens.add(new LinguagemFavorita("JavaScript", 1995, "NetBeans"));

        System.out.println("\t-- Ordem de Inserção --\t");
        System.out.println(minhasLinguagens);

        Set<LinguagemFavorita> minhasLinguagens1 = new TreeSet<>(minhasLinguagens);

        System.out.println("\t-- Ordem Natural (Nome) --\t");
        System.out.println(minhasLinguagens1);

        System.out.println("\t-- IDE --\t");
        Set<LinguagemFavorita> minhasLinguagens2 = new TreeSet<>(new OrdenaIde()){{
            add(new LinguagemFavorita("Java", 1996, "Intellij"));
            add(new LinguagemFavorita("Python", 1989, "VSCode"));
            add(new LinguagemFavorita("JavaScript", 1995, "NetBeans"));
        }};
        for (LinguagemFavorita l2 : minhasLinguagens2)
            System.out.println(l2.getIde() +" - "+  l2.getNome() + " - " + l2.getAnoDeCriacao()+ " - ");

        System.out.println("\t-- Ano de criação e nome --\t");
        Set<LinguagemFavorita> minhasLinguagens3 = new TreeSet<>(new OrdenaAno()){{
            add(new LinguagemFavorita("Java", 1996, "Intellij"));
            add(new LinguagemFavorita("Python", 1989, "VSCode"));
            add(new LinguagemFavorita("JavaScript", 1995, "NetBeans"));
        }};
        for (LinguagemFavorita l3 : minhasLinguagens3)
            System.out.print(l3.getIde() +" - "+ l3.getNome() +" - "+ l3.getAnoDeCriacao() + " - ");







    }
}