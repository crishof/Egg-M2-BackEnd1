package entidades;

import java.util.Random;

public class Mes {

    Random random = new Random();

    private String mes[] = {
            "enero",
            "febrero",
            "marzo",
            "abril",
            "mayo",
            "junio",
            "julio",
            "agosto",
            "septiembre",
            "octubre",
            "noviembre",
            "diciembre",
    };
    private String mesSecreto = mes[random.nextInt(12)];

    public Mes() {
    }

    public Mes(String[] mes, String mesSecreto) {
        this.mes = mes;
        this.mesSecreto = mesSecreto;
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
}
