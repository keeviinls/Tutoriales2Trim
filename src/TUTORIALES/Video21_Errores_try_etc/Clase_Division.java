package TUTORIALES.Video21_Errores_try_etc;

import java.util.Scanner;

public class Clase_Division {
    public static void main(String[] args) {

        //EXCEPCIONES

        //try = intentar
        try{
            int valor1,valor2,resultado;
            Scanner sc = new Scanner(System.in);

            System.out.println("Dime el primer valor: ");
            valor1=sc.nextInt();
            System.out.println("Dime el segundo valor: ");
            valor2=sc.nextInt();

            resultado=valor1/valor2;

            System.out.println("Division es igual a: "+resultado);
        }

        //catch = capturar, siempre tiene que tener un objeto de la clase Exception, seguido de un nombre, normalmente se pone "e" o "er"
        catch (Exception e){
            //comportamiento cuando ocurre un error
            System.out.println("Error!!! "+e);

        }

        //FINALLY NO ES OBLIGATORIO
        //BASICAMENTE MUESTRA UN MENSAJE AL FINAL, YA SEA SI FALLA O FUNCIONA CORRECTAMENTE, EL MENSAJE LO MUESTRA SIEMPRE
        finally {
            System.out.println("Operacion concluida");
        }



    }
}
