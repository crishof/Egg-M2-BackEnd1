import entidades.Persona;
import servicios.PersonaService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        PersonaService ps = new PersonaService();

        Persona persona1 = ps.CrearPersona();

        ps.calcularEdad(persona1);

        System.out.println("Ingrese la edad para comparar");
        int edad = leer.nextInt();
        System.out.println(ps.menorQue(persona1,edad));

        System.out.println(persona1.getNombre() + (ps.menorQue(persona1,edad) ? " es" : " no es") + " menor de " + edad + " años");


        ps.mostrarPersona(persona1);



    }
}
