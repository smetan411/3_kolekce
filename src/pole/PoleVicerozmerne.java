package pole;

public class PoleVicerozmerne {

    public static void main(String[] args) {

       vytiskniKinosal();
//        naplnKinosalRucne();
//        vytiskniMultikino();
//        vytiskniLetniKino();
//        naplnLetniKinoZkracene();
    }

    // deklaruj kinosal s peti radami a peti sedadly v kazde rade
    // napln kinosal castecne rucne, castecne cyklem, vytiskni ho
    public static void vytiskniKinosal() {
        int[][] kinosal = new int[5][5];
        // plnime kinosal
        kinosal[2][2] = 1;
        for (int i = 1; i < 4; i++) {
            kinosal[i][3] = 1;
        }
        for (int i = 0; i < 5; i++) {
            kinosal[i][4] = 1;
        }
        // tiskneme kinosal cyklem for
        for (int j = 0; j < kinosal[0].length; j++) {
            for (int i = 0; i < kinosal.length; i++) {
                System.out.print(kinosal[i][j] + " ");
            }
            System.out.println();
        }
        //pro text pod tiskem - zjistime radky, sloupce, celkem sedadel:
        int sloupcu = kinosal.length;
        int radku = kinosal[0].length;
        int mistaKSezeni = radku * sloupcu;
        System.out.println("V kine je " + radku + " rad a v kazde rade je " + sloupcu + " sedadel.");
        System.out.println("Je tam tedy celkem " + mistaKSezeni + " mist k sezeni.");
    }

    // napln kinosal rucne
    // vytiskni ho cyklem for a cyklem foreach
    public static void naplnKinosalRucne() {
        int[][] kinosal = {
                {0, 0, 0, 0, 1},
                {0, 0, 0, 1, 1},
                {0, 0, 1, 1, 1},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 0, 1}
        };
        // tiskneme kinosal
        for (int i = 0; i < kinosal[0].length; i++) {
            for (int j = 0; j < kinosal.length; j++) {
                System.out.print(kinosal[i][j] + " ");
            }
            System.out.println();
        }
        // tiskneme kinosal jinak
        System.out.println();
        for (int[] radek : kinosal) {
            for (int sedadlo : radek) {
                System.out.print(sedadlo + " ");
            }
            System.out.println();
        }
    }

    // deklaruj multikino se tremi kinosaly
    // napln ho cyklem, vsude napr. jednu plnou radu
    public static void vytiskniMultikino() {

        int[][][] multikino = new int[3][5][5];
        //plnime multikino [cisloKinosalu][rada][sedadlo]
        for (int i = 0; i < 5; i++) {
            multikino[0][1][i] = 1;
        }
        for (int i = 0; i < 5; i++) {
            multikino[1][2][i] = 1;
        }
        for (int i = 0; i < 5; i++) {
            multikino[2][3][i] = 1;
        }
        //tisk pomoci for
        System.out.println("Tiskneme prvni kinosal:");
        System.out.println("Rada s indexem 1 je vyprodana, je to druha rada.");
        for (int i = 0; i < multikino[0][i].length - 1; i++) {
            for (int j = 0; j < multikino[0].length - 1; j++) {
                System.out.print(multikino[0][i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Tiskneme druhy kinosal:");
        System.out.println("Vyprodali jsme predposledni radu.");
        for (int i = 0; i < multikino[1][i].length - 1; i++) {
            for (int j = 0; j < multikino[1].length - 1; j++) {
                System.out.print(multikino[1][i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Tiskneme treti kinosal:");
        System.out.println("Vyprodana je posledni rada.");
        for (int i = 0; i < multikino[2][i].length - 1; i++) {
            for (int j = 0; j < multikino[2].length - 1; j++) {
                System.out.print(multikino[2][i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Lepsi zpusob tisku: ");
        //kratsi zpusob
        int cisloKinosalu = 1;
        for (int[][] kino : multikino) {
            System.out.println("Tiskneme kinosal cislo " + cisloKinosalu);
            for (int[] rada : kino) {
                for (int sedadlo : rada) {
                    System.out.print(sedadlo + " ");
                }
                System.out.println();
            }
            cisloKinosalu++;
        }
    }

    public static void vytiskniLetniKino() {
        // zubate pole, sloupce maji promennou delku
        int[][] letniKino = new int[4][];
        letniKino[0] = new int[4];
        letniKino[1] = new int[5];
        letniKino[2] = new int[5];
        letniKino[3] = new int[3];
        for (int i = 0; i < letniKino[0].length; i++) {
            letniKino[0][i] = 1;
        }
        for (int i = 0; i < letniKino[1].length; i++) {
            letniKino[1][i] = 1;
        }
        for (int i = 0; i < letniKino[2].length; i++) {
            letniKino[2][i] = 1;
        }
        for (int i = 0; i < letniKino[3].length; i++) {
            letniKino[3][i] = 1;
        }

        System.out.println("Tiskneme letni kino:");
        System.out.println("Je uplne obsazene.");

        for (int[] rada: letniKino ) {
            for (int sedadlo : rada ) {
                System.out.print(sedadlo + " ");
            }
            System.out.println();
        }

//        for (int i = 0; i < letniKino[0].length; i++) {
//            System.out.print(letniKino[0][i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < letniKino[1].length; i++) {
//            System.out.print(letniKino[1][i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < letniKino[2].length; i++) {
//            System.out.print(letniKino[2][i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < letniKino[3].length; i++) {
//            System.out.print(letniKino[3][i] + " ");
//        }
//
//        System.out.println();

    }

    public static void naplnLetniKinoZkracene() {
        int[][] letniKino = {
                new int[]{1, 1, 1, 1},
                new int[]{1, 1, 1, 1, 1},
                new int[]{1, 1, 1, 1, 1},
                new int[]{1, 1, 1}
        };
        System.out.println("Tiskneme letni kino:");
        System.out.println("Je uplne obsazene.");

        for (int i = 0; i < letniKino[0].length; i++) {
            System.out.print(letniKino[0][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < letniKino[1].length; i++) {
            System.out.print(letniKino[1][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < letniKino[2].length; i++) {
            System.out.print(letniKino[2][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < letniKino[3].length; i++) {
            System.out.print(letniKino[3][i] + " ");
        }

        System.out.println();
    }
}

