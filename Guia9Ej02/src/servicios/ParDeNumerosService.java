package servicios;

import entidades.ParDeNumeros;

public class ParDeNumerosService {


    public void MostrarValores(ParDeNumeros parDeNumeros) {

        System.out.println("===Mostrar Valores===");

        System.out.println("El numero 1 es "+parDeNumeros.getNum1());
        System.out.println("El numero 2 es "+parDeNumeros.getNum2());
    }

    public void DevolverMayor(ParDeNumeros parDeNumeros){

        System.out.println("===Mostrar Mayor===");


        String retorno = (parDeNumeros.getNum1()>parDeNumeros.getNum2())?"El primero numero es mayor":"El segundo numero es mayor";

        System.out.println(retorno);
        }

        public void CalcularPotencia(ParDeNumeros parDeNumeros){

            System.out.println("===Calcular potencia===");


            int num1R = (int) Math.abs(parDeNumeros.getNum1());
        int num2R = (int) Math.abs(parDeNumeros.getNum2());

            System.out.println(num1R);
            System.out.println(num2R);
            System.out.println(Math.max(num1R,num2R));
        double potencia = Math.pow(Math.max(num1R,num2R),Math.min(num1R,num2R));
            System.out.println(potencia);


        }

    public void CalcularRaiz(ParDeNumeros parDeNumeros){

        System.out.println("===Calcular raiz===");


        int num1R = (int) Math.abs(parDeNumeros.getNum1());
        int num2R = (int) Math.abs(parDeNumeros.getNum2());

        System.out.println(num1R);
        System.out.println(num2R);

        double raiz = Math.sqrt(Math.min(num1R,num2R));
        System.out.println(raiz);

    }

    }
