package alumno;

import java.util.Random;
import java.util.Scanner;
//import java.util.Arrays;


public class Principal2 {
        public static String[] asignaturas = new String[] {"Programación", "Base de datos", "Entornos", "Lenguaje de Marcas", "Sistemas Operativos"};
        public static String[] alumnos = new String[] {"Pedro", "Jose", "Maria", "Ana", "Sandra"};
    public static void main(String[] args) {
/*
        Alumno[] listaAlumnos = new Alumno[5];
        Nota[] notaAlumnos = new Nota[5];
        Nota[][] notaAlumnos2 = new Nota[5][5];

        for (int i=0; i< listaAlumnos.length; i++) {
            listaAlumnos[i] = new Alumno(alumnos[i], getNota2(notaAlumnos2, i));
        }
*/
        //rellenarNotas(listaAlumnos, notaAlumnos);
        //rellenarNotas(listaAlumnos, notaAlumnos2);

        Nota[] nota1 = new Nota[5];
        Scanner keyboardIn = new Scanner(System.in);
        int nota;
        String asignatura;
        for (int i=0; i<nota1.length; i++) {
            System.out.println("Introduce la asignatura : ");
            asignatura = keyboardIn.next();
            System.out.println("Introduce la nota : ");
            nota = keyboardIn.nextInt();
            nota1[i] = new Nota(asignatura, nota);
        }
        Nota[] nota2 = new Nota[5];

        nota2[0] = new Nota("Matematica", 10);
        nota2[1] = new Nota("Lenguaje", 9);
        nota2[2] = new Nota("Ingles", 10);
        nota2[3] = new Nota("Base de datos", 5);
        nota2[4] = new Nota("Programación", 6);

        Alumno[] alumnos = new Alumno[2];
        int[] numero = new int[5];
        String[] CAD = new String[5];

        alumnos[0] = new Alumno("Pedro", nota1);
        alumnos[1] = new Alumno("Jose", nota2);

        Alumno alumno3 = new Alumno("Maria", nota2);


        System.out.println(alumnos[0]);
        System.out.println(alumnos[1]);

        System.out.println("La nota maxima es " + alumnos[0].notaMaxima(nota1));
        System.out.println("La nota maxima es " + alumnos[1].notaMaxima(nota2));

/*
        for (Alumno listaAlumno : listaAlumnos) {
            System.out.println(listaAlumno);
        }
*/
    }

/*
    public static void rellenarNotas(Alumno[] lista, Nota[] notas) {
        for (int i=0; i<alumnos.length; i++) {
            lista[i] = new Alumno(alumnos[i], getNota(notas));
        }
*/

/*
    public static Nota[] getNota(Nota n){
        Random r = new Random();

        for (int i=0; i<asignaturas.length; i++) {
                int nota = r.nextInt(9)+1;
                n = new Nota(asignaturas[i], nota);
            }
        return n;
    }
*/

    public static Nota[] getNota2(Nota[][] n, int cont) {
        Random r = new Random();
        Nota[] vector = new Nota[n.length];
        System.arraycopy(n[cont], 0, vector, 0, vector.length);
        for (int i=0; i<asignaturas.length; i++) {
            int nota = r.nextInt(9)+1;
            vector[i] = new Nota(asignaturas[i], nota);
        }
        return vector;
    }
}
