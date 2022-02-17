package PracticasLibroJoyanes;

import java.util.Scanner;
import java.util.Vector;

public class pruebas {
    public static void main(String[] args) {
        String objeto = new String("Objeto 1");
        String objeto2 = "Objeto 20";
        Scanner keyboardIn = new Scanner(System.in);
        boolean sw1;
        boolean sw = objeto instanceof String;
        sw1 = keyboardIn instanceof Scanner;
        System.out.println("el objeto es " + sw);
        System.out.println("el objeto es " + sw1);
        System.out.println(objeto);
        System.out.println(objeto2);
        System.out.println("resultado : " + (4 - 40 / 5));
    }
}
