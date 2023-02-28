package TUTORIALES.Video15_HERENCIA;

import java.util.Scanner;

public class Uso_Operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hija_Suma mensajero = new Hija_Suma();
        System.out.println("Dime el primer valor: ");
        mensajero.setValor1(sc.nextInt());
        System.out.println("Dime el segundo valor: ");
        mensajero.setValor2(sc.nextInt());
        mensajero.sumar();
        mensajero.MostrarResultado();

        Hija_Restar mensajeroRestar = new Hija_Restar();
        System.out.println("Dime el primer valor: ");

        mensajeroRestar.setValor1(sc.nextInt());
        System.out.println("Dime el segundo valor: ");
        mensajeroRestar.setValor2(sc.nextInt());
        mensajeroRestar.restar();
        mensajeroRestar.MostrarResultado();

        //ESTO SON PRUEBAS MIAS
        Operaciones_Herencia mensajeroDeDios = new Operaciones_Herencia(5,3,10);

        System.out.println(mensajeroDeDios.getValor1());
        System.out.println(mensajeroDeDios.getValor2());



    }
}
