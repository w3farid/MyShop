package product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TheConnection {
   static Connection con=null;
  public static Connection getConnect(){
      
      try {
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:/3306/myshop", "root", "farid");
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(TheConnection.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(TheConnection.class.getName()).log(Level.SEVERE, null, ex);
      }
      return con;
  }
}
