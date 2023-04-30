package zasobnik;

import java.util.Random;

public class Zadost {

    private static final Random random = new Random();

    private static final String[] NAZVY = {
            "David", "Adam", "Richard", "Martin", "Sam", "Drahomír",
            "Vlastimil", "Michael", "Štěpán", "Petr"};

    private final String jmeno;

    public Zadost() {
        this.jmeno = NAZVY[random.nextInt(NAZVY.length)];
    }

    @Override
    public String toString() {
        return jmeno;
    }


}
