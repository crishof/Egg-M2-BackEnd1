/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooex04.entidades;

import java.util.Scanner;

/**
 *
 * @author cristian
 *
 * * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad de
 * dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo
 * después de realizar una transacción de retiro.
 */
public class Cuenta {

    private double saldo = Math.random() * 1000;
    private String titular;

    Scanner leer = new Scanner(System.in);

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirarDinero() {

        System.out.println("Bienvenido!");
        System.out.println("Ingrese nombre");

        titular = leer.nextLine();
        int opcion = 0;

        while (opcion != 3) {

            System.out.println("Ingrese la opción que desea realizar");
            System.out.println("Digite 1 para consultar saldo");
            System.out.println("Digite 2 para hacer un retiro");
            System.out.println("Digite 3 para salir");

            opcion = leer.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("El saldo de su cuenta es " + saldo);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad que desea retirar");
                    double retiro = leer.nextInt();

                    if (retiro < saldo) {
                        saldo -= retiro;
                        System.out.println("Su nuevo saldo es "+saldo);
                    } else {
                        System.out.println("No dispone de saldo suficiente para retirar esa cantidad");
                    }
                    break;
                case 3:
                    System.out.println("Hasta luego!");

            }
        }

    }

}
