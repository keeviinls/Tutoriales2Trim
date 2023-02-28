package Ejercicios_Iniciacion.Ejercicio2;

public class Padre_Editorial {
    protected int codigo;
    protected String nombre;
    protected int anio;

    public Padre_Editorial() {
        this.codigo=0;
        this.nombre=null;
        this.anio=0;
    }

    public Padre_Editorial(int codigo, String nombre, int anio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


}
