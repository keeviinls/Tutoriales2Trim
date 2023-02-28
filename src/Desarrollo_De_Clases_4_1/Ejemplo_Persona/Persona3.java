package Desarrollo_De_Clases_4_1.Ejemplo_Persona;

import java.util.Date;

public class Persona3 {

    //atributos

    private String dni;
    private String nombre;
    private String apellidos;
    private String fecha_nacimiento;

    //constructor

    public Persona3(){

    }

    //Constructor parametrizado 1

    public Persona3(String dni, String nombre, String apellidos, String fecha_nacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    //Constructor parametrizado 2

    public Persona3(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }


    //metodos

    public void dormir(){
        System.out.println("DURMIENDO");
    }

    public void comer(){
        System.out.println("COMIENDO");
    }
}
