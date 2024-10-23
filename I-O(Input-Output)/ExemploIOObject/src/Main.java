import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void serealizarObjeto() throws IOException {
        File file = new File("gato"); // representação/'mémoria' do documento
        Gato gato = new Gato("Jon","Tigrado",19,true, true);

        //ObjectOutputStream oos = null;

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file.getAbsolutePath()));
            oos.writeObject(gato);
        } catch(FileNotFoundException e){
            //caso apresente uma exception FileNotFoundException, imprima a frase abaixo no console
            System.out.printf("Arquivo %s não encntrado! Verifique o diretório %s", file.getName(), e.getMessage());
        } catch (IOException e){
            //caso apresente uma exception IOxception, imprima a frase abaixo no console:
            System.out.printf("Não foi possível criar um arquivo %s .", file.getName());
            e.printStackTrace();
        }
    }

    public static void desserializarObjeto(String arquivo){
        File file = new File(arquivo);

        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file.getName()));//abrir arquivo
            Gato gato = (Gato) ois.readObject();//método qu lê o objeto serealizado

            //impressão dos dados
            System.out.printf("\nNome....................: %s \n", gato.getNome());
            System.out.printf("\nIdade...................: %d \n", gato.getIdade());
            System.out.printf("\nCor.....................: %s \n", gato.getCor());
            System.out.printf("\nCastrado....................: %s \n", gato.isCastrado());
            System.out.printf("\nRonrona....................: %s \n", gato.isRonrona());

        } catch (FileNotFoundException e) {//captura exigida pelo método FileInputStream
            System.out.printf("Arquivo %s não encontrado! Verifique o diretório %s", file.getName(), e.getMessage());
        } catch (IOException e) {
            System.out.printf("Não foi possível abrir o arquivo %s", file.getName());
        } catch (ClassNotFoundException e) {
            System.out.printf("Não foi possivel ler o objeto do arquivo %s", file.getName());
        }
    }
    public static void main(String[] args) throws IOException {
        //serealizarObjeto();
        desserializarObjeto("gato");
    }
}





