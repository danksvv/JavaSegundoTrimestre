package sorteo;
// Una clase hija Carta, con dos atributos palo y número que redefinirá el método lanzar() generando aleatoriamente un palo y un número y visualice la carta de forma “As de Oros”.

public class Carta extends Sorteo {

    private int palo;
    private int numero;

    public Carta() {
        super(40);
    }

    public void lanzar() {
        String[]  palos = { "Oros", "Copas", "Espadas","Bastos" };
        String[] cartas = { "As", "Dos","Tres","Cuatro","Cinco","Seis","Siete","Sota","Caballo","Rey" };
        int palo = (int)(Math.random() * 4);
        int carta = (int)(Math.random() *10);
        System.out.println("Ha salido el "+cartas[carta]+ " de "+ palos[palo]);

    }


}
