package servicio;

import entidad.Libro;

import java.util.HashSet;
import java.util.Scanner;

public class LibroServicio {

    public void menu(HashSet<Libro> libros) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int opcion;

        System.out.println("Ingrese la opcion deseada");
        System.out.println("Ingrese 1 para agregar libro");
        System.out.println("Ingrese 2 para mostrar todos los libros");

        opcion = leer.nextInt();

        switch ( opcion ){
            case 1 -> cargarLibro();
            case 2 ->
        }
    }

    public Libro cargarLibro() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String titulo;
        String autor;
        int ejemplaresCant;
        int prestadosCant = 0;
        System.out.println("Ingreso de Libro");
        System.out.println("Ingrese el título");
        titulo = leer.next();
        System.out.println("Ingrese Autor");
        autor = leer.next();
        System.out.println("Ingrese cantidad de ejemplares disponibles");
        ejemplaresCant = leer.nextInt();

        return new Libro(titulo, autor, ejemplaresCant, prestadosCant);
    }

    public void mostrarLibros(HashSet<Libro> libros) {

        for (Libro librosStock : libros
        ) {
            System.out.println(librosStock);
        }
    }
}

