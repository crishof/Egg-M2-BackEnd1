import entidades.ParDeNumeros;
import servicios.ParDeNumerosService;

public class Main {

    public static void main(String[] args) {

        ParDeNumerosService pds = new ParDeNumerosService();
        ParDeNumeros pdN = new ParDeNumeros();

        pds.MostrarValores(pdN);
        pds.DevolverMayor(pdN);
        pds.CalcularPotencia(pdN);
        pds.CalcularRaiz(pdN);

    }
}
