package articulos;

import java.util.Scanner;

public class PrincipalArticulos {
    public static void main(String[] args) {

        Scanner keyboardIn = new Scanner(System.in);

        System.out.println("Articulo 1");
        System.out.print("Introduce el nombre de articulo : ");
        String art1Nombre = keyboardIn.next();
        System.out.print("Introduce el color de " + art1Nombre + " : ");
        String art1Color = keyboardIn.next();
        System.out.print("Introduce el precio de " + art1Nombre + " : ");
        double art1Precio = keyboardIn.nextDouble();
        Articulos articulo1 = new Articulos(art1Nombre, art1Color, art1Precio);
        Articulos articulo2 = new Articulos();
        // Usar métodos para dar valores a articulo 2
        articulo2.nombre = "Jeans";
        articulo2.setColor("Azules");
        articulo2.setPrecio(110);
        System.out.println("Articulo 3");
        System.out.print("Introduce el nombre de articulo : ");
        String art3Nombre = keyboardIn.next();
        System.out.print("Introduce el color de " + art3Nombre + " : ");
        String art3Color = keyboardIn.next();
        System.out.print("Introduce el precio de " + art3Nombre + " : ");
        double art3Precio = keyboardIn.nextDouble();
        Articulos articulo3 = new Articulos(art3Nombre, art3Color);
        // Usar un método par establecer el precio de árticulo 3
        articulo3.setPrecio(art3Precio);
        // Cambio de nombre y color del articulo 1
        System.out.print("Introduce el nuevo nombre de articulo : ");
        art1Nombre = keyboardIn.next();
        System.out.print("Introduce el nuevo color de " + art1Nombre + " : ");
        art1Color = keyboardIn.next();
        articulo1.nombre = art1Nombre;
        articulo1.setColor(art1Color);
        // Visualiza los datos de los articulos
        System.out.println(articulo1);
        System.out.println(articulo2);
        System.out.println(articulo3);
        // Incrementa el precio de articulo 2
        System.out.print("Introduce el porcentaje a incrementar del articulo : ");
        double art2Inc = keyboardIn.nextDouble();
        articulo2.setIncrementarPrecio(art2Inc);
        // Rebajar el precio del articulo 1
        articulo1.setRebajarPrecio();
        // Visualiza despues de los cambios
        System.out.println(articulo1);
        System.out.println(articulo2);
        System.out.println(articulo3);


    }
}
