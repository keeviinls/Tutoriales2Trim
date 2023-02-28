package TUTORIALES.Video6;

public class Suma_2 {
    private int primer_valor;
    private int segundo_valor;
    private int resultado;

    public Suma_2() {
    }

    public Suma_2(int primer_valor, int segundo_valor, int resultado) {
        this.primer_valor = primer_valor;
        this.segundo_valor = segundo_valor;
        this.resultado = resultado;
    }

    public void setPrimer_valor(int primer_valor) {
        this.primer_valor = primer_valor;
    }


    public void setSegundo_valor(int segundo_valor) {
        this.segundo_valor = segundo_valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void resultado(){
        resultado=primer_valor+segundo_valor;
        System.out.println("la suma es "+resultado);
    }

    public String imrpimir() {
        return "Suma_2{" +
                "primer_valor=" + primer_valor +
                ", segundo_valor=" + segundo_valor +
                ", resultado=" + resultado +
                '}';
    }
}
