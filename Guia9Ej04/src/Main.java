import servicios.FechaService;

import java.util.Date;

public class Main {

    public static void main(String[]args){

        FechaService fs = new FechaService();
        Date fechaNacimiento = fs.fechaNacimiento();
        Date fechaActual = fs.fechaActual();

        int edadPorDia = fs.diferenciaPorDias(fechaNacimiento,fechaActual);
        int edadPorMs = fs.diferenciaPorMs(fechaNacimiento,fechaActual);

        System.out.println("get time: "+fechaNacimiento.getTime());

        System.out.println("Fecha nacimiento: " + fechaNacimiento);
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("La edad de la persona ingresada es : "+ edadPorDia + " años");
        System.out.println("La edad de la persona ingresada es : "+ edadPorMs + " años");

    }
}
