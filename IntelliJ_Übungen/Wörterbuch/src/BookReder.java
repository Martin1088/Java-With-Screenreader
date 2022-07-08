import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class BookReder {
    public static void main(String [] args) {
        // Dictionary in Java mit Hashmapdas Englische als key
        HashMap<String, String> words = new HashMap<>();

        try {
            // Datei lesen
            File myobj = new File("Fachenglisch.txt");
            Scanner myReder = new Scanner(myobj);
            while (myReder.hasNext()) {
                String data = myReder.nextLine();
                // in zwei Strings teilen
                if (!data.contains("-") ) {
                    continue;
                } else if (data.contains("-")) {
                     String[] part = data.split(" - ");
                     System.out.println(part[0] + " == " + part[1]);
                     //words.put(part[0], part[1]);
                 }
            }
            myReder.close();
            //Iterator<String> it = words.keySet().iterator();
            //while (it.hasNext()) {
            //System.out.println(it.next());
        } catch (FileNotFoundException e) {
            System.out.println("Fehler ist aufgetretten");
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
}
