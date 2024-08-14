package arvoreBinaria.noArvore;

public class NoArvore<T extends Comparable<T>> {

    private T conteudo;
    private NoArvore<T> noDir;
    private NoArvore<T> noEsq;

    public  NoArvore(T conteudo){
        this.conteudo= conteudo;
        this.noEsq = noDir = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoArvore<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(NoArvore<T> noDir) {
        this.noDir = noDir;
    }

    public NoArvore<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(NoArvore<T> noEsq) {
        this.noEsq = noEsq;
    }

    @Override
    public String toString() {
        return "NoArvore{" +
                "conteudo=" + conteudo +
                '}';
    }
}
