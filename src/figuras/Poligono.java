package figuras;
// Polígono: clase hija de Figura con un atributos numLados y los métodos no abstractos setNumLados y getNumLados. No implementa los métodos abstractos perímetro y área. Evaluar si debe ser o no abstracta
public abstract class Poligono extends Figuras {
    private int numlados;

    public Poligono(String color, int numlados) {
        super(color);
        this.numlados = numlados;
    }

    public int getNumlados() {
        return numlados;
    }

    public void setNumlados(int numlados) {
        this.numlados = numlados;
    }

    public double perimetro(){ return 0; }
    public double area(){ return 0; }

    @Override
    public String toString() {
        return super.toString() + "Poligono{" +
                "numlados=" + numlados +
                '}';
    }
}
