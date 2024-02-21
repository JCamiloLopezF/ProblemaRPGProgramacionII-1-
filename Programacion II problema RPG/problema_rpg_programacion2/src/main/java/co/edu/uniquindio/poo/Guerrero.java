package co.edu.uniquindio.poo;

public class Guerrero extends Personaje{
    private int fuerza;
    private int resistencia;
    private int vitalidad;

    public Guerrero(String nombre, String descripcion, String apodo, double dineroInicial, int fuerza, int resistencia, int vitalidad) {
        super(nombre, descripcion, apodo, dineroInicial);
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.vitalidad = vitalidad;
    }
}
