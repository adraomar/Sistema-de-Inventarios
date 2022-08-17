package controlador;

import vistas.VistaLogin;

public class ControladorLogin {
    public static VistaLogin ventana = new VistaLogin();
    static String version = "1.0.0";
    static String revision = "1.0.0a";
    static String owner = "Omar Adra";
    
    public static void mostrar() {
        ventana.getLblCopyright().setText("Sistema de Inventario - V: " + version + " - Rev: " + revision + " - Powered by " + owner);
        ventana.setVisible(true);
    }
    
    public static void ocultar() {
        ventana.setVisible(false);
    }
    
    public static void botonIniciarSesion() {
        
    }
}
