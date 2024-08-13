package ListaDuplamenteEncadeada.No;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo antNo;
    private NoDuplo proxNo;

    public NoDuplo(T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo getAntNo() {
        return antNo;
    }

    public void setAntNo(NoDuplo antNo) {
        this.antNo = antNo;
    }

    public NoDuplo getProxNo() {
        return proxNo;
    }

    public void setProxNo(NoDuplo proxNo) {
        this.proxNo = proxNo;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                ", antNo=" + antNo +
                ", proxNo=" + proxNo +
                '}';
    }
}
