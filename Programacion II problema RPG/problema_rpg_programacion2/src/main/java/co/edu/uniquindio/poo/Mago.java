package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Mago extends Personaje{
    private int inteligencia;
    private int sabiduria;
    private int  energiaMagica;
    private ArrayList<Mago> listaMagos;

    public Mago(String nombre, String descripcion, String apodo, double dineroInicial, int inteligencia, int sabiduria, int energiaMagica) {
        super(nombre, descripcion, apodo, dineroInicial);
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.energiaMagica = energiaMagica;
        this.listaMagos = new ArrayList<>();
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSabiduria() {
        return sabiduria;
    }

    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    }

