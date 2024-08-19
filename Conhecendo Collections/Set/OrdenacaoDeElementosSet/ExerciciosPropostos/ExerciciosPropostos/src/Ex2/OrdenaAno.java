package Ex2;

import java.util.Comparator;

public class OrdenaAno implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
    }
}
