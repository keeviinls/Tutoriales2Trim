package Practica_Dificil;

public class Television extends Electrodomestico {
    private int resolucion = 20;
    private boolean sincronizador_tdt = false;

    public Television(double precio_base, Colores color, Consumos consumo_energetico, double peso, int resolucion, boolean sincronizador_tdt) {
        super(precio_base, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.sincronizador_tdt = sincronizador_tdt;
    }

    public Television(double precio_base, double precio_final, Colores color, Consumos consumo_energetico, double peso, int resolucion, boolean sincronizador_tdt) {
        super(precio_base, precio_final, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.sincronizador_tdt = sincronizador_tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSincronizador_tdt() {
        return sincronizador_tdt;
    }

    public void setSincronizador_tdt(boolean sincronizador_tdt) {
        this.sincronizador_tdt = sincronizador_tdt;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion > 40){
            precio_final = precio_final + (precio_final*0.3);
            if (sincronizador_tdt == true){
                precio_final=precio_final+50;
            }
        }
        else if (resolucion < 40) {

            if (sincronizador_tdt == true){
                precio_final=precio_final+50;
            }
        }
        System.out.println("COLOR: "+color+"" +
                "CONSUMO: "+consumo_energetico+
                "PESO: "+peso+
                "RESOLUCION: "+resolucion+
                "TDT "+ sincronizador_tdt+
                "El precio total es de "+precio_final);
    }
}