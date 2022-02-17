package biblioteca;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private int nacimiento;
    private int defuncion;

    public Autor(String nombre, String nacionalidad, int nacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public int getDefuncion() {
        return defuncion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void fallecer(int defuncion) {
        this.defuncion = defuncion;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", nacimiento=" + nacimiento +
                ", defuncion=" + defuncion +
                '}';
    }
}
