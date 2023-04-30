package pole;

import java.util.Arrays;

public class PoleJednorozměrné {

    public static void main(String[] args) {
          seradJmena();
//        provedSoucetPole();
//        seradSuda();
//        vypisLicha();
//        vytvorNahodnePole(10,20);
//        seradNahodnaCisla();
//        seradRucne();
//        prohodPismena();
//        najdiNejvetsi();
//        seradPoleSestupne();
//
//      int[] mojePole = {5, 6, 9, 5, 78, 2};
//       prohodDvaPrvkyPole(mojePole, 5, 3);

    }

    //   Vytvořte pole pěti jmen, potom pole seřaďte podle abecedy
    //   a vytiskněte jména pomocí for, foreach a Arrays.toString()
    public static void seradJmena() {
        String[] jmena = {"Pavel", "Eva", "Hana", "Jitka", "Libor"};
        Arrays.sort(jmena);
        //tisk s for
        for (int i = 0; i < jmena.length; i++) {
            System.out.print(jmena[i] + " ");
        }
        System.out.println();
        // tisk s foreach
        for (String s : jmena) {
            System.out.print(s + " ");
        }
        System.out.println();
        // tisk s Arrays.toString()
        System.out.println(Arrays.toString(jmena));
    }

    //   Vytvořte pole celých čísel, potom pole sečtěte, použijte foreach
    public static void provedSoucetPole() {
        int[] pole = {5, 66, 94, 5, 2, 11, 87, 30, 50};
        int soucetPole = 0;
        for (int s : pole) {
            soucetPole += s;
        }
        System.out.println("souce pole je: " + soucetPole);
    }


    // naplńte pole pomocí cyklu tak, aby obsahovalo nulu a sudá čísla až do 20 a pole vytiskněte na řádek
    // predvedte tisk spatne a dobre - pomoci foreach a Arrays.toString()
    public static void seradSuda() {
        int[] suda = new int[11];
        for (int i = 0; i < 11; i++) {
            suda[i] = i * 2;
        }
        for (int s : suda) {
            System.out.print(s + " ");
        }
        System.out.println();
        //tisk spatne, vytiskne odkaz
        System.out.println(suda);
        System.out.println(Arrays.toString(suda));
    }

    // naplńte pole pomocí cyklu tak, aby obsahovalo lichá čísla 1 až 21 a pole vytiskněte na řádek
    public static void vypisLicha() {
        int[] licha = new int[11];
        for (int i = 0; i < 11; i++) {
            licha[i] = i * 2 + 1;
        }
        for (int s : licha) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void vytvorNahodnePole(int maxDelkaPole, int maxHodnotaPrvku) {
        int a = (int) Math.round(Math.random() * maxDelkaPole + 1);
        int[] nahodnePole = new int[a];
        for (int i = 0; i < nahodnePole.length - 1; i++) {
            nahodnePole[i] = (int) Math.round(Math.random() * maxHodnotaPrvku + 1);
        }
        for (int prvek : nahodnePole) {
            System.out.print(prvek + ", ");
        }
    }

    // vytvořte pole s pěti náhodně velkými celými čísly (1 - 1000), pole vytiskněte pomocí Arrays.toString()
    // seřaďte čísla podle velikosti pomocí metody Arrays.sort(), pole vytiskněte pomoci foreach
    public static void seradNahodnaCisla() {
        int[] cisla = new int[5];
        for (int i = 0; i < cisla.length; i++) {
            cisla[i] = (int) Math.round(Math.random() * 1000 + 1);
        }
        System.out.println(Arrays.toString(cisla));
        Arrays.sort(cisla);
        System.out.println(Arrays.toString(cisla));
        //tisk jeste jednou pomoci foreach
        for (int cislo : cisla) {
            System.out.print(cislo + " ");
        }
    }

    //   vytvořte pole s pěti čísly a seřaďte je podle velikosti, ale rucne, nikoliv pomoci sort()
    //   vytiskněte pole na řádek pomocí příkazu forEach, mezi čísly bude mezera a středník
    public static void seradRucne() {
        int[] cisla = {5, 28, 6, 15, 701};
        boolean prohozeno = true;
        while (prohozeno) {
            prohozeno = false;
            for (int i = 0; i < cisla.length - 1; i++) {
                if (cisla[i] > cisla[i + 1]) {
                    int a = cisla[i];
                    cisla[i] = cisla[i + 1];
                    cisla[i + 1] = a;
                    prohozeno = true;
                }
            }
        }
        for (int i : cisla) {
            System.out.print(i + "; ");
        }
        System.out.println();
    }

    // vytvořte pole písmen (char) a prohoďte dvě libovolná písmena
    // vytiskněte pole před prohozením písmen metodou Arrays.toString()
    // a po prohození písmen napr. příkazem forEach
    public static void prohodPismena() {
        char[] pismena = {'a', 'b', 'c'};
        //    tisk před prohozením
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


    // vytvořte náhodně velké pole (max.20 prvků) složené z náhodných celýchčísel(1 - 1000)
    // a najděte největší číslo, vytisknete ho
    // pod něj zkuste vypsat celé pole dvěma způsoby (foreach, Arrays.toString())
    public static void najdiNejvetsi() {
        int a = (int) Math.round(Math.random() * 20 + 1);
        int[] pole = new int[a];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = (int) Math.round(Math.random() * 1000 + 1);
        }
        // hledání největšího
        int nejvetsi = 0;
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] > nejvetsi) {
                nejvetsi = pole[i];
            }
        }
        System.out.println("Největší číslo je: " + nejvetsi);
        System.out.println(Arrays.toString(pole));
        for (int b : pole) {
            System.out.print(b + "; ");
        }
        System.out.println();
    }


    // cyklem vytvořte pole deseti celých čísel, první zvolte libovolně, pozor ma index 0
    // každé číslo je trojnásobkem předchozího
    // a seřaďte je sestupně - od největšího do nejmenšího
    public static void seradPoleSestupne() {
        int[] poleCisel = new int[10];
        poleCisel[0] = 5;
        // nulty index uz mame, zaciname od indexu 1
        for (int i = 1; i < poleCisel.length; i++) {
            poleCisel[i] = poleCisel[(i - 1)] * 3;
        }
        // setřídění od největšího
        boolean prohozeno = true;
        while (prohozeno) {
            prohozeno = false;
            for (int i = 0; i < poleCisel.length - 1; i++) {
                if (poleCisel[i] < poleCisel[i + 1]) {
                    //prohozeni prvku pole
                    int a = poleCisel[i];
                    poleCisel[i] = poleCisel[i + 1];
                    poleCisel[i + 1] = a;
                    prohozeno = true;
                }
            }
        }
        for (int b : poleCisel) {
            System.out.print(b + "; ");
        }
    }


    /**
     * metoda prohodi dva prvky pole
     * * @param poleCisel pole intu
     * @param index1 index prvniho prvku k prohozeni
     * @param index2 index druheho prvku k prohozeni
     * @return
     */

    /**
     * dokumentacni komentar
     * @param poleCisel
     * @param index1
     * @param index2
     * @return
     */
    public static int[] prohodDvaPrvkyPole(int[] poleCisel, int index1, int index2) {
        System.out.println(Arrays.toString(poleCisel));
        int a = poleCisel[index1];
        poleCisel[index1] = poleCisel[index2];
        poleCisel[index2] = a;
        System.out.println(Arrays.toString(poleCisel));
        return poleCisel;
    }


}


