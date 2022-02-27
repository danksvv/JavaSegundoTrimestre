package figuras;
// Hexagono: clase hija de Polígono. Sus atributos son lado y apotema. Además de los métodos get, set y toString correspondientes,
// implementa los métodos de área y perímetro. ( área=(perímetro*apotema)/2 )

public class Hexagono extends Poligono {

   private double lado;
   private double apotema;

    public Hexagono(String color, double lado, double apotema) {
        super(color, 6);
        this.lado = lado;
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double perimetro(){
        return lado*6;
    }
    public double area(){
        return (perimetro() * apotema)/2;
    }

    @Override
    public String toString() {
        return "Soy una figura de color " + super.getColor() + ". Además soy un hexagono y poligono con 6 lados: Mi área es " + area() + " y mi perímetro es " + perimetro();
    }
}
