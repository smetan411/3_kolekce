package listSeznam;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.function.Consumer;

public class SeznamList {


    public static void main(String[] args) {
        vytiskniSeznam();
//        vytiskniSeznam1();
//        prvkyListu();
//        nejPrvkyListu();
//        nejPrvkyListu1();
//        seznamJmen();
//        jmennySeznam();
//        jmennySeznam1();
//        prohodPismena();
//        prohodPrvkyListu();
//        zjistiJeLiTam();
//        sectiPrvky();
//        setridRucne();
//        seznamJinychJmen();
//        tiskniLichaCisla();

    }

    //    vytvoř seznam celých čísel pomocí metody .add() a vytiskni ho
//    vytiskni první a poslední prvek
//    přidej na první místo seznamu číslo 100, seznam vytiskni
    public static void vytiskniSeznam() {
        System.out.println("Zakládám list");
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(10);
        list.add(32);
        list.add(26);
        System.out.println("Tisknu list: " + list);

        System.out.println("První prvek: " + list.get(0));
        System.out.println("Poslední prvek: " + list.get(list.size() - 1));

        list.add(0, 100);
        System.out.println("Tisknu pole s odebranými prvky:" + list);

    }


    //  vytvoř seznam pomocí Lists.new ArrayList(), budeš k tomu potřebavat knihovnu
//  Google Core Libraries for Java, kterou vložíš do ProjectStructure / Libraries / např. com.google.guava:guava:18.0
//  odeber ze seznamu prvek podle indexu, prvek podle hodnoty a posledni prvek seznamu
    public static void vytiskniSeznam1() {
        System.out.println("Zakládám list");
        List seznam = Lists.newArrayList(20, 40, 60, 80, 100);
        System.out.println("Tisknu list: " + seznam);

        seznam.remove(0);
        seznam.remove(seznam.indexOf(40));
        seznam.remove(seznam.size() - 1);
        System.out.println("Tisknu pole s odebranými prvky:" + seznam);
    }


//    vytvoř seznam 20ti čísel pomocí cyklu generováním náhodných čísel a zjisti,
//    jestli je tam prvek s hodnotou např. 80

