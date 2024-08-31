import java.util.*;
import java.util.function.Function;

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

        //Todo: Crie um dicionário e relacione os estados e suas populações;
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

        System.out.println("--------------------------------------------------------------");

        //Todo Substitua a população do estadodo RN por 3.534,165
        System.out.println("Mudança no Estado RN: ");
        estadosPopulacao.put("RN", 3534165);
        entradas = estadosPopulacao.entrySet();
        for (Map.Entry<String, Integer> entrada: entradas)
            if (entrada.getKey().equals("RN"))
                System.out.println("Estado: "+ entrada.getKey() + " População: "+ entrada.getValue());
        System.out.println("--------------------------------------------------------------");

        //Todo: Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039,277
        System.out.println("Adição do Estado PB: ");
        if (!estadosPopulacao.containsKey("PB"))
            estadosPopulacao.put("PB", 4039277);
        entradas = estadosPopulacao.entrySet();
        for(Map.Entry<String, Integer> entrada: entradas)
            System.out.println("Estado: "+ entrada.getKey()+ " população: "+ entrada.getValue());
        System.out.println("--------------------------------------------------------------");

        //Todo: Exiba a população PE
        System.out.println("A Popuação de PE é: "+estadosPopulacao.get("PE"));

        //Todo: Exiba todos os estados e suas populações na ordem que foram informado;
        System.out.println("Estados na ordem que foram informado: ");
        Map<String, Integer> estadosPopulacaoOrdemEntrada = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadosPopulacaoOrdemEntrada);
        System.out.println("--------------------------------------------------------------");

        //Todo: Exiba os estados e suas populações em ordem alfabética;
        System.out.println("Informando em ordem Alfabética: ");
        Map<String, Integer> estadosPopulacaoOrdemAlfabetica = new TreeMap<>(estadosPopulacao);
        System.out.println(estadosPopulacaoOrdemAlfabetica);
        System.out.println("--------------------------------------------------------------");

        //Todo: Exiba o estado com a menor população e sua quantidade
        int menorPopulacao= Collections.min(estadosPopulacao.values());
        entradas = estadosPopulacao.entrySet();

        for (Map.Entry<String, Integer> entrada: entradas)
            if(entrada.getValue().equals(menorPopulacao))
                System.out.println("Estado com Menor População: " +entrada.getKey()+ " Populção: " +entrada.getValue());
        System.out.println("--------------------------------------------------------------");

        //Todo: Exiba o estado com a maior população e sua quantidade
        int maiorPopulacao= Collections.max(estadosPopulacao.values());

        for (Map.Entry<String, Integer> entrada: entradas)
            if (entrada.getValue().equals(maiorPopulacao))
                System.out.println("Estado com Maior População: " +entrada.getKey()+ " Populção:" +entrada.getValue());
        System.out.println("--------------------------------------------------------------");

        //Todo:Exiba a soma da população desses estados
        System.out.println("A soma da população desses estados é: "+ (menorPopulacao+maiorPopulacao));
        System.out.println("--------------------------------------------------------------");

        //Todo: Exiba a média da população deste dicionário de estados
        int somaTotal=0;
        Iterator<Integer> iterator = estadosPopulacao.values().iterator();

        while(iterator.hasNext())
            somaTotal+= iterator.next();

        System.out.println("A média populacional nestes estados é: "+ (somaTotal/ estadosPopulacao.size()));
        System.out.println("--------------------------------------------------------------");

        //Todo: Remova os estados com a população menor que 4,000.000;
        System.out.println("Removendo estados com a população abaixo de 400000: ");
        Iterator<Map.Entry<String, Integer>> iterator1 = estadosPopulacao.entrySet().iterator();

        while (iterator1.hasNext())
            if (iterator1.next().getValue() < 4000000)
                iterator1.remove();

        System.out.println(estadosPopulacao);
        System.out.println("--------------------------------------------------------------");

        //Todo: Apague o dicionário de estados
        System.out.println("Limpando a nossa coleção e verificando: ");
        estadosPopulacao.clear();
        System.out.println(estadosPopulacao);

        //Todo: Desafio Opcional --> Simule um dado, lance ele 100 vezes e armazene. Depois mostre quantas vezes cada
        //valor foi sorteado
        System.out.println("DESAFIO DO DADO:");
        Dado dadoBranco = new Dado();
        List sorteados = new ArrayList<>();

        sorteados.addAll(dadoBranco.lancarDados(100));
        System.out.println(dadoBranco.agrupamentoSorteados(sorteados));

        /*Todo: Dadas as seguintes informações de id e contato, crie um dicionário e ordene este dicionário exibindo
        *(Nome id - Nome contato;
        *
        * id= 1 - Contato - nome: Simba, numero: 2222;
        * id= 4 - Contato - nome: Cami, numero: 5555;
        * id= 3 - Contato - nome: Jon, numero: 1111;
        *
        */

        System.out.println("Proposta - 3");
        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> meusContatos = new HashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(meusContatos);

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> meusContato1 = new LinkedHashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(meusContato1);

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> meusContatosPorID = new TreeMap<>(meusContatos);
        System.out.println(meusContatosPorID);

        System.out.println("--\tOrdem número telefone\t--");
        /*
        Set<Map.Entry<Integer, Contato>> meusContatosTelefone = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
                return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
            }
        });

        Set<Map.Entry<Integer,Contato>> meusContatosTelefone = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> entry) {
                        return entry.getValue().getNumero();
                    }
                }));
         */

        Set<Map.Entry<Integer,Contato>> meusContatosTelefone = new TreeSet<>(Comparator.comparing(entry -> entry.getValue().getNumero()));

        meusContatosTelefone.addAll(meusContatos.entrySet());

        for (Map.Entry<Integer, Contato> entry: meusContatosTelefone) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem nome contato\t--");
        /*
        Set<Map.Entry<Integer, Contato>> meusContatosNome = new TreeSet<>(new ComparatorNome());
        meusContatosNome.addAll(meusContatos.entrySet());

        for (Map.Entry<Integer, Contato>entry: meusContatosNome){
            System.out.println(entry.getKey()+ " - " +entry.getValue().getNome());
                }

         */

        // Utilizando o Lambda de forma a susbtituir o uso de classe Comparator declarada, o lambda nos ajuda a
        // simplificar uma classe anônima, sendo a sintaxe: corpo(Variável) -> função(implementação). A variável
        // assume como seu valor o tipo que estamos passando na inicialização da variável principal ao qual se aplica
        // (meusContatosNome) que nesse caso é Set<Map.Entry<>> e assim a variavel que representa os dados (entry)
        // irá ter os métodos deste nosso tipo principal.
        Set<Map.Entry<Integer, Contato>> meusContatosNome =
                new TreeSet<>(Comparator.comparing(entry -> entry.getValue().getNome()));
        meusContatosNome.addAll(meusContatos.entrySet());

        for(Map.Entry<Integer, Contato> entry: meusContatosNome){
            System.out.println(entry.getKey()+ " - " +entry.getValue().getNome());
        }



            }
        }

/*
 * Trecho comentado poos utilizamos de Lambda para a criação destes métodos Comparator diretamente nas estruturas que
 *  iriam utiliza-los
class ComparatorNumero implements Comparator<Map.Entry<Integer, Contato>>{

    @Override
    public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
        return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
    }
}
*
class ComparatorNome implements Comparator<Map.Entry<Integer, Contato>>{

    @Override
    public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
        return c1.getValue().getNome().compareTo(c2.getValue().getNome());
    }
}
 */