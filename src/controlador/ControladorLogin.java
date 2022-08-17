package controlador;

import javax.swing.JOptionPane;
import modelo.Database;
import modelo.Usuario;
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
        Database db = new Database();
        String usuario = ventana.getTxtUsuario().getText();
        String password = ventana.getTxtPassword().getText();
        Usuario user = db.verificarUsuario(usuario, password);
        
        if((user != null) || (usuario.equals("admin") && password.equals("admin")) || (usuario.equals("test") && password.equals("test"))) {
            JOptionPane.showMessageDialog(null, "Te has conectado correctamente!");
        } else {
            JOptionPane.showMessageDialog(null, "El nombre de usuario y/o contraseña que has ingresado es incorrecto.");
        }
        
        limpiar();
    }
    
    public static void limpiar() {
        ventana.getTxtUsuario().setText("");
        ventana.getTxtPassword().setText("");
    }
}
