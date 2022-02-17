package posicion;

public class Posicion {
    // Cada posición viene definida por dos valores enteros x e y. Implementa los siguientes métodos:
    private int x;
    private int y;

    // Constructor por defecto, que se corresponde con la posición (0,0).
    public Posicion() {}
    // Constructor al que se pasan, como parámetros los valores iniciales x e y.
    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Constructor de copia, al que se le pasa un objeto de tipo posición e inicializa el objeto con los valores x e y del objeto pasado como parámetro
    public Posicion(Posicion pos1) {
        x = pos1.x;
        y = pos1.y;
    }
    // Método setXY, que sustituye los valores x e y por los valores enteros que se le pasan como parámetros.
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Método getX y getY que muestran respectivamente la coordenada X e Y del punto.

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Método getXY, que muestra las coordenadas de un objeto Posicion en el formato (x, y).
    public String getXY() {
        return "(" + x + ", " + y + ")";
    }
    // Método decXY, que decrementa el valor de las coordenadas x e y con los valores enteros pasados como parámetros.
    public void decXY(int x, int y) {
        this.x -= x;
        this.y -= y;
    }
    // Método incXY, que incrementa el valor de las coordenadas x e y con los valores enteros pasados como parámetros.
    public void incXY(int x, int y) {
        this.x += x;
        this.y += y;
    }
    // Método recta, que recibe como parámetro un objeto de tipo Posicion y calcula y muestra la ecuación de la recta que pasa por los puntos representados por el objeto que forma parte de la llamada y el que se pasa como parámetro. Sabiendo que la ecuación que pasa por dos puntos, (x1, y1) y (x2, y2) es:
    //y-y1 = m(x-x1)
    //Siendo m la pendiente de la recta que se calcula con la siguiente fórmula:
    //m = (y2-y1) / (x2-x1)
    public String recta(Posicion pos2) {
        if (pos2.x == x)
            return "Pendiente infinita : recta donde corta en el eje x = " + pos2.x;
        else if (pos2.y == y)
            return "Pendiente horizontal : recta donde corta en el eje y = " + pos2.y;
        else {
            double m = (double) (pos2.y - y)/(pos2.x - x);
            return "Pendiente : y - " + y + " = " + m + "( x - " + x + ")";
        }
    }
    // Método opuestoXY, que devuelva un objeto Posicion cuyas coordenadas x e y sean las opuestas a las coordenadas x e y del objeto que forma parte de la llamada.
    public Posicion opuestoXY() {
            int aux = x;
            x = y;
            y = aux;
            return this;
        }

    }


