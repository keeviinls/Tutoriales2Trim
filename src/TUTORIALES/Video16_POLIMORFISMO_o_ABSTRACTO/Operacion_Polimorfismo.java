package TUTORIALES.Video16_POLIMORFISMO_o_ABSTRACTO;

//AQUI DEBEMOS AÑADIR ABSTRACT PARA QUE EL METODO SEA ABSTRACTO
public abstract class Operacion_Polimorfismo {
    protected int valor1,valor2,resultado;

    /*PARA QUE EL METODO SEA ABSTACTO VEMOS QUE DEBEMOS AÑADIR ABSTACT
    AL AÑADIRLO VEMOS QUE EN LA LINEA DE ARRIBA NOS MARCARA UN ERROR
    PARA QUE PODAMOS USAR EL METODO ABSTRACTO, DEBE ESTAR EN UN CLASE ABSTRACTA, POR LO QUE AÑADIMOS "ABSTRACT" TAMBIEN EN LA LINEA DE ARRIBA*/

    //AHORA EL SIGUIENTE ERROR ES QUE EL METODO NO PUEDE LLEVAR LA LOGICA, PARA SOLUCIONARLO DEBEMOS BORRAR LAS LLAVES Y PONEMOS PUNTO Y COMA
    public abstract void Operaciones();

    public void MostrarResultado(){
        System.out.println(resultado);
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
}
