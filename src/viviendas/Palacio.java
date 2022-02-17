package viviendas;

// 3)	Crea la clase Palacio: Es una vivienda con 10 habitaciones y puede tener o no chófer. Las clases tendrán los siguientes métodos:
//a.	Constructores
//b.	Métodos get, set y toString.

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Palacio extends Vivienda{
    private boolean conChofer;

    public Palacio(int metrosCuadrados, String calle, int numeroCalle, boolean conChofer) {
        super(10, metrosCuadrados, calle, numeroCalle);
        this.conChofer = conChofer;
    }

    @Override
    public String toString() {
        return super.toString() + "Palacio{" +
                "conChofer=" + conChofer +
                '}';
    }
}
