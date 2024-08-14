import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();

        notas.add(0.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.0);

        System.out.println(notas);
        notas.add(4, 8.0);

        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        System.out.println(notas.contains(5d));

        for(Double nota: notas) System.out.println(nota);

    }
}