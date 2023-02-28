package Desarrollo_De_Clases_4_1.Ejemplo_Persona;

import java.util.Date;

public class Persona {

    //atributos

    private String dni;
    public String nombre;
    private String apellidos;
    private Date fecha_nacimiento;

    //constructor

    public Persona (){
    }

    //metodos

    public void dormir(){
        System.out.println("DURMIENDO");
    }

    public void comer(){
        System.out.println("COMIENDO");
    }
}
