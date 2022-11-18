package inicio;

import interfaz.*;
import dominio.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author culne
 */
public class main {

    public static void main(String[] args) {
        Sistema sistema = cargarSistema();
        VentanaPrincipal ventana = new VentanaPrincipal(sistema);
        ventana.setVisible(true);

    }

    public static Sistema cargarSistema() {
        Sistema sistema;

        FileInputStream in;
        try {
            in = new FileInputStream("salida.sys");
            ObjectInputStream deserializador = new ObjectInputStream(in);
            sistema = (Sistema) deserializador.readObject();
        } catch (FileNotFoundException ex) {
            sistema = new Sistema();
        } catch (IOException | ClassNotFoundException ex) {
            sistema = new Sistema();
        }

        sistema.inicializarManejador();
        return sistema;

    }

}
