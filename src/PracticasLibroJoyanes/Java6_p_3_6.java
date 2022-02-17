package PracticasLibroJoyanes;

public class Java6_p_3_6 {
    public static void main(String[] args) {

        for (int i=0; i<=8; i++) {
            //System.out.println("*");
            for (int j=0; j<=5; j++) {
                if (i==0 || i==4 || i==8){
                    char valor = (j!=5) ? '*' : ' ';
                    System.out.print(valor);
                  /*  if (j!=5)
                        System.out.print("*");
                    else
                        System.out.print(" ");*/
                }

                else {
                    if (j==0 || j==5)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
