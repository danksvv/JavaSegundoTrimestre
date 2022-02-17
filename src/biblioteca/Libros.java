package biblioteca;

public class Libros {
    private String ISBN;
    private String titulo;
    private boolean prestado;
    private Autor autor;

    public Libros(String ISBN, String titulo, Autor autor) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;      // redundante, el valor primitivo de boolean es false
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

}
