import java.util.*;

public class Dado {

    // Variáveis Final, não podem ser referênciadas novamente ou seja, o nome desta variável não pode ser reutilizada
    // em uma nova variável(Não podemos atribuir umanova lista a sorteados por exemplo: sorteados = new ArrayList<>(); )
    private final Random gerador = new Random();
    private final List sorteados = new ArrayList<>();

    public List<Integer> lancarDados(int quantidadeLances){
        for (int i = 0; i < quantidadeLances; i++) {
            sorteados.add(gerador.nextInt(6)+1);
        }
         return sorteados;
    }

    // Método que retorna o agrupamento de cada valor sorteado pelo nosso dado, esse deáfio foi fácil, porém minha
    // maior dificuldade foi tentando pensar em uma forma mais robusta de fazer, no final resolvi utilizar um Loop
    // while com Switch case(), depois tenho que achar uma forma mais simples de fazer isso.
    public String agrupamentoSorteados(List<Integer> sorteados){
        int count_1=0, count_2=0, count_3=0, count_4=0, count_5=0, count_6=0;
        int atual=0;
        Iterator<Integer> iterator = sorteados.iterator();
        String retorno="";

        while(iterator.hasNext()) {
            atual = iterator.next();

            switch (atual) {
                case (1):
                    count_1++;
                    break;
                case (2):
                    count_2++;
                    break;
                case (3):
                    count_3++;
                    break;
                case (4):
                    count_4++;
                    break;
                case (5):
                    count_5++;
                    break;
                case (6):
                    count_6++;
                    break;
                default:
                    //System.out.println("Parece que o dado caiu no chão....");
                    System.out.println(atual);
            }
        }
        retorno = "|1 ->"+ count_1 + "| 2->"+ count_2+ "| 3->"+ count_3 + "| 4->"+ count_4 +"| 5->"+ count_5+ "| 6->"+ count_6;

        return retorno;
    }

}
