package exercicioArvoreBinária.NoArvoreEx;

public class NoArvoreEx<T extends Comparable> {

    private T conteudo;
    private NoArvoreEx<T> noDir;
    private NoArvoreEx<T> noEsq;

    public NoArvoreEx(T conteudo){
        this.conteudo= conteudo;
        this.noDir = this.noEsq = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoArvoreEx<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(NoArvoreEx<T> noDir) {
        this.noDir = noDir;
    }

    public NoArvoreEx<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(NoArvoreEx<T> noEsq) {
        this.noEsq = noEsq;
    }

    @Override
    public String toString() {
        return "NoArvoreEx [conteudo=" + conteudo + "]";
    }

        
    
    
}
