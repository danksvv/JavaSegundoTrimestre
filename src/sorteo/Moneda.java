package sorteo;
// Una clase hija Moneda, que redefinirá el método lanzar() generando aleatoriamente cara o cruz.
public class Moneda extends Sorteo {

    public Moneda() {
        super(2);
    }

    public void lanzar() {
       int aleatorio = (int) (Math.random() * super.posibilidades + 1);
       if (aleatorio == 1)
           System.out.println("SALIO CARA");
       else
           System.out.println("SALIO CRUZ");
    }
}
