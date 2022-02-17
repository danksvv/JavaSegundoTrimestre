package poo;

public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;
    private String color;
    private int pesoTotal;
    private boolean asientoCuero, climatizador;
    private int precio;

    // método constructor
    public Coche(){
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        pesoPlataforma = 500;
        color = "blanco";
        pesoTotal = pesoPlataforma;
    }
    // métodos getters y setters
    public String getRuedas() {
        return "El número de ruedas es " + ruedas;
    }
    public String getLargo() {
        return "El largo del coche es " + largo/1000;
    }
    public String getAncho() {
        return "El ancho del coche es " + ancho;
    }
    public void setColor(String color) {
        this.color= color;
    }
    public String getColor() {
        return color;
    }
    public void setAsientoCuero(String _asientos) {
        asientoCuero = (_asientos.equalsIgnoreCase("si"));
    }
    public String getAsientoCuero() {
        return  asientoCuero ? "Lleva asientos de cuero" : "Lleva asientos de serie";
    }
    public void setClimatizador(String _climatizador) {
        climatizador = (_climatizador.equalsIgnoreCase("si"));
    }
    public String getClimatizador() {
        return climatizador ? "Lleva Climatizador incorporado" : "Sin Climatizador, aire de serie";
    }
    public void setPesoTotal() {
        //pesoTotal += pesoPlataforma;
        pesoTotal += (asientoCuero) ? 400 : 100;
        pesoTotal += (climatizador) ? 200 : 150;
    }
    public String getPesoTotal() {
        return "El peso total es : " + pesoTotal + " KG";
    }
    public String getPrecio() {
        this.precio = 10000;
        precio += (asientoCuero) ? 2000 : 0;
        precio += (climatizador) ? 1500 : 0;
        return "El precio final es : " + precio + " euros.";
    }
    @Override
    public String toString() {
        return "Datos Coche :\n" + getRuedas() +
                "\n" + getAncho() +
                " cm\n" + getLargo() +
                " metros\n" + getColor() +
                "\n" + getAsientoCuero() +
                "\n" + getClimatizador() +
                "\n" + getPesoTotal() +
                "\n" + getPrecio();
    }
}
