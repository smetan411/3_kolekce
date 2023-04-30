package genericita;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamyVJave {

    public static void main(String args[]) {
        // vytvoření seznamu čísel, metoda map() provede např. výpočet
        List<Integer> cisla = Arrays.asList(2, 3, 4, 5);
        List<Integer> nasobek = cisla.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());
        System.out.println(nasobek);

        // vytvoření seznamu jmen, metoda filter() vybere podle zadané podmínky,
        // metoda sorted() seřadí podle abecedy, velikosti čísel apod.
        List<String> jmena = Arrays.asList("Pepa", "Olinka", "Adam");
        List<String> vyberZeJmen = jmena.stream()
                .filter(jmeno -> jmeno.startsWith("O"))
                .collect(Collectors.toList());
        System.out.println(vyberZeJmen);

        List<String> jmenaABC = jmena.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(jmenaABC);

        // vytvoření seznamu čísel, druhá mocnina pomocí metody .map()
        // uložení výsledku do množiny Set
        List<Double> desetinnaCisla = Arrays.asList(2.1, 10.0, 5.0, 2.1);
        Set<Double> druheMocniny = desetinnaCisla.stream()
                .map(x -> x * x)
                .collect(Collectors.toSet());
        System.out.println(druheMocniny);

        // vytvoření mnoziny, použití metody forEach()
        List<Integer> roky = Arrays.asList(75, 50, 12, 82);
        roky.stream().map(x -> x + 1).forEach(vek -> System.out.println("letos ma " + vek + " let"));


        //použití metody forEach()
        List<String> jmenaDeti = Arrays.asList("David", "Jana", "Dan", "Katka", "Petr");
        jmenaDeti.stream()
                .filter(dite -> dite.length() > 4).toList()
                .forEach(jmeno -> System.out.print(jmeno + " "));

        System.out.println();

        //zkrácený zápis pomocí dvojtečky
        List<String> deti = Arrays.asList("David", "Jana", "Dan", "Katka", "Petr");
        jmenaDeti.stream()
                .filter(dite -> dite.length() > 4)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //Pozn.
        Set<Integer> nejakaCisla = new HashSet<>(Arrays.asList(2, 10, 5, 2));
        nejakaCisla.add(27);

    }
}
