package TUTORIALES.Video18AmbitosDeVariables;

public class Los_Tres_Ambitos {

    //EN LA ESTATICA NO ES NECESARIO CREAR UNA INSTANCIA PARA PODER ACCEDER A ELLAS
    static int variableEstatica=555;



    int variableGlobal;  //VEMOS QUE LA VARIABLE GLOBAL SI PODEMOS USARLA EN LOS 2 METODOS

    void miMetodo(int parametro){
        //LAS DE LOCAL SOLO PUEDEN SE USADAS DESDE DONDE HAN SIDO DECLARADAS, EN ESTE CASO SOLO SE USA EN EL METODO "miMetodo"
        int variableLocal = 21; //las locales siempre se deben inicializar

        System.out.println("El valor de variableLocal es "+variableLocal);
        System.out.println("El valor de parametro es "+parametro);

        System.out.println("La variableGlobal es "+variableGlobal);
    }

    public void Prueba(){
        String variableLocal = null; //VEMOS QUE NO DEJA PQ NO ESTA INICLAIZADA, PARA USARLO DEBEMOS INCIALIZARLO, ESTE CASO LO HICE CON "NULL"
        System.out.println("El valor de la variableLocal es "+variableLocal);
        System.out.println("La variableGlobal es "+variableGlobal);
    }
}
