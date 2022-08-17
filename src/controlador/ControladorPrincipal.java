package controlador;

import modelo.Usuario;
import vistas.VistaPrincipal;

public class ControladorPrincipal {
    public static VistaPrincipal ventana = new VistaPrincipal();
    
    public static void mostrar(Usuario user) {
        ventana.setVisible(true);
        completarCampos(user);
    }
    
    public static void ocultar() {
        ventana.setVisible(false);
    }
    
    public static void completarCampos(Usuario user) {
        String rolName;
        
        ventana.getTxtApellido().setText(user.getLastName());
        ventana.getTxtNombres().setText(user.getFirstName());
        ventana.getTxtUsuario().setText(user.getUserName());
        ventana.getTxtCorreo().setText(user.getEmail());
        ventana.getTxtDni().setText(user.getDni());
        
        switch(user.getRolid()) {
            case 0: rolName = "Empleado"; break;
            case 1: rolName = "Administrador"; break;
            default: rolName = "Empleado"; break;
        }
        
        ventana.getTxtRolName().setText(rolName);
        
    }
}
