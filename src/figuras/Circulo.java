package figuras;
// Círculo: clase hija de Figura con un atributo radio. Además de los métodos get, set y toString correspondientes, implementa los métodos de área y perímetro.
public class Circulo extends Figuras {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Métodos abstractos implementos

    public double perimetro(){
        return Math.PI * radio * 2;
    }

    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
       return "Soy una figura de color " + super.getColor() + ". Además soy un figura y circulo con ningún lado: Mi área es " + area() + " y mi perímetro es " + perimetro();
    }
}
