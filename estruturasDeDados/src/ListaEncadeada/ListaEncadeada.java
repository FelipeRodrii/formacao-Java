package ListaEncadeada;
import No.No;

public class ListaEncadeada<T> {

    private No<T> item;

    public ListaEncadeada(){
        this.item = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No(conteudo);
        if(this.isEmpty()){
            item = novoNo;
            return;
        }
        No<T> itemAux= item;
        for (int i = 0; i < this.size(); i++) {
            itemAux = itemAux.getProxNo();
        }
        itemAux.setProxNo(novoNo);

    }

    public T remove(int index){
        validaIndice(index);
        No<T> itemPivor = getItem(index);
        if (index == 0){
            item = itemPivor.getProxNo();
            return itemPivor.getConteudo();
        }
        No<T> itemAnterior = getItem(index-1);
        itemAnterior.setProxNo(itemPivor.getProxNo());
        return itemPivor.getConteudo();
    }

    private No<T> getItem(int index){
        validaIndice(index);
        No<T> itemAuxiliar = item;
        No<T> itemRetorno = null;
        for (int i = 0; i <=index ; i++){
            itemRetorno = itemAuxiliar;
            itemAuxiliar = itemAuxiliar.getProxNo();
        }
        return itemRetorno;
    }

    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não Existe conteúdo no índice "+ index + "desta lista. Esta lista só vai atéo índice " + ultimoIndice + ".");
        }
    }

    public T getIndex(int index){
        return getItem(index).getConteudo();
    }

    public boolean isEmpty(){
        return item == null ? true : false;
    }

    public int size(){
        int tamanhoList= 0;
        No<T> itemAux = item;
        while(true){
            if(itemAux != null){
                tamanhoList++;
                if(itemAux.getProxNo() !=null){
                    itemAux = itemAux.getProxNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoList;
    }


    public No<T> getItem() {
        return item;
    }

    public void setItem(No<T> item) {
        this.item = item;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> itemAuxiliar = item;
        for (int i = 0; i < size(); i++) {
            strRetorno += "[No{conteudo=" + itemAuxiliar.getConteudo() +"}] --->";
            itemAuxiliar = itemAuxiliar.getProxNo();

        }
        return "ListaEncadeada{" +
                "item=" + item +
                '}';
    }

}
