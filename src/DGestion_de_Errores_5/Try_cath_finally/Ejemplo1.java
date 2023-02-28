package DGestion_de_Errores_5.Try_cath_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Dime el dividendo");
            int dividendo=sc.nextInt();
            System.out.println("Dime el divisor");
            int divisor=sc.nextInt();
            System.out.println("El cociente es "+dividendo/divisor);
        }

        /*Este es para cuando pide numeros y el usuario mete letras*/
        catch (InputMismatchException e){
            System.out.println("No ha introducido un valor acorde al tipo de datos");
        }

        /*Para cuando se ejecuta operacion aritematica invalida, por ejemplo metemos 0*/
        catch (ArithmeticException e){
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
            System.out.println("Has introducido un 0");
        }
    }
}
