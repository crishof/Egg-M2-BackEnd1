import entidades.NIF;
import servicios.NIFService;

public class Main {
    public static void main(String[] args) {

        NIFService nifService = new NIFService();
        NIF nif1 = nifService.CrearNif();

        nifService.Mostrar(nif1);

    }
}