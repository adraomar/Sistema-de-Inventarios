package modelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class Database {
    public String user = "root";
    public String pass = "Administrador5591";
    public String db = "db-inventario";
    public String host = "jdbc:mysql://192.168.100.200:3306/";
    public Connection con;

    public Database() {
        try {
            con = DriverManager.getConnection(host + db, user, pass);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Mysql: " + ex.getMessage());
        }
    }
    
    public Usuario verificarUsuario(String usuario, String password) {
        Usuario u = null;
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM accounts WHERE userName = ? AND userPassword = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, usuario);
            ps.setString(2, password);
            rs = ps.executeQuery();
            
            if(rs.next()) {
                u = new Usuario(rs.getInt("id"), rs.getString("lastName"), rs.getString("firstName"), rs.getString("userName"), rs.getString("userPassword"), rs.getInt("rolid"), rs.getString("email"), rs.getString("dni"), true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error conexion: " + ex.getMessage());
        }
        
        return u;
    }
    
    
    
}
