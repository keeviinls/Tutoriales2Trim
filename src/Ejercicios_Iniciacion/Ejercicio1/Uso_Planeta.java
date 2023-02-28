package Ejercicios_Iniciacion.Ejercicio1;

import java.util.Scanner;

public class Uso_Planeta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Padre_Planeta planeta1 = new Padre_Planeta("Tierra",5,10.10,20.20,100,900000,Tipos_Planeta.GASEOSO,true);
        planeta1.calcular_densidad();
        System.out.println(planeta1.imprimir());

        Padre_Planeta planeta2 = new Padre_Planeta();

        System.out.println("Dime el nombre del planeta");
        planeta2.setNombre(sc.nextLine());
        System.out.println("Dime la cantidad de satelites");
        planeta2.setSatelites(sc.nextInt());
        System.out.println("Dime la cantidad de masa");
        planeta2.setMasa(sc.nextDouble());
        System.out.println("Dime la cantidad de volumen");
        planeta2.setVolumen(sc.nextDouble());
        System.out.println("Dime el tamaño del diametro");
        planeta2.setDiametro(sc.nextInt());
        System.out.println("Dime la distancia que hay con el sol");
        planeta2.setDistancia_sol(sc.nextInt());
        System.out.println("Dime que tipo de planeta es");
        planeta2.setTipos_planeta(Tipos_Planeta.valueOf(sc.next().toUpperCase()));
        System.out.println("Dime si es observable o no");
        planeta2.setObservable(sc.hasNext());
        planeta2.calcular_densidad();
        System.out.println(planeta2.imprimir());
        planeta2.esPlanetaExterior();

    }
}
