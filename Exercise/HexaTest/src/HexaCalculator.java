import java.util.ArrayList;
import java.util.Random;

public class HexaCalculator {

    private static String HexaTranslator(int number) {
        ArrayList<String> hexa = new ArrayList<>() ;
        hexa.add("A");
        hexa.add("B");
        hexa.add("C");
        hexa.add("D");
        hexa.add("E");
        hexa.add("F");
        String result;
        if (number < 10) {
            result = Integer.toString(number);
        } else if (number>= 10) {
            number = number - 1;
            result = hexa.get(number);
        }
        return result;
    }
    // Funktion zum Umrechnen der Zufallszahl in eine HexaDezimalzahl
    private static String


    public static void main(String[] args) {
        // Variablen für den Input des Nutzers und die richtige Antwort
        String UserInput = "";
        String  soloution = "";
        while (UserInput.equals("q") {
            // Es werden zwei Zufallszahlen generiert eine für die Aufgabe und eine als wahl zwischen Hexa und Dezimal
            Random ran = new Random();
            int quest = 0 + ran.nextInt(65535 - 0 + 1);
            int choice = 0 + ran.nextInt(1 - 1 + 1);
            System.out.println("Mit q wird das Program beendet");
            // hier kommt die Umrechnung in Hexadezimalzahl

        }
        //
    }
}
