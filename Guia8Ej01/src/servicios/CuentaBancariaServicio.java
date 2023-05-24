package servicios;

import entidades.CuentaBancaria;

import java.text.DecimalFormat;
import java.util.Scanner;

import static entidades.CuentaBancaria.*;

public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");

    public CuentaBancaria crearCuenta() {

        CuentaBancaria c1 = new CuentaBancaria();

        System.out.println("Ingrese DNI");
        long dniCliente = leer.nextInt();
        c1.setDniCliente(dniCliente);
        System.out.println("ingrese numero de cuenta");
        int numeroCuenta= leer.nextInt();
        c1.setNumeroCuenta(numeroCuenta);

//      double saldoActual = df.format(Math.random()*100);
        double saldoActual = Math.random()*10000;
        c1.setSaldoActual(saldoActual);
        System.out.println("Cuenta creada con éxito");

        return c1;
    }

    public void IngresarDinero(CuentaBancaria c1){
        System.out.println("Ingrese el importe a depositar");
        double depo = leer.nextDouble();
        double saldoActual = c1.getSaldoActual();
        saldoActual += depo;
        c1.setSaldoActual(saldoActual);
        System.out.println("Deposito de $ "+ depo + " realizado con exito");
    }

    public void RetirarDinero(CuentaBancaria c1){
        System.out.println("Ingrese el importe a retirar");
        double retiro = leer.nextDouble();
        double saldoActual = c1.getSaldoActual();
        while (retiro>saldoActual){
            System.out.println("No tiene saldo suficiente");
            System.out.println("Su saldo actual es " + df.format(saldoActual));
            System.out.println("Ingrese el importe a depositar");
            retiro= leer.nextDouble();
        }
        c1.setSaldoActual(saldoActual-=retiro);
        System.out.println("Extracción realizada con éxito. Saldo actual: $"+df.format(saldoActual));
    }

    public void ExtraccionRapida(CuentaBancaria c1){

        System.out.println("Extracción rápida");
        System.out.println("Ingrese el importe a retirar");
        double retiro = leer.nextDouble();
        double saldoActual = c1.getSaldoActual();
        while (retiro>(saldoActual*0.2)){
            System.out.println("Su disponible para Extracción rápida es :"+df.format(saldoActual*0.2));
            System.out.println("Ingrese el importe a retirar");
            retiro = leer.nextDouble();
        }
            c1.setSaldoActual(saldoActual-=retiro);
        System.out.println("Extracción realizada con éxito. Saldo actual: $"+df.format(saldoActual));
    }

    public void ConsultarSaldo(CuentaBancaria c1){

        System.out.println("Su saldo en cuenta "+numeroCuenta+" es: $"+df.format(saldoActual));
        System.out.println("Su disponible para retiro rápido es: $"+df.format(saldoActual*0.2));


    }

    public void ConsultarDatos(CuentaBancaria c1){
        System.out.println("Cuenta numero: "+numeroCuenta);
        System.out.println("DNI Cliente: "+dniCliente);
        System.out.println("Saldo disponible: $ "+df.format(saldoActual));
    }
}
