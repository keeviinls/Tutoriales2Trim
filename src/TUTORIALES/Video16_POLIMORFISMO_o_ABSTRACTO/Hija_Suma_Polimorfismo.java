package TUTORIALES.Video16_POLIMORFISMO_o_ABSTRACTO;

//AL AÑADIR EXTENDES OPERACION POLIMORFISMO VEMOS QUE NS MUESTRA UN ERROR.
//SE SOLICIONA HACIENDO LO DE OVERRIDE DE ABAJO
public class Hija_Suma_Polimorfismo extends Operacion_Polimorfismo{

    //AHORA SOBRESCRIRIBEMOS UN METODO, VAMOS A SOBRESCRIBIRLO DE UN METODO QUE YA EXISTE. PARA ELLO USAREMOS @Override

    @Override
    //VEMOS QUE DEBEMOS LLAMAR AL METODO DE LA MISMA MANERA QUE EL QUE YA ESTA CREADO, NO HACE FALTA PONER LO DE "ABSTRACT"
    public void Operaciones(){
        resultado=valor1+valor2;
    }
}