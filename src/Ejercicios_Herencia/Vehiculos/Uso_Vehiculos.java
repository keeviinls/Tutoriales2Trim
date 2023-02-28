package Ejercicios_Herencia.Vehiculos;

import java.util.Scanner;

public class Uso_Vehiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Padre_Vehiculos camion = new Hija_Camion(20,"HBA 302", 15);
        camion.run(1000);
        camion.ShowInfo();

        System.out.println("Dime los kilometros realizados");
        int km_realizados = sc.nextInt();
        System.out.println("Dime la matricula ");
        String matricula=sc.next();
        System.out.println("Dime el numero de ejes");
        int num_ejes=sc.nextInt();
        System.out.println("Dime los kilometros solicitados para calcular el RUN");
        int km_solicitados=sc.nextInt();

        Padre_Vehiculos camion2 = new Hija_Camion(km_realizados,matricula,num_ejes);
        camion2.run(km_solicitados);
        camion2.ShowInfo();
    }
}
