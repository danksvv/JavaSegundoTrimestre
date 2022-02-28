package centralita;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class LlamadasLocales extends Llamadas {

        private final double coste = 0.15;

    public LlamadasLocales(int numero_origen, int numero_destino, int duration) {
        super(numero_origen, numero_destino, duration);
        super.contador++;
    }

    public double precio() {
        return Math.round((getDuration()*coste)*100.0)/100.0;
    }

    @Override
    public String toString() {
        return super.toString() +
                "precio de la llamada=" + precio() + '}';
    }
}
