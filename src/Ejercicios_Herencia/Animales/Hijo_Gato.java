package Ejercicios_Herencia.Animales;

public class Hijo_Gato extends Padre_Animales {
    private String color=null;

    public Hijo_Gato(int edad, String color) {
        super(edad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void saySomething(){
        System.out.println("!miau¡");
    }


    public String showInfo() {
        return "Hijo_Gato{" +
                "color='" + color + '\'' +
                ", edad=" + edad +
                '}';
    }
}
