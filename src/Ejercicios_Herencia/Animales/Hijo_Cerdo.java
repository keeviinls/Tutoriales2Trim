package Ejercicios_Herencia.Animales;

public class Hijo_Cerdo extends Padre_Animales {

    private String alimentacion = null;

    public Hijo_Cerdo(int edad, String alimentacion) {
        super(edad);
        this.alimentacion = alimentacion;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public void saySomething(){
        System.out.println("!oink, oink¡");
    }

    public String showInfo() {
        return "Hijo_Cerdo{" +
                "alimentacion='" + alimentacion + '\'' +
                ", edad=" + edad +
                '}';
    }
}
