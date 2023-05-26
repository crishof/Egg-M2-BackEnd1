/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pooej04;

import com.mycompany.pooej04.entidades.Rectangulo;

/**
 *
 * @author cristian
 *
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluirá un método para
 * crear el rectángulo con los datos del Rectángulo dados por el usuario.
 * También incluirá un método para calcular la superficie del rectángulo y un
 * método para calcular el perímetro del rectángulo. Por último, tendremos un
 * método que dibujará el rectángulo mediante asteriscos usando la base y la
 * altura. Se deberán además definir los métodos getters, setters y
 * constructores correspondientes. Superficie = base * altura / Perímetro =
 * (base + altura) * 2.
 *
 */
public class POOEj04 {

    public static void main(String[] args) {
        
        System.out.println("Creacion de Rectangulo");

        Rectangulo r1 = new Rectangulo();

        r1.crearRectangulo();
        r1.perimetro();
        r1.superficie();
        

        System.out.println("El rectangulo de base " + r1.getBase() + " y altura " + r1.getAltura() + " tiene:");

        System.out.println("Perimetro = "+r1.perimetro());
        System.out.println("Souperficie = "+r1.superficie());
        System.out.println("============");
        
        r1.dibujo();
    }

}
