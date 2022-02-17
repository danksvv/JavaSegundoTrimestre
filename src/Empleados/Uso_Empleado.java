package Empleados;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {
    public static void main(String[] args) {
/*
        Empleado empleado1 = new Empleado("Ana Suarez", 12000, 1990, 1, 12);
        Empleado empleado2 = new Empleado("Pedro Jimenez", 15000, 1980, 5, 25);
        Empleado empleado3 = new Empleado("Raquel Sanchez", 24000, 1971, 10, 5);
        empleado1.subSueldo(3);
        empleado2.subSueldo(1);
        empleado3.subSueldo(8);

        System.out.println("Nombre : " + empleado1.getNombre() + "\nSueldo : " + empleado1.getSueldo() + "\nFecha de Alta : " + empleado1.getFecha());
*/
        Empleado [] mis_empleados = new Empleado[3];
        mis_empleados[0] = new Empleado("Luis Andres", 20000, 1992, 3, 12);
        mis_empleados[1] = new Empleado("Ana Suarez", 12300, 1998, 5, 2);
        mis_empleados[2] = new Empleado("Pedro Jose", 31000, 1881, 4, 7);

        for (Empleado item : mis_empleados) {
            System.out.println("Nombre " + item.getNombre() + " Sueldo " + item.getSueldo() + " Fecha Alta " + item.getFecha());
        }
    }
}

    class Empleado{
        private String nombre;
        private double sueldo;
        private Date fecha_alta;

        public Empleado(String nom, double sld, int agno, int mes, int dia){
           nombre = nom;
           sueldo = sld;
           // La clase Gregorian Calendar, construye una fecha
           GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
           fecha_alta = calendario.getTime();
        }
        // Devolvemos el nombre desde Getter
        public String getNombre(){
            return nombre;
        }
        public double getSueldo(){
            return sueldo;
        }
        public Date getFecha(){
            return fecha_alta;
        }
        // Metodo Setter
        public void subSueldo(double porcentaje){
            double aumento = sueldo*porcentaje/100;
            sueldo +=aumento;
    }

    class Jefatura extends Empleado{
        public Jefatura(String nombre, double sueldo, int anno, int mes, int dia) {
            super(nombre, sueldo, anno, mes, dia);
        }

        public void setIncentivo(double incentivo) {
            this.incentivo = incentivo;
        }
        // Sobreescribir el metodo heredado de empleado getSueldo, ya que no sera el mismo sueldo que empleado


        public double getSueldo() {
            return super.getSueldo() + incentivo;
        }

        private double incentivo;
    }
}
