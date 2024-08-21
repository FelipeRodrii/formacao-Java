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
        if (arcoIris.isEmpty()) throw new StringIndexOutOfBoundsException("Coleção Vazia ");
            Iterator<Cor> aux = arcoIris.iterator();
            String retorno="";

            while(aux.hasNext()){
                retorno += aux.next() + "\n";
            }
            return retorno;
    }

    public TreeSet<Cor> ordemAlfabetica(){
        TreeSet<Cor> ordenada = new TreeSet<>(arcoIris);
        if (ordenada.isEmpty()) throw new StringIndexOutOfBoundsException("Coleção Vazia");

        return ordenada;
    }

    public String ordemInversa(){
        TreeSet<Cor> aux = new TreeSet<>(arcoIris);
        if(aux.isEmpty()) throw new StringIndexOutOfBoundsException("Coleção Vazia");

        Iterator<Cor> inverso = aux.descendingIterator();
        String retorno= "";
        while(inverso.hasNext()) {
            retorno += inverso.next()+ " - ";
        }
        return retorno;
    }

    // Detalhe interessante, o método Next() sempre irá chamar o próximo elemento, então cada vez que ele é chamado
    // além de chamar o próximo elemento do iterator ele muda o Next() para o próximo desses, então usar esse método
    // mais de uma vez pode acabar pulando elementos o iterator.
    public String coresComV(){
        Iterator<Cor> aux = arcoIris.iterator();
        String retorno="";

        while(aux.hasNext()){
            Cor corAtual = aux.next();
            if (corAtual.getCor().toUpperCase().charAt(0) == 'V'){
                retorno+= corAtual + "-";
            }
        }
        return retorno;
    }

    // Nota, para remover o objeto da nossa coleção, não enquanto estivermos usando o Iterator,não podemos remover
    // diretamenta da coleção mas sim do iterator utilizado que por sua vez irá remover diretamente da Coleção, isto
    // é pq o Iterator não Cria ou cópia a coleção, ele intera 'olhando' a coleção e mostrando os elementos dela,
    // assim, qualquer alteração na coleção enuqanto iteramos com o iterator, irá desincronizar ambas. Por isso
    // podemos mudar direto no Iterator e ele mudar a nossa coleção.
    public void removerSemLetraV(){
        Iterator<Cor> aux = arcoIris.iterator();

        while(aux.hasNext()){
            Cor corAtual = aux.next();
            if (corAtual.getCor().toUpperCase().charAt(0) != 'V'){
                aux.remove();
            }
        }
    }

    public void limpaCollecao(){
        arcoIris.clear();
    }

    public boolean isEmpty(){
        return this.arcoIris.isEmpty();
    }




}
