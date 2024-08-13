package ListaCircular.No;

public class NoCirc<T>{
    private T conteudo;
    private NoCirc<T> noProximo;

    public NoCirc(T conteudo){
        this.conteudo= conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoCirc<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(NoCirc<T> noProximo) {
        this.noProximo = noProximo;
    }

    @Override
    public String toString() {
        return "NoCirc{" +
                "conteudo=" + conteudo +
                '}';
    }
}
