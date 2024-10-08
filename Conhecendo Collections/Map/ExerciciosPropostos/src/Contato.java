import java.util.Objects;

public class Contato {

    private String nome="";
    private int numero=0;

    public Contato(String nome, int numero){
        this.nome= nome;
        this.numero= numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return numero == contato.numero && Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }

    @Override
    public String toString() {
        return "nome= " + nome + " |" +
                ", numero=" + numero +
                '\n';
    }
}
