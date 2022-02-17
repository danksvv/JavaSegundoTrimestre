package animales;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Mamifero extends Animal{
    private int numeroCrias;
    private int mesesEmbarazo;

    public Mamifero(String nameC, String nameE, int peso, int tamano, int numCrias, int mesesEmb){
        super(nameC, nameE, peso, tamano);
        this.numeroCrias = numCrias;
        this.mesesEmbarazo = mesesEmb;
    }

    @Override
    public String toString() {
        return "Mamifero{" + super.toString() +
                "numeroCrias=" + numeroCrias +
                ", mesesEmbarazo=" + mesesEmbarazo +
                '}';
    }
}
