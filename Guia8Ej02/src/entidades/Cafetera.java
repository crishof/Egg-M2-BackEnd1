package entidades;

public class Cafetera {

    public  int capacidadMaxima = 1000;
    public  int cantidadActual=0;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima,int cantidadActual){
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
