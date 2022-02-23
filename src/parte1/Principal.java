package parte1;

public class Principal {
    public static void main(String[] args) {

        ProgramadorOverload programador1 = new ProgramadorOverload();
        AnalistaOverload analista1 = new AnalistaOverload();
        ProbadorOverload probador1 = new ProbadorOverload();

        programador1.sueldo("FIJO");
        analista1.sueldo("por horas");
        probador1.sueldo("fijo");

        programador1.datos("Luis", "9999999X", 605234623);
        analista1.datos("Pedro", "44232323X", 632234623);
        probador1.datos("Ana", "8231299X", 915234623);

        programador1.labores("Luis");
        analista1.labores("Pedro");
        probador1.labores("Ana");


    }
}
