package entidades;

public class NIF {

    long dni;
    String nif;

    public NIF() {
    }

    public NIF(long dni, String nif) {
        this.dni = dni;
        this.nif = nif;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "NIF{" +
                "dni=" + dni +
                ", nif=" + nif +
                '}';
    }
}
