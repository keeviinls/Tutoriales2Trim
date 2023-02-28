package TUTORIALES.Video19y20_Cajero;

import clases.ClaseHija_Consulta;
import clases.ClaseHija_Deposito;
import clases.ClaseHija_Retiro;
import clases.ClasePadre_Abstracta;

import java.util.Scanner;

public class Uso_Cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //AQUI DA IGUAL CUAL CLASE HIJA SELECCIONEMOS, CON CUALQUIERA DE LAS 3 FUNCIONA BIEN
        //SELCCIONAMOS LA HIJA CONSULTA PQ LO UNICO QUE HACE ES MOSTRARNOS EL SALDO ACTUAL, NO EJECUTA OTRA FUNCION, POR LO QUE NO AFECTA EL FUNCIONAMIENTO DEL PROGRAMA
        //REPITO CON LAS 3 FUNCIONA, PERO YA QUE ESTA NO TOCA BASICAMENTE NADA, PUES USAMOS ESA.
        ClasePadre_Abstracta mesajero = new ClaseHija_Consulta();
        mesajero.setSaldo(sc.nextInt());
        mesajero.Operaciones();


    }

}
