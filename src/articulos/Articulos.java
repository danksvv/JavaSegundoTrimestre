package articulos;

public class Articulos {

    private int codigo;
    public String nombre;
    private String color;
    private double precio;
    private static int contador;

    // Métodos Constructor
    public Articulos(String nombre, String color, double precio) {
        contador++;
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
        this.codigo = contador;
    }
    public Articulos() {
        this("", "", 0);
        //codigo = codSiguiente;
    }
    public Articulos(String nombre, String color) {
        this(nombre, color, 0);
        //codigo = codSiguiente;
    }

    // Métodos Getters y Setters
    public int getCodigo() {
        return codigo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
    public void setIncrementarPrecio(double incremento) {
        precio += (precio*incremento/100);
    }
    public void setRebajarPrecio() {
        precio -= (precio*10/100);
    }

    @Override
    public String toString() {
        return "Código : " + getCodigo() +
               "\tEl articulo " + nombre +
               "\tColor : " + getColor() +
               "\tPrecio : " + getPrecio();
    }
}
