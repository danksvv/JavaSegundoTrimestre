package centralita;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class LlamadasProvinciales extends Llamadas {

    private double[] precios = {0.20, 0.25, 0.30};
    private int franjas;

    public LlamadasProvinciales(int numero_origen, int numero_destino, int duration, int franjas) {
        super(numero_origen, numero_destino, duration);
        this.franjas = franjas;
        super.contador++;
    }

    public double precio() {
        return Math.round((getDuration()*precios[franjas-1])*100.0)/100.0;

    }

    @Override
    public String toString() {
        return super.toString() +
                "precio de la llamada=" + precio() + '}';
    }
}
