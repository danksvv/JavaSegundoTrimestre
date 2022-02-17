package Paises;

public class Principal {
    public static void main(String[] args) {

        Pais pais1 = new Pais("Peru", "Lima");
        Pais[] europeos = new Pais[5];

        europeos[0] = new Pais("España", "Madrid");
        europeos[1] = new Pais("Portugal", "Lisboa");
        europeos[2] = new Pais("Holanda", "Amsterdam");
        europeos[3] = new Pais("Francia", "Paris");
        europeos[4] = new Pais("Alemania", "Berlin");

        System.out.println(pais1);

        for (Pais i : europeos)
            System.out.println("Paises Europeos " + i);

    }
}
