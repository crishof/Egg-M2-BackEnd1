/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pooej01;

import com.mycompany.pooej01.entidad.Libro;

/**
 *
 * @author cristian
 *
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el número de páginas.
 */
public class PooEj01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Libro L1 = new Libro();
        Libro L2 = new Libro();
        L1.ingresarLibro();
        L2.ingresarLibro();

        L1.imprimirLibro();
        L2.imprimirLibro();
        
        System.out.println("agrego linea para probar git");
    }

}
