/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooej03.entidades;

import java.util.Scanner;

/**
 *
 * @author cristian
 *
 * * Crear una clase llamada Operacion que tenga como atributos privados
 * numero1 y numero2. A continuación, se deben crear los siguientes métodos:
 * Método constructor con todos los atributos pasados por parámetro.Método
 * constructor sin los atributos pasados por parámetro. Métodos get y set.
 * Método para crearOperacion(): que le pide al usuario los dos números y los
 * guarda en los atributos del objeto. Método sumar(): calcular la suma de los
 * números y devolver el resultado al main. Método restar(): calcular la resta
 * de los números y devolver el resultado al main Método multiplicar(): primero
 * valida que no se haga una multiplicación por cero, si fuera a multiplicar por
 * cero, el método devuelve 0 y se le informa al usuario el error. Si no, se
 * hace la multiplicación y se devuelve el resultado al main Método dividir():
 * primero valida que no se haga una división por cero, si fuera a pasar una
 * división por cero, el método devuelve 0 y se le informa al usuario el error
 * se le informa al usuario. Si no, se hace la división y se devuelve el
 * resultado al main.
 *
 */
public class Operacion {

    private int numero1;
    private int numero2;

    Scanner leer = new Scanner(System.in);

    public Operacion() {

    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {

        System.out.println("Ingrese numero 1");
        numero1 = leer.nextInt();
        System.out.println("Ingrese numero 2");
        numero2 = leer.nextInt();

    }

    public int sumar() {
        int suma = numero1 + numero2;

        return suma;
    }

    public int restar() {
        int resta = numero1 - numero2;

        return resta;
    }

    public int multiplicar() {

        if (numero1 == 0 || numero2 == 0) {
            while (numero1 == 0) {
                System.out.println("No se puede multiplicar por 0. Reingrese numero 1");
                this.numero1 = leer.nextInt();
            }
            while (numero2 == 0) {
                System.out.println("No se puede multiplicar por 0. Reingrese numero 2");
                this.numero2 = leer.nextInt();
            }

        }
        int multiplicacion = numero1 * numero2;

        return multiplicacion;
    }

    public int dividir() {

        if (numero1 == 0 || numero2 == 0) {
            while (numero1 == 0) {
                System.out.println("No se puede dividir por 0. Reingrese numero 1");
                this.numero1 = leer.nextInt();
            }
            while (numero2 == 0) {
                System.out.println("No se puede dividir por 0. Reingrese numero 2");
                this.numero2 = leer.nextInt();
            }

        }
        int division = numero1 / numero2;

        return division;
    }
}
