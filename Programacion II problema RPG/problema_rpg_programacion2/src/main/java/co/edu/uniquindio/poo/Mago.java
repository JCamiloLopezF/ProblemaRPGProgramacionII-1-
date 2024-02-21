package co.edu.uniquindio.poo;

public class Mago extends Personaje{
    private int inteligencia;
    private int sabiduria;
    private int  energiaMagica;

    public Mago(String nombre, String descripcion, String apodo, double dineroInicial, int inteligencia, int sabiduria, int energiaMagica) {
        super(nombre, descripcion, apodo, dineroInicial);
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.energiaMagica = energiaMagica;
    }
}
