package parte3;

public class ProbadorOverRide extends InformaticosOverRide {

    public void sueldoR(double salario) {

        if (salario == 1500)
            System.out.println("Tiene un salario de un sueldo fijo");
        else
            System.out.println("Tiene un salario por horas");

    }

    public void datosR(String nombre) {

        System.out.println("El empleado " + nombre + " tiene datos reservados");

    }

    public void laboresR(String labor) {

        System.out.println("los empleados del departamento de pruebas desarrollan la labor de " + labor);

    }


}
