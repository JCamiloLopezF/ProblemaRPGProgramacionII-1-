package co.edu.uniquindio.poo;

public abstract class Personaje implements ValidacionNombre{
    private String nombre;
    private String descripcion;
    private String apodo;
    private double dineroInicial;

    public Personaje(String nombre, String descripcion, String apodo, double dineroInicial) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.apodo = apodo;
        this.dineroInicial = dineroInicial;
    }
    
    
/*Aquí se puede evidenciar el principio número 3 sustitución de Liskov donde esta clase abstracta
puede sustituir a sus clases hijas, ya que cada una de ellas son un tipo de personajes
*/
}
