package servicios;

import entidades.Ahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void longitud(Ahorcado ahorcado) {

        System.out.println("El largo de la palabra a adivinar es de " + ahorcado.getPalabraBuscar().length + " letras");

//        System.out.println("== Print de prueba ==");
//        System.out.println(Arrays.toString(ahorcado.getPalabraBuscar()));
    }

    public static Ahorcado crearJuego() {

        Ahorcado ahorcado = new Ahorcado();

        System.out.println("Jugador 1, ingrese una palabra");
        String palabra = leer.next();
        char[] aux = new char[palabra.length()];

        for (int i = 0; i < aux.length; i++) {
            aux[i] = palabra.charAt(i);
        }
        System.out.println("Jugador 1, cuantas vidas otorga?");
        int vida = leer.nextInt();
        ahorcado.setPalabraBuscar(aux);
        ahorcado.setJugadasMax(vida);

        return ahorcado;

    }
    public static boolean buscarLetra(Ahorcado ahorcado, char letra) {

        boolean letraOk = false;

        for (int i = 0; i < ahorcado.getPalabraBuscar().length; i++) {

            if (ahorcado.getPalabraBuscar()[i] == letra) {
                letraOk = true;
                break;
            }
        }

        if (letraOk) {
            System.out.println("La letra se encuentra en la palabra");
        } else {
            System.out.println("La letra no se encuentra en la palabra");
        }
        return letraOk;
    }
    public static boolean encontradas(Ahorcado ahorcado, char letra) {
        char[] letrabuscar = ahorcado.getPalabraBuscar();

        int cont = 0;

        for (int i = 0; i < ahorcado.getPalabraBuscar().length; i++) {
            if (letra == letrabuscar[i]) {
                cont++;
            }
        }
        ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + cont);

        int letrasF = ahorcado.getLetrasEncontradas();
        System.out.println("Letras encontradas: " + letrasF);
        System.out.println("Letras faltantes " + (ahorcado.getPalabraBuscar().length - letrasF));

        if (cont > 0) {
            return true;
        } else {
            ahorcado.setJugadasMax(ahorcado.getJugadasMax() - 1);
            return false;
        }
    }
    public static void intentos(Ahorcado ahoracado) {
        System.out.println("Te quedan " + ahoracado.getJugadasMax() + " intentos");
    }
    public static void juego() {

        Ahorcado ahorcado = crearJuego();
        longitud(ahorcado);

        while (ahorcado.getJugadasMax() > 0 && ahorcado.getPalabraBuscar().length != ahorcado.getLetrasEncontradas()) {
            System.out.println("Ingrese la letra a adivinar");
            char letra = leer.next().charAt(0);

             buscarLetra(ahorcado, letra);
             encontradas(ahorcado, letra);
            intentos(ahorcado);
        }

        System.out.println("");

        if (ahorcado.getLetrasEncontradas() == ahorcado.getPalabraBuscar().length){
            System.out.println("= = = Enorabuena! Has ganado!");
        }else {
            System.out.println("= = = Lo siento! Has perdido!");
        }
    }




    }





