import entidades.CuentaBancaria;
import servicios.CuentaBancariaServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();
        CuentaBancaria c1 = servicio.crearCuenta();

        System.out.println("Bienvenido");
        int opcion;

        do {
            System.out.println("Ingrese la opción deseada");
            System.out.println();
            System.out.println("digite 1 para Ingresar dinero");
            System.out.println("digite 2 para Retirar dinero");
            System.out.println("digite 3 para Extracción Rápida");
            System.out.println("digite 4 para Consultar saldo");
            System.out.println("digite 5 para Consultar datos de la cuenta");
            System.out.println("digite 6 para SALIR");
            System.out.println();
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    servicio.IngresarDinero(c1);
                    break;
                case 2:
                    servicio.RetirarDinero(c1);
                    break;
                case 3:
                    servicio.ExtraccionRapida(c1);
                    break;
                case 4:
                    servicio.ConsultarSaldo(c1);
                    break;
                case 5:
                    servicio.ConsultarDatos(c1);
                    break;
                case 6:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 6);
    }
}