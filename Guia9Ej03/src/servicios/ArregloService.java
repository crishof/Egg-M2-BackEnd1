package servicios;

import java.util.Arrays;
import java.util.Random;

public class ArregloService {

    Random random = new Random();
    public void InicializarA(int[] arregloA) {

//        int ran = random.nextInt(100);
//        Arrays.fill(arregloA,ran);

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = random.nextInt(100);
        }
    }

    public void Mostrar(int[] arregloA) {

        System.out.println(Arrays.toString(arregloA));
    }

    public void Ordenar(int[] arregloA) {

        Arrays.sort(arregloA);


        int aux;
        for (int i = 0; i<arregloA.length/2;i++){

            aux = arregloA[i];
            arregloA[i]= arregloA[(arregloA.length)-1-i];
            arregloA[(arregloA.length)-1 -i] = aux;

        }
    }

    public void InicializarB(int[] arregloA,double [] arregloB){

        for ( int i = 0; i < 10; i++ ){
            arregloB[i] = arregloA[i];
        }
        Arrays.fill(arregloB,10,20,0.5);

    }

    public void MostrarAyB(int[]arregloA,double[] arregloB){

        System.out.println(Arrays.toString(arregloA));
        System.out.println(Arrays.toString(arregloB));

    }
}
