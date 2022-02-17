package animales;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Animal {
    private String nombreComun;
    private String nombreEspecifico;
    private int peso;
    private int tamano;

    public Animal(String nombreComun, String nombreEspecifico, int peso, int tamano) {
        this.nombreComun = nombreComun;
        this.nombreEspecifico = nombreEspecifico;
        this.peso = peso;
        this.tamano = tamano;
    }

}
