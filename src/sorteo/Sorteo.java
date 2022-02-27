package sorteo;
// Una clase abstracta Sorteo, con un atributo posibilidades que se definirá protected entero y con un método abstracto lanzar() ,
// el método no abstracto probabilidad () que genera un double obtenido al dividir 1 entre el nº de posibilidades y el método verDatos()
// que obtenga las posibilidades y la probabilidad del sorteo.
public abstract class Sorteo {

    protected int posibilidades;

    public Sorteo(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    abstract public void lanzar();

    public double posibilidades() {
        return (double)100/posibilidades;
    }

    public void verDatos() {
        System.out.println("Las posibilidades son " + posibilidades + " y la probabilidad es del " + posibilidades() + " %");
    }
}
