package Ejercicios_Excepciones.Ejercicio1_MIO;

public class Padre_Cuenta {
    private String titular;
    private int numero_de_cuenta;
    private double saldo;

    public Padre_Cuenta() {
    }

    public Padre_Cuenta(String titular, int numero_de_cuenta, double saldo) {
        this.titular = titular;
        this.numero_de_cuenta = numero_de_cuenta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero_de_cuenta() {
        return numero_de_cuenta;
    }

    public void setNumero_de_cuenta(int numero_de_cuenta) {
        this.numero_de_cuenta = numero_de_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "La cuenta con numero "+numero_de_cuenta+ " tiene como titular a "+titular+" con un saldo disponible de "+ saldo;
    }

    public void ingresar (double cantidad) throws Cantidad_Incorrecta_MIO{
        if (cantidad < 0){
            throw new Cantidad_Incorrecta_MIO("no se puede ingresar una cantidad negativa");
        }

        else {
            saldo=saldo+cantidad;
        }
    }

    public void retirar (double cantidad) throws Cantidad_Incorrecta_MIO{
        if (cantidad > saldo){
            throw new Cantidad_Incorrecta_MIO("no se puede retirar una cantidad negativa, te falta saldo");
        }

        else {
            saldo=saldo-cantidad;
        }
    }
}
