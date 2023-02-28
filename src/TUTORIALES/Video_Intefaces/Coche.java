package TUTORIALES.Video_Intefaces;

public class Coche implements Rueda{
    public Coche(){
    }
    public void avanzar(){
        System.out.println("El coche AVANZA");
    }

    public void detenerse(){
        System.out.println("El coche se DETIENE");
    }
}
