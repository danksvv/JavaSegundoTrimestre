package vehiculos;
// 2)	Para los camiones los atributos son: marca, matrícula, número de ruedas (no tiene porqué ser 4)
// , autonomía, límite de carga (entero), carga (entero), conductor (String). Si la carga excede del límite, se tomará como carga dicho límite.


public class Camiones extends Vehiculos {
    private int limiteCarga;
    private int carga;
    private String conductor;

    public Camiones(String marca, String matricula, int numeroRuedas, int autonomia, int limiteCarga, int carga, String conductor) {
        super(marca, matricula, numeroRuedas, autonomia);
        if (carga >= limiteCarga) {
            this.carga = limiteCarga;
            this.limiteCarga = limiteCarga;
        }
        else {
            this.limiteCarga = limiteCarga;
            this.carga = carga;
        }
        this.conductor = conductor;
    }
// 6)	Para manipular la información de los camioneros se necesitan estos métodos:
//a.	cambiarConductor: Modificar el nombre del conductor del camión
    public void setNombre(String conductor) {
        this.conductor = conductor;
    }
    public String getNombre() {
        return this.conductor;
    }
//b.	cargar: Incrementa la carga en cierta cantidad. La carga final no puede sobrepasar el límite, en cuyo caso se aplica lo mismo que en el construtor.

    public void establecerCarga(int cantidad) {
        carga = Math.min(carga+cantidad, limiteCarga);
    }

    public int getCarga() {
        return carga;
    }
//c.	descargar: Dismimuye la carga en cierta cantidad. Si la cantidad es mayor que la carga, la carga se considerará 0.

    public void descargar(int cantidad) {
        carga = (cantidad>carga) ? 0:carga-cantidad;
    }

//d.	listar: Lista todos los datos de un camión.
    @Override
    public String toString() {
        return "Camiones{" + super.toString() +
                "limiteCarga=" + limiteCarga +
                ", carga=" + carga +
                ", conductor='" + conductor + '\'' +
                '}';
    }
}
