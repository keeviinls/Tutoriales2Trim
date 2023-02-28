package PRACTICA;

public abstract class Figura implements Acciones {

    public abstract double volumen() throws Excepcion_Cuadrado;

    public abstract double area() throws Excepcion_Cuadrado;

    public void dibujar() {
        System.out.println(" ----------- ");
        System.out.println("|           |");
        System.out.println("|           |");
        System.out.println("|           |");
        System.out.println(" ----------- ");
    }
}
