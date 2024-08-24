package arvoreBinaria.model;

public abstract class ObjArvore<T> implements Comparable<T>{

    // Abstração apenas para as classes de comparação da nossa árvore, para verificar se nossos nós são iguai a
    // ordenação de nossos nós e sua impressão com o toString();
    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int compareTo(T outro);
    public abstract String toString();
}
