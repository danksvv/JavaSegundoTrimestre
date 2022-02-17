package alumno;

import java.util.Random;
import java.util.Scanner;
//import java.util.Arrays;


public class Principal {
        public static String[] asignaturas = new String[5];
        public static String[] alumnos = new String[5];
        public static Scanner keyboardIn = new Scanner(System.in);

    public static void main(String[] args) {
        Alumno[] listaAlumnos = new Alumno[5];
        Nota[][] notaAlumnos = new Nota[5][5];

        // Llamada a los distintos metodos, pasando por parametros los arrays correspondientes
        System.out.println("====================================");
        System.out.println("INTRODUCE LAS ASIGNATURAS A CURSAR : ");
        System.out.println("====================================");
        cargarAsignaturas();
        System.out.println("====================================");
        System.out.println("INTRODUCE LOS ALUMNOS(AS) MATRICULADOS : ");
        System.out.println("====================================");
        cargarAlumnos();
        cargarNotas(notaAlumnos);
        rellenarAlumnos(listaAlumnos, notaAlumnos);
        System.out.println("====================");
        System.out.println("NOTAS DE LOS ALUMNOS");
        System.out.println("====================");
        visualizarNotas(listaAlumnos);
        System.out.println("===========================");
        System.out.println("NOTAS MAXIMA DE CADA ALUMNO");
        System.out.println("===========================");
        maximaNotaAlumno(listaAlumnos, notaAlumnos);
        System.out.println("===========================");
        System.out.println("NOTAS MEDIA DE CADA ALUMNO");
        System.out.println("===========================");
        mediaNotaAlumno(listaAlumnos, notaAlumnos);
        System.out.println("=================");
        System.out.println("NOTAS MEDIA TOTAL");
        System.out.println("=================");
        mediaNotasTotal(listaAlumnos, notaAlumnos);
        System.out.println("==========================");
        System.out.println("NOTAS MEDIA POR ASIGNATURA");
        System.out.println("==========================");
        mediaNotaAsignaturas(listaAlumnos, notaAlumnos);
    }

    // Método que se encarga de recorrer un arrays de string e introducir por cada iteracion el nombre de cada asignatura
    public static void cargarAsignaturas() {
        for (int i=0; i<asignaturas.length; i++) {
            System.out.print("Introduce la " + (i+1) + "º asignatura => ");
            asignaturas[i] = keyboardIn.nextLine();
        }
    }

    // Método que se encarga de recorrer un arrays de string e introducir por cada iteracion el nombre de cada alumno
    public static void cargarAlumnos() {
        for (int i=0; i<alumnos.length; i++) {
            System.out.print("Introduce el(la) " + (i+1) + "º alumno(a) => ");
            alumnos[i] = keyboardIn.nextLine();
        }
    }

    // Método que se encarga de cargar las notas aleatoriamente en cada recorrido de array bidimensional
    public static void cargarNotas(Nota[][] n) {
        Random r = new Random();
        for (int i=0; i<n.length; i++) {
            for (int j=0; j<n[i].length; j++) {
                int nota = r.nextInt(9) + 1;
                n[i][j] = new Nota(asignaturas[j], nota);
            }
        }
    }

    // Método que recibe un array alumno y un array bidimensional Nota, con un for recorremos
    // la lista de alumnos y en cada iteracion instanciamos pasando el nombre y el array de notas
    // previamente el array de notas llamara a un método getNota() que nos devolvera un array
    public static void rellenarAlumnos(Alumno[] a, Nota[][] n) {
        for (int i=0; i< a.length; i++) {
            a[i] = new Alumno(alumnos[i], getNota(n, i));
        }
    }

    // Método que recibe un array bidimensional y una constante, en este método se realiza una transformación
    // del array bidimensional a unidimensional, con el método arraycopy, que recibe la posicion de la fila
    // a traves de la constante, y copia lo que contiene la primera fila a un nuevo array nota instanciado
    // luego con un recorrido de bucle se instancia cada nota pasando el nombre del array asignatura y la
    // nota accediendo a traves de su metodo getNotaAsignatura(), cargando asi el array de notas
    // al final de la carga nos devuelve un array unidimensional de tipo nota
    public static Nota[] getNota(Nota[][] n, int cont) {
        Nota[] notas = new Nota[n.length];
        System.arraycopy(n[cont], 0, notas, 0, notas.length);
        for (int i=0; i<asignaturas.length; i++) {
            notas[i] = new Nota(asignaturas[i], n[cont][i].getNotaAsignatura());
        }
        return notas;
    }

    // Método que recorre el array Alumno y visualiza cada elemento de la lista
    public static void visualizarNotas(Alumno[] a) {
        for (Alumno listaAlumno : a) {
            System.out.println(listaAlumno);
        }
    }

    // Método que recibe un array Alumno y el array bidimensional Nota, el cual recorremos
    // con un for cada alumno y el array Nota transformamos en un array unidimensional
    // para que en cada recorrido pasemos el array de notas de cada alumno y a traves del método notaMaxima()
    // lo recorremos y calculamos el máximo
    public static void maximaNotaAlumno(Alumno[] a, Nota[][] n) {
        for (int i=0; i<a.length; i++) {
            Nota[] notas = new Nota[n.length];
            System.arraycopy(n[i], 0, notas, 0, notas.length);
            System.out.println("La nota máxima del alumno/a '" + a[i].getNombre() + "' es " + a[i].notaMaxima(notas) + " de la asignatura " + a[i].nombreMaxAsignatura(notas, a[i].notaMaxima(notas)));
        }
    }

    // Método que recibe un array Alumno y un array bidimensional para transformarlo en unidimensional
    // pasarlo al metodo notaMedia() y calcular la nota media de cada alumno
    public static void mediaNotaAlumno(Alumno[] a, Nota[][] n) {
        for (int i=0; i<n.length; i++) {
            Nota[] notas = new Nota[n.length];
            System.arraycopy(n[i], 0, notas, 0, notas.length);
            System.out.println("La nota media del alumno/a '" + a[i].getNombre() + "' es " + a[i].notaMedia(notas));
        }
    }

    // Calculamos la nota media de todos los alumnos a traves del método mediaTotal pasando el array bidimensional
    public static void mediaNotasTotal(Alumno[] a, Nota[][] n) {
        System.out.println("La media total de todos los alumnos es : " + a[0].mediaTotal(n));
    }

    // Calculamos la media de cada asignatura a traves del método mediaAsignatura() pasando el array bidimensinal
    // y un indice que indicara la columna de la cual deseamos obetener las notas
    public static void mediaNotaAsignaturas(Alumno[] a, Nota[][] n) {
        for (int i=0; i<asignaturas.length; i++)
            System.out.println("La media de " + asignaturas[i] + " es " + a[i].mediaAsignatura(n, i));
    }
}
