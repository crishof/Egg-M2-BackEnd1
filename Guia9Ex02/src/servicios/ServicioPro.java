package servicios;

import entidades.Ahorcado;

import java.util.Arrays;
import java.util.Scanner;

import static servicios.AhorcadoServicio.*;

public class ServicioPro {

    Scanner leer = new Scanner(System.in);

    public void juegoPRO() {

        Ahorcado ahorcado = crearJuego();
        longitud(ahorcado);
        char[] oculto = new char[ahorcado.getPalabraBuscar().length];
        Arrays.fill(oculto, '*');

        while (ahorcado.getJugadasMax() > 0 && ahorcado.getPalabraBuscar().length != ahorcado.getLetrasEncontradas()) {
            System.out.println("Ingrese la letra a adivinar");
            char letra = leer.next().charAt(0);

            if (buscarLetra(ahorcado, letra)) {

                for (int i = 0; i < ahorcado.getPalabraBuscar().length; i++) {
                    if (letra == ahorcado.getPalabraBuscar()[i]) {
                        oculto[i] = ahorcado.getPalabraBuscar()[i];
                    }
                }
            }
            encontradas(ahorcado, letra);
            intentos(ahorcado);
            printOculto(ahorcado, letra, oculto);

        }

        System.out.println("");

        if (ahorcado.getLetrasEncontradas() == ahorcado.getPalabraBuscar().length){
            System.out.println("= = = Enorabuena! Has ganado!");
        }else {
            System.out.println("= = = Lo siento! Has perdido!");
        }

    }

    public void menu() {
        System.out.println("");
        System.out.println("= = = = A H O R C A D O = = = =");
        System.out.println();
        System.out.println("= =  = = = = = MENU = = = = = = ");
        System.out.println("");

        System.out.println("Ingrese 1 para modo EGG o 2 para modo Cris");
        int menu = leer.nextInt();
        switch (menu) {
            case 1:
                System.out.println("OK! Comencemos!");
                System.out.println();
                AhorcadoServicio.juego();
                break;
            case 2:
                System.out.println("Excelente opción! Perparate!");
                System.out.println();
                juegoPRO();
                break;
            default:
                System.out.println("Ingrese una opción válida");
        }
    }

    public void printOculto(Ahorcado ahorcado, char letra, char[] oculto) {


        System.out.println("=== Palabra oculta ===");
        System.out.println(Arrays.toString(oculto));

    }


}
