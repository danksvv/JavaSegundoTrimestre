package centralita;

import java.util.Arrays;

public class Centralita {
    private Llamadas[] llamadas;
    private int valor;

    public Centralita() {
        llamadas= new Llamadas[Llamadas.contador];
        this.valor = 0;
    }

    public void registroLlamadas(Llamadas a) {
        llamadas[valor] = a;
        valor++;
    }

    public void costeTotal() {
        double total = 0;

        for (int i=0; i< llamadas.length; i++) {
            System.out.println("llamada = " + llamadas[i]);
            total += llamadas[i].precio();
        }
        System.out.println("El precio total de la llamadas es : " + total);
    }

    public void totalLlamadas() {
        System.out.println("el total de llamadas es " + Llamadas.contador +" = " + valor );
    }

    @Override
    public String toString() {
        return "Centralita{" +
                "llamadas=" + Arrays.toString(llamadas) +
                "numero de llamadas=" + valor + '}';
    }
}
