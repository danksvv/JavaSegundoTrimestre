package empleadosAbstracto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

abstract class Empleados {
    private String nombre;
    private String DNI;
    private int telefono;

    public Empleados(String nombre, String DNI, int telefono) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.telefono = telefono;
    }

    public abstract void consultarSalario();
}
