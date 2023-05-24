import entidades.Raices;
import servicios.RaicesServicio;

public class Main {
    public static void main (String[]args){


        RaicesServicio rc = new RaicesServicio();
/*
1-6-8
1-4-4
 */
        Raices ecuacion = new Raices(1,6,8);

        double discriminante = rc.getDiscriminante(ecuacion);
        boolean tieneRaices = rc.tieneRaices(ecuacion);
        boolean tieneRaiz = rc.tieneRaiz(ecuacion);


        System.out.println("==============");
        System.out.println(ecuacion.toString());
        System.out.println("Discriminante : "+discriminante);
        System.out.println("Tiene raices : "+tieneRaices);
        System.out.println("Tiene raiz : "+tieneRaiz);

        rc.Calcular(ecuacion);
    }
}
