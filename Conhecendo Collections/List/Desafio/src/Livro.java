import java.util.Comparator;

public class Livro implements Comparable<Livro>{

    private String titulo, autor, genero;
    private int anoPublicacao;

    public Livro(String titulo, String autor, String genero, int anoPublicacao){
        this.titulo= titulo;
        this.autor= autor;
        this.genero= genero;
        this.anoPublicacao= anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro Titulo=" + titulo + ", Autor=" + autor + ", Gênero=" + genero + ", Ano de Publicação="
                + anoPublicacao + "\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        return true;
    }

    @Override
    public int compareTo(Livro l) {
        if(getTitulo().compareTo(l.getTitulo()) < 0)
            return -1;
        else if(getTitulo().compareTo(l.getTitulo()) > 0)
            return 1;
        else
            return 0;
    }
}
