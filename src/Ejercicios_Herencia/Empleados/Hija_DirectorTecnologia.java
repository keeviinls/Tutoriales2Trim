package Ejercicios_Herencia.Empleados;

public class Hija_DirectorTecnologia extends Padre_Empleados {

    public Hija_DirectorTecnologia(String nif, String nombre_empleado, String apellidos_empleado, int horas_trabajadas) {
        super(nif, nombre_empleado, apellidos_empleado, horas_trabajadas);
    }

    @Override
    public void Informacion() {
        System.out.println("Hija_ProductManager{" +
                "nif='" + nif + '\'' +
                ", nombre_empleado='" + nombre_empleado + '\'' +
                ", apellidos_empleado='" + apellidos_empleado + '\'' +
                ", horas_trabajadas=" + horas_trabajadas +
                '}');
    }
}
