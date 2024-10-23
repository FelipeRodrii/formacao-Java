import java.io.Serializable;

public class Gato implements Serializable{//Isso é um marcador que informa à JVM que a classe pode ser serializada.

    public static final long serialVersionUID = 3l; //Identificador de versão: A classe serializável pode (e deve) definir um serialVersionUID, que é uma constante que garante a compatibilidade entre versões
    private String nome;
    private String cor;
    private int idade;
    private boolean castrado;
    private transient boolean ronrona; //transient aqui serve para deixar esse atributo "invisível" para serialização

    public Gato(String nome, String cor, int idade, boolean castrado, boolean ronrona){
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.castrado = castrado;
        this.ronrona = ronrona;
    }


    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public boolean isRonrona() {
        return ronrona;
    }
}