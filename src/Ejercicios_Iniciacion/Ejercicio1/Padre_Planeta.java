package Ejercicios_Iniciacion.Ejercicio1;

public class Padre_Planeta {

    protected String nombre = null;
    protected int satelites = 0;
    protected double masa = 0;
    protected double volumen = 0;
    protected int diametro = 0;
    protected int distancia_sol = 0;
    protected Tipos_Planeta tipos_planeta;
    protected boolean observable = false;

    protected double densidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSatelites() {
        return satelites;
    }

    public void setSatelites(int satelites) {
        this.satelites = satelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDistancia_sol() {
        return distancia_sol;
    }

    public void setDistancia_sol(int distancia_sol) {
        this.distancia_sol = distancia_sol;
    }

    public Tipos_Planeta getTipos_planeta() {
        return tipos_planeta;
    }

    public void setTipos_planeta(Tipos_Planeta tipos_planeta) {
        this.tipos_planeta = tipos_planeta;
    }

    public boolean isObservable() {
        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }

    public Padre_Planeta() {
    }

    public Padre_Planeta(String nombre, int satelites, double masa, double volumen, int diametro, int distancia_sol, Tipos_Planeta tipos_planeta, boolean observable) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distancia_sol = distancia_sol;
        this.tipos_planeta = tipos_planeta;
        this.observable = observable;
    }


    public String imprimir() {
        return "Padre_Planeta{" +
                "nombre='" + nombre + '\'' +
                ", satelites=" + satelites +
                ", masa=" + masa +
                ", volumen=" + volumen +
                ", diametro=" + diametro +
                ", distancia_sol=" + distancia_sol +
                ", tipos_planeta=" + tipos_planeta +
                ", observable=" + observable +
                '}';
    }
    public void calcular_densidad(){

        densidad=masa/volumen;
        System.out.println("La densidad del planeta es "+densidad);
    }

    public boolean esPlanetaExterior() {
        boolean esExterior=false;
        float limite = (float) (149597870 * 3.4);
        if (distancia_sol>limite){
            esExterior= true;
        }
        return esExterior;
    }
}
