package servicios;

import entidades.NIF;

import java.util.Scanner;

public class NIFService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public NIF CrearNif(){
        NIF nif = new NIF();
        System.out.println("Ingrese su DNI");
        nif.setDni(leer.nextLong());

        long resto = nif.getDni() % 23;

        char array [] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        char letra = array[(int)resto];
        nif.setNif(String.valueOf(letra));

        return nif;
    }

    public void Mostrar(NIF nif){

        System.out.println("Su numero de NIF es : "+nif.getDni()+"-"+nif.getNif());

      //  String nif22 = nif.getDni()+"-"+nif.getNif();

       // System.out.println("PRUEBA NIF   "+nif22);
    }
}
