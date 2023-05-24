import entidades.Cadena;
import servicios.CadenaServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio cs = new CadenaServicio();

        System.out.println("Ingrese una frase para operar");
        Cadena cad1 = new Cadena(leer.nextLine());

        cs.mostrarVocales(cad1);
        cs.invertirFrase(cad1);
        cs.vecesRepetido(cad1,leer);
        cs.compararLongitud(cad1,leer);
        cs.unirFrases(cad1,leer);
        cs.reemplazar(cad1,leer);
        cs.contiene(cad1,leer);
    }
}