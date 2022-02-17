package posicion;

import java.util.Scanner;

public class PrincipalPosicion {
    public static void main(String[] args) {
        // Genera un main que cree dos puntos, los visualice, obtenga sus opuestos, los incremente  con un valor introducido por teclado y calcule la recta que pasa por ambos.
        Scanner keyboardIn = new Scanner(System.in);

        Posicion pos1 = new Posicion(6,2);
        Posicion pos2 = new Posicion(5,6);

        Posicion pos3 = new Posicion(5,2);
        Posicion pos4 = new Posicion(pos3);

        System.out.println("Pos1 valor punto x = " + pos1.getX());
        System.out.println("Pos1 valor punto y = " + pos1.getY());

        System.out.println("Pos2 valor punto x = " + pos2.getX());
        System.out.println("Pos2 valor punto y = " + pos2.getY());

        System.out.println(pos1.getXY());
        System.out.println(pos2.getXY());

        System.out.println(pos3.getXY());
        System.out.println(pos4.getXY());

        //pos1.opuestoXY();
        pos4.opuestoXY();

        System.out.println(pos1.getXY());
        System.out.println(pos4.getXY());

        System.out.println("Introduce la cantidad a aumentar : ");
        int incremento = keyboardIn.nextInt();

        pos1.incXY(incremento, incremento);

        System.out.println(pos1.getXY());

        System.out.println(pos1.recta(pos3));
    }
}
