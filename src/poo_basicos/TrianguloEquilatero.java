package poo_basicos;

public class TrianguloEquilatero {
    private double lado;

    // Método constructor por defecto
    public TrianguloEquilatero() {}
    // Método constructor con argumentos
    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    // Métodos Get y Set
    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double getAltura() {
        return Math.round((Math.sqrt(3)*lado/2)*100.0)/100.0;
    }

    public double getArea() {
        return Math.round((Math.sqrt(3)/4)*Math.pow(lado, 2)*100.0)/100.0;
    }

    public double getPerimetro() {
        return 3*lado;
    }

    @Override
    public String toString() {
        return "TrianguloEquilatero: " +
                "\nLado = " + getLado() +
                "\nAltura = " + getAltura() +
                "\nArea = " + getArea() +
                "\nPerimetro = " + getPerimetro();
    }
}
