package Ejercicios_Herencia.Vehiculos;

public abstract class Padre_Vehiculos {
    protected int km_realizados;
    protected String matricula;

    public Padre_Vehiculos(int km_realizados, String matricula) {
        this.km_realizados = km_realizados;
        this.matricula = matricula;
    }

    public int getKm_realizados() {
        return km_realizados;
    }

    public void setKm_realizados(int km_realizados) {
        this.km_realizados = km_realizados;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void run(int km_solicitados){
        int run;
        run=km_solicitados+km_realizados;
        System.out.println("El run completo es "+run);
    }

    public  abstract void ShowInfo();

}
