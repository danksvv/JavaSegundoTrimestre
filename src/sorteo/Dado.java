package sorteo;
// Una clase hija Dado, que redefinirá el método lanzar() generando un nº aleatorio entre 1 y 6.
// numero = (int) (Math.random() * 50 + 1); --> genera un numero entre 1 y 50
public class Dado extends Sorteo {

    public Dado() {
        super(6);
    }

    public void lanzar() {
        int aleatorio = (int) (Math.random() * super.posibilidades + 1);
        System.out.println("DADO LANZADO , RESULTADO : " + aleatorio);
    }

}
