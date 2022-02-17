package poo;

import java.util.Scanner;

public class UsoVehiculo {
    public static void main(String[] args) {

        Coche c1 = new Coche();
        c1.setColor("Rojo");

        Furgoneta f1 = new Furgoneta(7, 500);
        f1.setColor("Negro");
        f1.setAsientoCuero("Si");

        System.out.println("El coche es de color " + c1.getColor());
        System.out.println("La furgoneta es de color " + f1.getColor() + " y " + f1.getAsientoCuero());
        System.out.println(f1);
        System.out.println(c1);
    }
}
