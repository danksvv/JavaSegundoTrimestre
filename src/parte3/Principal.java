package parte3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);
        double sueldo;
        String nombre, labor;

        AnalistasOverRide analista1 = new AnalistasOverRide();
        ProgramadoresOverRide programador1 = new ProgramadoresOverRide();
        ProbadorOverRide probador1 = new ProbadorOverRide();

        InformaticosOverRide[] informaticos = {analista1, programador1, probador1};

        // cargar y mostrar sueldos

        for (int i=0; i<informaticos.length; i++){
            System.out.println("Introduce el sueldo : ");
            sueldo = keyboardIn.nextDouble();
            informaticos[i].sueldoR(sueldo);
            System.out.println("Introduce el nombre : ");
            nombre = keyboardIn.next();
            informaticos[i].datosR(nombre);
            System.out.println("Introduce la labor : ");
            labor = keyboardIn.next();
            informaticos[i].laboresR(labor);
        }

        keyboardIn.close();

    }




}
