package TUTORIALES.Video_Intefaces;

public class Bicicleta implements Rueda{

    public Bicicleta(){

    }

    public void avanzar(){
        System.out.println("La bicicleta AVANZA");
    }

    public void detenerse(){
        System.out.println("La biclite se DETIENE");
    }
}
