package Ex1;

import java.util.Comparator;
import java.util.Objects;

public class Cor implements Comparable<Cor>{

    String cor= null;

    public Cor(String cor) {
        setCor(cor);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cor cor1 = (Cor) o;
        return Objects.equals(cor, cor1.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cor);
    }

    @Override
    public String toString() {
        return "{" +
                "cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cor o) {
        return this.getCor().compareTo(o.getCor());
    }

}
