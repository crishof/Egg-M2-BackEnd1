package servicio;

import entidad.Libro;

import java.util.HashSet;
import java.util.Scanner;

public class LibroServicio {

    public void menu(HashSet<Libro> libros) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int opcion;
        do {
            System.out.println("Ingrese la opcion deseada");
            System.out.println("Ingrese 1 para agregar libro");
            System.out.println("Ingrese 2 para cargar libros automaticamente");
            System.out.println("Ingrese 3 para prestar libro");
            System.out.println("Ingrese 4 para devolver libro");
            System.out.println("Ingrese 5 para mostrar todos los libros");
            System.out.println("Ingrese 6 para SALIR");

            opcion = leer.nextInt();
            String cargaMas;

            switch (opcion) {
                case 1:
                    do {
                        cargarLibro();
                        System.out.println("Desea ingresar otro libro? S/N");
                        cargaMas = leer.next();
                        libros.add(cargarLibro());
                    } while (cargaMas.equalsIgnoreCase("S"));
                    System.out.println("Ingreso finalizado");
                    break;
                case 2:
                    cargarLibroAutom(libros);
                    break;
                case 3:
                    prestarLibro(libros);
                    break;
                case 4:
                    devolverLibro(libros);
                    break;
                case 5:
                    mostrarLibros(libros);
                    break;
                case 6:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 6);
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

        for (Libro librosStock : libros) {
            System.out.println(librosStock);
        }
    }

    public void cargarLibroAutom(HashSet<Libro> libros) {

        libros.add(new Libro("La comunidad del anillo", "Tolkien", 2, 0));
        libros.add(new Libro("Las dos Torres", "Gandalf", 5, 0));
        libros.add(new Libro("El retorno del Rey", "Legolas", 1, 0));
        libros.add(new Libro("El hobbit", "Sauron", 4, 0));

    }

    /*
    • Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
    busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
    método. El método se incrementa de a uno, como un carrito de compras, el
    atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
    cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
    que no queden ejemplares disponibles para prestar. Devuelve true si se ha
    podido realizar la operación y false en caso contrario.
*/
    public void prestarLibro(HashSet<Libro> libros) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el libro que desea prestar");
        String libroPrestar = leer.next();
        String conf;

        for (Libro prestado : libros) {
            if (prestado.getTitulo().equalsIgnoreCase(libroPrestar)) {
                System.out.println("El libro se encuentra en la librería");
            } else if (prestado.getEjemplaresCant() > 1) {
                System.out.println("Hay " + prestado.getEjemplaresCant() + " unidades disponibles");
                System.out.println("Desea prestar el libro? S/N");
                conf = leer.next();
                if (conf.equalsIgnoreCase("S")) {
                    prestado.setPrestadosCant(prestado.getPrestadosCant() + 1);
                }
            } else {
                System.out.println("No se encuentra el libro solicitado");
            }
        }


    }
    /*
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
    lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
    El método decrementa de a uno, como un carrito de compras, el atributo
    ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
    vez que se produzca la devolución de un libro. No se podrán devolver libros
    donde que no tengan ejemplares prestados. Devuelve true si se ha podido
    realizar la operación y false en caso contrario.
        */

    public void devolverLibro(HashSet<Libro> libros) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el libro que va a devolver");
        String devolucion = leer.next();


        for (Libro libros1 : libros) {
            if (devolucion.equalsIgnoreCase(libros1.getTitulo())) {
                libros1.setEjemplaresCant(libros1.getEjemplaresCant() + 1);
                libros1.setPrestadosCant(libros1.getPrestadosCant() - 1);
                break;
            }
        }
    }
}


