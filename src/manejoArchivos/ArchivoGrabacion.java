package manejoArchivos;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

/**
 *
 * @author culne
 */
public class ArchivoGrabacion {
    
    private Formatter out;
    
    public ArchivoGrabacion(String unNombre){
        try{
            out = new Formatter(unNombre);
        }catch(FileNotFoundException e){
            System.out.println("Error al crear");
            System.exit(1);
        }
    }
    
    public ArchivoGrabacion(String unNombre, boolean upd){
        try{
            FileWriter f = new FileWriter(unNombre, upd);
            this.out = new Formatter(f);
        }catch (IOException e){
            System.out.println("No se puede crear/actualizar");
            System.exit(1);
        }
    }
    
    public void grabarLinea(String unTexto){
        this.out.format("%s%n", unTexto);
    }
    
    public void cerrar(){
        this.out.close();
    }
}
