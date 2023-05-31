/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pooex02;

import com.mycompany.pooex02.entidades.Puntos;

/**
 *
 * @author cristian
 *
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
 * sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un
 * objeto puntos usando un método crearPuntos() que le pide al usuario los dos
 * números y los ingresa en los atributos del objeto. 
 * Después, a través de otro
 * método calcular y devolver la distancia que existe entre los dos puntos que
 * existen en la clase Puntos
 */
public class PooEx02 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    

    
    Puntos p1 = new Puntos();
    
    p1.crearPuntos();
    
//    p1.distancia();
    
        System.out.println("La distancia entre las coordenadas es :"+p1.distancia());

   

}
}