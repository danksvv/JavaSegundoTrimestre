package figuras;
// Triángulo: clase hija de Polígono. Sus atributos son base y altura. Además de los métodos get, set y toString correspondientes, implementa los métodos de área y perímetro.
public class Triangulo extends Poligono {
    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super(color, 3);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Implementa los métodos area y perimetro

    public double perimetro() {
         return getBase()*3;
    }


    public double area() {
         return (getBase() * getAltura()) / 2;
    }

    @Override
    public String toString() {
       return "Soy una figura de color " + super.getColor() + ". Además soy un poligono y Triangulo con 3 lados: Mi área es " + area() + " y mi perímetro es " + perimetro();
    }
}

