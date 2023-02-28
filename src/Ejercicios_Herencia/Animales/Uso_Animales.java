package Ejercicios_Herencia.Animales;

import java.util.Scanner;

public class Uso_Animales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hijo_Perro perro = new Hijo_Perro(1,"husky");
        perro.saySomething();
        System.out.println(perro.showInfo());


        System.out.println("Dime la edad del perro");
         int edad = sc.nextInt();
        System.out.println("Dime la raza del perro");
         String raza = sc.next();
        Hijo_Perro perro2=new Hijo_Perro(edad,raza);
        perro2.saySomething();
        System.out.println(perro2.showInfo());






    }
}
