package Utilidades;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author PABLO
 */
public class Validaciones {
        
    public static boolean validar_url(String url, String reg_exp) 
    {         
        Pattern patron = Pattern.compile(reg_exp);
        Matcher m = patron.matcher(url);
        return m.find();
            
    }
    
}
