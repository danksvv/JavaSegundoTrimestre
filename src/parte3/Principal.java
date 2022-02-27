package parte3;

public class Principal {
    public static void main(String[] args) {

        AnalistasOverRide analista1 = new AnalistasOverRide();
        ProgramadoresOverRide programador1 = new ProgramadoresOverRide();
        ProbadorOverRide probador1 = new ProbadorOverRide();

        InformaticosOverRide[] informaticos = {analista1, programador1, probador1};

        // cargar y mostrar sueldos

        for (InformaticosOverRide informatico : informaticos){
            if(informatico instanceof AnalistasOverRide){
                informatico.sueldoR(1200);
                informatico.laboresR("Analizar codigo");
                informatico.datosR("Andres");
            }
            else if (informatico instanceof ProbadorOverRide){
                informatico.sueldoR(1200);
                informatico.laboresR("Analizar codigo");
                informatico.datosR("Andres");
            }
            else if (informatico instanceof ProgramadoresOverRide) {
                informatico.sueldoR(1200);
                informatico.laboresR("Analizar codigo");
                informatico.datosR("Andres");
            }
        }

    }




}
