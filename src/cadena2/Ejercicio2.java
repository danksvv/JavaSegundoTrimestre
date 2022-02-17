package cadena2;
// 2.	Dada una cadena por teclado, escribir un método que obtenga otra cadena eliminando las vocales.
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);
        System.out.println("Introduce una cadena : ");
        String cadena = keyboardIn.nextLine();

        System.out.println("La cadena final es : " + eliminarVocales(cadena));

    }

    public static String eliminarVocales(String cadena) {
        String aux="";

        for(int i=0; i<cadena.length(); i++){
            if (cadena.charAt(i) != 'a' && cadena.charAt(i) != 'e'&& cadena.charAt(i) != 'i' && cadena.charAt(i) != 'o'&& cadena.charAt(i) != 'u')
                aux += cadena.charAt(i);
        }
        return  aux;
    }
}
