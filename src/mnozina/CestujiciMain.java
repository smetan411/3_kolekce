package mnozina;

import java.util.HashSet;
import java.util.Set;

public class CestujiciMain {

    public static void main(String[] args) {
        // deklarace mnoziny
        Set<CestujiciAutobusu> cestujici = new HashSet<>();
        // vytvoření několika cestujících
        CestujiciAutobusu karel = new CestujiciAutobusu("Karel", "Novák");
        CestujiciAutobusu josef = new CestujiciAutobusu("Josef", "Nový");
        CestujiciAutobusu tomas = new CestujiciAutobusu("Tomáš", "Marný");
        //pridani cestujicich do mnoziny
        cestujici.add(karel);
        cestujici.add(josef);
        cestujici.add(tomas);
        //tisk mnoziny
        for (CestujiciAutobusu s : cestujici) {
            System.out.println(s);
        }
        System.out.println();

        boolean jeTam = cestujici.contains(karel);
        System.out.println("Karel je tam: " + jeTam);

        System.out.println("Odstranujeme Josefa");
        cestujici.remove(josef);
        jeTam = cestujici.contains(josef);
        System.out.println("Josef je tam: " + jeTam);

        System.out.println("Nikdo tam neni: " + cestujici.isEmpty());
        cestujici.add(karel);

        System.out.println();

        System.out.println("Znovu tiskneme mnozinu. ");
        for (CestujiciAutobusu s : cestujici) {
            System.out.println(s);
        }

        System.out.println();

        System.out.println("Konecna, vsichni vystupovat: ");
        cestujici.clear();
        System.out.println("V autobusu nikdo neni: " + cestujici.isEmpty());
        System.out.println("Pouzili jsme metody .add(), .contains(), .remove(), .isEmpty(), .clear()");


    }
}



