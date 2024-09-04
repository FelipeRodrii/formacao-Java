package Ex2;

import java.util.Comparator;
import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {

    private String nome;
    private int anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIDE() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return anoDeCriacao == that.anoDeCriacao && Objects.equals(nome, that.nome) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public String toString() {
        return "{" +
                "|nome='" + nome + '\'' +
                ", |anoDeCriacao=" + anoDeCriacao +
                ",|ide='" + ide + '\'' +
                '}';
    }


    @Override
    public int compareTo(LinguagemFavorita l) {
        int nome = this.getNome().compareTo(l.getNome());
        if(nome != 0 ) return nome;

        int ano = Integer.compare(this.getAnoDeCriacao(), l.getAnoDeCriacao());
        if(ano != 0) return ano;

        return this.getIDE().compareTo(l.getIDE());
    }
}
