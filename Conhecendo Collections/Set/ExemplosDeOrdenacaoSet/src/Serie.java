import java.util.Objects;

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpidodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpidodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpidodio(Integer tempoEpidodio) {
        this.tempoEpisodio = tempoEpidodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpidodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    // Comparable criado para podermos ordenar os dados armazenados em nosso treeSet de Serie.
    @Override
    public int compareTo(Serie o) {
        int nome = this.getNome().compareTo(o.getNome());
        if(nome!=0) return nome;

        int genero = this.getGenero().compareTo(o.getGenero());
        if (genero !=0) return genero;

        return (Integer.compare(this.getTempoEpisodio(), o.getTempoEpisodio()));
    }
}
