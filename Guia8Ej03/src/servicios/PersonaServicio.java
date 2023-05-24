package servicios;

import entidades.Persona;

import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona(){
        Persona persona = new Persona();
        System.out.println("Ingrese nombre");
        String nombre = (leer.next());
        System.out.println("Ingrese edad");
        int edad = (leer.nextInt());
        System.out.println("Ingrese sexo");
        char sex;
        do {
            System.out.println("H-Hombre - M-Mujer - O-Otro");
            sex = (leer.next().toUpperCase().charAt(0));
        }while (sex != 'H' && sex != 'M' && sex != 'O' );
        System.out.println("Ingrese peso");
        double peso = (leer.nextDouble());
        System.out.println("Ingrese altura");
        double altura = (leer.nextDouble());
        return new Persona(nombre,edad,sex,peso,altura);
    }

    public boolean esMayorDeEdad(Persona persona){

        return false;

    }
    public int calcularMC(Persona persona){

        return 1;
    }
}
