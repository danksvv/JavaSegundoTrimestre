package Arrays;

public class TablaSumarFilas {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        rellenarMatriz(matriz);
        visualizarMatriz(matriz);
    }

    public static void rellenarMatriz(int[][] m) {
        for (int i=0; i<m.length; i++) {
            for (int j=0; j<m[i].length; j++)
                m[i][j] = i + j;
        }
    }

    public static void visualizarMatriz(int[][] m) {
        for (int[] a : m) {
            for (int b : a)
                System.out.print(" " + b);
            System.out.println(" ");
        }
    }
}

