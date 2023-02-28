package Ejercicios_Herencia.Animales;

public class Hijo_Perro extends Padre_Animales {
    private String raza=null;




    public Hijo_Perro(int edad, String raza) {
        super(edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    @Override
    public void saySomething(){
        System.out.println("!guau, guau¡");
    }


    public String showInfo() {
        return "Hijo_Perro{" +
                "raza='" + raza + '\'' +
                ", edad=" + edad +
                '}';
    }
}
