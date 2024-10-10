import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.*;
import java.util.Scanner;

public class Exercicio2IOCaracter {

    public static void lerTecladoEscreverDocumentos() throws IOException {
       // Utilizando a classe PrintWriter apenas para conhecer, aqui poderia se um Sout;
        PrintWriter pw = new PrintWriter(System.out);
        pw.write("Digite 3 recomendações de filmes e digite 'fim' ao final:");
        pw.println();
        pw.flush(); // -> Descarrega o conteúdo dm método write, então o método write precisa deste método em seguida.

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        File f = new File("Recomendações.txt"); // Classe utilizada para especificar diretório ou arquivos. Nossa
        // intância do arquivo ou uma 'memória', como se estivessemos imaginando o documento.

        /*  Writer w = new FileWriter(f.getName());
            Buffered bw = new BufferedWriter(w); */

        /*
            Nota: O arquivo em sí só é criado quando usamos o createNewFile(), quando utilizamos diretamente os
            método de FileWrite (FileWriter(String) -> Escrita direta), ou quando utilizamos o métodos de Buffered
         */

        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName())); // Padrão decorator com Buffered,
        // melhora eficiência da nossa escrita.

        do{
            bw.write(line);
            bw.newLine();
            line = scan.nextLine();

        } while(!line.equalsIgnoreCase("fim"));
        bw.flush();

        pw.printf("Arquivo '%s' foi criado com tamanho '%d' bytes.", f.getName(), f.length());
        pw.flush();

        scan.close();
        bw.close();
        pw.close();

    }

    public static void main(String[] args) throws IOException {
        lerTecladoEscreverDocumentos();
    }
}