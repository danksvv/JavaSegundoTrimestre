package figuras;

public class Principal {
    public static void main(String[] args) {
        int poligonos=0;
        int rectangulos=0;
        // Instanciar y probar objetos de cada clase.

        Circulo c1 = new Circulo("Rojo", 2.3);
        Triangulo t1 = new Triangulo("Verde", 12, 21);
        Rectangulo r1 = new Rectangulo("Amarillo", 4, 2.2);
        Hexagono h1 = new Hexagono("Negro", 4.2, 7);

        System.out.println(c1);
        System.out.println(t1);
        System.out.println(r1);
        System.out.println(h1);

        // Crear un array de figuras del tamaño que desees y guarda en él las figuras creadas.

        Figuras[] coleccionFiguras = {c1, t1, r1, h1};

        // Recorrer el array mostrando los datos de cada figura.

        for (Figuras f : coleccionFiguras)
            System.out.println(f);

        // Contar cuántos polígonos y cuántos rectángulos se han creado.

        for (Figuras f : coleccionFiguras) {
            if (f instanceof Rectangulo)
                rectangulos++;

            if (f instanceof Poligono)
                poligonos++;
        }

        System.out.println("En total hay " + rectangulos + " rectangulos y  " + poligonos + " poligonos");

    }
}
