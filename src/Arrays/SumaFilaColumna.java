package Arrays;
import java.util.Random;

public class SumaFilaColumna {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random classRandom = new Random();

        cargarMatriz(matriz, classRandom);
        visualizarMatriz(matriz);
        System.out.println("=============");
        System.out.println("SUMA DE FILAS");
        System.out.println("=============");
        sumarFilas(matriz);
        System.out.println("================");
        System.out.println("SUMA DE COLUMNAS");
        System.out.println("================");
        sumarColumnas(matriz);
    }

    public static void cargarMatriz(int[][] m, Random r) {
        for (int i=0; i< m.length; i++) {
            for (int j=0; j<m[i].length; j++)
                m[i][j] = 1 + r.nextInt(9);
        }
    }

    public static void visualizarMatriz(int[][] m) {
        for (int[] a : m){
            for(int b : a)
                System.out.print(" " + b + " ");
            System.out.println(" ");
        }

    }

    public static void sumarFilas(int[][] m) {
        for (int i=0; i< m.length; i++) {
            int suma = 0;
            for (int j=0; j<m[i].length; j++)
                suma += m[i][j];
            System.out.println("La suma de la fila " + i + " es " + suma);
        }

    }

    public static void sumarColumnas(int[][] m) {
        for (int i=0; i< m.length; i++) {
            int suma = 0;
            for (int j=0; j<m[i].length; j++)
                suma += m[j][i];
            System.out.println("La suma de la columna " + i + " es " + suma);
        }
    }
}
