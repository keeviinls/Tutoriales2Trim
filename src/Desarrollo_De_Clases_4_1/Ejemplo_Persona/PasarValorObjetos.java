package Desarrollo_De_Clases_4_1.Ejemplo_Persona;

public class PasarValorObjetos {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre="kevin";
        System.out.println(p1.nombre);
        transformarnombre(p1);
        System.out.println("despues de pasarle el metodo Transformar nombre...");
        System.out.println("El nombre es "+p1.nombre);



    }

    static void transformarnombre (Persona p){
        p.nombre = "Zoro";
    }
}
