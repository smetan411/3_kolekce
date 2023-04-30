package kolekceUvod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TridaCollectionsUpravy {

    public static void main(String[] args) {
        kopirovaniKolekceDoKolekce(); //
        naplniKolekciZadanymPrvkem();
        nahradiVybranePrvky();
        obratiPoradiPrvku();
        rotujePrvkyKolekce();
        zamichaPrvkyKolekce();
        seradiPrvkyKolekce();
        prohodiNaIndexech();
    }

    public static void kopirovaniKolekceDoKolekce() {
        final List<Integer> kopirovanaKolekce = Arrays.asList(12, 65, 87, 2, 38, 42, 73, 21);
        final List<Integer> cilovaKolekce = Arrays.asList(85, 3, 45, 24, 97, 26, 15, 38, 48, 56, 14);
        System.out.println("Obsah původní cílové kolekce: " + cilovaKolekce);
        Collections.copy(cilovaKolekce, kopirovanaKolekce);
        System.out.println("Přepsaný obsah cílové kolekce: " + cilovaKolekce);
    }

    public static void naplniKolekciZadanymPrvkem() {
        final List<Integer> list = Arrays.asList(12, 35, 89, 48, 56);
        System.out.println("Obsah původní kolekce: " + list);
        Collections.fill(list, 5);
        System.out.println("Přepsaný obsah kolekce zadanym prvkem: " + list);
    }

    public static void nahradiVybranePrvky() {
        final List<Integer> list = Arrays.asList(1, 2, 3, 5, 9, 2, 7, 6, 2);
        System.out.println("Obsah původní kolekce: " + list);
        final int oldValue = 2;
        final int newValue = 8;
        final boolean prvkyPrepsany = Collections.replaceAll(list, oldValue, newValue);
        System.out.println("Vybrane prvky byly prepsany: " + prvkyPrepsany);
        System.out.println("Novy obsah kolekce: " + list);
    }

    public static void obratiPoradiPrvku() {
        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Obsah puvodni kolekce: " + list);
        Collections.reverse(list);
        System.out.println("Novy obsah kolekce: " + list);
    }

    public static void rotujePrvkyKolekce() {
        // rotuje o zadanou distanci, posledni se presune na zacatek
        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Obsah puvodni kolekce: " + list);
        final int distance = 2;
        Collections.rotate(list, distance);
        System.out.println("Obsah nove kolekce posunute o: " + distance + ": " + list);
    }

    public static void zamichaPrvkyKolekce() {
        final List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Obsah puvodni kolekce: " + list);
        Collections.shuffle(list);
        System.out.println("Obsah nove zamichane kolekce: " + list);
    }

    public static void seradiPrvkyKolekce() {
        final List<Integer> list = Arrays.asList(9, 2, 3, 7, 8, 5, 6, 7, 1, 2, 5);
        System.out.println("Obsah puvodni kolekce: " + list);
        Collections.sort(list);
        System.out.println("Obsah nove kolekce: " + list);
    }

    public static void prohodiNaIndexech(){
        final List<Integer> list = Arrays.asList(6, 2, 3, 5, 7, 9, 8, 4, 5);
        System.out.println("Obsah puvodni kolekce: " + list);
        final int srcIndex = 2;
        final int dstIndex = 6;
        Collections.swap(list, srcIndex, dstIndex);
        System.out.println("Obsah nove kolekce: " + list);
    }
}
