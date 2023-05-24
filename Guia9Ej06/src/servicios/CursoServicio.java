package servicios;

import entidades.Curso;

import java.util.Arrays;
import java.util.Scanner;

public class CursoServicio {
    /*
    Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases.
    Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada repetición
    que se ingrese el nombre de cada alumno.

    Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después
    se le asignan a sus respectivos atributos para llenar el objeto Curso.
    En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos

    Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso.
    Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora,
    la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
     */

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Curso crearCurso() {

        Curso curso = new Curso();

        System.out.println("Ingrese el nombre del curso");
        curso.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por día");
        curso.setHorasDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de días a la semana");
        curso.setDiasSemana(leer.nextInt());
        System.out.println("Ingrese si es turno mañana o tarde");
        curso.setTurno(leer.next());
        System.out.println("Ingrese el precio por hora individual");
        curso.setPrecioHora(leer.nextDouble());

        curso.setAlumnos(cargarAlumnos(curso.getAlumnos().length));
        return curso;
    }

    private String[] cargarAlumnos(int vector) {

        String[] nombres = new String[vector];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            nombres[i] = leer.next();
        }
        return nombres;

    }

    public double calcularGananciaSemanal(Curso curso){

        double ganancia = curso.getHorasDia() * curso.getPrecioHora() * curso.getHorasDia() * curso.getDiasSemana();
    return ganancia;
    }

    public void mostrarAlumnos(Curso curso){

//        System.out.println("Los alumnos son " + curso.toString());
        System.out.println(Arrays.toString(curso.getAlumnos()));
    }

}
