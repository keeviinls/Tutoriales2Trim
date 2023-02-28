package DGestion_de_Errores_5.Creacion_Clase_Excepcion;

public class EdadErronea extends Exception{
    EdadErronea(String mensaje){
        super(mensaje);
    }
}
