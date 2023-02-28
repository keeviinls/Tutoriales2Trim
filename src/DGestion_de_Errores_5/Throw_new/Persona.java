package DGestion_de_Errores_5.Throw_new;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        if (edad<=0)
        {
            throw new IllegalArgumentException("La edad debe ser mayor a 0");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

}
