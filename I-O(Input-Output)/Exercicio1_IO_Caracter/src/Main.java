import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void abrirtecladoExibirConsole() throws IOException {
        System.out.println("Digite 3 sugestões de filmes: ");

        InputStream is = System.in;
        // InputStream -> Indica que lidaremos com dados binários.
        // is -> Variável que captura os dados binários, mas não os deixa ver diretamente
        // System.in -> É o teclado, ele está sendo "aberto" para entrada do usuário

        Reader isr = new InputStreamReader(is);
        // Reader-> Classe responsavel por processar caracteres.
        // isr -> Objeto que representa o InputStreamReader
        // InputStreamReader -> Classe que faz a tradução dos dados binários para caracteres. Recebe um ImputStream
        // de parâmetro e transforma essa sequência de bytes em texto.

        BufferedReader br = new BufferedReader(isr);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Padrão decorator
        // BufferedReader -> Armazena temporarimanete os caracteres(que vierem de InputStreamReader) em um buffer
        // funciona como uma "mémoria temporária" que guara os dados até que precisemos. Recebe um InputStreamReader
        // de Parâmetro
        // br -> Objeto que representa nosso buffered, porém não podemos recuperar o texto guardado diretamente.
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); Padrão decorator

        String line = br.readLine(); // guarda os dados digitados pelo usuário. Usando a função readLine() do
        // buffered, faz a leitura dos dados ser muito mais eficiênte, usando o scan por exemplo, os dados seriam
        // lidos diretamente do teclado, e a operação seria mais lenta. O radLine() permite ler uma linha inteira de
        // uma vez.

        // Preparando a escrita no console
        OutputStream os = System.out;
        // OutputStream -> classe que indica uma saída de dados que serão enviado em formato binário.
        // os -> Variável que vai representar a nossa saída, permitindo que dads sejam enviados
        // System.out -> Abre a saída do console

        OutputStreamWriter osr = new OutputStreamWriter(os);
        // OutputStreamWriter -> Classeu que traduz caracteres legiveis de volta para binários. recebe como parâmetro
        // um OutputStream que é o canal por onde dos dados binários serao enviados.
        // osr -> Representa o nosso OutputStreamWriter

        BufferedWriter bw = new BufferedWriter(osr);
        // BufferedWriter ->Serve para armazenar temporariamente dados ante de envia-los ao console, isto melhora a
        // escrita já ue os dados aqui serão NÃO serçao enviados de forma fragmentada, mas todos juntos. Recebe um
        // OutputStreamWriter como parâmetro

        bw.write(line); // Imprime o conteudo de line. A função write() imprime o texto armazenaso em buffe de maneira
        // mais eficiente e rápida. Quando usarmos esta comando ele não vai enviar diretamente o dado, ele ficará
        // armazenado no buffer, e só será emviado ao console com outro comando.

        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //Padrão decorator

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(!(line.isEmpty()));
        bw.flush(); // Este comando força o envio de todos osdados que estão no buffer para o destino final(console).
        // sem o flush(), o buffer continua acumulando dados no buffer até que esteja cheio ou seja fechado com o
        // close().
        br.close();
        bw.close();

    }
    public static void main(String[] args) throws IOException {
        abrirtecladoExibirConsole();

    }
}