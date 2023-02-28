package TUTORIALES.Video6;

import java.util.Scanner;

public class Uso_Suma2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Suma_2 segundasuma = new Suma_2();
        System.out.println("Dime el valor del primer numero");
        segundasuma.setPrimer_valor(sc.nextInt());
        System.out.println("Dime el segundo valor");
        segundasuma.setSegundo_valor(sc.nextInt());
        segundasuma.resultado();
        System.out.println(segundasuma.imrpimir());
    }
}
