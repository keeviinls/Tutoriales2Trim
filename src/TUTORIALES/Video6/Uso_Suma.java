package TUTORIALES.Video6;

import java.util.Scanner;

public class Uso_Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer valor: ");
        int valorUno = sc.nextInt();
        System.out.println("Dime el segundo valor: ");
        int valorDos = sc.nextInt();

        Suma valores = new Suma (valorUno, valorDos);

    }
}
