package Ejercicios_Herencia.Empleados;

public class Hija_Programador extends Padre_Empleados {

    private String lenguajes_de_programacion;
    private String proyecto;
    public boolean conoce;

    public Hija_Programador(String nif, String nombre_empleado, String apellidos_empleado, int horas_trabajadas, String lenguajes_de_programacion, String proyecto) {
        super(nif, nombre_empleado, apellidos_empleado, horas_trabajadas);
        this.lenguajes_de_programacion = lenguajes_de_programacion;
        this.proyecto = proyecto;
    }

    public String getLenguajes_de_programacion() {
        return lenguajes_de_programacion;
    }

    public void setLenguajes_de_programacion(String lenguajes_de_programacion) {
        this.lenguajes_de_programacion = lenguajes_de_programacion;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public boolean isConoce() {
        return conoce;
    }

    public void setConoce(boolean conoce) {
        this.conoce = conoce;
    }

    public void Conocer(){

        if (lenguajes_de_programacion == "proyecto1" || lenguajes_de_programacion == "proyecto2"){
            conoce = true;
            System.out.println("Si conoce ese lenguaje");
        }
        else {
            conoce = false;
            System.out.println("No conoce ese lenguaje");
        }
    }

    @Override
    public void Informacion() {
        System.out.println("Hija_Programador{" +
                "lenguajes_de_programacion='" + lenguajes_de_programacion + '\'' +
                ", proyecto='" + proyecto + '\'' +
                ", nif='" + nif + '\'' +
                ", nombre_empleado='" + nombre_empleado + '\'' +
                ", apellidos_empleado='" + apellidos_empleado + '\'' +
                ", horas_trabajadas=" + horas_trabajadas +
                '}');

    }
}
