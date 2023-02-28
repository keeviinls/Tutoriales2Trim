package TUTORIALES.Video11.paquete2;
import TUTORIALES.Video11.paquete1.Atributos_Metodos;
public class ClaseJavaDos {
    public static void main(String[] args) {
        /*SI QUEREMOS CREAR OBJETO, QUE LO LLAMAMOS MENSAJERO, NO PODEMOS CREARLO
        * DEBEMOS IMPORTAR LA CLASE PQ ESTAN EN PAQUETES DISINTOS, PARA ELLO VEMOS QUE ARRIBA EN LA 2 LINEA LO IMPORTAMOS
        * YA LO TENEMOS IMPORTADO YA PODEMOS CREAR EL OBJETO*/

        Atributos_Metodos mensajero = new Atributos_Metodos();
        //VEMOS QUE NO NOS DETECTA LOS ATRIBUTOS DE "Atributos_Metodos"
        //YA QUE RECORDEMOS QUE SOLO PODEMOS ACCEDER LOS QUE ESTAN EN EL MISMO PAQUETE
        //mensajero.valor1;
    }
}
