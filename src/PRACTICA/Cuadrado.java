package PRACTICA;

public class Cuadrado extends Figura {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double area() throws Excepcion_Cuadrado {
        double resultado = 0;

        if (lado <= 0) {
            throw new Excepcion_Cuadrado("Un lado no puede ser igual o menor que 0");
        } else {
            resultado = lado * lado;
        }

        return resultado;
    }

    @Override

    public double volumen() throws Excepcion_Cuadrado {
        double resultado = 0;

        if (lado <= 0) {
            throw new Excepcion_Cuadrado("Un lado no puede ser igual o menor que 0");
        } else {
            resultado = Math.pow(lado, 3);

        }
        return resultado;

    }




}
