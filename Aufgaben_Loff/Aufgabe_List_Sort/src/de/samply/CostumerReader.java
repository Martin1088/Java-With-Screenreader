package de.samply;
import java.sql.*;

public class CostumerReader {
    public static void main(String[] args) {
        //  einlesen Der Daten
            String url = "jdbc:mysql://localhost:3308/haro01";
            String user = "root";
            String password = "";
            try {
                Connection con = DriverManager.getConnection(url, user, password);
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("SELECT * FROM kreditor");
                while (rs.next()) {
                    for (int i = 1; i < 7; i++) {
                        System.out.print(rs.getString(i)+ " " );
                    }
                    System.out.println();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
    }
}
