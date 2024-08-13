package ListaCircular;

import ListaCircular.No.NoCirc;

public class ListaCircular<T>{

    private NoCirc<T> cabeca;
    private NoCirc<T> cauda;
    private int tamanhoLista= 0;

    public ListaCircular(){
        this.cabeca= null;
        this.cauda= null;
        this.tamanhoLista= 0;
    }

    public void add(T conteudo){
        NoCirc<T> novoNo = new NoCirc<>(conteudo);
        if (tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(this.cauda);
        }else{
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        tamanhoLista++;
    }

    public void remove(int index){
        if (index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice maior que o tamanho da lista");

        NoCirc<T> noAuxiliar = cauda;
        if (index == 0){
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(cauda);
        }else if(index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }else {
            for (int i = 0; i < index-1; i++) {
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private NoCirc<T> getNo(int index){
        if(isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");
        if(index==0){
            return this.cauda;
        }

        NoCirc<T> noAuxiliar = this.cauda;
        for (int i = 0; (i < index ) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoCirc<T> noAuxiliar = this.cauda;
        for (int i = 0; i < size(); i++) {
            strRetorno += "[No{conteudo="+ noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += size() != 0 ? "(Retorno a início)" : "[]";
        return strRetorno;
    }
}
