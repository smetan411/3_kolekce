package mapa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapySlovniky {

    public static void main(String[] args) {

//        vytiskniSlovnik();
//        prelozSlovoPomociSlovniku();
//        zjistiAVymazSlovo();
//        zjistiaVymazSlovo();

    }


    public static void vytiskniSlovnik() {

        Map<String, String> slovnik = new HashMap<>();
        slovnik.put("cat", "kocka");
        slovnik.put("mouse", "mys");
        slovnik.put("dog", "pes");
        slovnik.put("cow", "krava");
        slovnik.put("horse", "kun");

        System.out.println("Tisk pomoci forEach: ");
        for (String s : slovnik.keySet()) {
            System.out.println(s + " - " + slovnik.get(s));
        }
        System.out.println("Tisk pomoci tridy Entry:");
        for (Map.Entry<String, String> entry : slovnik.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }


    public static Map<String, String> naplnSlovnik() {
        Map<String, String> slovnik = new HashMap<>();
        slovnik.put("cat", "kocka");
        slovnik.put("mouse", "mys");
        slovnik.put("dog", "pes");
        slovnik.put("cow", "krava");
        slovnik.put("horse", "kun");
        return slovnik;
    }

    public static void prelozSlovoPomociSlovniku() {
        Map<String, String> slovnik = naplnSlovnik();
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej anglicke slovo:");
        String slovo = sc.nextLine();
        if (slovnik.containsKey(slovo)) {
            System.out.println("Preklad slova " + slovo + " do cestiny je: " + slovnik.get(slovo));
        }
    }


    public static void zjistiAVymazSlovo() {

        Map<String, String> slovnik = naplnSlovnik();

        System.out.println("Zadej anglicke slovo k vymazani:");
        Scanner sc = new Scanner(System.in);
        String slovoKVymazani = sc.nextLine();
        if (slovnik.containsKey(slovoKVymazani)) {
            System.out.println("Ve slovniku zadane slovo je a vymazu ho.");
            slovnik.remove(slovoKVymazani);
        } else {
            System.out.println("Zadane slovo ve slovniku neni.");
        }
        System.out.println("Slovnik ma ted celkem " + slovnik.size() + " slov/a.");
        System.out.println("Vypisuju slovnik: ");
        for (String s : slovnik.keySet()) {
            System.out.println(s + " - " + slovnik.get(s));
        }
    }

}


