package Desarrollo_De_Clases_4_1.Ejemplo_Persona;

import java.util.Date;

public class Persona2 {
    //variable clase
    public static int numero=0;

    //atributos

    private String dni;
    private String nombre;
    private String apellidos;
    private Date fecha_nacimiento;

    //constructor

    public Persona2(){
        numero++;
    }

    //metodos getters & setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public  int getNumero(){
        return numero;
    }

    public int setNumero(){
        return numero--;
    }


    //metodos

    public void dormir(){
        System.out.println("DURMIENDO");
    }

    public void comer(){
        System.out.println("COMIENDO");
    }
}
