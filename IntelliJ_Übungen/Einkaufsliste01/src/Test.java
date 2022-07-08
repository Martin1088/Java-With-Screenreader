import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test {
    public static void main(String  [] args) {
        Vector vec;
        vec = new Vector();
        // Erzeuge listeneinträge
        Shopping str1 = new Shopping("Schokolade", 1, 5, 5);
        Shopping str2 = new Shopping("Toletenpapier", 3, 16, 5);
        Shopping str3 = new Shopping("Kaffeemaschine", 90, 16, 1);
        Shopping str4 = new Shopping("Kaffee", 4, 5, 10);
        Shopping str5 = new Shopping("Tee gemischt", 6, 5, 5);
        Shopping str6 = new Shopping("Mikrowelle", 150, 16, 1);
        Shopping str7 = new Shopping("Tassen", 2,16, 40);
        // Einfügen der Objekte in den Vektor
        vec.add(str1);
        vec.add(str2);
        vec.add(str3);
        vec.add(str4);
        vec.add(str5);
        vec.add(str6);
        vec.add(str7);
        // Valiable für Lösung der Aufgabe
        double total_mwst_alt = 0;
        double total_mwst_neu = 0;
        double total_betrag_alt = 0;
        double total_betrag_neu = 0;
        double mwst_betrag_neu = 0;
        double mwst_betrag_alt = 0;

        // Ausgabe
        for (int i = 0;i < vec.size(); i++) {
            mwst_betrag_alt = (((Shopping) vec.elementAt(i)).getNettobetrag()/100) * ((Shopping) vec.elementAt(i)).getMwst() * ((Shopping) vec.elementAt(i)).getAnzahl();
            total_mwst_alt = total_mwst_alt + mwst_betrag_alt;
            total_betrag_alt = total_betrag_alt + ((Shopping) vec.elementAt(i)).getNettobetrag() + mwst_betrag_alt;

            System.out.print("Artikel: ");
            System.out.print(((Shopping) vec.elementAt(i)).getArtikel());
            System.out.print(" Merhwertsteuer: ");
            System.out.print(((Shopping) vec.elementAt(i)).getMwst());
            System.out.print(" Prozent,  Nettobetrag: ");
            System.out.print(((Shopping) vec.elementAt(i)).getNettobetrag());
            System.out.print(" Euro, Anzahl: ");
            System.out.print(((Shopping) vec.elementAt(i)).getAnzahl());
            System.out.println(" Stück");
        }
        System.out.println("Der gesamte einkauf kostet " + total_betrag_alt);
        System.out.println("Die gesamte Merhwertsteuer beträgt " + mwst_betrag_alt);


    }
}
