package DGestion_de_Errores_5.Creacion_Clase_Excepcion;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) throws EdadErronea{
        if (edad<=0)
        {
            throw new EdadErronea("La edad debe ser mayor a 0");
        }
        this.nombre = nombre;
        this.edad = edad;
    }
}
