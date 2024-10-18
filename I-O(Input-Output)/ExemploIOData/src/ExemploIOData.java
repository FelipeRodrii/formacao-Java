import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExemploIOData {
    public static void incluirProduto() throws IOException {
        File f = new File("C:/Users/felip/OneDrive/Documentos/TesteDeCodigo/Produtos.bin");//Apontar local do arquivo
        // diretório,
        // Criando uma imagem do nosso arquivo
        PrintStream ps = new PrintStream(System.out);//Fluxo de saída para console, substituindo o 'sout'.

        /*OutputStream os = new FileOutputStrem(f.getName());//criadno um fluxo de armazenamento em um arquivo
        DataOutputStream dos = new DataOutputStream(os);//iniciando um objeto DataOutputStream */
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath()));//decorator

        Scanner scan = new Scanner(System.in); // abrir teclado

        System.out.print("Informa a quantidade de itens a serem cadastrados: ");
        int quantItens = scan.nextInt();
        System.out.println();

        do {
            
            ps.print("Nome do produto: ");
            String nome = scan.next();//armazena o 'input' da variável.
            dos.writeUTF(nome);//escrevendo no documento

            ps.print("Quantidade: ");
            int quantidade = scan.nextInt();
            dos.writeInt(quantidade);//escrevendo no documento

            ps.print("Tamanho: ");
            char tamanho = (char) System.in.read();//Forma de ler dados, aqui ele le os dados em bytes, isto é uma boa
            // forma eficiente de ler char
            dos.writeChar(tamanho);

            ps.print("Preço: ");
            Double preco = scan.nextDouble();
            dos.writeDouble(preco);

            quantItens -= 1;
        }while(quantItens != 0);

        ps.printf("O arquivo %s foi criado com %d bytes no diretório %s.\n",f.getName(), f.length(),
                f.getAbsolutePath()); //imprimindo frase formatada


        lerArquivoBin(f.getPath());

    }

    private static void lerArquivoBin(String arquivo) throws IOException {
        File f = new File(arquivo);
        PrintStream ps = new PrintStream(System.out);
        Scanner scan = new Scanner(System.in);

        /*InputStream is = new FileInputStream(f,getPath()); //abrindo um fluxo de leitura de um arquivo
        DataInputStream dis = new DataInputStream(is); //iniciando um objeto DataInputStream*/
        DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()));

        //criando as variáveis
        int quantItens = scan.nextInt();
        String nome;
        int quantidade;
        char tamanho;
        double preco;

        while(quantItens!= 0){

            nome = dis.readUTF();
            quantidade = dis.readInt();
            tamanho = dis.readChar();
            preco = dis.readDouble();

            System.out.printf("\nNome....................: %s\n", nome);
            System.out.printf("\nQuantidade....................: %s\n", quantidade);
            System.out.printf("\nTamanho....................: %s\n", tamanho);
            System.out.printf("\nPreco....................: %s\n", preco);
            System.out.printf("\nTotal valor das peças: " + (preco * quantidade));

            quantItens -= 1;
        }


        dis.close();

        //as declarações devem estar na mesma ordem que os dados foram informados e é bom fazer as declaraçõe antes,
        // pois o programa sabera com antecedência que tipo de dado esperar

    }


    public static void main(String[] args) throws IOException {
        incluirProduto();


    }
}