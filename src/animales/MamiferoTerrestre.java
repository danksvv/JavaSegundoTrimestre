package animales;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class MamiferoTerrestre extends Mamifero {
    private int numeroPatas;
    private int altura;
    public MamiferoTerrestre(String nameC, String nameE, int peso, int tamano, int numCrias, int mesesEmb, int numeroPatas) {
        super(nameC, nameE, peso, tamano,  numCrias, mesesEmb);
        this.numeroPatas = numeroPatas;
        this.altura = tamano;
    }

    public void crecimiento(int porcentaje) {
        altura = super.getTamano() + (super.getTamano()*porcentaje/100);
    }

    public int getTamano() {
        return altura;
    }

    @Override
    public String toString() {
        return "MamiferoTerrestre{" + super.toString() +
                "Tamaño total " + getTamano() +
                "numeroPatas=" + numeroPatas +
                '}';
    }
}
