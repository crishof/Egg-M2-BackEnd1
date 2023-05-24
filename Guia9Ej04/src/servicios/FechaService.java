package servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    Scanner leer = new Scanner(System.in);

    //    Date fecha = new Date();
    public Date fechaNacimiento() {

        System.out.println("Ingrese dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes = leer.nextInt()-1;
        System.out.println("Ingrese año de nacimiento");
        int year= leer.nextInt()-1900;

        return new Date(year,mes,dia);
    }

    public Date fechaActual(){
        return new Date();
    }

    public int diferenciaPorDias(Date fechaNacimiento, Date fecha) {
        int diffYear = fecha.getYear() - fechaNacimiento.getYear();
        int diffMonth = fecha.getMonth() - fechaNacimiento.getMonth();
        int diffDay = fecha.getDay() - fechaNacimiento.getDay();
        // Si está en ese año pero todavía no los ha cumplido
        if (diffMonth < 0 || (diffMonth == 0 && diffDay < 0)) {
            diffYear = diffYear - 1;
        }
        return diffYear;
    }

    public int diferenciaPorMs(Date fechaNacimiento, Date fechaActual){

        long msyear = 1000L * 60 * 60 * 24 * 365;
        long msdiff = fechaActual().getTime() - fechaNacimiento.getTime();
        int edad = (int) (msdiff / msyear);
        return edad;
    }
}