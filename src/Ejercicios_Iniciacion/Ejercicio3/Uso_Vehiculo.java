package Ejercicios_Iniciacion.Ejercicio3;

import Ejercicios_Iniciacion.Ejercicio2.Padre_Editorial;

public class Uso_Vehiculo {
    public static void main(String[] args) {
        Padre_Vehiculo vehiculo1 = new Padre_Vehiculo("Hyundai","i30",2013,"HVK150","blanco",6000);
        System.out.println(vehiculo1.imprimir());
    }
}
