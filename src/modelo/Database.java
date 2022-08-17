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
    
    
    
}
