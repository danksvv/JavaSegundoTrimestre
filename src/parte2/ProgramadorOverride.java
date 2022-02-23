package parte2;

public class ProgramadorOverride extends InformaticosOverride {

    // Metodos sobreescritos

    public void sueldoA(double salario) {

        if (salario == 1000)
            System.out.println("El empleado tiene un sueldo fijo");
        else
            System.out.println("El empleado tiene un sueldo por horas");

    }

    public void datosA(String nombre) {

        System.out.println("El empleado " + nombre + " pertenece al departamento de programadores");

    }

    public void laboresA(String labor) {

        System.out.println("Los empleados del departamento de programadores realizan labores de " + labor);
    }

}
