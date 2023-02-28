package PRACTICA;

import java.util.Scanner;

public class Uso_Cuadrado {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Forzar Excepcion
        try {
            Figura cuadrado1 = new Cuadrado(0);
            System.out.println("El area del cuadrado es "+cuadrado1.area()+"cm²");
            System.out.println("El volumen del cuadrado es "+cuadrado1.volumen()+ "cm³");
            cuadrado1.dibujar();
        }
        catch (Excepcion_Cuadrado e) {
            System.out.println(e.getMessage());;
        }
        /*----------------------------------Opcion correcta-----------------------------------
        /*
        try {
            Figura cuadrado2 = new Cuadrado(50);
            System.out.println("El area del cuadrado es "+cuadrado2.area()+"cm²");
            System.out.println("El volumen del cuadrado es "+cuadrado2.volumen()+ "cm³");
             cuadrado2.dibujar();

        }
        catch (Excepcion_Cuadrado e) {
            System.out.println(e.getMessage());;
        }*/

        /*----------------------------------Opcion a gusto del usuario------------------------------
        try {
            System.out.println("Dime el tamaño del lado");
            int lado=sc.nextInt();
            Figura cuadrado3= new Cuadrado(lado);
            System.out.println("El area del cuadrado es "+cuadrado3.area()+"cm²");
            System.out.println("El volumen del cuadrado es "+cuadrado3.volumen()+ "cm³");
            cuadrado3.dibujar();
        }
        catch (Excepcion_Cuadrado e){
            System.out.println(e.getMessage());
        }*/

    }
}
