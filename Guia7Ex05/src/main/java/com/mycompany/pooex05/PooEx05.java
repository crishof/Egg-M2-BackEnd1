/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooex05;

import com.mycompany.pooex05.entidades.Empleado;

/**
 *
 * @author cristian
 * 
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
 * Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual. 
 * El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
public class PooEx05 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Empleado e1 = new Empleado();
        
        e1.calcularAumento();
        
        
    }
}
