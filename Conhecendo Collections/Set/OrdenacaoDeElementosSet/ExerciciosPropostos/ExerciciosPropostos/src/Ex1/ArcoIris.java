package Ex1;

import java.util.*;

public class ArcoIris{

    Set<Cor> arcoIris = new LinkedHashSet<>();
    public void add(Cor cor){
        arcoIris.add(cor);
    }

    public int size(){
        return arcoIris.size();
    }

    public String impressaoCores(){
        Iterator<Cor> aux = arcoIris.iterator();
        String retorno=null;

        while(aux.hasNext()){
            retorno += aux.next() + "\n";
        }
        return retorno;
    }

    public TreeSet<Cor> ordemAlfabetica(){
        TreeSet<Cor> ordenada = new TreeSet<>(arcoIris);
        if (ordenada.isEmpty()) throw new StringIndexOutOfBoundsException("Coleção Vazia!");

        return ordenada;
    }

    public String ordemInversa(){
        TreeSet<Cor> aux = new TreeSet<>(arcoIris);
        if(aux.isEmpty()) throw new StringIndexOutOfBoundsException("Coleção Vazia");

        Iterator<Cor> inverso = aux.descendingIterator();
        String retorno= null;
        while(inverso.hasNext()) {
            retorno += " - "+inverso.next();
        }
        return retorno;
    }

    public String coresComV(LinkedHashSet<Cor> arcoIris){
        return null;
    }

    public void limpaCollecao(){
        arcoIris.clear();
    }




}
