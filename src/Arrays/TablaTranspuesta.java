package Arrays;
import java.util.Random;

public class TablaTranspuesta {
    public static void main(String[] args) {
        int fila = 5;
        int columna = 3;
        int[][] matriz = new int[fila][columna];
        cargarMatriz(matriz);
        visualizarMatriz(matriz);
        int[][] transpuesta = transpuestaMatriz(matriz, fila, columna);
        visualizarMatriz(transpuesta);
    }

    public static void cargarMatriz(int[][] m) {
        Random classRandom = new Random();
        for(int i=0; i<m.length; i++) {
            for(int j=0; j<m[i].length; j++)
                m[i][j] = classRandom.nextInt(9) + 1;
        }
    }

    public static void visualizarMatriz(int[][] m) {
        for(int[] a : m) {
            for(int b : a)
                System.out.print(" " + b + " ");
            System.out.println(" ");
        }
    }

    public static int[][] transpuestaMatriz(int[][] m, int f, int c) {
        int[][] traspuesta = new int[c][f];
        for(int i=0; i<m.length; i++) {
            for(int j=0; j<m[i].length; j++)
                traspuesta[j][i] = m[i][j];
        }
        return traspuesta;
    }
}
