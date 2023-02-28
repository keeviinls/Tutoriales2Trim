package Ejercicios_Excepciones.Ejercicio2;

public class Persona_MIA {
    private String nombre = "";
    private int edad=0;
    private String dni;
    private Sexo sexo = Sexo.hombre;
    private int peso = 0;
    private int altura= 0;

    public Persona_MIA() {
    }

    public Persona_MIA(String nombre, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona_MIA(String nombre, int edad, String dni, Sexo sexo, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }


    public String toString() {
        return " te llamas "+nombre +
                " tienes "+edad+ " años de edad"+
                " tu DNI es "+dni+
                " tu sexo es "+sexo+
                " tu peso es "+peso+
                " tu altura es "+altura;
    }

    public String toStringdos() {
        return " te llamas "+nombre +
                " tienes "+edad+ " años de edad"+
                " tu sexo es "+sexo;

    }

    public void metodo_edad(int edad) throws Edad_Incorrecta_MIA{
        if (edad <= 0){
            throw new Edad_Incorrecta_MIA("una persona no puede tener una edad de recien nacido");
        }
        else {
            System.out.println("Ok, entonces tu edad es de "+edad+ " años");
        }
    }

    public void metodo_sexo(Sexo sexo) throws Sexo_Incorrecto_MIA{

        if (sexo == Sexo.hombre){
            System.out.println("Ok tu sexo es hombre");
        }
        else if (sexo == Sexo.mujer) {
            System.out.println("Ok tu sexo es mujer");
        }

        else {
            throw new Sexo_Incorrecto_MIA("seleccionaste un sexo no disponible");
        }


       /*switch (sexo){
          case hombre :
          System.out.println("Ok tu sexo es hombre");break;
          case mujer:
              System.out.println("Ok tu sexo es mujer");break;
          default:
              throw new Sexo_Incorrecto_MIA("seleccionaste un sexo no disponible");
      }*/


    }
}
