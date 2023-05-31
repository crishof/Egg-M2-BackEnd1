/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooex03.entidades;

import java.util.Scanner;

/**
 *
 * @author cristian
 *
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos
 * jugadores jugar un juego de adivinanza de números. El primer jugador elige un
 * número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un
 * número limitado de intentos y recibe una pista de "más alto" o "más bajo"
 * después de cada intento. El juego termina cuando el segundo jugador adivina
 * el número o se queda sin intentos. Registra el número de intentos necesarios
 * para adivinar el número y el número de veces que cada jugador ha ganado
 */
public class Juego {

    Scanner leer = new Scanner(System.in);
    public int num1;
    public int num2;

    public boolean iniciarJuego() {
        boolean win = true;
        int cont = 3;
        System.out.println("Jugador 1 ingrese numero");
        num1 = leer.nextInt();

        System.out.println("Comienza el juego!");
        System.out.println("Jugador 2 intente adivinar el numero");
        System.out.println("=================");

        while (num1 != num2 && cont !=0) {

            System.out.println("Tienes " + cont + " intentos");
            System.out.println("Ingresa un numero");
            num2 = leer.nextInt();

            if (num2 < num1) {
                System.out.println("el numero es mayor, ingresa otro");
                cont--;
//                System.out.println("Te quedan " + cont + " intentos");
//                num2 = leer.nextInt();
                win = false;
//                break;
            }
            if (num2 > num1) {
                System.out.println("El numero es menor, ingresa otro");
//                cont--;
//                System.out.println("Te quedan " + cont + " intentos");
//                num2 = leer.nextInt();
                win = false;
//                break;
            }
            if (num2 == num1) {
                win = true;

            }
        }

        if (cont == 0) {
            System.out.println("No te quedan intentos");
            win = false;
            
        }
        return win;
    }
}
