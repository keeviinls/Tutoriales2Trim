package TUTORIALES.Video8y9;

public class Lavadora {
    private int kilos;
    private int TipoRopa;
    private int llenadoCompleto;
    private int lavadoCompleto;
    private int secadoCompleto;

    public Lavadora() {
    }

    public Lavadora(int kilos, int tipoRopa) {
        //NO PONEMOS LOS OTROS DATOS PQ EL USUARIO NO TIENE PQ ACCEDERA  ELLOS,
        // SOLO NECESITAMOS DE ELLOS EL TIPO DE ROPA Y LOS KILO
        this.kilos = kilos;
        this.TipoRopa = tipoRopa;
    }

    public int getKilos() {
        return kilos;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    public int getTipoRopa() {
        return TipoRopa;
    }

    public void setTipoRopa(int tipoRopa) {
        this.TipoRopa = tipoRopa;
    }

    //LOS PONGO PRIVADOS PQ ESOS METODOS SOLO VAN A SERVIR PARA LA FUNCION INTERNA DE LA CLASE
    //NO NECESITA SER USADO POR OTRO PROGRAMADOR


    //USAMOS VOID PARA QUE NOS REGRESE UN RESULTADO
    //PONEMOS 12 KILOS DE EJEMPLO, IMAGINANDO Q LA LAVADORA SOPORTA HASTA 12 KILOS

    public void Llenado(){

                    if (kilos > 0 && kilos <=12){
                        llenadoCompleto = 1;
                        System.out.println("Llenando...");
                        System.out.println("Llenado completado con exito");
                    }

                    else {
                        System.out.println("LA CARGA DE ROPA ES MUY PESADA O HAS SELECCIONADO MENOS 0");
                    }


    }

    private void Lavado(){
        Llenado();
        if (llenadoCompleto == 1){

                    if (TipoRopa == 1) {
                        System.out.println("Ropa Blanca / Lavado Suave");
                        System.out.println("Lavando ...");
                        lavadoCompleto = 1;
                    } else if (TipoRopa == 2) {
                        System.out.println("Ropa Color / Lavado intenso");
                        System.out.println("Lavando ...");
                        lavadoCompleto = 1;
                    } else {
                        System.out.println("ERROR");
                    }

        }

    }

    private void Secado(){
        Lavado();
        if (lavadoCompleto == 1){
            System.out.println("Secando ...");
            secadoCompleto = 1;
        }
        else {
            System.out.println("Error al llegar al Secado");
        }

    }

    public void CicloFinalizado(){
        Secado();
        if (secadoCompleto == 1){
            System.out.println("El secado ha sido completado");
        }
        else {
            System.out.println("El secado no se completo");
        }
    }
}
