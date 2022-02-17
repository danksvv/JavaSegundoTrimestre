package cadenas;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);

        System.out.println("Introduce una cadena : ");
        String cadena = keyboardIn.nextLine();

        cadena = cadena.trim().replace(" ", "");
        StringBuilder aux = new StringBuilder();

        for (int i=cadena.length(); i>0; i--)
            aux.append(cadena.charAt(i-1));

        System.out.println(cadena.contentEquals(aux) ? "Es palindromo..." : "No es palindromo...");
        System.out.println("la cadena introducida espacios : " + cadena);
        System.out.println("la cadena al reves espacios : " + aux);
    }
}
