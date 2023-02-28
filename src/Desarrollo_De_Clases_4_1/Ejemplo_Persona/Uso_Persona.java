package Desarrollo_De_Clases_4_1.Ejemplo_Persona;

import java.util.Scanner;

public class Uso_Persona {
    public static void main(String[] args) {
        //crear un objeto
        Persona person1 = new Persona();

        /*vamos a simular el comportamiento normal de un humano
        * entre las 00 hasta las 7 esta dormido, 12-15 comiendo y 20-22 comiendo */
        Scanner sc = new Scanner(System.in);
        System.out.println("Que hora es?");
        int hora= sc.nextInt();

        if (hora>=0 && hora <=7){
            person1.dormir();
        }
        else if ((hora>=12 && hora<=15) || (hora >=20 && hora <= 22)) {
            person1.comer();
        }
        else {
            System.out.println("CURRANDO");
        }
    }
}
