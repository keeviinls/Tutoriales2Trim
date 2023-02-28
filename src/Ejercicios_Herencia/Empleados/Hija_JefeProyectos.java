package Ejercicios_Herencia.Empleados;

public class Hija_JefeProyectos extends Padre_Empleados{

    private String proyectos;

    public Hija_JefeProyectos(String nif, String nombre_empleado, String apellidos_empleado, int horas_trabajadas, String proyecto) {
        super(nif, nombre_empleado, apellidos_empleado, horas_trabajadas);
        this.proyectos = proyectos;
    }

    public String getProyectos() {
        return proyectos;
    }

    public void setProyectos(String proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public void Informacion() {
        System.out.println("Hija_JefeProyectos{" +
                ", proyectos='" + proyectos + '\'' +
                ", nif='" + nif + '\'' +
                ", nombre_empleado='" + nombre_empleado + '\'' +
                ", apellidos_empleado='" + apellidos_empleado + '\'' +
                ", horas_trabajadas=" + horas_trabajadas +
                '}');

    }
}

