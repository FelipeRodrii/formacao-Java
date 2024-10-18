import java.io.*;
import static java.lang.System.currentTimeMillis;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExercicioIOBytes {

    public static  void copiarArquivoByte(String arquivo) throws IOException {
        File f = new File(arquivo);
        String nomeArquivo = f.getName();

        // Abrindo arquivo que será copiado
        /* InputStream is = new FileInputStream(nomeArquivo); // Fluxo de entrada que lê de um arquivo
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(nomeArquivo)); // Fluxo de entrada que
        armazena em um buffer */
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(nomeArquivo)); // Padrão decorator

        String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf(".txt")).concat("-copy2.txt");//
        // preparando o nome do novo arquivo cópia
        File fcopy = new File(nomeArquivoCopy);

        /*OutputStream os = new OutputStream(f.copy.getName()); //Fluxo de saída que grava em um arquivo
        BufferedOutputStream bos = new BufferedOutputStream(os); // Fluxo de saida armazenada em um buffer */
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fcopy));

        int line = 0;
        while ((line = bis.read()) != -1){
            bos.write((char) line);
            bos.flush();
        }
        bis.close();
        bos.close();

        System.out.printf("Arquivo %s copiado com sucesso (Por Bytes)! \n" +
                " Diretório: %s \n", fcopy.getName(), fcopy.getAbsolutePath());

    }


    private static void copiarArquivoCaracter(String arquivo) throws IOException {
        File file = new File(arquivo);
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));

        File fcopy = new File(file.getName().substring(0, file.getName().indexOf("txt")).concat("-copy.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy));

        String line = br.readLine();

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while(line != null);

        bw.flush();
        br.close();
        bw.close();

        System.out.printf("O arquivo %s foi copiado com sucesso (Caracter) \n" +
                "Local: %s \n", fcopy.getName(), fcopy.getAbsolutePath());

    }


    public static void main(String[] args) throws IOException {
        long tempoInicial = currentTimeMillis();

        copiarArquivoByte("Roteiro.txt");
        //copiarArquivoCaracter("Roteiro.txt");

        System.out.println("O método foi executado em " + (currentTimeMillis() - tempoInicial));


    }

}