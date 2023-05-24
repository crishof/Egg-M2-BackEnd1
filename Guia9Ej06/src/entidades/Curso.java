package entidades;

import java.util.Arrays;

public class Curso {

    private String nombreCurso;
    private int horasDia;
    private int diasSemana;
    private String turno;
    private double precioHora;
    private String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, int horasDia, int diasSemana, String turno, double precioHora, String[] nombres) {
        this.nombreCurso = nombreCurso;
        this.horasDia = horasDia;
        this.diasSemana = diasSemana;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos = nombres;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHorasDia() {
        return horasDia;
    }

    public void setHorasDia(int horasDia) {
        this.horasDia = horasDia;
    }

    public int getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(int diasSemana) {
        this.diasSemana = diasSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", horasDia=" + horasDia +
                ", diasSemana=" + diasSemana +
                ", turno='" + turno + '\'' +
                ", precioHora=" + precioHora +
                ", nombres=" + Arrays.toString(alumnos) +
                '}';
    }
}
