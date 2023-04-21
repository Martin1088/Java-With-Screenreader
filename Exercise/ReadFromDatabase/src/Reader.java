
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Reader {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3308/mrbs";
        String user = "mrbs";
        String password =  "mrbs";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Sie sind erfolgreich mit der Datenbank Raumplanner verbunden!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
