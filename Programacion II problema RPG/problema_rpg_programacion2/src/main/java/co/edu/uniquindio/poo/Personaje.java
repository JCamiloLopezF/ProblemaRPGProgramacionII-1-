package co.edu.uniquindio.poo;

public abstract class Personaje{
    private String nombre;
    private String descripcion;
    private String apodo;
    private double dineroInicial;
  


    public Personaje(String nombre, String descripcion, String apodo, double dineroInicial) {
        assert dineroInicial >= 0: "El dinero no puede ser negativo";
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.apodo = apodo;
        this.dineroInicial = dineroInicial;
        //listaPersonajes = new ArrayList<>();
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

    /*Aquí se puede evidenciar el principio número 3 sustitución de Liskov donde esta clase abstracta
    puede sustituir a sus clases hijas, ya que cada una de ellas son un tipo de personajes
*/
}
