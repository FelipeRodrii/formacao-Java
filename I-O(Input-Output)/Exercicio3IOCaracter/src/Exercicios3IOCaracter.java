import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicios3IOCaracter {
    public static void copiarArquivo(String arquivo) throws IOException {
        File f = new File(arquivo); // -> Referência do arquivo, como se estivessemos 'imaginando' antes de criar
        String nomeDoArquivoOriginal = f.getName(); // nome do arquivo original, será a String arquivo

        BufferedReader br = new BufferedReader(new FileReader(nomeDoArquivoOriginal)); // Criando o leitor on Buffer

        String nomeDoArquivoCopy= nomeDoArquivoOriginal.substring(0, nomeDoArquivoOriginal.indexOf(".")).concat(
                "-copy.txt");

        File fcopy = new File(nomeDoArquivoCopy); // criando a referência para a copia
        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName())); // criando o arquivo cópia

        String linha = br.readLine(); // Br se refere ao arquivo original, que já existe ! Então estamos lendo as
        // linhas do nosso arquivo original(br)

        do {
            bw.write(linha);// escreve a linha no Buffer para em breve ser enviada para o arquivo cópia(bw)
            bw.newLine(); // insira uma linha
            linha= br.readLine();// depois que escrevemos a nossa cópia, lemos a próxima linha(readLine()) do arquivo
            // original(br)
        }while(!(linha == null));
        bw.flush(); // descarrega as linhas informadas no arquivo cópia

        System.out.printf("Arquivo '%s' criado om sucesso! \n diretório: %s", fcopy.getName(),
                fcopy.getAbsolutePath()); // exibe a mensagem formatada
        System.out.println("");
        System.out.printf("Faça 3 recomendações de livros: \n");

        adicionarInformacoesArquivoJaexistente(nomeDoArquivoCopy);

        br.close();
        bw.close();

    }

    public static void adicionarInformacoesArquivoJaexistente(String arquivoCopy) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Padrão decorator, pegar dados do
        // teclado

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCopy, true));
        // Parão decorator, para escrever no arquivo sem apagar o conteúdo que já existia

        String line = br.readLine();

        do {
            bw.write(line); // escreve no buffer interno a linha capturada pelo scanner
            bw.newLine(); // pule oara a próxima linha
            line = br.readLine(); // pegue a próxima linha do teclado
        }while(!line.equalsIgnoreCase("fim"));

        bw.flush();// terminado o laço, descarrega as informações capturadas pelo teclado no arquivo recomendações.txt
        br.close();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        copiarArquivo("Recomendações.txt"); s

    }
}