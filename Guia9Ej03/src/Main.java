import servicios.ArregloService;

public class Main {
    public static void main(String[] args) {


        int[] arregloA = new int[50];
        double[] arregloB = new double[20];

        ArregloService as = new ArregloService();

        as.InicializarA(arregloA);
        as.Mostrar(arregloA);
        as.Ordenar(arregloA);
        as.InicializarB(arregloA,arregloB);
        as.MostrarAyB(arregloA,arregloB);





    }
}
