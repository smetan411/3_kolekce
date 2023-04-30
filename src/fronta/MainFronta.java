package fronta;

import java.util.LinkedList;
import java.util.Queue;

//  offer() prida novy prvek na konec fronty
//  poll()  odebere prvek ze zacatku fronty, ten co je na rade a navrati ho v return
//  peek()  vrati prvek na zacatku fronty bez odebrani
//  size()  vrati celkovy pocet prvku ve fronte

public class MainFronta {
    public static void main(String[] args) {
        Queue<Zakaznik> zakaznici = new LinkedList<>();

        System.out.println("Přidáme zákazníky do fronty");
        for (int i = 0; i < 10; i++) {
            Zakaznik zakaznik = new Zakaznik();
            zakaznici.offer(zakaznik);
            System.out.println("Zákazník " + zakaznik + " se zařadil do fronty");
        }

// Obsloužení zákazníků ve frontě
        System.out.println();
        System.out.println("Obsluhuji zákazníky");
        while (zakaznici.size() > 0) {
            Zakaznik zakaznik = zakaznici.poll();
            System.out.println("Zákazník " + zakaznik + " byl obsloužen");
        }
    }

}
