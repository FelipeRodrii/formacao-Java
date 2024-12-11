package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GerenciadorDePedidos gerenciadorDePedidos= new GerenciadorDePedidos();

        Pedido pedido1 = new Pedido("Felipe Rodrigues");
        Pedido pedido2 = new Pedido("Caio");
        Pedido pedido3 = new Pedido("Giovanna");
        Pedido pedido4 = new Pedido("Felipe Xavier");
        Pedido pedido5 = new Pedido("Felipe Santos");
        Pedido pedido6 = new Pedido("Felipe");

        pedido2.adicionarProduto(new Produto("Coxinha", "Alimenticio", 3d));
        pedido2.adicionarProduto(new Produto("Coca-Latinha", "Alimenticio", 4d));
        pedido2.finalizarPedido();

        pedido6.adicionarProduto(new Produto("Coca-Cola 3l", "Alimenticio", 8d));
        pedido6.adicionarProduto(new Produto("Cx-KitKat", "Alimenticio", 75d));
        pedido6.finalizarPedido();

        pedido3.adicionarProduto(new Produto("Pastel + Caldo-Cana", "Alimenticio", 12d));
        pedido3.finalizarPedido();

        gerenciadorDePedidos.criarPedido(pedido1);
        gerenciadorDePedidos.criarPedido(pedido2);
        gerenciadorDePedidos.criarPedido(pedido3);
        gerenciadorDePedidos.criarPedido(pedido4);
        gerenciadorDePedidos.criarPedido(pedido5);
        gerenciadorDePedidos.criarPedido(pedido6);

        List<Pedido> busca= gerenciadorDePedidos.listarPedidosPorCategoria("Alimenticio");

        for (Pedido p: busca)
            System.out.printf(p.getCliente() + " " + p.getProdutos() + "\n");

        String msn= gerenciadorDePedidos.enviarNotificacaoEmail();
        System.out.println(msn);

        List<Pedido> matches= gerenciadorDePedidos.buscarPedidoPorCliente("felipe");

        for(Pedido pedido: matches)
            System.out.printf(pedido + "\n");



    }
}