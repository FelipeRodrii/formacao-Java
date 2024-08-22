import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* Exercício 1:
         * dada a população estimada de lguns estados do NE brasileiro,faça:
         * Estado = PE - População = 9.616,621
         * Estado = AL - População = 3.351,543
         * Estado = CE - População = 9.187,103
         * Estado = RN - População = 3.534,265
         */

        // Todo: Crie um dicionário e relacione os estados e suas populações;
        Map<String, Integer> estadosPopulacao = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println("Imprimindo Dicionário Criado: ");
        Set<Map.Entry<String, Integer>> entradas = estadosPopulacao.entrySet();
        for (Map.Entry<String, Integer> entra: entradas)
                System.out.println("Estado: "+entra.getKey()+ " População: "+entra.getValue());

        //Todo Substitua a população do estadodo RN por 3.534,165
        System.out.println("Mudança no Estado RN: ");
        estadosPopulacao.put("RN", 3534165);
        entradas = estadosPopulacao.entrySet();
        for (Map.Entry<String, Integer> entrada: entradas)
            if (entrada.getKey().equals("RN"))
                System.out.println("Estado: "+ entrada.getKey() + " População: "+ entrada.getValue()+ "\n");

        //Todo: Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039,277
        System.out.println("Adição do Estado PB:");
        if (!estadosPopulacao.containsKey("PB"))
            estadosPopulacao.put("PB", 4039277);
        entradas = estadosPopulacao.entrySet();
        for(Map.Entry<String, Integer> entrada: entradas)
            System.out.println("Estado: "+ entrada.getKey()+ " população: "+ entrada.getValue());

        //Todo: Exiba a população PE
        System.out.println("A Popuação de PE é: "+estadosPopulacao.get("PE"));

        //Todo: Exiba todos os estados e suas populações na ordem que foram informado;
        Map<String, Integer> estadosPopulacaoOrdemEntrada = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadosPopulacaoOrdemEntrada);

        //Todo: Exiba os estados e suas populações em ordem alfabética;
        Map<String, Integer> estadosPopulacaoOrdemAlfabetica = new TreeMap<>(estadosPopulacao);
        System.out.println(estadosPopulacaoOrdemAlfabetica);

        //Todo: Exiba o estado com a menor população e sua quantidade
        int menorPopulacao= Collections.min(estadosPopulacao.values());
        entradas = estadosPopulacao.entrySet();

        for (Map.Entry<String, Integer> entrada: entradas)
            if(entrada.getValue().equals(menorPopulacao))
                System.out.println("Estado: " +entrada.getKey()+ " Populção: " +entrada.getValue());

        //Todo: Exiba o estado com a maior população e sua quantidade
        int maiorPopulacao= Collections.max(estadosPopulacao.values());

        for (Map.Entry<String, Integer> entrada: entradas)
            if (entrada.getValue().equals(maiorPopulacao))
                System.out.println("Estado: " +entrada.getKey()+ " Populção: " +entrada.getValue());

        //Todo:Exiba a soma da população desses estados

        //Todo: Exiba a média da população deste dicionário de estados

        //Todo: Remova os estados com a população menor que 4,000.000;

        //Todo: Apague o dicionário de estados


        //Todo: Desafio Opcional --> Simule um dado, lance ele 100 vezes e armazene. Depois mostre quantas vezes cada
        //valor foi sorteado
    }
}