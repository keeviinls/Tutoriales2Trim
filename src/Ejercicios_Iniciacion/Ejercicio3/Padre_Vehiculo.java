package Ejercicios_Iniciacion.Ejercicio3;

public class Padre_Vehiculo {

    private String marca;
    private String referencia;
    private int modelo;
    private String placa;
    private String color;
    private int valor;

    private int velocidad = 0;
    private int marcha=0;

    public Padre_Vehiculo() {
    }

    public Padre_Vehiculo(String marca, String referencia, int modelo, String placa, String color, int valor) {
        this.marca = marca;
        this.referencia = referencia;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


    public String imprimir() {
        return "Padre_Vehiculo{" +
                "marca='" + marca + '\'' +
                ", referencia='" + referencia + '\'' +
                ", modelo=" + modelo +
                ", placa='" + placa + '\'' +
                ", color='" + color + '\'' +
                ", valor=" + valor +
                ", velocidad=" + velocidad +
                ", marcha=" + marcha +
                '}';
    }
}
