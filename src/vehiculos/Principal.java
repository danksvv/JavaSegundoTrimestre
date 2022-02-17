package vehiculos;

public class Principal {
    public static void main(String[] args) {

        // Se pide crear una clase que contenga un main para crear 1 vehículo, 1 coche y 2 camiones

        Vehiculos vehiculo1 = new Vehiculos("Toyota", "XL2312", 4, 320);
        Coches coche1 = new Coches("Nissan", "ES3213", 420, "Blanco", 5, false);
        Camiones camion1 = new Camiones("Volvo", "AD3038", 6, 2000, 20000, 30000, "Peter");
        Camiones camion2 = new Camiones("IVECO", "DE0438", 8, 3000, 50000, 10000, "Gunter");


        Vehiculos[] vehiculos = {vehiculo1, coche1, camion1, camion2};

        for (Vehiculos i : vehiculos)
            System.out.println(i);

        System.out.println("======================================================");

        // y probar los métodos anteriores de pintar(), cargar() y descargar(), visualizando los objetos.

        coche1.pintar("Rojo");
        camion2.establecerCarga(60000);

        System.out.println(camion2);

        camion1.descargar(10500);

        System.out.println(camion1);

        camion1.descargar(10000);

        System.out.println(camion1);
    }
}
