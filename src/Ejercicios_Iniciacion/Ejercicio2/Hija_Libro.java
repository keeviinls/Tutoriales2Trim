package Ejercicios_Iniciacion.Ejercicio2;

public class Hija_Libro extends Padre_Editorial{
    private String isbn;
    private String titulo;
    private int precio;

    public Hija_Libro() {
    }

    public Hija_Libro(int codigo, String nombre, int anio, String isbn, String titulo, int precio) {
        super(codigo, nombre, anio);
        this.isbn = isbn;
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public void imprimir() {
        System.out.println( "Hija_Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", anio=" + anio +
                '}');

    }
}
