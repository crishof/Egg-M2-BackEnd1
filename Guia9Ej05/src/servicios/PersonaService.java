package servicios;

import entidades.Persona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public Persona CrearPersona() {

        System.out.println("Ingrese nombre");
        String nombre = (leer.nextLine());
        Date fechaNac = leerFecha();

        return new Persona(nombre,fechaNac);
    }

    public Date leerFecha(){
        System.out.println("Ingrese día de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes = leer.nextInt()-1;
        System.out.println("Ingrese año de nacimiento");
        int year = leer.nextInt() - 1900;

        return new Date(year,mes,dia);
    }

    public Date fechaActual(){
        return new Date();
    }


    public int calcularEdad(Persona persona){

        Date fechaActual = new Date();
        Date fechaNacimiento=persona.getFechaNacimiento();

        int diffYear = fechaActual.getYear() - fechaNacimiento.getYear();
        int diffMonth = fechaActual.getMonth() - fechaNacimiento.getMonth();
        int diffDay = fechaActual.getDay() - fechaNacimiento.getDay();
        // Si está en ese año pero todavía no los ha cumplido
        if (diffMonth < 0 || (diffMonth == 0 && diffDay < 0)) {
            diffYear = diffYear - 1;
        }
        return diffYear;
    }

    public boolean menorQue(Persona persona,int edad){

        return calcularEdad(persona)<edad;
    }

    public void mostrarPersona(Persona persona){

        System.out.println("La persona se llama " + persona.getNombre());
        System.out.println("La persona nació el " + persona.getFechaNacimiento());

    }
}
