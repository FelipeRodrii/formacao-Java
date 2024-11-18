package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GerenciadorDePedidos {

    private List<Pedido> pedidos;
    NotificacaoService notificacaoService;

    public GerenciadorDePedidos(NotificacaoService notificacaoService) {
        this.pedidos= new ArrayList<>();
        this.notificacaoService = notificacaoService;
    }

    public void criarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public void buscarPedidoPorCliente(String cliente){
        //Pedido pedido = pedidos.stream().allMatch(p -> p.getCliente().equalsIgnoreCase(cliente));
         pedidos.stream().filter(p -> p.getCliente().equalsIgnoreCase(cliente)).forEach(System.out::println);
    }
}
