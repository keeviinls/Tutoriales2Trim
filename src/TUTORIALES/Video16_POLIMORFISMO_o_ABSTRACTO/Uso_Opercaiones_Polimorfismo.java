package TUTORIALES.Video16_POLIMORFISMO_o_ABSTRACTO;

import java.util.Scanner;

public class Uso_Opercaiones_Polimorfismo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*AQUI CAMBIA TODO, CUANDO USAMOS EL POLIMORFISMO
        NROMALMENTE PONEMOS   "NOMBRE CLASE PADRE" "NOMBRE OBJETO" = new "NOMBRE CLASE PADRE"
        PERO AHORA ES LO MISMO PERO EL ULTIMO "NOMBRE CLASE PADRE" LO SUSTITUIMOS POR LA CLASE HIJA QUE QUEREMOS USAR*/

        Operacion_Polimorfismo mensajeroSuma = new Hija_Suma_Polimorfismo();
        System.out.println("Dime el primer valor");
        mensajeroSuma.setValor1(sc.nextInt());
        System.out.println("Dime el segundo valor");
        mensajeroSuma.setValor2(sc.nextInt());
        mensajeroSuma.Operaciones();
        mensajeroSuma.MostrarResultado();

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

        Operacion_Polimorfismo mensajeroResta = new Hija_Resta_Polimorfismo();
        System.out.println("DIME EL PRIMER VALOR");
        mensajeroResta.setValor1(sc.nextInt());
        System.out.println("DIME EL SEGUNDO VALOR");
        mensajeroResta.setValor2(sc.nextInt());
        mensajeroResta.Operaciones();
        mensajeroResta.MostrarResultado();
    }
}
