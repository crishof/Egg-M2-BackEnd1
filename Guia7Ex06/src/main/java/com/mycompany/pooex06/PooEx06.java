/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooex06;

import com.mycompany.pooex06.entidades.Rectangulo;

/**
 *
 * @author cristian
 * 
 * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" 
 * y un método "calcular_area" que calcule y devuelva el área del rectángulo. 
 * Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
 */
public class PooEx06 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Rectangulo rectangulo1 = new Rectangulo();
        
//        rectangulo1.calcularArea(4,6);
        
        System.out.println("El area del rectangulo es :"+rectangulo1.calcularArea(4, 6));
    }
}
