package empleadosAbstracto;

public class Principal {
    public static void main(String[] args) {
        // Empleadoas fijos
        Fijos fijo1 = new Fijos("Andres López", "50213254-S", 601601602, 1500);
        Fijos fijo2 = new Fijos("Ana Soler", "50345232-R", 601608677, 1200);
        Fijos fijo3 = new Fijos("Esther Cifuentes", "50352311-T", 601123321, 2500);
        // Empleadoas Temporales
        Temporales temporal1 = new Temporales("Javier Valenzuela", "4312231-Y", 654987156, 20, 10);
        Temporales temporal2 = new Temporales("Sandra Perez", "6312391-Y", 643874901, 50, 12);
        Temporales temporal3 = new Temporales("Carmen Gallardo", "6932121-Y", 643812009, 40, 15);

        Empleados[] trabajadores = {fijo1, fijo2, fijo3, temporal1, temporal2, temporal3};

        for (Empleados emp: trabajadores)
            emp.consultarSalario();
    }

}
