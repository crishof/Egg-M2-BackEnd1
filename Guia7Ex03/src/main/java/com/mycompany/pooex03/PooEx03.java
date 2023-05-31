/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pooex03;

import com.mycompany.pooex03.entidades.Juego;

/**
 *
 * @author cristian
 */
public class PooEx03 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Juego j1 = new Juego();

        if (j1.iniciarJuego()) {
            System.out.println("Enorabuena! has ganado!");
        } else {
            System.out.println("Lo siento, has perdido!");
        }
    }
}
