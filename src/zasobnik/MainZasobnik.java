package zasobnik;


//  push() prida novy prvek na vrchol zasobniku
//  poll()  odebere prvek z vrcholu zasobniku, tedy ten co je na rade a navrati ho v return
//  peek()  vrati prvek na vrcholu zasobniku bez odebrani
//  size()  vrati celkovy pocet prvku v zasobniku

import java.util.ArrayDeque;
import java.util.Deque;

public class MainZasobnik {
    public static void main(String[] args) {
        Deque<Zadost> prvkyZasobniku = new ArrayDeque<>();

        System.out.println("Přidáme žadatele do fronty");
        for (int i = 0; i < 10; i++) {
            Zadost prvek = new Zadost();
            prvkyZasobniku.push(prvek);
            System.out.println("Žadatel " + prvek + " se zařadil do zasobniku");
        }

// Obsloužení zákazníků ve frontě
        System.out.println();
        System.out.println("Obsluhuji žadatele");
        while (prvkyZasobniku.size() > 0) {
            Zadost prvek = prvkyZasobniku.poll();
            System.out.println("Žadatel " + prvek + " byl obsloužen");
        }
    }

}

