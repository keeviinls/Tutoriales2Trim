package Practica_Dificil;

public class Lavadora extends Electrodomestico{
    private double carga=5;

    public Lavadora(double precio_base, Colores color, Consumos consumo_energetico, double peso, double carga) {
        super(precio_base, color, consumo_energetico, peso);
        this.carga = carga;
    }

    public Lavadora(double precio_base, double precio_final, Colores color, Consumos consumo_energetico, double peso, double carga) {
        super(precio_base, precio_final, color, consumo_energetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();

        if (carga > 30){
            precio_final=precio_final+50;
        }

        System.out.println("COLOR: "+color+"" +
                "CONSUMO: "+consumo_energetico+
                "PESO: "+peso+
                "CARGA: "+carga+
                "El precio total es de "+precio_final);

    }
}
