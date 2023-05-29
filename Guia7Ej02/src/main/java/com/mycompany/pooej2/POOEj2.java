/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pooej2;

import entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author cristian
 */
public class POOEj2 {

    public static void main(String[] args) {

        Circunferencia C1 = new Circunferencia();

        C1.crearCircunferencia();

        System.out.println("El radio es: " + C1.getRadio());
        System.out.println("El perimetro es: " + C1.calcularPerimetro());
        System.out.println("El area es: " + C1.calcularArea());

    }

}
