package Desarrollo_De_Clases_4_1.Ejemplo_Persona;

public class Uso_Persona2 {
    public static void main(String[] args) {
        //crear un objeto


        System.out.println("Veamos numero de personas creadas hasta el momento = "+Persona2.numero);
        Persona2 persona = new Persona2();
        persona.setNombre("Kevin");
        System.out.println("El nombre de la primera persona es "+persona.getNombre());
        System.out.println("Ahora hay  "+Persona2.numero+ " personas");


    }
}
