package figuras;
// Figuras: clase abstracta que tiene un atributo color, y los métodos no abstractos setColor, getColor y toString y los métodos abstractos perímetro y área.
public abstract class Figuras {

    private String color;

    public Figuras(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // métodos abstractos

    public abstract double perimetro();
    public abstract double area();


    @Override
    public String toString() {
        return "Figuras{" +
                "color='" + color + '\'' +
                '}';
    }
}
