package Ejercicios_Herencia.Vehiculos;

public class Hija_Camion extends Padre_Vehiculos{

    private int num_ejes;

    public Hija_Camion(int km_realizados, String matricula, int num_ejes) {
        super(km_realizados, matricula);
        this.num_ejes = num_ejes;
    }

    @Override
    public void ShowInfo(){
        System.out.println("Los kilometros realizados son "+km_realizados);
        System.out.println("La matricula es "+matricula);
        System.out.println("El numero de ejes es "+num_ejes);
    }
}
