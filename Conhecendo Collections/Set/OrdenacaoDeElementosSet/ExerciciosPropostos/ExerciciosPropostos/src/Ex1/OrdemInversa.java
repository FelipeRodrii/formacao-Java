package Ex1;

import java.util.Comparator;

public class OrdemInversa implements Comparator<Cor> {

    @Override
    public int compare(Cor c1, Cor c2) {
        return c1.getCor().compareTo(c2.cor);
    }

    @Override
    public Comparator<Cor> reversed() {
        return Comparator.super.reversed();
    }
}
