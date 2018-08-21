
package controller.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static Connection conn; //Objeto de conexion
    public void realizaConexion(){
        conn = null;
        String urlDatabase =  "jdbc:postgresql://localhost:5432/ProyectoFinal"; 
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(urlDatabase,  "postgres", "william");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ocurrio un error : "+e.getMessage());
        }
        System.out.println("La conexión se realizo sin problemas! =) ");
    }
    
    public Connection getConnection(){
        return this.conn; //Retorno el objeto de conexion
    }
   
    public void cerrarConexion() throws SQLException{
        conn.close(); 
    }
}
