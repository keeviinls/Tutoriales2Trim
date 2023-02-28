package Ejercicios_Herencia.Empleados;

import java.util.Scanner;

public class Uso_Empleados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hija_Programador programador = new Hija_Programador("nifprom", "Alberto", "Gonzalez", 30, "proyecto1","PRIMERPROYECTO");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        programador.imputar_horas(30);
        programador.Informacion();
        programador.Conocer();

        System.out.println("------------------------------------------------------------------------------------------------------------------------------");


        Padre_Empleados Jefe_Proyecto = new Hija_JefeProyectos("nifJefe","Antonio", "Muñoz", 50, "Proyecto jefe");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        Jefe_Proyecto.imputar_horas(50);
        Jefe_Proyecto.Informacion();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");


        Padre_Empleados product_manager = new Hija_ProductManager("nifProduct", "Eren", "Yaeger", 200, "Proyecto Eren");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        product_manager.imputar_horas(200);
        product_manager.Informacion();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        Padre_Empleados directorTecnologia = new Hija_DirectorTecnologia("nifProduct", "Kevin", "Loayza", 100);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        directorTecnologia.imputar_horas(100);
        directorTecnologia.Informacion();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Dime el NIF del programador");
        String nif=sc.next();
        System.out.println("Dime el nombre del programador");
        String nombre_empleado = sc.next();
        System.out.println("Dime sus apellidos");
        String apellidos_empleado = sc.next();
        System.out.println("Dime sus horas trabajadas");
        int horas_trabajadas = sc.nextInt();
        System.out.println("Dime su lenguaje de programacion");
        String lenguajes_de_programacion = sc.next();

        System.out.println("Dime le nombre de su proyecto");
        String proyecto = sc.next();

        System.out.println("Dime un numero de horas para imputarlas");
        int horas=sc.nextInt();

        Hija_Programador programador2 = new Hija_Programador(nif,nombre_empleado,apellidos_empleado,horas_trabajadas,lenguajes_de_programacion,proyecto);
        programador2.setLenguajes_de_programacion(lenguajes_de_programacion);
        programador2.imputar_horas(horas);
        programador2.Conocer();
        programador2.Informacion();


    }
}
