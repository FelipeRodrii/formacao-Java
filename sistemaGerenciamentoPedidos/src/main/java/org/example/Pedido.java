package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String cliente;
    private List<Produto> produtos;
    private boolean finalizado;

    public Pedido(String cliente) {
        this.cliente= cliente;
        this.produtos = new ArrayList<>();
        this.finalizado = false;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos(){
        return produtos;
    }

    public void adicionarProduto(Produto produto){
        try{
            produtos.add(produto);
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public double calcularTotal(){
        double total=0d;

        try {
            total = produtos.stream().mapToDouble(p -> p.getPreco()).sum();
            return total;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        return total;
    }

    public void finalizarPedido(){
        try{
            finalizado= true;
        }catch(IllegalStateException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Pedido->" +
                "Cliente: " + cliente +
                " Finalizado: " + finalizado +
                 " Produtos: "+ produtos +
                  " Total: "+ calcularTotal();
    }
}
