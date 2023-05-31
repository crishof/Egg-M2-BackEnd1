/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooex05.entidades;

import java.util.Scanner;

/**
 *
 * @author cristian
 * 
 * * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
 * Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual. 
 * El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
public class Empleado {
    
    public String nombre;
    public int edad;
    public double salario;

    Scanner leer = new Scanner(System.in);
    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public double calcularAumento(){
        
        System.out.println("Ingrese nombre");
        nombre = leer.nextLine();
        System.out.println("Ingrese edad");
        edad = leer.nextInt();
        System.out.println("Ingrese salario");
        salario = leer.nextInt();
        
        if (edad>30){
            System.out.println("Le corresponde un aumento del 10%");
            System.out.println("Su nuevo salario es :"+(salario=salario*1.1));
        }else{
            System.out.println("Le corresponde un aumento del 5%");
            System.out.println("Su nuevo salario es :"+(salario=salario*1.05));
        }
        double aumento = salario;
        return aumento;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }
    
}
