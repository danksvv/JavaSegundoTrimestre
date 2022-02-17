package poo;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {
    public static void main(String[] args) {

        Empleado [] mis_empleados = new Empleado[3];

        mis_empleados[0] = new Empleado("Ana Ruiz Diaz", 12000, 2012, 1, 12);
        mis_empleados[1] = new Empleado("Pedro Levandoski", 20000, 2004, 12, 23);
        mis_empleados[2] = new Empleado("Jose Maria Hernandez", 15000, 2010, 8, 20);

        mis_empleados[0].setSubirSueldo(20);
        mis_empleados[1].setSubirSueldo(5);

        for (Empleado item : mis_empleados)
            System.out.println(item);
    }
}

class Empleado {
    private String nomnbre;
    private double sueldo;
    private Date altaContrato;
    private int id;
    private static int idSiguiente = 1;
    // Método constructor
    public Empleado(String nombre, double sueldo, int anno, int mes, int dia) {
        this.nomnbre = nombre;
        this.sueldo = sueldo;
        mes--;
        GregorianCalendar fecha = new GregorianCalendar(anno, mes, dia);
        this.altaContrato = fecha.getTime();
        id = idSiguiente;
        idSiguiente++;
    }
    // Métodos getters y setters
    public String getNomnbre() {
        return nomnbre;
    }
    public double getSueldo() {
        return sueldo;
    }
    public Date getAltaContrato() {
        return altaContrato;
    }
    public void setSubirSueldo(double porcentaje) {
        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;
    }
    public int getId() {
        return id;
    }
    public static int getIdSiguiente() {
        return Empleado.idSiguiente;
    }
    @Override
    public String toString() {
        return "ID empleado : " + getId() +
        "\nNombre de empleado : " + getNomnbre() +
                "\nSueldo de empleado : " + getSueldo() +
                "\nAlta de contrato : " + getAltaContrato() +
                "\nId siguiente : " + getIdSiguiente();
    }
}
