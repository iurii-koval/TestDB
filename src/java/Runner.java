
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Runner {
    
    public static void main(String [] args) throws SQLException {
        String url = "jdbc:derby://localhost:1527/SwissquoteTeamDB";
        String login = "root";
        String password = "";
                
        Connection connection = DriverManager.getConnection(url, login, password);
        Statement testStatement = connection.createStatement();
        ResultSet result = testStatement.executeQuery("select count(*) as total from teams");
        
        while(result.next()) {
            System.out.println("output:" + result.getInt("total"));
        }
        
          
    }
    
}
