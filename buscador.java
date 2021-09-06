package compiladores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author reyna
 */
public class buscador {
    
   public static boolean busca_3a(String cadena){
        String expR = "(.)\\1";
        Pattern pat= Pattern.compile(expR, Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher(cadena);
        return mat.find();
    }
   
    public static void main(String[] args) {
        
        System.out.println(busca_3a("loop"));
        System.out.println(busca_3a("yummy"));
        System.out.println(busca_3a("orange"));
        System.out.println(busca_3a("munchkin"));
    }
    
   
}
