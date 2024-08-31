import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Descrição:
        // Desenvolva um sistema decontrole de presença para um evento onde cada participante é identificado por um
        // nome e um número de identificação único (ID). O sistema deve garantir que não haja registros duplicados e
        // deve permitir a verificaçãode presença.

        ControlePresenca evento = new ControlePresenca();
        int opcao, idade, id;
        String nome;
        boolean start = true;
        Scanner scan = new Scanner(System.in);

        while (start) {

            System.out.println("Controlador de evento, escolha uma das opções: ");
            System.out.println("0---> Encerrar Programa: ");
            System.out.println("1---> Inserir DesafioHashSet.Participante: ");
            System.out.println("2---> Remover DesafioHashSet.Participante: ");
            System.out.println("3---> Verificar presença por nome: ");
            System.out.println("4---> Listar Participantes e seus ID'S ");

            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 0:
                    start = false;
                    break;
                case 1:
                    System.out.println("Informe o Nome do participante");
                    nome= scan.nextLine();

                    System.out.println("Informe o Idade do participante");
                    idade = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Informe o ID do participante");
                    id = scan.nextInt();
                    scan.nextLine();

                    evento.adicionarParticipante(nome, idade, id);
                    break;
                case 2:
                    evento.listarParticipanteNomeID();

                    System.out.println("Informe o ID do participante a ser removido: ");
                    id = scan.nextInt();
                    scan.nextLine();

                    System.out.println("DesafioHashSet.Participante: "+ evento.recuperarParticipantePorID(id)+ " removido.");
                    evento.removerParticipantePorID(id);
                    break;
                case 3:
                    System.out.println("Informe o nome a ser buscado");
                    nome = scan.nextLine();
                    System.out.println(evento.verificarPresencaPorNome(nome));

                    break;
                case 4:
                    System.out.println(evento.listarParticipanteNomeID());
                    break;
                default:
                    System.out.println("Opção Invalida !");
                    break;

            }
        }
    }
}