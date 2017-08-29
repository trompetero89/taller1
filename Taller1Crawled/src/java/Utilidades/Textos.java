package Utilidades;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Textos 
{
    
    /**
     *
     * @param texto
     */
    public static void Escribir(String texto) 
    {
        try
        {
            if(texto.length()>0)
            {
                File archivo=new File("D:\\PABLO\\01_ESTUDIOS\\MAESTRIA\\1_BIG_DATA\\TALLER_1\\texto.txt");
                try (FileWriter escribir = new FileWriter(archivo,true)) {
                    escribir.write(texto+"\n");
                }
            }
        }
        catch(IOException e)        {
            System.out.println("Error al escribir");
        }
    }
   
}
