package alumno;

import java.util.Arrays;

public class Alumno {
    private String nombre;
    private Nota[] notas;

    public Alumno(String nombre, Nota[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nota[] getNotas() {
        return notas;
    }

    public void setNotas(Nota[] notas) {
        this.notas = notas;
    }

    // Recibe el array de notas y guardamos el primer valor del array para posteriormente ir comparando
    // mediante un bucle los demás valores del array y quedarnos con el maximo devolviendo un entero
    public int notaMaxima(Nota[] notas) {
        int maximo = notas[0].getNotaAsignatura();
            for (Nota n : notas) {
                if(n.getNotaAsignatura() >= maximo)
                maximo = n.getNotaAsignatura();
            }
            return maximo;
     }

     // Recibe un array de notas y la nota máxima, con un bucle recorre el array y compara con la nota
    // máxima y la guarda el nombre de la asignatura en un String, para devolverla al final del bucle
    public String nombreMaxAsignatura(Nota[] notas, int max) {
        String asignatura = "";
        for (Nota n : notas) {
            if (n.getNotaAsignatura() == max)
                asignatura = n.getAsignatura();
        }
        return asignatura;
}
    // Recibe un array de notas, recorre con un bucle y guarda la suma de todo el array
    // retorna la suma dividido entre el tamaño del array que seria la media de la nota
    public double notaMedia(Nota[] notas) {
        double suma = 0;
        for (Nota nota : notas) {
            suma += nota.getNotaAsignatura();
        }

        return suma/notas.length;
    }

    // Recibe un array bidimension y recorre todo el array sumando todas las notas
    // de los alumnos, retorna la suma divido entre el tamaño del array
    public double mediaTotal(Nota[][] n) {
        double suma = 0;
        for (Nota[] value : n) {
            for (Nota nota : value) suma += nota.getNotaAsignatura();
        }
        return suma/n.length;
    }

    // Recibe un array bidimensional y un constante (el nº de columna), al recorrerlo
    // is la fila coincide con la constante se guarda el valor, autosumando en cada coincidencia
    public double mediaAsignatura(Nota[][] n, int cont) {
        double suma=0;
        for (int i=0; i<n.length; i++) {
            for (int j=0; j<n[i].length; j++) {
                if (i==cont)
                    suma += n[j][cont].getNotaAsignatura();
            }
        }
        return suma/n.length;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}
