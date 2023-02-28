package Ejercicios_Iniciacion.Ejercicio2;

import java.util.Scanner;

public class Uso_Libro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hija_Libro libro1 = new Hija_Libro(12345,"ANAYA",2020,"ISBN12301328312","Sao",20);
        libro1.imprimir();

        Hija_Libro libro2 = new Hija_Libro();
        System.out.println("Dime el codigo de la editorial");
        libro2.setCodigo(sc.nextInt());
        System.out.println("Dime el nombre de la editorial");
        libro2.setNombre(sc.next());
        System.out.println("Dime el año de la editorial");
        libro2.setAnio(sc.nextInt());
        System.out.println("Dime el isbn del libro");
        libro2.setIsbn(sc.next());
        System.out.println("Dime el titulo del libro");
        libro2.setTitulo(sc.next());
        System.out.println("Dime el precio del libro");
        libro2.setPrecio(sc.nextInt());

        libro2.imprimir();
    }

}
