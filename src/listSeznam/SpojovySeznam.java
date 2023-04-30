package listSeznam;

import java.util.LinkedList;

public class SpojovySeznam {

    public static void main(String[] args) {
        vytvorSeznam();
        pridavejMazej();
    }

    public static void vytvorSeznam(){
        LinkedList<Integer> seznam = new LinkedList<>();
        seznam.add(5);
        seznam.addFirst(6);
        seznam.addLast(10);
        System.out.println(seznam.getFirst());
        System.out.println(seznam.getLast());
    }

    public static void pridavejMazej(){
        LinkedList<Integer> seznam = new LinkedList<>();
        seznam.addLast(1);
        seznam.addLast(2);
        seznam.addLast(3);
        seznam.addLast(4);
        seznam.addLast(5);

// přidávání a mazání v prostředku seznamu
        seznam.add(3, 32);
        seznam.add(3, 31);
        seznam.remove(2);

// výpis seznamu
        for (Integer i : seznam) {
            System.out.print(i + ", ");
        }
    }
}
