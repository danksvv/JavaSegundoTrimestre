package cadenas;

import java.util.Scanner;

// •	Ejemplo: “hola ana belen”    carácter: a  => se encuentra en la posición 3, 5, 7
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);

        System.out.println("Introduce una cadena : ");
        String cadena = keyboardIn.nextLine();
        System.out.println("Introduce el caracter a buscar : ");
        char caracter = keyboardIn.next().charAt(0);
        boolean sw = false;
        for (int i=0; i<cadena.length(); i++){
            if (cadena.charAt(i) == caracter) {
                sw = true;
                break;
            }
        }
        if (sw) {
            System.out.print("'" + cadena + "' Caracter: '" + caracter + "' => se encuentra en la posición ");
            for(int i=0; i<cadena.length(); i++){
                if(cadena.charAt(i) == caracter)
                    System.out.print(i + ", ");
            }
        }
        else
            System.out.println("No existe coincidencia...");

        keyboardIn.close();
    }
}
