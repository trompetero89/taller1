package Controladores;
import static crawler.Crawler.Obtener_Referencias;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author PABLO
 */

@Controller//Se le indica a Spring que esta clase es un controlador
public class Control {
    
     @RequestMapping(value = "Principal.htm", method = RequestMethod.GET)     
     public ModelAndView Principal() throws IOException
     {  
        List<String> list = getListFacult();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("Principal");
        mav.addObject("lists",list);
        return mav;
    }
     
     public List<String> getListFacult() throws IOException {         
        List<String> list = new ArrayList<String>();
        Elements Referencias = Obtener_Referencias("http://www.uniandes.edu.co","a");             
        for (Element e: Referencias)
        {
            if(Utilidades.Validaciones.validar_url(e.absUrl("href"),"(?d)facultades")){
                if(Utilidades.Validaciones.validar_url(e.absUrl("href"),"(?d)lista-")){
                    Elements el = Obtener_Referencias(e.absUrl("href"),"span.field-content");
                    for (Element j: el){
                        if(j.text().length()>0){
                        list.add(j.text());
                        }
                    }
                }                    
            }
        }
	return list;
     }

}

        
    
//un comentario 
//otro comentario 