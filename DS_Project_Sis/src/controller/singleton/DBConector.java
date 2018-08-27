
package controller.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DBConector {
    
    private static DBConector instance;
    private Connection connection;
    private final String URL = "jdbc:postgresql://192.168.1.15/DS_Database"; 
    private final String USERNAME = "postgres";
    private final String PASSWORD = "admin";
        
    private DBConector(){
        try {
            this.connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Successful Connection of the Database");
        } 
        catch (SQLException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    public void closeConnection(){
        try { 
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static DBConector getInstance() throws SQLException {
        if (instance == null) {
            instance = new DBConector();
        } 
        else if (instance.getConnection().isClosed()) {
            instance = new DBConector();
        }
        return instance;
    }
    
//    private void insertQuery(){
//        try {
//            Statement stmt = connection.createStatement();
//            String sql = "INSERT INTO Cliente (Cedula_Cliente, Nombre, Apellido, Direccion, Telefono) "
//                    + "VALUES (0912321230, 'Ricardo', 'Serrano', 'Guayaquil', 3215620 );";
//            stmt.executeUpdate(sql);
//        } catch (SQLException ex) {
//            Logger.getLogger(DBConector.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    
}
