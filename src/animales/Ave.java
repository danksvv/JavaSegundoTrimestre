package animales;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Ave extends Animal{
    private int numeroHuevos;
    private boolean esVolador;

    public Ave(String nombreComun, String nombreEspecifico, int peso, int tamano, int numeroHuevos, boolean esVolador) {
        super(nombreComun, nombreEspecifico, peso, tamano);
        this.numeroHuevos = numeroHuevos;
        this.esVolador = esVolador;
    }

    @Override
    public String toString() {
        return "Ave{" + super.toString() +
                "numeroHuevos=" + numeroHuevos +
                ", esVolador=" + esVolador +
                '}';
    }
}
