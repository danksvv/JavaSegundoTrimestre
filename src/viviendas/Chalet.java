package viviendas;

import lombok.Getter;
import lombok.Setter;

// 2)	Crea la clase Chalet: Es una vivienda que, además, tiene metros de jardín  y puede tener o piscina.
@Setter
@Getter

public class Chalet extends Vivienda {
    private int metrosJardin;
    private boolean conPiscina;

    public Chalet(int numeroHabitaciones, int metrosCuadrados, String calle, int numeroCalle, int metrosJardin, boolean conPiscina) {
        super(numeroHabitaciones, metrosCuadrados, calle, numeroCalle);
        this.metrosJardin = metrosJardin;
        this.conPiscina = conPiscina;
    }

    @Override
    public String toString() {
        return super.toString() + "Chalet{" +
                "metrosJardin=" + metrosJardin +
                ", conPiscina=" + conPiscina +
                '}';
    }
}
