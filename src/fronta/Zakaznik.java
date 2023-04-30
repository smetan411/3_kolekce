package fronta;

import java.util.Random;

public class Zakaznik {

    private static final Random random = new Random();

    private static final String[] JMENA = {
            "David", "Adam", "Richard", "Martin", "Sam", "Drahomír",
            "Vlastimil", "Michael", "Štěpán", "Petr"};

    private final String jmeno;

    public Zakaznik() {
        this.jmeno = JMENA[random.nextInt(JMENA.length)];
    }

    @Override
    public String toString() {
        return jmeno;
    }

}
