package vehiculos;
// 1)	Para los coches almacena los siguientes atributos: marca, matrícula, número de ruedas (siempre 4), autonomía, color, número de pasajeros y si es o no descapotable.


public class Coches extends Vehiculos {
    private String color;
    private int numeroPasajeros;
    private boolean esDescapotable;

    public Coches(String marca, String matricula, int autonomia, String color, int numeroPasajeros, boolean esDescapotable) {
        super(marca, matricula, 4, autonomia);
        this.color = color;
        this.numeroPasajeros = numeroPasajeros;
        this.esDescapotable = esDescapotable;
    }

    // 5)	Para manipular la información de los coches se utilizan dos métodos:
    //a.	pintar: cambia de color un coche.

    public void pintar(String color) {
        this.color = color;
    }

    public String getPintar() {
        return this.color;
    }

    //b.	listar: lista todos los atributos de un coche.
    @Override
    public String toString() {
        return "Coches{" + super.toString() +
                "color='" + color + '\'' +
                ", numeroPasajeros=" + numeroPasajeros +
                ", esDescapotable=" + esDescapotable +
                '}';
    }
}
