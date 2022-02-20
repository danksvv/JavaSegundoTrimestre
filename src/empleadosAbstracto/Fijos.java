package empleadosAbstracto;

public class Fijos extends Empleados{
    private final double salario_fijo;

    public Fijos(String nombre, String DNI, int telefono, double salario_fijo) {
        super(nombre, DNI, telefono);
        this.salario_fijo = salario_fijo;
    }

    public void consultarSalario(){
        System.out.println("El salario mensual de " + this.getNombre() + " es " + salario_fijo);
    }
}
