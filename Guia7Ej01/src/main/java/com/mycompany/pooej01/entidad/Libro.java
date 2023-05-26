/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooej01.entidad;

import java.util.Scanner;

/**
 *
 * @author cristian
 * 
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, 
 * y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
 * Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método 
 * el número de ISBN, el título, el autor del libro y el número de páginas.
 */

//solo ingresa linea para probar git


public class Libro {
    
    String isbn ;
    String titulo;
    String autor;
    int paginas;

    Scanner sc = new Scanner(System.in);
    
    
    public Libro() {
    }

    public Libro(String isbn, String titulo, String Autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = Autor;
        this.paginas = paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String Autor) {
        this.autor = Autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public void ingresarLibro(){
        
        System.out.println("Ingresar codigo ISBN");
        isbn = sc.nextLine();
        System.out.println("Ingresar Autor");
        autor = sc.nextLine();
        System.out.println("Ingresar Titulo");
        titulo=sc.nextLine();
        System.out.println("Ingresar numero de paginas");
        paginas= sc.nextInt();
                
    }
    
    public void imprimirLibro(){
        
        System.out.println("Datos del libro");
        System.out.println("ISBN: "+isbn);
        System.out.println("Autor: "+autor);
        System.out.println("Titulo: "+titulo);
        System.out.println("Numero de paginas: "+paginas);
    }
    
}
