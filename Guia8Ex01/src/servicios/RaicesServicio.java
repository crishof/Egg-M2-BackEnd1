package servicios;

import entidades.Raices;

import java.util.RandomAccess;

public class RaicesServicio {

    public double getDiscriminante(Raices raiz){

        return (Math.pow(raiz.getB(),2)-(4*raiz.getA()*raiz.getC()));
    }

    public boolean tieneRaices(Raices raiz){

        return  getDiscriminante(raiz) > 0;

    }

    public boolean tieneRaiz(Raices raiz){

        return getDiscriminante(raiz) == 0;
    }

    public void obtenerRaices(Raices raiz){
            if(tieneRaices(raiz)){
                double raiz1 = (-raiz.getB() + Math.sqrt(getDiscriminante(raiz)))/(2*raiz.getA());
                double raiz2 = (-raiz.getB() - Math.sqrt(getDiscriminante(raiz)))/(2*raiz.getA());

                System.out.println("Raiz 1: "+ raiz1);
                System.out.println("Raiz 2: "+ raiz2);
            }
    }

    public void obtenerRaiz(Raices raiz){

        if(tieneRaiz(raiz)){
            double raiz1 = (-raiz.getB()) /(2*raiz.getA());

            System.out.println("Raiz 1: "+raiz1);
        }


    }

    public void Calcular(Raices raiz){

        if(tieneRaices(raiz)){
            obtenerRaices(raiz);

        }else if (tieneRaiz(raiz)){
            obtenerRaiz(raiz);
        }
        else {
            System.out.println("No se obtienen raices");
        }


    }
}
