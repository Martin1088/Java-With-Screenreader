import com.sun.javafx.UnmodifiableArrayList;

import java.util.ArrayList;
import java.util.List;

public class Shopping {

    public static void main(String[] args) {
        // Einkaufliste als String Array
        // Artikel, Nettobetrag, Mehrwertsteuer, Anzahl
        String [] [] shoppinglist = {
                {"Schokolade", "1", "5", "5"},
                {"Tolettenpapier", "3", "16", "5"},
                {"Daffeemaschine", "90", "16", "1"},
                {"Kaffee", "4", "5", "10"},
                {"Tee gemischt", "6", "5", "5"},
                {"Mikrowelle", "150", "15", "1"},
                {"Tassen", "2", "16", "40"}
        };
        for (int i = 0;i < shoppinglist.length; i++) {
            for (int j = 0; j < shoppinglist[i].length; j++) {
                System.out.println(shoppinglist[i] [j]);
            }
            System.out.println();
        }
    }

}
