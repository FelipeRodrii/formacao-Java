package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> produtos;
    private boolean finalizado;

    public Pedido() {
        this.produtos = new ArrayList<>();
        this.finalizado = false;
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
}
