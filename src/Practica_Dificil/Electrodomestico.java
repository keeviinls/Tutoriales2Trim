package Practica_Dificil;

public abstract class Electrodomestico {

    //Atributos

    protected double precio_base = 100;
    protected double precio_final;
    protected Colores color=Colores.blanco;
    protected Consumos consumo_energetico=Consumos.F;
    protected double peso = 5;

    //Constructor por defecto

    public Electrodomestico(double precio_base, Colores color, Consumos consumo_energetico, double peso) {
        this.precio_base = precio_base;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }


    //Constructor con precio y peso. Resto por defecto

    public Electrodomestico(double precio_base, double peso) {
        this.precio_base = precio_base;
        this.peso = peso;
    }

    //Constructor con todos los atributos


    public Electrodomestico(double precio_base, double precio_final, Colores color, Consumos consumo_energetico, double peso) {
        this.precio_base = precio_base;
        this.precio_final = precio_final;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public double getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_final(double precio_final) {
        this.precio_final = precio_final;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public Consumos getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(Consumos consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public void comprobarConsumoEnergetico(char letra) throws ProductoIncorrecto {

        switch (letra){
            case 'A':
                System.out.println("El consumo es "+Consumos.A);
                System.out.println("El precio es mayor a 100 euros");
                consumo_energetico= Consumos.A;
                break;

            case 'B':
                System.out.println("El consumo es "+Consumos.B);
                System.out.println("El precio es entre 80 y 100 euros");
                consumo_energetico= Consumos.B;
                break;

            case 'C':
                System.out.println("El consumo es "+Consumos.C);
                System.out.println("El precio es entre 60 y 80 euros");
                consumo_energetico= Consumos.C;
                ;break;

            case 'D':
                System.out.println("El consumo es "+Consumos.C);
                 System.out.println("El precio es entre 50 y 60 euros");
                consumo_energetico= Consumos.D;
                ;break;

            case 'E':
                System.out.println("El consumo es "+Consumos.E);
                System.out.println("El precio es entre los 30 y 50 euros");
                consumo_energetico= Consumos.E;
                ;break;

            case 'F':
                System.out.println("El consumo es "+Consumos.F);
                System.out.println("El precio es entre los 10 y 30 euros");
                consumo_energetico= Consumos.F;
                ;break;

                default:
                    throw new ProductoIncorrecto("No es correcto la letra con precio");
        }

    }

    public void comprobarColor (String color) throws ProductoIncorrecto{
        switch (color){
            case "blanco":
                System.out.println("Ok tu color es "+Colores.blanco);
                color= String.valueOf(Colores.blanco);
                ;break;
            case "negro":
                System.out.println("Ok tu color es "+Colores.negro);
                color= String.valueOf(Colores.negro);
                break;
            case "rojo":
                System.out.println("Ok tu color es rojo "+Colores.rojo);
                color= String.valueOf(Colores.rojo);
                break;
            case "azul":
                System.out.println("Ok tu color es azul");
                color= String.valueOf(Colores.azul);
                break;
            case "gris":
                System.out.println("Ok tu color es gris");
                color= String.valueOf(Colores.gris);
                break;
            default:
                throw new ProductoIncorrecto("Este color no esta dentro de la gama");
        }


    }

    public void precioFinal(){

        switch (consumo_energetico){
                            case A :
                             precio_final = 100;
                                        if (peso > 0 && peso < 19){
                                            precio_final=precio_final+10;
                                        }

                                        else if (peso > 20 && peso < 49) {
                                            precio_final = precio_final+50;
                                        }

                                        else if (peso > 50 && peso < 79) {
                                            precio_final=precio_final+80;
                                        }
                                        else if (peso > 80) {
                                            precio_final = precio_final + 100;
                                        }

                            break;
                        case B:
                            precio_final = 80;
                            if (peso > 0 && peso < 19){
                                precio_final=precio_final+10;
                            }

                            else if (peso > 20 && peso < 49) {
                                precio_final = precio_final+50;
                            }

                            else if (peso > 50 && peso < 79) {
                                precio_final=precio_final+80;
                            }
                            else if (peso > 80) {
                                precio_final = precio_final + 100;
                            }
                            break;

                        case C:
                            precio_final = 60;
                            if (peso > 0 && peso < 19){
                                precio_final=precio_final+10;
                            }

                            else if (peso > 20 && peso < 49) {
                                precio_final = precio_final+50;
                            }

                            else if (peso > 50 && peso < 79) {
                                precio_final=precio_final+80;
                            }
                            else if (peso > 80) {
                                precio_final = precio_final + 100;
                            }
                            break;

                        case D:
                            precio_final = 50;
                            if (peso > 0 && peso < 19){
                                precio_final=precio_final+10;
                            }

                            else if (peso > 20 && peso < 49) {
                                precio_final = precio_final+50;
                            }

                            else if (peso > 50 && peso < 79) {
                                precio_final=precio_final+80;
                            }
                            else if (peso > 80) {
                                precio_final = precio_final + 100;
                            }
                            break;

                        case E:
                            precio_final = 30;
                            if (peso > 0 && peso < 19){
                                precio_final=precio_final+10;
                            }

                            else if (peso > 20 && peso < 49) {
                                precio_final = precio_final+50;
                            }

                            else if (peso > 50 && peso < 79) {
                                precio_final=precio_final+80;
                            }
                            else if (peso > 80) {
                                precio_final = precio_final + 100;
                            }
                            break;

                        case F:
                            precio_final = 10;
                            if (peso > 0 && peso < 19){
                                precio_final=precio_final+10;
                            }

                            else if (peso > 20 && peso < 49) {
                                precio_final = precio_final+50;
                            }

                            else if (peso > 50 && peso < 79) {
                                precio_final=precio_final+80;
                            }
                            else if (peso > 80) {
                                precio_final = precio_final + 100;
                            }
                            break;

            default:break;

        }



    /*   if (consumo_energetico == Consumos.E){
            precio_final= 30;
            if (peso > 50 && peso < 79){
                precio_final=precio_final+80;
            }
        }
        else if (consumo_energetico == Consumos.D) {
            precio_final = 50;
            if (peso > 50 && peso < 79){
                precio_final=precio_final+80;
            }
        }*/







    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio_base=" + precio_base +
                ", precio_final=" + precio_final +
                ", color=" + color +
                ", consumo_energetico=" + consumo_energetico +
                ", peso=" + peso +
                '}';
    }
}
