
package Config;

import java.sql.*;

public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "12345678");
        } catch (Exception e) {
            System.err.println("Error de conexión: " + e);
        }
    }
    public Connection getConnection(){
        return con;
    }
}
