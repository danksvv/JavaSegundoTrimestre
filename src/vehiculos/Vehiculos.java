package vehiculos;
// 3)	Tener en cuenta que existirá una clase Vehículo de la cual colgarán las clases “Coches” y “Camiones” heredadas.

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Vehiculos {
    private String marca;
    private String matricula;
    private int numeroRuedas;
    private int autonomia;

    public Vehiculos(String marca, String matricula, int numeroRuedas, int autonomia) {
        this.marca = marca;
        this.matricula = matricula;
        this.numeroRuedas = numeroRuedas;
        this.autonomia = autonomia;
    }
}
