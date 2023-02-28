package Desarrollo_De_Clases_4_1.EjercicioPractico2;

import java.util.Scanner;

public class Padre_Viajero {

    private String dni;
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private String direccion;

    public static int contador;

    public Padre_Viajero() {
        contador++;
    }

    public Padre_Viajero(String dni, String nombre, String apellidos, String nacionalidad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        contador++;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void getInfo(Modo modo){
        String salto="";
        Scanner sc=new Scanner(System.in);
        switch (modo){

            case NORMAL :
                System.out.println("DNI: "+dni);
                System.out.println("NOMBRE: "+nombre);
                System.out.println("APELLIDOS: "+apellidos);
                System.out.println("NACIONALIDAD: "+nacionalidad);
                System.out.println("DIRECCION: "+nacionalidad);
            break;

            case PAUSADO:
                System.out.println("DNI" +dni);
                salto=sc.nextLine();
                System.out.println("NOMBRE" +nombre);
                salto=sc.nextLine();
                System.out.println("APELLIDOS"+ apellidos);
                salto=sc.nextLine();
                System.out.println("NACIONALIDAD"+ nacionalidad);
                salto=sc.nextLine();
                System.out.println("DIRECCION" +direccion);
                salto=sc.nextLine();
                break;

        }

    }
}