    public static void prvkyListu() {
        List<Integer> seznamNahodnychCisel = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int nahodneCislo = (int) Math.round(Math.random() * 100 + 1);
            seznamNahodnychCisel.add(nahodneCislo);
        }
        System.out.println("Tisk seznamu:" + seznamNahodnychCisel);
        System.out.println("Hledaný prvek v seznamu je/true, neni/false:   " + seznamNahodnychCisel.contains(80));
        boolean obsahujePrvek = seznamNahodnychCisel.contains(80);
        if (obsahujePrvek) {
            seznamNahodnychCisel.remove(seznamNahodnychCisel.indexOf(80));
        }
        System.out.println("Tisk seznamu bez prvku 80:" + seznamNahodnychCisel);
    }


    //  vytvor seznam cisel a najdi největší a nejmenší cislo
    public static void nejPrvkyListu() {
        List<Integer> seznamCisel = new ArrayList<>();
        seznamCisel.add(100);
        seznamCisel.add(58);
        seznamCisel.add(2);
        seznamCisel.add(10);
        seznamCisel.add(32);
        seznamCisel.add(46);
        System.out.println("Tisknu list: " + seznamCisel);

        int nejvetsi = Integer.MIN_VALUE;
        for (int i = 0; i < seznamCisel.size() - 1; i++) {
            if (seznamCisel.get(i) > nejvetsi) {
                nejvetsi = seznamCisel.get(i);
            }
        }
        System.out.println("Největší číslo je: " + nejvetsi);

        int nejmensi = Integer.MAX_VALUE;
        for (int i = 0; i < seznamCisel.size() - 1; i++) {
            if (seznamCisel.get(i) < nejmensi) {
                nejmensi = seznamCisel.get(i);
            }
        }
        System.out.println("Nejmenší číslo je: " + nejmensi);
    }


    //  proveď totéž s cyklem forEach
    public static void nejPrvkyListu1() {
        List<Integer> seznamCisel = new ArrayList<>();
        seznamCisel.add(100);
        seznamCisel.add(58);
        seznamCisel.add(2);
        seznamCisel.add(10);
        seznamCisel.add(32);
        seznamCisel.add(46);
        System.out.println("Tisknu list: " + seznamCisel);

        int nejvetsi = Integer.MIN_VALUE;

        for (Integer cislo : seznamCisel) {
            if (cislo > nejvetsi) {
                nejvetsi = cislo;
            }
        }
        System.out.println("Největší číslo je: " + nejvetsi);

        int nejmensi = Integer.MAX_VALUE;
        for (Integer cislo : seznamCisel) {
            if (cislo < nejmensi) {
                nejmensi = cislo;
            }
        }
        System.out.println("Nejmenší číslo je: " + nejmensi);
    }


    // vytvoř soubor, který uživatele vyzve k zadání jména a poté jeho jméno zařadí do seznamu podle abecedy
    // seznam zobraz
    public static void seznamJmen() {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej své jméno.");
        String jmeno = sc.nextLine();
        list.add(jmeno);
        System.out.println("Chceš zadat další jméno? ano - ne");
        while ("ano".equals(sc.nextLine())) {
            System.out.println("Zadej dalsi jmeno");
            String dalsiJmeno = sc.nextLine();
            list.add(dalsiJmeno);
            System.out.println("Chces zadat dalsi jmeno?");
        }

        System.out.println("Vytisknu celý seznam: ");
        System.out.print(list);
    }


    // vytvoř jmenný seznam a pomocí metody .sort jména seřaď podle abecedy, seznam vytiskni
    public static void jmennySeznam() {
        System.out.println("Zakládám jmenný seznam: ");
        List<String> list = new ArrayList<>();
        list.add("Petřík");
        list.add("Martínek");
        list.add("Zuzanka");
        list.add("Alenka");
        list.add("Tomášek");
        System.out.println(list);

        Comparator r1 = Comparator.naturalOrder();
        Comparator r2 = Comparator.reverseOrder();

        Comparator<String> r3 = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        };
        Collections.sort(list, r1);
        System.out.println(list);
        Collections.sort(list, r2);
        System.out.println(list);
        Collections.sort(list, r3);
        System.out.println(list);
    }


    // vytvoř seznam jmen pomocí metody Lists.newArrayList
    // seznam zobraz
    public static void jmennySeznam1() {
        System.out.println("Zakládám jmenný seznam: ");

        List seznamJmen = Lists.newArrayList("Petřík", "Zuzanka", "Martínek", "Alenka", "Tomášek");
        System.out.println(seznamJmen);

        Comparator r1 = Comparator.naturalOrder();
        Comparator r2 = Comparator.reverseOrder();

        Comparator<String> r3 = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        };
        Collections.sort(seznamJmen, r1);
        System.out.println(seznamJmen);
        Collections.sort(seznamJmen, r2);

        seznamJmen.sort(r1);
        System.out.println(seznamJmen);
        seznamJmen.sort(r2);
        System.out.println(seznamJmen);

        System.out.println(seznamJmen);
        Collections.sort(seznamJmen, r3);
        System.out.println(seznamJmen);
    }


    // naplńte seznam pomocí cyklu tak, aby obsahoval jen kladná lichá čísla až do 21 a seznam vytiskněte
    public static void tiskniLichaCisla() {
        List<Integer> lichaCisla = new ArrayList<>();
        int licheCislo = 1;
        lichaCisla.add(licheCislo);
        for (int i = 0; i < 10; i++) {
            licheCislo += 2;
            lichaCisla.add(licheCislo);
        }
        System.out.println(lichaCisla);
    }

    public static void prohodPismena() {
        char[] pismena = {'a', 'b', 'c'};
        System.out.println(Arrays.toString(pismena));
        //     prohozeni
        char pomocnik = pismena[2];
        pismena[2] = pismena[1];
        pismena[1] = pomocnik;
        //tisk
        for (char b : pismena) {
            System.out.print(b + "; ");
        }
        System.out.println();
    }

    // prohod prvky listu
    public static void prohodPrvkyListu() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        System.out.println(list1);
        int pomocnik = list1.get(0);
        int pomocnik2 = list1.get(1);
        list1.set(0, pomocnik2);
        list1.set(1, pomocnik);
        System.out.println(list1);
    }


    // zjisti, jestli je v seznamu 50
    public static void zjistiJeLiTam() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        System.out.println("V seznamu cislo 50 je=true / neni=false:  " + list1.contains(50));
    }


    // setřiď seznam ručně, podobně jako pole
