package Practica_Dificil;

import java.util.Arrays;
import java.util.Scanner;

public class UsoElectrodomesticos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int contador2=0;
        String [] array = new String[5];
        for (int i=0;i<array.length;i++){
            System.out.println("Dime que es para el valor "+i);
            String nombre = sc.next();
            array[i]=nombre;
            switch (array[i]){
                case "television": contador++;break;
                case "lavadora": contador2++;break;
                default:break;}
        }
        System.out.println("TELEVISIONES :"+contador+
                "LAVADORAS: "+contador2);
        System.out.println(Arrays.toString(array));
        Television tev1= new Television(100,Colores.rojo,Consumos.E,10,50,true);
        tev1.precioFinal();
        tev1.precio_final=tev1.precio_final*contador;
        System.out.println("Has seleccionado "+contador+ " televisiones, asi que el precio final es  "+tev1.precio_final);


        Lavadora lav1 = new Lavadora(100,Colores.rojo,Consumos.E,10,40);
        lav1.precioFinal();
        lav1.precio_final=lav1.precio_final*contador2;
        System.out.println("Has seleccionado "+contador2+ " lavadoras, asi que el precio final es  "+lav1.precio_final);

        System.out.println("El coste total de todos los electrodomesticos es:");
        System.out.println(lav1.precio_final+tev1.precio_final);








        //LAVADORA
     /*   System.out.println("Dime un color");
        Colores color = Colores.valueOf(sc.next().toLowerCase());
        System.out.println("Dime el consumo");
        char letra = sc.next().toUpperCase().charAt(0);
        Consumos consumo_energetico = Consumos.valueOf(String.valueOf(letra));

       System.out.println("Dime el peso");
        double peso = sc.nextDouble();
*/
      /*  System.out.println("Dime la resolucion");
        int resolucion = sc.nextInt();
        System.out.println("Dime si tiene sincronizador tdt");
        boolean sincronizador_tdt = Boolean.parseBoolean(sc.next());

        Television tev1= new Television(100,Colores.rojo,Consumos.E,10,resolucion,sincronizador_tdt);
        tev1.precioFinal();
        /*System.out.println("Dime la carga ");
        double carga = sc.nextDouble();
        Lavadora lav1 = new Lavadora(100,color,consumo_energetico,peso,carga);
        lav1.precioFinal();*/

        /*
        try {
            System.out.println("Dime el color que deseas ");
            Colores color = Colores.valueOf(sc.next().toLowerCase());
            System.out.println("Dime el consumo");
            char letra = sc.next().toUpperCase().charAt(0);
            Consumos consumo_energetico = Consumos.valueOf(String.valueOf(letra));
            System.out.println("Dime el peso");
            double peso = sc.nextDouble();
            Electrodomestico elec1 = new Electrodomestico(100,color,consumo_energetico,peso);

            elec1.comprobarColor(String.valueOf(color));
            elec1.comprobarConsumoEnergetico(letra);
            elec1.precioFinal();

            System.out.println(elec1.toString());
        }
        catch (ProductoIncorrecto e){
            System.out.println(e.getMessage());
        }*/


    }
}
