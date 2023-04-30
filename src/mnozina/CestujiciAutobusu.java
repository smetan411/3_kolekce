package mnozina;


import java.util.Objects;

public class CestujiciAutobusu {
    private final String jmeno;
    private final String prijmeni;

    public CestujiciAutobusu(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    @Override
    public String toString() {
        return "CestujiciAutobusu{" +
                "jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CestujiciAutobusu that = (CestujiciAutobusu) o;
        return jmeno.equals(that.jmeno) && prijmeni.equals(that.prijmeni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jmeno, prijmeni);
    }
}