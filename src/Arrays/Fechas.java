package Arrays;
import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {

        int[][] dias = new int[12][];
        dias[0] = new int[31];
        dias[1] = new int[28];
        dias[2] = new int[31];
        dias[3] = new int[30];
        dias[4] = new int[31];
        dias[5] = new int[30];
        dias[6] = new int[31];
        dias[7] = new int[31];
        dias[8] = new int[30];
        dias[9] = new int[31];
        dias[10] = new int[30];
        dias[11] = new int[31];
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        cargarDias(dias);
        visualizarDias(dias);
        limitarDias(dias, meses);
    }

    public static void cargarDias(int[][] d) {
        int dia;
        for (int i=0; i<d.length; i++) {
            dia = 1;
            for (int j=0; j<d[i].length; j++){
                d[i][j] = dia;
                dia++;
            }
        }
    }

    public static void visualizarDias(int[][] d) {
        for (int[] ints : d) {
            for (int anInt : ints) {
                System.out.print(" " + anInt);
            }
            System.out.println(" ");
        }
    }

    public static void limitarDias(int[][] d, String[] m) {
       Scanner keyboardIn = new Scanner(System.in);
        System.out.print("Introduce el dia y mes en el siguiente formato dd mm (fecha incial) => ");
        int dia1 = keyboardIn.nextInt();
        int mes1 = keyboardIn.nextInt();
        System.out.print("Introduce el dia y mes en el siguiente formato dd mm (fecha final) => ");
        int dia2 = keyboardIn.nextInt();
        int mes2 = keyboardIn.nextInt();
        // el mes empieza en 1 en el calendario gregoriano, pero en el array se cuenta desde el 0
        mes1 -= 1;
        int n1 = mes1;
        // la diferencia entre el mes2 y la longitud del array es la cantidad que tenemos que restar al recorrer el array
        int n2;
        n2 = mes2-1;
        mes2 = d.length - mes2;
        for(int i=mes1; i<d.length-mes2; i++) {
            if(n1 == n2) {
                for(int j=dia1-1; j<dia2; j++)
                    System.out.println(d[i][j] + " de " + m[i]);
            }
            else {
                for(int j=0; j<d[i].length; j++) {
                    if(n1 == i && d[i][j] >= dia1)
                        System.out.println(d[i][j] + " de " + m[i]);
                    else if(n1 < i && n2 > i)
                        System.out.println(d[i][j] + " de " + m[i]);
                    else if(n2 == i && d[i][j] <= dia2)
                        System.out.println(d[i][j] + " de " + m[i]);
                }
            }
           /* for(int j=0; j<d[i].length; j++){
                //if (mes1 == mes2)
                if (n1 == i && d[i][j] >= dia1)
                        System.out.print(" " + d[i][j]);
                *//*else if(n2 == i && d[i][j] <= dia2)
                    System.out.print(" " + d[i][j]);
                *//*else if(i > n1 || i < n2)
                    System.out.print(" " + d[i][j]);*/
                //else {
                //    if (d.length - mes2 <= dia2)
                //        System.out.print(" " + d[i][j]);
                //else
                    //System.out.print(" " + d[i][j]);
        }
    }

}

