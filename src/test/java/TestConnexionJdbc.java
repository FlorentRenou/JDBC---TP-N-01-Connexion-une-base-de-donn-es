import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class TestConnexionJdbc {

    private static final String DB_URL = "jdbc:mariadb://localhost:3306/compta";
    private static final String DB_USER = "root";
    private static final String DB_PWD = "root";
    public static void main(String[] args) {
        try {
            //Class.forName("org.mariadb.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);

            System.out.println(connection);
            connection.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}