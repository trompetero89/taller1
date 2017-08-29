package crawler;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author PABLO
 */
public class Crawler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

            Elements Referencias = Obtener_Referencias("http://www.uniandes.edu.co","a"); 
            Crear_Semilla(Referencias);          
    }
    
    //Retorna en forma de string el HMTL de una url enviada
    public static String Obtener_HTML (String url_procesar) throws IOException
    {      
        Document doc = Jsoup.connect(url_procesar).get();
        String html_element = doc.html(); 
        return html_element;
       
        
    }
    
     //Retorna las paginas refereridas en un objeto de tipo elemento
    public static Elements Obtener_Referencias (String url_procesar, String tag) throws IOException
    {        
        Document doc = Jsoup.connect(url_procesar).get();
        Elements elementos = doc.select(tag);
        return elementos;
    }
    
    public static void Crear_Semilla (Elements Referencias) throws IOException
    {        
        
    }

}    

