import org.example.GerenciadorDePedidos;
import org.example.NotificacaoService;
import org.example.Pedido;
import org.example.Produto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class GerenciadorDePedidosTeste {

    private List<Pedido> pedidos = new ArrayList<>();

    @Test
    public void adicionarpedidos(){
        Pedido pedido1 = new Pedido("Brino");
        Pedido pedido2 = new Pedido("Rbiana");
        Pedido pedido3 = new Pedido("Felipe");

        pedido1.adicionarProduto(new Produto("Detergente", "Limpeza", 3.90));
        pedido2.adicionarProduto(new Produto("Hamburguer", "Comida", 38.90));
        pedido3.adicionarProduto(new Produto("HeadSet", "Eletronico", 129.00));

        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
    }
    @Mock
    NotificacaoService notificacaoService;

    @InjectMocks
    private GerenciadorDePedidos gerenciadorDePedidos;

    @Test
    public void validaCriacaoPedido(){
        Pedido pedido1 = new Pedido("Brino");
        Pedido pedido2 = new Pedido("Rbiana");
        Pedido pedido3 = new Pedido("Felipe");

        pedido1.adicionarProduto(new Produto("Detergente", "Limpeza", 3.90));
        pedido2.adicionarProduto(new Produto("Hamburguer", "Comida", 38.90));
        pedido3.adicionarProduto(new Produto("HeadSet", "Eletronico", 129.00));

        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        gerenciadorDePedidos.criarPedido(pedidos.get(1));

    }

    @Test
    public void validaBuscarPedidoPorCliente(){
        gerenciadorDePedidos.buscarPedidoPorCliente("Brino");
        assertEquals("Brino", pedidos.get(0).getCliente());

        gerenciadorDePedidos.buscarPedidoPorCliente("Rbiana");
    }

    @Test
    public void validaListarPedidosPorCategoria(){
        gerenciadorDePedidos.listarPedidosPorCategoria("Limpeza");
    }


}
