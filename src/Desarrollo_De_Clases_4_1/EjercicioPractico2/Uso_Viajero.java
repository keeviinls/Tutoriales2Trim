package Desarrollo_De_Clases_4_1.EjercicioPractico2;

import TUTORIALES.Video17_SUPER.Padre;

import java.util.Scanner;

public class Uso_Viajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzcame su dni");
        String dni=sc.nextLine();
        System.out.println("Introduzcame su nombre");
        String nombre=sc.nextLine();
        System.out.println("Introduzcame su apellido");
        String apellido=sc.nextLine();
        System.out.println("Introduzcame su nacionalidad");
        String nacionalidad=sc.nextLine();
        System.out.println("Introduzcame su direccion");
        String direccion=sc.nextLine();

        Padre_Viajero viajero1 = new Padre_Viajero(dni, nombre, apellido, nacionalidad, direccion);

        System.out.println("QUE FORMATO QUIERE VER DEL VIAJERO1?");
        Modo modo = Modo.valueOf(sc.next().toUpperCase());

        viajero1.getInfo(modo);
    }
}
