// 1.	Dadas dos cadenas introducidas por teclado, escribir un método que devuelva la cadena resultante de la concatenación en mayúsculas (Con StringBuffer)
package cadena2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner keyboardIn = new Scanner(System.in);
        StringBuffer cadena1 = new StringBuffer();
        StringBuffer cadena2 = new StringBuffer();

        System.out.println("Introduce una cadena de texto : ");
        cadena1.append(keyboardIn.nextLine());
        System.out.println("Introduce una cadena de texto : ");
        cadena2.append(keyboardIn.nextLine());

        System.out.println("La cadena concatenada y máyuscula : " + cadenaMayusculas(cadena1, cadena2));

    }

    public static String cadenaMayusculas(StringBuffer cad1, StringBuffer cad2){
        return cad1.append(cad2).toString().toUpperCase();
    }
}
