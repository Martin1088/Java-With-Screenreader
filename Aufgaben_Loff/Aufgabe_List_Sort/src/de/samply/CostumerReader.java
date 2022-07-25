package de.samply;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
                // schreibe Liste in eine Datei txt
                FileWriter myObj = new FileWriter("kreditoren.txt");

                while (rs.next()) {
                    for (int i = 1; i < 6; i++) {
                        System.out.print(rs.getString(i)+ " " );
                        myObj.write(rs.getString(i) + " ");
                    }
                    System.out.println();
                    myObj.write("\r\n");
                }
                myObj.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println("There is something wrong !");
                e.printStackTrace();
            }
    }
}
