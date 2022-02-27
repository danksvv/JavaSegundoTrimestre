package sorteo;
// Crear un main para instanciar distintos tipos de objetos de clase Dado, Moneda y Carta
public class Principal {
    public static void main(String[] args) {

        Dado d1 = new Dado();
        Moneda m1 = new Moneda();
        Carta c1 = new Carta();

        d1.lanzar();
        m1.lanzar();
        c1.lanzar();

        d1.verDatos();
        m1.verDatos();
        c1.verDatos();
    }
}
