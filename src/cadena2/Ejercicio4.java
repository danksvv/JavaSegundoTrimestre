package cadena2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner keyboardIn = new Scanner(System.in);

        System.out.println("Introduce una cadena : ");
        StringBuffer cadena1 = new StringBuffer(keyboardIn.nextLine());

        System.out.println("La cadena introducida es " + cadena1.toString().trim());



    }
}
