package parte1;

public class ProbadorOverload extends InformaticosOverload {

    // Metodos sobrecargados

    public void sueldo(String tipo){
        if (tipo.equalsIgnoreCase("fijo"))
            System.out.println("El sueldo a percibir es fijo");
        else
            System.out.println("El sueldo a percibir es por horas");
    }

    public void datos(String nombre, String DNI, int telefono){
        System.out.println("El empleado " + nombre + " con DNI " + DNI + " tiene el telefono " + telefono);
    }

    public void labores(String nombre){
        System.out.println("El empleado " + nombre + " realiza tareas de pruebas");
    }

    }
