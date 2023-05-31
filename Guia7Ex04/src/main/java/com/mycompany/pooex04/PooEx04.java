/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooex04;

import com.mycompany.pooex04.entidades.Cuenta;

/**
 *
 * @author cristian
 * 
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
 * Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
public class PooEx04 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Cuenta C1 = new Cuenta();
        
        C1.retirarDinero();
    }
}
