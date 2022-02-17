package cadena2;
// 1.	Dadas dos cadenas introducidas por teclado, escribir un método que devuelva la cadena resultante de la concatenación en mayúsculas.
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);
        String cad1, cad2;
        System.out.println("Introduce la primera cadena : ");
        cad1 = keyboardIn.nextLine();
        System.out.println("Introduce la segunda cadena : ");
        cad2 = keyboardIn.nextLine();

        String cadena = concatenacionMayusculas(cad1, cad2);

        System.out.println("Cadena concatenada y en máyusculas : " + cadena);
    }

    public static String concatenacionMayusculas(String c1, String c2) {
        return c1.toUpperCase() + " " + c2.toUpperCase();
    }
}
