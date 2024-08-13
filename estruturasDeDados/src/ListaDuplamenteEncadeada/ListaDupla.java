package ListaDuplamenteEncadeada;
import ListaDuplamenteEncadeada.No.NoDuplo;
import ListaEncadeada.No.No;

public class ListaDupla<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista = 0;

    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
        novoNo.setProxNo(null);
        novoNo.setAntNo(ultimoNo);
        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setProxNo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento) {
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setProxNo(noAuxiliar);

        if (novoNo.getProxNo() != null) {
            novoNo.setAntNo(noAuxiliar.getAntNo());
            novoNo.getProxNo().setAntNo(novoNo);
        } else {
            novoNo.setAntNo(ultimoNo);
            ultimoNo = novoNo;
        }
        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getAntNo().setProxNo(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index) {
        if (index == 0) {
            primeiroNo = primeiroNo.getProxNo();
            if (primeiroNo != null) {
                primeiroNo.setAntNo(null);
            }
        } else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getAntNo().setProxNo(noAuxiliar.getProxNo());
            if (noAuxiliar != ultimoNo) {
                noAuxiliar.getProxNo().setAntNo(noAuxiliar.getAntNo());
            } else {
                ultimoNo = noAuxiliar;
            }
        }
        tamanhoLista--;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getProxNo();
        }
        return noAuxiliar;
    }

    public int size() {
        return tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; i < size()-1; i++) {
            if(noAuxiliar == null){
                break;
            }
            strRetorno += "[No{Conteudo= " + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getProxNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
