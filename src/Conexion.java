import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
   public Connection getConnection(){
       Connection connection = null;
       try {
           connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1995665colima");
           if(connection != null) {
               System.out.println("Conexión exitosa");
           }
           }catch(SQLException e) {
               System.out.println(e);
           }
       return connection;
   }
}

