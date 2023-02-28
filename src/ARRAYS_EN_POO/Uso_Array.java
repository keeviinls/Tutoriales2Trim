package ARRAYS_EN_POO;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Uso_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        int matricula=0;
        char grupo= ' ';
        int grado=0;
        Padre_array a[] = new Padre_array[2];

        for (int i=0;i<a.length;i++){
            System.out.println("Ingresa tu nombre");
            nombre=sc.next();
            System.out.println("Ingresa tu matricula");
            matricula=sc.nextInt();
            System.out.println("Ingresa tu grupo");
            grupo = sc.next().charAt(0);
            System.out.println("Ingresa tu grado");
            grado=sc.nextInt();

            a[i]=new Padre_array(nombre,matricula,grupo,grado);

        }


        for (int i=0;i<a.length;i++){
            System.out.println(a[i].getNombre()+" "+a[i].getMatricula()+" "+a[i].getGrupo()+" "+a[i].getGrado());
        }

     /*   //ESTO RELLENARIA DEL DIBUJO, UNO DE LOS CUADRITOS PEQUEÑOS, POR EJEMPLO EL DEL INT
        a[0].setMatricula(12);
        a[0].setNombre("kevin");

        a[0].getMatricula();
        a[0].getNombre();*/
    }
}
