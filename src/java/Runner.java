
import static com.company.generators.TeamGenerator.generateListOfTeams;
import com.company.tables.Team;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;




public class Runner {
    
    public static void main(String [] args) throws SQLException {
        String url = "jdbc:derby://localhost:1527/SwissquoteTeamDB";
        String login = "root";
        String password = "";
        
        List<Team> teams = generateListOfTeams(40, 2, 100, 4, 7, 4, 10);
        
        String teamsPart = new String();
        for(Team team : teams) {
            StringBuilder teamData = new StringBuilder();
            teamData.append('(')
                    .append(team.getId())
                    .append(',')
                    .append(team.getTeamName())
                    .append(',')
                    .append(team.getNumberOfMembers())
                    .append(')');
            teamsPart = teamsPart + new String(teamData);
        }
        
        System.out.println(teamsPart);
        
/*        
        Connection connection = DriverManager.getConnection(url, login, password);
        Statement testStatement = connection.createStatement();
        ResultSet result = testStatement.executeQuery("select count(*) as total from teams");
        
        while(result.next()) {
            System.out.println("output:" + result.getInt("total"));
        }
  */      
          
    }
    
}
