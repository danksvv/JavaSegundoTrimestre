package parte2;

public class ProbadorOverride extends InformaticosOverride {

    // Metodos sobreescritos

    public void sueldoA(double salario) {

        if(salario == 2000)
            System.out.println("El empleado tiene un sueldo fijo");
        else
            System.out.println("El empleado tiene un sueldo por horas");
    }

    public void datosA(String nombre) {

        System.out.println("El empleado " + nombre + " pertenece al grupo de pruebas");

    }

    public void laboresA(String labor) {

        System.out.println("Los empleados del departamento de pruebas desarrollan la labor de " + labor);

    }


}
