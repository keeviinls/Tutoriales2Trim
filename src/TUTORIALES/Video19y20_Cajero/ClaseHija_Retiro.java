package TUTORIALES.Video19y20_Cajero;

public class ClaseHija_Retiro extends ClasePadre_Abstracta {
    @Override
    public void Transacciones(){
        System.out.println("Cuanto deseas retirar: ");
        Retiro();
        if (retiro <= getSaldo()){
            transacciones=getSaldo();
            setSaldo(transacciones-retiro);
            System.out.println("----------------------------------");
            System.out.println("Retiraste: " +retiro);
            System.out.println("Tu saldo actual es: "+getSaldo());
            System.out.println("----------------------------------");

        }
        else {
            System.out.println("Saldo Insuficiente");
        }
    }
}
