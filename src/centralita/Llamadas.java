package centralita;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Llamadas {
    private int numero_origen;
    private int numero_destino;
    private int duration;
    protected static int contador=0;

    public Llamadas(int numero_origen, int numero_destino, int duration) {
        this.numero_origen = numero_origen;
        this.numero_destino = numero_destino;
        this.duration = duration;
    }


    abstract public double precio();

    @Override
    public String toString() {
        return "Llamadas{" +
                "numero_origen=" + numero_origen +
                ", numero_destino=" + numero_destino +
                ", duration=" + duration +
                '}';
    }
}
