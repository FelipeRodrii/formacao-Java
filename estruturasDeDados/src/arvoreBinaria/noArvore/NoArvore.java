package arvoreBinaria.noArvore;

// Classe representando cada Nó que iremos inserir em nossa árvore.
public class NoArvore<T extends Comparable<T>> {

    // Os atributos desta Classe serão o nosso conteudo, objeto que iremos guardar em nosso nó(unidade) da árvore
    // binária.
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
