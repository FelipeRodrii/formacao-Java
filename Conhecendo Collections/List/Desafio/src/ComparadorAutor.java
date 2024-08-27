import java.util.Comparator;

public class ComparadorAutor implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2){
        if (l1.getAutor().compareTo(l2.getAutor()) < 0)
            return -1;
        else if (l1.getAutor().compareTo(l2.getAutor())> 0)
            return 1;
        else
            return 0;
    }
}
