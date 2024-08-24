package arvoreBinaria.model;

import java.util.Objects;
// Classe que Herda ObjArvore<Obj>, nos obriga a implementar os método equals, hashcode, compareTo e toString para
// nossa classe Obj(representando nosso objeto no nó, especificado no Generics)
public class Obj extends ObjArvore<Obj> {

    Integer meuValor=0;

    // Nossa classe Obj terá um único atributo do tipo Inteiro
    public Obj(Integer meuValor) {
        this.meuValor = meuValor;
    }

    // Método Equals que verifica se um objeto é igual ao outro vendo se ambos ocupam o mesmo endereço de memória,
    // conparando as classes e outras verificações que acharmos necessários, por exemplo, neste equals, indicamos se
    // dois objeos tiverem o mesmo valor Inteiro, eles serão considerados iguais.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(meuValor, obj.meuValor);
    }

    // Método HashCode retorna um inteiro que serve como código hash(Calcúlo matematico que serve para criptgrafar
    // arquivos, neste caso uma identificação).O hash guarda seus dados em Bucket's(compartimento ou lista que armazena
    // os dados de acordo com seu valor hash) e cada espaço no bucket é identificado com um valor exclusivo, e dois
    // obejtos com o mesmo valor hash serão 'desempatados' pelo equals. Essa  implementação é essencial em coleções hash.
    // Neste caso estamos usando o valor 'meuValor' como uma espécie do Id do Hash code, então ele sempre vai
    // comparar o Hashcode() de cada 'meuValor' dos objetos, e se iguais, ele irá verificar pelo equals.
    @Override
    public int hashCode() {
        return Objects.hash(meuValor);
    }

    // Comparação que estamos utilizando para ordenar nosso valor, assim a árvore irá saber em qual posição colocar os
    // dados
    @Override
    public int compareTo(Obj outro) {
        int i = 0;

        if (this.meuValor > outro.meuValor) {
            i = 1;
        } else if (this.meuValor < outro.meuValor) {
            i = -1;
        }
        return i;

    }

    // Método de impressão dos dados
    @Override
    public String toString() {
        return meuValor.toString();
    }
}
