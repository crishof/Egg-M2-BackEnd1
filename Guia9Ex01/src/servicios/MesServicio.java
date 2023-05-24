package servicios;

import entidades.Mes;

import java.util.Scanner;

public class MesServicio {

    Scanner leer = new Scanner(System.in);

    public void adivinarMes(Mes mes) {

        System.out.println("ADIVINA EL MES SECRETO");
        System.out.println();


        int vidas = 4;
        String mesUser;

        do {
            System.out.println("Ingrese un mes del año");
            mesUser = leer.nextLine();
            if (mesUser.equalsIgnoreCase(mes.getMesSecreto())) {
                System.out.println("Correcto! el mes secreto es " + mes.getMesSecreto());
                break;
            }else if (vidas == 0){
                System.out.println("Te quedaste sin vidas!!");
                break;
            } else {
                System.out.println("Incorrecto! intenta nuevamente");
                if(vidas>1) {
                    System.out.println("Te quedan " + vidas + " vidas");
                }else{
                        System.out.println("Ultimo intento! te queda " + vidas + " vida");
                    }
                vidas --;
            }
        } while (!mesUser.equalsIgnoreCase(mes.getMesSecreto()));

    }
}



