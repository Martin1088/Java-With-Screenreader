package de.samply;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
                // Liste mit dem Inhalt der Liste
                List<kreditor> kreditors = new ArrayList<>();
                List<ArrayList<String>> test = new ArrayList<>();

                while (rs.next()) {
                    for (int i = 1; i < 6; i++) {
                        System.out.print(rs.getString(i)+ " " );
                        myObj.write(rs.getString(i) + " ");
                        ArrayList<String> temp
                                = new ArrayList<>();
                        temp.add(rs.getString(i));
                        test.add(temp);
                    }
                    kreditors.add(new kreditor (rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDouble(6)));
                    System.out.println();
                    myObj.write("\r\n");
                }
                myObj.close();
                // Anzeigen der Liste
                System.out.println("Liste mit Klasse kreditor: ");
                for (kreditor k: kreditors) {
                    System.out.println(k.Firma + " " + k.PLZ);
                }
                System.out.println("Araay Liste : ");
                System.out.println(test);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println("There is something wrong !");
                e.printStackTrace();
            }
    }
}
