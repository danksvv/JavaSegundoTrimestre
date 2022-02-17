package viviendas;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 1)	Crea la clase Vivienda con los siguientes atributos: numero habitaciones, metros cuadrados, calle, número.
@Getter
@Setter
@ToString

public class Vivienda {
    private int numeroHabitaciones;
    private int metrosCuadrados;
    private String calle;
    private int numeroCalle;

    public Vivienda(int numeroHabitaciones, int metrosCuadrados, String calle, int numeroCalle) {
        this.numeroHabitaciones = numeroHabitaciones;
        this.metrosCuadrados = metrosCuadrados;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
    }
}
