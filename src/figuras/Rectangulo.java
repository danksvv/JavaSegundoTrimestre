package figuras;
// Rectángulo: clase hija de Polígono. Sus atributos son base y altura. Además de los métodos get, set y toString correspondientes implementa los métodos de área y perímetro.
public class Rectangulo extends Poligono {

    private double base;
    private double altura;

    public Rectangulo(String color , double base, double altura) {
        super(color, 2);
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

    // Implementa los métodos perimetro y area
    public double perimetro() {
        return base*2 + altura*2;
    }

    public double area() {
        return base*altura;
    }

    @Override
    public String toString() {
       return "Soy una figura de color " + super.getColor() + ". Además soy un poligono y Rectangulo con 4 lados: Mi área es " + area() + " y mi perímetro es " + perimetro();

    }
}
