package TUTORIALES.Video19y20_Cajero;

import java.util.Scanner;

public abstract class ClasePadre_Abstracta {
    protected int transacciones, retiro, deposito;
    private static int saldo;


    Scanner sc = new Scanner(System.in);

    public void Operaciones(){

        int bandera = 0;
        int seleccion = 0;

        do {
            do {
                System.out.println("Porfavor seleccione una opcion:");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Deposito de efectivo");
                System.out.println("    4. Salir.");
                seleccion = sc.nextInt();

                if (seleccion >= 1 && seleccion <=4){
                    bandera = 1;
                }

                else {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Opcion no disponible, vuelva a intentarlo porfavor");
                    System.out.println("---------------------------------------------------");

                }
            }while (bandera == 0);

            if (seleccion == 1){
                ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
                mensajero.Transacciones();
            }

            else if (seleccion == 2) {
                ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
                mensajero.Transacciones();
            }
            else if (seleccion == 3) {
                ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
                mensajero.Transacciones();
            }
            else if (seleccion == 4) {
                System.out.println("------------------------");
                System.out.println("Gracias, vuelva pronto");
                System.out.println("------------------------");
                bandera = 2;
            }
        }while (bandera !=2);
    }

    //METODO PARA SOLICITAR CANTIDAD DE RETIRO

    public void Retiro(){
        retiro = sc.nextInt();
    }

    //METODO PARA SOLICITAR DEPOSITO

    public void Deposito(){
        deposito=sc.nextInt();
    }

    //METODO ABSTRACTO PARA LAS TRANSACCIONES
    public abstract void Transacciones();

    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        ClasePadre_Abstracta.saldo = saldo;
    }
}
