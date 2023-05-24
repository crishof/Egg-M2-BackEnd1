package servicios;

import entidades.Cadena;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CadenaServicio {

    public int mostrarVocales(Cadena cadena) {
        System.out.println("");
        System.out.println("====== MOSTRAR VOCALES=======");
        System.out.println("");
        int cantVocal = 0;

        for (int i = 0; i < (cadena.getLongitud()); i++) {
            if (cadena.getFrase().charAt(i) == 'a') {
                cantVocal += 1;
            } else if (cadena.getFrase().charAt(i) == 'e') {
                cantVocal += 1;
            } else if (cadena.getFrase().charAt(i) == 'i') {
                cantVocal += 1;
            } else if (cadena.getFrase().charAt(i) == 'o') {
                cantVocal += 1;
            } else if (cadena.getFrase().charAt(i) == 'u') {
                cantVocal += 1;
            }
        }
        System.out.println("La frase tiene " + cantVocal + " vocales");
        return cantVocal;
    }

    public String invertirFrase(Cadena cadena) {
        System.out.println("");
        System.out.println("====== INVERTIR FRASE=======");
        System.out.println("");

        String reverse = "";

        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {
            reverse = reverse.concat(String.valueOf(cadena.getFrase().charAt(i)));
        }
        System.out.println("La frase invertida queda así: " + reverse);
        return reverse;
    }

    public int vecesRepetido(Cadena cadena, Scanner leer) {
        System.out.println("");
        System.out.println("====== VECES REPETIDO=======");
        System.out.println("");
        int veces = 0;

        System.out.println("Ingrese la letra que desea buscar");
        char letra = leer.next().charAt(0);

        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == letra) {
                veces++;
            }
        }
        switch (veces) {
            case 0:
                System.out.println("La letra [ " + letra + " ] no está en el String");
                break;
            case 1:
                System.out.println("La letra [ " + letra + " ] está una sola vez");
                break;
            default:
                System.out.println("La letra [ " + letra + " ] aparece " + veces + " veces.");
        }

        return veces;
    }

    public int compararLongitud(Cadena cadena, Scanner leer) {
        System.out.println("");
        System.out.println("====== COMPARAR LONGITUD =======");
        System.out.println("");
        int largo = 0;

        System.out.println("Ingrese la frase con la que desea comparar");
        String frase2 = leer.next();
        int largoS1 = cadena.getLongitud();
        int largoS2 = frase2.length();
        int dif = largoS1 - largoS2;
        System.out.println("Longitud frase 1: " + largoS1);
        System.out.println("Longitud frase 2: " + largoS2);
        if (dif == 0) {
            System.out.println("Las frases son iguales");
        } else if (dif < 0) {
            System.out.println("La segunda frase es mas larga por " + dif * (-1) + " caracteres");
        } else {
            System.out.println("La primera frase es mas larga por " + dif + " caracteres");
        }
        return largoS2;
    }

    public void unirFrases(Cadena cadena, Scanner leer) {
        System.out.println("");
        System.out.println("====== UNIR FRASES =======");
        System.out.println("");

        System.out.println("Ingrese una frase para agregar");
        String frase2 = leer.next();
        String fraseUnida = cadena.getFrase().concat(frase2);

        System.out.println("Las frases unidas quedan as: " + fraseUnida);
    }

    public void reemplazar(Cadena cadena, Scanner leer) {
        System.out.println("");
        System.out.println("======  REEMPLAZAR =======");
        System.out.println("");

        System.out.println("Ingrese una letra");
        String letra = leer.next();
        String reemplazo = cadena.getFrase().replaceAll("a", letra);

        System.out.println("La frase reemplazada queda así: "+reemplazo);
    }


    public void contiene(Cadena cadena, Scanner leer) {
        System.out.println("");
        System.out.println("====== CONTIENE =======");
        System.out.println("");
        System.out.println("Ingrese una letra a buscar");
        String letra = leer.next();
        boolean check = cadena.getFrase().contains(letra);
        if(check){
            System.out.println("La frase contiene la letra " + letra);
        }
    }
}

