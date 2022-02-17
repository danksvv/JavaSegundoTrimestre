package cadenas;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);
        System.out.print("Introduce una cadena : ");
        String cadena = keyboardIn.nextLine();

        System.out.println("La longitud de la cadena '" + cadena + "' es " + cadena.length());

        int mitad = cadena.length()/2;

        System.out.println("El caracter que ocupa el centro de la cadena es '" + cadena.charAt(mitad) + "'");

        System.out.println("La mitad izquierda de la cadena es : " + cadena.substring(0, mitad));
        System.out.println("La mitad derecha de la cadena es : " + cadena.substring(mitad));

        keyboardIn.close();
    }
}
