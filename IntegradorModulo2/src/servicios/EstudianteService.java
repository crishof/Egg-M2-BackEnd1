package servicios;

import entidades.Estudiante;

import java.util.Arrays;
import java.util.Scanner;

public class EstudianteService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Estudiante[] cargarAlumnos() {

        Estudiante[] estudiante = new Estudiante[8];

        for (int i = 0; i < estudiante.length; i++) {
//            System.out.println("Ingrese nombre del alumno " + (i +1));
//            String nombre = leer.next();
            String nombre = "";
//            System.out.println("Ingrese nombre del alumno " + (i +1));
//            int nota = Integer.parseInt(leer.next());
            int nota = 0;

            estudiante[i] = new Estudiante(nombre, nota);

        }

        estudiante[0].setNombre("Pepe");
        estudiante[1].setNombre("Alan");
        estudiante[2].setNombre("Juan");
        estudiante[3].setNombre("Sara");
        estudiante[4].setNombre("Cris");
        estudiante[5].setNombre("Tom");
        estudiante[6].setNombre("Oscar");
        estudiante[7].setNombre("Lina");
        estudiante[0].setNota(3);
        estudiante[1].setNota(6);
        estudiante[2].setNota(9);
        estudiante[3].setNota(7);
        estudiante[4].setNota(5);
        estudiante[5].setNota(10);
        estudiante[6].setNota(4);
        estudiante[7].setNota(8);

        return estudiante;
    }

    public void mostrarAlumnos(Estudiante[] estudiantes) {

        for (int i = 0; i < estudiantes.length; i++) {

            System.out.println(estudiantes[i].toString());
        }
    }

    public double calcularPromedio(Estudiante[] estudiantes) {

        double promedio = 0;

        for (int i = 0; i < estudiantes.length; i++) {

            promedio += estudiantes[i].getNota();
        }
        promedio /= 8;
        return promedio;
    }

    public void mostrarResultados(Estudiante[] estudiantes, double promedio, String[] mayores) {

        System.out.println("El promedio de las notas recibidas del curso es: " + promedio);
        System.out.println("Los estudiantes con notas mayores al promedio son: ");
        System.out.println(Arrays.toString(mayores));
    }

    public String[] mayorPromedio(Estudiante[] estudiantes, double promedio) {

        int cant = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > promedio) {
                cant++;
            }
        }
        String[] mayores = new String[cant];
        int j = 0;
        for (int i = 0; i < estudiantes.length; i++){

            if (estudiantes[i].getNota() > promedio) {
                mayores[j] = estudiantes[i].getNombre();
                j++;
            }
        }
        return mayores;
    }

    public void notas() {

        Estudiante[] estudiante = cargarAlumnos();

        mostrarAlumnos(estudiante);

        double promedio = calcularPromedio(estudiante);

        String [] mayores = mayorPromedio(estudiante,promedio);
        mostrarResultados(estudiante, promedio, mayores);


    }
}