//    public static void setridRucne() {
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(40);
//        list1.add(20);
//        list1.add(60);
//        list1.add(10);
//        list1.add(50);
//        list1.add(30);
//        boolean tridim = true;
//        while (tridim) {
//            tridim = false;
//            for (int i = 0; i < list1.size() - 1; i++) {
//                if (list1.get(i) > list1.get(i + 1)) {
//                    int a = list1.get(i);
//                    int b = list1.get(i + 1);
//                    a = list1.get(i + 1);
//                    b = list1.get(i);
//                }
//            }
//            tridim = true;
//        }
//        System.out.println(list1);
//    }


    //  sečti všechny číselné prvky seznamu
    public static void sectiPrvky() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        int soucet = 0;
        for (Integer i : list1) {
            soucet += i;
        }
        System.out.println(soucet);
    }

    public static void seznamJinychJmen() {
// vytvorime seznam
        List<Clovek> seznam = new ArrayList<>();
// naplnime seznam - 1. zpusob
        Clovek clovek1 = new Clovek("Dalimil", "Brabec");
        Clovek clovek2 = new Clovek("Viktor", "Kotrba");

        seznam.add(clovek1);
        seznam.add(clovek2);
// naplnime seznam - 2. zpusob
        seznam.add(new Clovek("Josef", "Vykoukal"));
        seznam.add(new Clovek("Karolina", "Novakova"));

        // projdeme iteratorem a vypiseme postupne vsechny lidi
        for (Iterator i = seznam.iterator(); i.hasNext(); ) {
            Clovek c = (Clovek) i.next();
            c.vypisInfo();
        }
        for (Clovek c : seznam) {
            c.vypisInfo();
        }

        for (int i = 0; i < seznam.size() - 1; i++) {
            seznam.get(i).vypisInfo();
        }

        seznam.forEach(new Consumer<Clovek>() {
            @Override
            public void accept(Clovek clovek) {
                clovek.vypisInfo();
            }
        });

        seznam.forEach(clovek -> clovek.vypisInfo());  //alt+enter pro lambda


        seznam.forEach(Clovek::vypisInfo);
    }

    //sem> porovnat komparatorem prijmeni, jmena, vek


    //   Clovek je vnorena trida, nekdy se to tak pouziva, aby trida Clovek nebyla videt ven
    static class Clovek {
        String jmeno, prijmeni;

        Clovek(String jmeno, String prijmeni) {
            this.jmeno = jmeno;
            this.prijmeni = prijmeni;
        }

        public void vypisInfo() {
            System.out.println(jmeno + " " + prijmeni);
        }
    }

    public static class SpojovySeznam {

        public static void main(String[] args) {
    //        prvniSpojovySeznam();
    //        vkladaniMazaniPrvku();
            spojovySeznamCyklem();
        }

        public static void prvniSpojovySeznam() {
            LinkedList<Integer> seznam = new LinkedList<>();
            seznam.add(5);
            seznam.addFirst(6);
            seznam.addLast(10);
            System.out.println(seznam.getFirst());
            System.out.println(seznam.getLast());
            System.out.println(seznam);

        }

        //vytvor spojovy seznam, vloz tam cisla 1 az 5
        // pridej na pozici s indexem 3 cisla 33, 31, smaz cislo s indexem 2
        // mezi cisla 31 a 33 vloz cislo 32
        // smaz cislo 31, vzdy po ukonu seznam vytiskni
        public static void vkladaniMazaniPrvku() {

            LinkedList<Integer> seznam = new LinkedList<>();
            for (int i = 0; i <5 ; i++) {
                seznam.addLast(i + 1);
            }
            for (Integer i : seznam) {
                System.out.print(i + ", ");
            }
            System.out.println();

            seznam.add(3, 33);
            for (Integer i : seznam) {
                System.out.print(i + ", ");
            }
            System.out.println();

            seznam.add(3, 31);
            for (Integer i : seznam) {
                System.out.print(i + ", ");
            }
            System.out.println();

            seznam.add((seznam.indexOf(31) + 1), 32);
            for (Integer i : seznam) {
                System.out.print(i + ", ");
            }
            System.out.println();
            seznam.remove(2);
            for (Integer i : seznam) {
                System.out.print(i + ", ");
            }
            System.out.println();

            seznam.remove(seznam.indexOf(31));
            for (Integer i : seznam) {
                System.out.print(i + ", ");
            }
        }

        // napln spojovy seznam cyklem nahodnymi cisly 0 az 20
        // pokud je tam cislo 9, tak ho vymaz
        // secti cisla ve spojovem seznamu
        public static void spojovySeznamCyklem() {
            LinkedList<Integer> seznam = new LinkedList<>();
            for (int i = 0; i < 5; i++) {
                seznam.add((int) Math.round(Math.random() * 20));
            }
            for (Integer i : seznam) {
                System.out.print(i + " ");
            }
            System.out.println(seznam.contains(9));
            if(seznam.contains(9)){
                seznam.remove(seznam.indexOf(9));
            }
            for (Integer i : seznam) {
                System.out.print(i + " ");
            }
            System.out.println();
            int soucet = 0;
            for (Integer i : seznam) {
                soucet += i;
            }
            System.out.println(soucet);
        }
    }
}