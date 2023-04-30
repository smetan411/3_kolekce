package kolekceUvod;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TridaCollectionsVyhledavani {

    public static void main(String[] args) {
        obsahujeStejnePrvky();
        kolikratObsahujePrvek();
        pozicePrvnihoVyskytu();
        pozicePoslednihoVyskytu();
        maximalniHodnotaKolekce();
        minimalniHodnotaKolekce();
        binarniVyhledavani();
    }

    public static void obsahujeStejnePrvky() {
        final Collection<String> c1 = Arrays.asList("karel", "pepa", "michal");
        final Collection<String> c2 = Arrays.asList("ondra", "kamil", "petr");
        final boolean disjoint = Collections.disjoint(c1, c2);
        System.out.println("Kolekce neobsahují stejné prvky: " + disjoint);
    }

    public static void kolikratObsahujePrvek() {
        final Collection<String> c = Arrays.asList("karel", "michal", "petr", "karel", "ondra");
        final int frekvence = Collections.frequency(c, "karel");
        System.out.println("Kolekce obsahuje: " + frekvence + "x jméno karel.");
    }

    public static void pozicePrvnihoVyskytu() {
        final List<Integer> c = Arrays.asList(1, 5, 9, 3, 5, 7, 4, 2, 7, 6);
        final List<Integer> subList = Arrays.asList(3, 5, 7);
        final int indexOfSubList = Collections.indexOfSubList(c, subList);
        System.out.println("První nalezený index kolekce: " + subList + " je: " + indexOfSubList);
    }


    public static void pozicePoslednihoVyskytu() {
        final List<Integer> c = Arrays.asList(1, 5, 9, 3, 5, 7, 4, 2, 3, 5, 7, 6);
        final List<Integer> subList = Arrays.asList(3, 5, 7);
        final int indexOfSubList = Collections.lastIndexOfSubList(c, subList);
        System.out.println("Poslední nalezený index kolekce: " + subList + " je: " + indexOfSubList);
    }

    public static void maximalniHodnotaKolekce() {
        final Collection<Integer> c = Arrays.asList(8, 7, 7, 6, 0, 5, 3, 1, 1, 3);
        final int max = Collections.max(c);
        System.out.println("Maximální prvek v kolekci: " + c + " je: " + max);
    }

    public static void minimalniHodnotaKolekce() {
        final Collection<Integer> c = Arrays.asList(8, 7, 7, 6, 0, 5, 3, 1, 1, 3);
        final int min = Collections.min(c);
        System.out.println("Nejmenší prvek v kolekci: " + c + " je: " + min);
    }


    public static void binarniVyhledavani() {
        final List<Integer> list = Arrays.asList(9, 6, 5, 4, 2, 3, 1, 7, 8, 0);
        Collections.sort(list); // Zkuste si zakomentovat řazení, algoritmus přestane fungovat
        final int key = 2;
        final int index = Collections.binarySearch(list, key);
        System.out.println("Prvek: " + key + " se nachází na pozici: " + index);
    }

}
