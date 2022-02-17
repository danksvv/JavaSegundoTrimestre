package viviendas;

public class TestVivienda {
    public static void main(String[] args) {
        // 4)	Crea la clase TestViviendas  que contenga un método main realice las siguientes operaciones:
        //c.	Crear 1 vivienda, 2 chalets y 1 palacio.
        int cont = 0;
        Vivienda vivienda1 = new Vivienda(3, 40, "Gran via", 3);
        Chalet chalet1 = new Chalet(5, 80, "El pozo", 42, 15, false);
        Chalet chalet2 = new Chalet(7, 120, "El cortijo", 21, 24, true);
        Palacio palacio1 = new Palacio(12, "El Escorial", 32, true);

        // d.	Crear un array de 4 posiciones al que  se le asignarán los objetos anteriores.

        Vivienda[] viviendas = {vivienda1, chalet1, chalet2, palacio1};

        // e.	Recorrer el array y mostrar cada uno de los objetos por pantalla.

        for (Vivienda i : viviendas)
            System.out.println(i);

        // f.	Recorrer el array y contar cuántos chalets hay imprimiendo el resultado.

        for (Vivienda i : viviendas) {
            if (i instanceof Chalet)
                cont++;
        }

        System.out.println("El array viviendas contiene " + cont + " objetos de tipo Chalets");


    }
}
