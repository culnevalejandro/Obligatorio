package manejoArchivos;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author culne
 */
public class ArchivoLectura {
    
    private Scanner in;
    private String linea;
    
    public ArchivoLectura(String unNombre){
        try{
            this.in = new Scanner(Paths.get(unNombre));
        }catch(IOException e){
            System.out.println("Error");
            System.exit(0);
        }
    }
    
    public String leerLineaSiguiente(){
        return this.in.nextLine();   
    }
    
    public boolean hayMasLineas(){
        boolean hay = false;
        this.linea = null;
        
        if(this.in.hasNext()){
            this.linea = this.in.nextLine();
            hay = true;
        }
        
        return hay;
    }
    
    public String linea(){
        return this.linea;
    }
    
    public void cerrar(){
        this.in.close();
    }
}
