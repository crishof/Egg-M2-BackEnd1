import entidades.Mes;
import servicios.MesServicio;

public class Main {

    public static void main(String[]args){

        MesServicio ms = new MesServicio();
        Mes mes = new Mes();

        System.out.println("mes secreto: " + mes.getMesSecreto());
        ms.adivinarMes(mes);
    }
}
