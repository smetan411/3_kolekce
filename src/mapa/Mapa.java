package mapa;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Mapa {

    public static void main(String[] args) {
        mapaMest();
    }


    public static class Souradnice {
        int x;
        int y;

        public Souradnice(int x, int y) {
            this.x = x;
            this.y = y;
        }

        //  vysvetlit prosim / pomoci alt + insert vytvarime equals() + hashCode()
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Souradnice that = (Souradnice) o;
            return x == that.x &&  y == that.y;
        }

        // getter
        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }


        //      metoda toString
        @Override
        public String toString() {
            return "Souradnice {" + "x=" + x + ", y=" + y + '}';
        }
    }

    public static void mapaMest() {
        Map<Souradnice, String> mapa = new HashMap<>();
        mapa.put(new Souradnice(10, 20), "Brno");
        mapa.put(new Souradnice(5, 25), "Praha");
        mapa.put(new Souradnice(8, 30), "Kurim");

        System.out.println(mapa);
    }
}
