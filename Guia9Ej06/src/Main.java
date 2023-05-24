import entidades.Curso;
import servicios.CursoServicio;

public class Main {

    public static void main(String[] args) {

        CursoServicio cs = new CursoServicio();

        Curso curso = cs.crearCurso();

        cs.mostrarAlumnos(curso);

        System.out.println("La ganancia del curso es: $ " + cs.calcularGananciaSemanal(curso));

    }
}
