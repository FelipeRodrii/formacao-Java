import java.util.Comparator;
public class ComparatorAno implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        if (Integer.compare(l1.getAnoPublicacao(), l2.getAnoPublicacao()) < 0)
            return -1;
        else if (Integer.compare(l1.getAnoPublicacao(), l2.getAnoPublicacao())>0)
            return 1;
        else
            return 0;
    }
}
