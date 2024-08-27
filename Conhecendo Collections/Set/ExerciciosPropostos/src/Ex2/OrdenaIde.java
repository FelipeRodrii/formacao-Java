package Ex2;

import java.util.Comparator;

public class OrdenaIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {

        return l1.getIde().compareTo(l2.getIde());
    }
}

