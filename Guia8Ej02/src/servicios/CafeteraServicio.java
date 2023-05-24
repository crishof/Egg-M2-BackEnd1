package servicios;

import entidades.Cafetera;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);
    public void llenarCafetera(Cafetera cortado){
    cortado.setCantidadActual(cortado.getCapacidadMaxima());
        System.out.println("La cafetera tiene "+cortado.getCapacidadMaxima()+" cm3 de capacidad");
        System.out.println("Actualmente tiene "+cortado.getCantidadActual()+" cm3 disponibles");


    }

    public void servirTaza(Cafetera cortado){
        int saldo = cortado.getCantidadActual();
        int taza = 180;

        if(saldo==0){
            System.out.println("La cafetera está vacia, agregue café");
        }
        if (saldo<taza && saldo>0) {
            System.out.println("La cantidad de cafe que hay en la cafetera no alcanza para llenar la taza");
            System.out.println("Su taza se llenó al " + saldo * 100 / taza + " %");
            cortado.setCantidadActual(0);
            System.out.println("En la cafetera quedan " + cortado.getCantidadActual() + " cm3 dispinibles");
            saldo = 0;
        }
        if (saldo>taza) {
            saldo -= taza;
            cortado.setCantidadActual(saldo);
            System.out.println("La cafetera tiene " + cortado.getCantidadActual() + " cm3 disponibles");
        }

    }

    public void vaciarCafetera(Cafetera cortado){

        System.out.println("ok!");
        cortado.setCantidadActual(0);
        System.out.println("La cafetera está vacía. Tiene "+cortado.getCantidadActual()+" cm3 disponibles");

    }

    public void agregarCafe(Cafetera cortado) {
        System.out.println("Ingrese la cantidad que desea agregar en cm3");
        int cantidad = leer.nextInt();
        int saldo = cortado.getCantidadActual();
        if ( saldo + cantidad <=1000) {
            cortado.setCantidadActual(saldo += cantidad);
        }
        if (saldo + cantidad > 1000){
            System.out.println("Lo que intenta agregar excede la capacidad de la cafetera");
            System.out.println("La cafetera ha sido llenada hasta el total de capacidad");
            cortado.setCantidadActual(1000);

    }
        System.out.println("Café agregado con éxito");
        System.out.println("La cafetera tiene " + cortado.getCantidadActual() + " cm3 disponibles");

    }
}
