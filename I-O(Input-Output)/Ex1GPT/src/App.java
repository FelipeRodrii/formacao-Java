import java.io.*;
import java.util.Scanner;
public class App {

    public static void criarArquivoEscrecer(String nomeArquivo) throws IOException{
        /*Criar programa que peça ao usuário para digitar uma lista de nomes e a final gravas esses nomes em nomes.txt o programa deve parar de pedir nomes quando for digitado uma linha vazia. */

        Scanner scan = new Scanner(System.in);
        
        File file  = new File(nomeArquivo); // Criando referência do arquivo
        BufferedWriter bw = new BufferedWriter(new FileWriter(file)); // Criando o buffer para enviar os dados
        

        System.out.println("Informe os nomes para serem guardados no documento: ");
        String linha = scan.nextLine();

        do {
            bw.write(linha);
            bw.newLine();
            linha = scan.nextLine();
        } while (!(linha.isBlank()));
        
        bw.flush();
        scan.close();
        bw.close();

        System.out.printf("O arquivo: '%s' foi adicionado no local: '%s'\n", file.getName(), file.getAbsolutePath());


    }

    public static void lerArquivoExibirConsole(String nomeArquivo) throws IOException{
        /*Criar programa que leia o arquivo nomes.txt e exiba todo o conteúdo desse arquivo no console */

        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        System.out.println("Imprimindo os nomes: ");

        do {
            bw.write(line);
            bw.newLine();
            line= br.readLine();
        } while (line != null);

        br.close();
        bw.close();

    }

    public static void copiarArquivo(String arquivo) throws IOException{

        File filecopy = new File(arquivo.substring(0, arquivo.indexOf(".")).concat("-copy.txt"));
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        BufferedWriter bw = new BufferedWriter(new FileWriter(filecopy));

        String line = br.readLine();

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        bw.flush();
        bw.close();
        br.close();

        System.out.printf("Copia do arquivo: %s criada em %s\n", arquivo, filecopy.getAbsolutePath());

    }
    
    public static void alterarConteudoArquivotxt(String arquivo, String palavraAntiga, String palavraNova) throws IOException{
        Scanner scan = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo.concat("-modificado")));

        String linha="";

        while ((linha = br.readLine()) != null) {
            String novaLinha = linha.replace(palavraAntiga, palavraNova);
            bw.write(novaLinha);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
        scan.close();

        System.out.println("Substituição concluída");

    }
    
    public static void main(String[] args) throws IOException  {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o nome do arquivo: ");
    String nomeArquivo = scan.nextLine();

        criarArquivoEscrecer(nomeArquivo);
        lerArquivoExibirConsole(nomeArquivo);
        copiarArquivo(nomeArquivo);
        alterarConteudoArquivotxt("Festa.txt", "Felippe", "Felipe");
        
        scan.close();

    }
}
