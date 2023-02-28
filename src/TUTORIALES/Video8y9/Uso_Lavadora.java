package TUTORIALES.Video8y9;
import java.util.Scanner;

public class Uso_Lavadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lavadora lavadora1 = new Lavadora();
        System.out.println("Dime la ropa es blanca o de color");
        lavadora1.setTipoRopa(sc.nextInt());
        System.out.println("Ok seleccionaste la ropa de tipo "+lavadora1.getTipoRopa());
        //lavadora1.setTipoRopa(2);


        System.out.println("Cuantos kilos de ropa");
        lavadora1.setKilos(sc.nextInt());
        //lavadora1.setKilos(5);
        lavadora1.CicloFinalizado();

    }
}
