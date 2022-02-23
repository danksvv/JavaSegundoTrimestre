package parte2;

public class Principal {
    public static void main(String[] args) {

        InformaticosOverride programador1 = new ProgramadorOverride();
        InformaticosOverride analista1 = new AnalistaOverride();
        InformaticosOverride probador1 = new ProbadorOverride();

        programador1.sueldoA(1222);
        programador1.datosA("Pedro");
        programador1.laboresA("picar codigo");

        analista1.sueldoA(1500);
        analista1.datosA("Ana");
        analista1.laboresA("analizar codigo");

        programador1.sueldoA(1500);
        probador1.datosA("Jose Antonio");
        probador1.laboresA("probar codigo");

    }
}
