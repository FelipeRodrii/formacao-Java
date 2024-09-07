package br.dio.collection;

import java.util.Objects;

public class Produto {
    private int id;
    private String nome;

    public Produto(int id, String nome){
        this.id= id;
        this.nome= nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Produto" +"id= "+ id + "| Nome= "+ nome + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id == produto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

