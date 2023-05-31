/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooex02.entidades;

import java.util.Scanner;

/**
 *
 * @author cristian
 * 
 * * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
 * sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
 * Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números 
 * y los ingresa en los atributos del objeto. 
 * Después, a través de otro método calcular y devolver la distancia 
 * que existe entre los dos puntos que existen en la clase Puntos
 */
public class Puntos {
    
    public int x1,y1,x2,y2;
    
    Scanner leer = new Scanner(System.in);

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        
        System.out.println("Ingrese valor x del punto 1");
        x1=leer.nextInt();
        System.out.println("Ingrese valor y del punto 1");
        y1=leer.nextInt();
        System.out.println("Ingrese valor x del punto 2");
        x2=leer.nextInt();
        System.out.println("Ingrese valor x del punto 2");
        y2=leer.nextInt();
        
    }
    
    public double distancia(){
        
    double distancia = Math.sqrt((Math.pow((x2-x1),2))+Math.pow((y2-y1),2));
    
    return distancia;
    }
    
}
