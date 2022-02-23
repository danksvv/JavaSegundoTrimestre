package parte2;

public class AnalistaOverride extends InformaticosOverride {

    // Metodos sobreescritos

    public void sueldoA(double salario) {

        if (salario == 1500)
            System.out.println("Tiene un salario de un sueldo fijo");
        else
            System.out.println("Tiene un salario por horas");

    }

    public void datosA(String nombre) {

        System.out.println("El empleado " + nombre + " tiene datos reservados");

    }

    public void laboresA(String labor) {

        System.out.println("El empleados de la parte de analisis desarrollan la labor de " + labor);

    }

}
