package genericita;

public class Trida<T1 extends Comparable> {

    // pozn. public class Trida<A extends B, B extends C, C> {}
    // tim jsme deklarovali tridu se tremi generickymi parametry

    private T1 promenna;

    public Trida(T1 promenna) {
        this.promenna = promenna;
    }

    public <T2> boolean porovnej(T2 a) {
        return promenna.equals(a);
    }

    public static void main(String[] args) {
        Trida<Integer> instance = new Trida<>(10);
        boolean vysledek = instance.<Integer>porovnej(10);
        System.out.println(vysledek);
    }
}
