package Ejercicios_Excepciones.Ejercicio2;

import Desarrollo_De_Clases_4_1.EjercicioPractico2.Modo;

import java.util.Scanner;

public class Uso_Persona_MIA {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Dime tu nombre");
            String nombre= sc.next();
            System.out.println("Dime tu edad");
            int edad=sc.nextInt();
            System.out.println("Dime tu sexo");
            Sexo sexo = Sexo.valueOf(sc.next().toLowerCase());

            Persona_MIA persona_propia = new Persona_MIA(nombre,edad,sexo);
            persona_propia.metodo_edad(edad);
            persona_propia.metodo_sexo(sexo);

            System.out.println(persona_propia.toString());
        }

        catch (Edad_Incorrecta_MIA | Sexo_Incorrecto_MIA e){
            System.out.println(e.getMessage());

        }


        /*try {
            Persona_MIA persona1= new Persona_MIA("kevin",21,Sexo.hombre);
            persona1.metodo_edad(21);
            System.out.println(persona1.toStringdos());
        }
        catch (Edad_Incorrecta_MIA e){
            System.out.println(e.getMessage());
        }*/

    }
}
