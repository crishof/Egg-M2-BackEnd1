import entidades.Cafetera;
import servicios.CafeteraServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CafeteraServicio servicio = new CafeteraServicio();

        Cafetera cortado = new Cafetera();

        System.out.println("Bienvenido a Nespresso");
        int opcion;
        Scanner leer = new Scanner(System.in);


        do {
            System.out.println("------------------------");
            System.out.println("=====MENU NESPRESSO=====");
            System.out.println("Ingrese la opción deseada");
            System.out.println("__________________________");
            System.out.println("Digite 1 para llenar cafetera");
            System.out.println("Digite 2 para servir taza");
            System.out.println("Digite 3 para agregar café");
            System.out.println("Digite 4 para vaciar cafetera");
            System.out.println("Digite 5 para salir");
            opcion = leer.nextInt();

            switch (opcion){
                case 1 :
                    servicio.llenarCafetera(cortado);
                    break;
                case 2 :
                    servicio.servirTaza(cortado);
                    break;
                case 3:
                    servicio.agregarCafe(cortado);
                    break;
                case 4 :
                    servicio.vaciarCafetera(cortado);
                    break;
                case 5 :
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while (opcion != 5);
    }
}

