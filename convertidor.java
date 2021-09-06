package compiladores;
import java.util.Scanner;
/**
 *
 * @author reyna
 */
public class convertidor {
    /*Cree una función o método que reciba una oración y convierta 
     cada "i" en "wi" y "e" en "we", y agregue "owo" al final.*/

    public static void main(String[] args) {
        /*Cree una función o método que reciba una oración y convierta 
         cada "i" en "wi" y "e" en "we", y agregue "owo" al final.*/
        Scanner dato = new Scanner(System.in);
        convertidor obj = new convertidor();

        System.out.println("Ingrese oracion:");
        String oracion = dato.nextLine();

        obj.metodoConvertidor(oracion);

    }

    public void metodoConvertidor(String cadena) {

        String palabraAgregada = " owo";

        String oracion = cadena.replace("e", "we");
        String oracionFinal = oracion.replace("i", "wi").concat(palabraAgregada);

        System.out.println("\n" + oracionFinal + "\n");

    }
}
