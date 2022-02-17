package PracticasLibroJoyanes;
// Programa que imprime 40 caracteres x linea
public class Java6_p_3_4 {
    static char[] texto = new char[40];
    public static void main(String[] args) {

        for (int i=0; i<=39; i++){
            for (int j=0; j<=39; j++){
                // Rango de caracteres ASCII en minuscula
                int rand = (int)(Math.random()*(123-97))+97;
                texto[i] = (char)rand;
                System.out.print(texto[i]);
                if (j==39) {
                    System.out.println("\n");
                }
            }
        }
    }
}
