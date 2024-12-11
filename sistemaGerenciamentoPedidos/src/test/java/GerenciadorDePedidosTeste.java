import org.example.GerenciadorDePedidos;
import org.example.NotificacaoService;
import org.example.Pedido;
import org.example.Produto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(MockitoExtension.class)
public class GerenciadorDePedidosTeste {

    @Spy
    private List<Pedido> pedidos = new ArrayList<>();

    @Captor
    private ArgumentCaptor<String> capturaString;

    @Mock
    NotificacaoService notificacaoService;

    @InjectMocks
    private GerenciadorDePedidos gerenciadorDePedidos;

    @Test
    public void adicionarpedidos(){
        criarPedidosParaTeste();
    }

    @Test
    public void validaCriacaoPedido(){
        criarPedidosParaTeste();
        gerenciadorDePedidos.criarPedido(pedidos.get(1));
    }

    @Test
    public void validaBuscarPedidoPorCliente(){
        criarPedidosParaTeste();

        gerenciadorDePedidos.buscarPedidoPorCliente("Brino");
        assertEquals("Brino", pedidos.get(0).getCliente());

        gerenciadorDePedidos.buscarPedidoPorCliente("Rbiana");
        assertEquals("Rbiana", pedidos.get(1).getCliente());
    }

    @Test
    public void validaListarPedidosPorCategoria(){
        criarPedidosParaTeste();
        List<Pedido> pedidosCategoria= gerenciadorDePedidos.listarPedidosPorCategoria("Limpeza");
        //assertEquals("Limpeza", pedidosCategoria.get(0).getProdutos().get(0).getCategoria());


    }

    @Test
    public void validarEnvioNotificacaoEmail(){
       assertEquals("Enviando notiicação por Email...",  gerenciadorDePedidos.enviarNotificacaoEmail());
    }
    @Test
    public void validarEnvioNotificacaoSMS(){
       assertEquals("Enviando notificação por SMS...",  gerenciadorDePedidos.enviarNotificacaoSMS());
    }

    public void criarPedidosParaTeste(){
        Pedido pedido1 = new Pedido("Bruno");
        Pedido pedido2 = new Pedido("Fabiana");
        Pedido pedido3 = new Pedido("Felipe");
        Pedido pedido4 = new Pedido("Cintia");
        Pedido pedido5 = new Pedido("Gustavo");

        pedido1.adicionarProduto(new Produto("Detergente", "Limpeza", 3.90));
        pedido2.adicionarProduto(new Produto("Sabão Barra", "Limpeza", 5.90));
        pedido3.adicionarProduto(new Produto("Alvejante", "Limpeza", 33.90));
        pedido4.adicionarProduto(new Produto("Hamburguer", "Comida", 38.90));
        pedido5.adicionarProduto(new Produto("HeadSet", "Eletronico", 129.00));

        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
    }
}
