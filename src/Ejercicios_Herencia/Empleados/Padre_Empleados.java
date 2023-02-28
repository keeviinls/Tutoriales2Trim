package Ejercicios_Herencia.Empleados;

public abstract class Padre_Empleados {

    protected String nif;
    protected String nombre_empleado;
    protected String apellidos_empleado;
    protected int horas_trabajadas;

    public Padre_Empleados(String nif, String nombre_empleado, String apellidos_empleado, int horas_trabajadas) {
        this.nif = nif;
        this.nombre_empleado = nombre_empleado;
        this.apellidos_empleado = apellidos_empleado;
        this.horas_trabajadas = horas_trabajadas;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getApellidos_empleado() {
        return apellidos_empleado;
    }

    public void setApellidos_empleado(String apellidos_empleado) {
        this.apellidos_empleado = apellidos_empleado;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public void imputar_horas(int horas){
        horas=horas+horas_trabajadas;
        System.out.println("Imputar horas es "+horas);
    }

    public abstract void Informacion();

}
