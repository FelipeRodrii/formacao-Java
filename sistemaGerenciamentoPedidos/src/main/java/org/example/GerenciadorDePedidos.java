package org.example;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

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

    public List<Pedido> buscarPedidoPorCliente(String cliente){
        //Pedido pedido = pedidos.stream().allMatch(p -> p.getCliente().equalsIgnoreCase(cliente));
        try{
            List<Pedido> pedidoPorCliente =
                    pedidos.stream().filter(p -> p.getCliente().equalsIgnoreCase(cliente)).toList();
            return pedidoPorCliente;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Pedido> listarPedidosPorCategoria(String categoria){
        try {
            List<Pedido> pedidosPorCategoria = pedidos.stream().filter(pedido -> pedido.getProdutos()
                    .stream().anyMatch(produto -> produto.getCategoria()
                            .equalsIgnoreCase(categoria))).toList();
            return pedidosPorCategoria;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String enviarNotificacaoEmail(){
        notificacaoService = new NotificacaoEmail();
        return notificacaoService.enviarNotificacao();
    }

    public String enviarNotificacaoSMS(){
        notificacaoService = new NotificacaoSMS();
        return notificacaoService.enviarNotificacao();
    }

}
