package TUTORIALES.Video15_HERENCIA;

public class Operaciones_Herencia {
    protected int valor1, valor2, resultado;

    public Operaciones_Herencia() {
    }

    //ESTO SON PRUEBAS MIAS

    public Operaciones_Herencia(int valor1, int valor2, int resultado) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = resultado;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public void MostrarResultado(){
        System.out.println(resultado);
    }
}
