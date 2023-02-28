package TUTORIALES.Video17_SUPER;

public class Hija extends Padre {

    //VAMOS A CREAR EL MISMO METODO, PERO NO LO VAMOS A HEREDAR, BASICAMENTE SON 2 DIFERENTES PERO CON EL MISMO NOMBRE
    //VEMOS QUE NOS DETECTA QUE ESTE METODO YA EXISTE EN LA CLASE PADRE

    public void Saludar(){
        //SI USAMOS SUPER, SELECCIONARA EL SALUDAR DE LA CLASE PADRE
        super.Saludar();
        System.out.println("Hola soy la hija");

    }
}
