package Ejercicios_Herencia.Animales;

public  abstract class Padre_Animales {
    protected int edad=0;

    public Padre_Animales(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void saySomething();
}
