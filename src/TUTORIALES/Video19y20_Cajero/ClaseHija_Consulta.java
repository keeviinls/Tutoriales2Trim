package TUTORIALES.Video19y20_Cajero;

public class ClaseHija_Consulta extends ClasePadre_Abstracta{


    @Override
    public void Transacciones(){
        System.out.println("----------------------------------");
        System.out.println("Tu saldo actual es :" +getSaldo());
        System.out.println("----------------------------------");

    }
}
