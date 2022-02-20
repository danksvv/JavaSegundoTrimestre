package empleadosAbstracto;

public class Temporales extends Empleados{
    private final int horas_trabajadas;
    private final double salario_por_hora;

    public Temporales(String nombre, String DNI, int telefono, int horas_trabajadas, double salario_por_hora) {
        super(nombre, DNI, telefono);
        this.horas_trabajadas = horas_trabajadas;
        this.salario_por_hora = salario_por_hora;
    }

    public void consultarSalario() {
        double total = horas_trabajadas * salario_por_hora;
        System.out.println("El salario de " + this.getNombre() + " es " + total + " por las " + horas_trabajadas + " horas laborales ");
    }
}
