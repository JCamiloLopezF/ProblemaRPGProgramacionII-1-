package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Predicate;

public abstract class Personaje implements RegistrarInterface{
    private String nombre;
    private String descripcion;
    private String apodo;
    private double dineroInicial;
    private ArrayList listaPersonajes;


    public Personaje(String nombre, String descripcion, String apodo, double dineroInicial) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.apodo = apodo;
        this.dineroInicial = dineroInicial;
        listaPersonajes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getApodo() {
        return apodo;
    }


    public void setApodo(String apodo) {
        this.apodo = apodo;
    }


    public double getDineroInicial() {
        return dineroInicial;
    }


    public void setDineroInicial(double dineroInicial) {
        this.dineroInicial = dineroInicial;
    }


    public ArrayList getListaPersonajes() {
        return listaPersonajes;
    }


    public void setListaPersonajes(ArrayList listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }

    @Override
    public void registrarPersonaje(Personaje personaje) {
        boolean validarMago= buscarPersonajePorNombre(personaje.getNombre()).isPresent();
        assert !validarMago:"El nombre para el mago ha sido registrado";
        listaPersonajes.add(personaje);
    }


    private Optional<Personaje> buscarPersonajePorNombre(String nombre) {
        Predicate<Personaje> condicion = personaje ->  personaje.getNombre().equals(nombre);
        return listaPersonajes.stream().filter(condicion).findAny();
    }
    /*Aquí se puede evidenciar el principio número 3 sustitución de Liskov donde esta clase abstracta
    puede sustituir a sus clases hijas, ya que cada una de ellas son un tipo de personajes
*/
}
