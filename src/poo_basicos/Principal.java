package poo_basicos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner keyboardIn = new Scanner(System.in);

        System.out.print("Introduce el lado del triangulo equilatero => ");
        double lado = keyboardIn.nextDouble();

        TrianguloEquilatero t1 = new TrianguloEquilatero(lado);

        System.out.println(t1);

    }
}
