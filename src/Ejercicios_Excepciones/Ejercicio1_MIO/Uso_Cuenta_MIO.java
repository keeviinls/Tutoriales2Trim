package Ejercicios_Excepciones.Ejercicio1_MIO;

import java.util.Scanner;

public class Uso_Cuenta_MIO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //NOTA SE PUEDE HACER CON TRY Y CATCH, PERO TAMBIEN SE PUEDE HACER SI ELLOS Y BASTARIA CON AGREGAR throws CANTIDADINCORRECTAMIO en la parte del main
        //osea seguido de "public static void main(String[] args)"

        try {
            System.out.println("Dime tu nombre");
            String titular = sc.next();
            System.out.println("Dime tu numero de cuenta");
            int num_cuenta = sc.nextInt();
            System.out.println("Dime tu saldo");
            double saldo=sc.nextDouble();
            Padre_Cuenta cuenta_mia2 = new Padre_Cuenta(titular,num_cuenta,saldo);

            System.out.println(cuenta_mia2.toString());
            System.out.println("Dime cuanto quieres ingresar");
            double cantidad = sc.nextDouble();
            cuenta_mia2.ingresar(cantidad);
            System.out.println(cuenta_mia2.toString());
            System.out.println("Dime cuanto deseas retirar");
            cantidad = sc.nextDouble();
            cuenta_mia2.retirar(cantidad);

            System.out.println(cuenta_mia2.toString());
        }
        catch (Cantidad_Incorrecta_MIO e){
            System.out.println(e.getMessage());
        }

        /*  Padre_Cuenta cuenta_mia = new Padre_Cuenta("kevin",12345678,1200);
            System.out.println(cuenta_mia.toString());
            cuenta_mia.ingresar(0);
            System.out.println(cuenta_mia.toString());
            cuenta_mia.retirar(6000);
            System.out.println(cuenta_mia.toString());*/

    }
}
