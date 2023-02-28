package Ejercicios_Herencia.Empleados;

public class Hija_ProductManager extends Padre_Empleados{
    private String proyecto;

    public Hija_ProductManager(String nif, String nombre_empleado, String apellidos_empleado, int horas_trabajadas, String proyecto) {
        super(nif, nombre_empleado, apellidos_empleado, horas_trabajadas);
        this.proyecto = proyecto;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public void Informacion() {
        System.out.println("Hija_ProductManager{" +
                "proyecto='" + proyecto + '\'' +
                ", nif='" + nif + '\'' +
                ", nombre_empleado='" + nombre_empleado + '\'' +
                ", apellidos_empleado='" + apellidos_empleado + '\'' +
                ", horas_trabajadas=" + horas_trabajadas +
                '}');
    }
}
