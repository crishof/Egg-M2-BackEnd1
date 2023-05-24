import entidades.Persona;
import servicios.PersonaServicio;

public class Main {
    public static void  main (String[]args){

//Crea servicio
        PersonaServicio ps = new PersonaServicio();
//Crea array [4]
        Persona [] persona = new Persona[4];
        int[] masa = new int[4];
        boolean[] mayor = new boolean[4];
//Llama metodos
        for (int i = 0; i< persona.length; i++) {
            persona[i] = ps.crearPersona();
            masa[i] = ps.calcularMC(persona[i]);
            mayor[i]= ps.esMayorDeEdad(persona[i]);
        }

        int cantmay =0;
        int cantmen =0;
        for (int i = 0; i < mayor.length; i++) {
            if (mayor[i])
                cantmay++;
            else
                cantmen++;
        }

        int mb = 0;
        int mi = 0;
        int ma = 0;
        for (int i = 0; i < masa.length; i++) {
            switch (masa[i]) {
                case -1:
                    mb++;
                    break;
                case 0:
                    mi++;
                    break;
                default:
                    ma++;
                    break;
            }
        }
        System.out.println("Porcentaje de mayores: "+ (cantmay*100/4)+"%");
        System.out.println("Porcentaje de menores: "+ (cantmen*100/4)+"%");
        System.out.println("       -------------");
        System.out.println("Masa corporal baja: "+(mb*100/4)+"%");
        System.out.println("Masa corporal ideal: "+(mi*100/4)+"%");
        System.out.println("Masa corporal alta: "+(ma*100/4));
    }
}
