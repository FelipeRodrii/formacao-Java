import java.util.HashMap;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* Um HashMap(ou dicionário, inclusive no Python é apenas dicionário) é uma estrutra de dados baseada em
         * chave e valor, onde cada chave está vinculado a um valor dentro da estrutura.
         * Dentro dessa estrutura as nossas chaves são exclusivas, então não podemos ter uma chave igual a outra.
         */

        /* Dado os modelos dos carros e seus respectivos consumos na estrada, faça:
         * modelo = gol - consumo = 14,4km/l
         * modelo = uno - consumo = 15,6km/l
         * modelo = mobi - consumo = 16,1km/l
         * modelo = hb20 - consumo = 14,5km/l
         * modelo = kwid - consumo = 15,6km/l
         */

        /* Formas de Iniciar um HashMap e Sintaxe:
         * Map<tipoChave, tipoValor> nomeVariavel = new HashMap<>(); ---> Sitaxe básica
         * HashMap<String, Double> carrosPopulares = new HashMap<>(); ---> Forma padrão Atual
         * Map carrosPopulares2020 = new HashMap(); ---> Antes do java 5
         * Map<String, Double> carrosPoplares = new HashMap<>(); ---> Generics - Diamond operator
         * Map<String, Double> carrosPopulares = Map.of("gol", 14.4, "uno", 15.6,"mobi", 16.1, "hb20", 14.5,"kwid",
         * 15.6,); ---> inicialização já com os valores
         */

        System.out.println("Crie u dicionário qe relacione os modelos e seus respectivos valores de consumos:");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
           put("gol", 14.4 );
           put("uno", 15.6);
           put("mobi", 16.1);
           put("hb20", 14.5);
           put("kwid", 15.6);
        }};

        // Como o Map não aceita chaves repetidas, podemos reutilizar o Put para o Value de uma chave
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);

        // Utiliamo o método containsKey para achar uma chave (Valor exclusivo) ou containsValue(Vários valores).
        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        // Método get, para trazer o Value de uma chave passada de referência
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        // KeySet, retorna um Set com as chaves do nosso Map
        System.out.println("Exiba os modelos");
        Set<String> modelos= carrosPopulares.keySet();
        System.out.println(modelos);

        // values, retorna uma coleção dos valore
        System.out.println("Exiba os consumos dos carros:");
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);

        // Método Max  de Collection retorna o maior valor presente em uma coleção
        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumosMaximo = Collections.max(carrosPopulares.values());

        // Map.Entry ---> Interface dentro da Interface Map, nos ajudando a manipular de entradas individuais de um map.
        // Podemos pensar em Entry como 'entradas de chave e valor'
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();

        for (Map.Entry<String, Double> entry: entries)
            if (entry.getValue().equals(consumosMaximo)) System.out.println("Modelo mais eficiente: " + entry.getKey()+
                    " - " + entry.getValue());


        System.out.println("Exiba o modelo menos econômico e seu consumo");
        Double consumoMin = Collections.min(carrosPopulares.values());

        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();

        for(Map.Entry<String, Double> entry: entries1)
            if (entry.getValue().equals(consumoMin)) System.out.println("Modelo menos econômico: " + entry.getKey()+
                    " - " + entry.getValue());

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        double soma=0;

        while (iterator.hasNext())
            soma+= iterator.next();

        System.out.println(soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + soma/carrosPopulares.size());

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Map.Entry<String, Double>> iterator1 = carrosPopulares.entrySet().iterator();

        while (iterator1.hasNext())
            if (iterator1.next().getValue().equals(15.6))
                iterator1.remove();

       System.out.println(carrosPopulares.toString());

        System.out.println("Exiba todos os carros na ordem que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4 );
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionário ordenado pel modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(){{
            put("gol", 14.4 );
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares2.toString());












    }
}