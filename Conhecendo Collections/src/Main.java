import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
        // Propsta de Exercicio 1
        List<Double> temperaturas = new ArrayList<>(6);
        Scanner scan = new Scanner(System.in);
        float media = 0;
        boolean start = true;

            System.out.println("INFORME A TEMPERATURA MÉDIA DOS 6 PREIMEIROS MESES DO ANO, SEGUINDO A ORDEM DESSES " +
                    "MESES :");

            for (int i = 0; i < 6; i++) {
                System.out.println("INFORME A TEMPERATURA MÉDIA DO " + (i+1) + "º MES:");
                temperaturas.add(scan.nextDouble());
            }

            for (Double temp : temperaturas) {
                media += temp;
            }
            media /= temperaturas.size();


            System.out.println("**************************");
            System.out.println("MESES ACIMA DA MÉDIA DE :"+ media%.1f);

            for (int i= 0; i < temperaturas.size(); i++ ) {
                switch (i){
                    case(1):
                        if (temperaturas.get(i) > media) {
                            System.out.println((i + 1) + "- Janeiro temperatura de: " + temperaturas.get(i));
                        }
                        break;
                    case(2):
                        if (temperaturas.get(i) > media) {
                            System.out.println((i + 1) + "- Fevereito temperatura de: " + temperaturas.get(i));
                        }
                        break;
                    case(3):
                        if (temperaturas.get(i) > media) {
                            System.out.println((i + 1) + "- Março temperatura de: " + temperaturas.get(i));
                        }
                        break;
                    case(4):
                        if (temperaturas.get(i) > media) {
                            System.out.println((i + 1) + "- Abril temperatura de: " + temperaturas.get(i));
                        }
                        break;
                    case(5):
                        if (temperaturas.get(i) > media) {
                            System.out.println((i + 1) + "- Maio temperatura de: " + temperaturas.get(i));
                        }
                        break;
                    case(6):
                        if (temperaturas.get(i) > media) {
                            System.out.println((i + 1) + "- Junho temperatura de: " + temperaturas.get(i));
                        }
                        break;
                    default:
                        System.out.println("Opção Invalida!!");
                }
        }

 */
        List<String> perguntas = new ArrayList<>();
        int countSim=0;
        int countNao=0;

        Scanner scan = new Scanner(System.in);
        perguntas.add("Telefonou para a Vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da Vítima?");
        perguntas.add("Devia para a Vítima?");
        perguntas.add("Já trabalhou com a Vítima?");


        System.out.println("RESPONDA AS PERGUNTAS COM 0 -> SIM E 1-> NÃO:");
        for(String pergunta: perguntas){
            System.out.println(pergunta);
            int res = scan.nextInt();

            if (res == 0) countSim++;
            else countNao++;

        }
        if(countSim == 2){
            System.out.println("SUSPEITA !!");
        } else if (countSim >= 3 && countSim < 5) {
            System.out.println("CÚMPLICE");
        } else if (countSim > 4) {
            System.out.println("ASSASSINA");
        }else{
            System.out.println("INOCENTE");
        }
    }
}