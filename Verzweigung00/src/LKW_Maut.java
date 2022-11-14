import java.util.Scanner;

public class LKW_Maut {

  public static void berechneMaut(int Achse, char Klasse, int kilometer) {
    // berechne
    char[] tabellenKlasse = {'A', 'B', 'C', 'D', 'E', 'F'};
    double[] bis3Achsen = {12.50, 14.60, 15.70, 18.8, 19.80, 20.80};
    double[] bis4Achsen = {13.1, 15., 20, 16.30, 19.40, 20.40, 21.40};
    for (int i = 0; i < tabellenKlasse.length; i++) {
      if (Character.compare(Klasse, tabellenKlasse[i]) == 0) {
        if (Achse <= 3) {
  System.out.println("Koste: " + (bis3Achsen[i] * kilometer) + " Euro");
        } else if (Achse <= 4) {
  System.out.println("Kosten: " + (bis4Achsen[i] * kilometer) + " Euro");
        } else {
          System.out.println("zu vile Achsen");
        }
      }
    }
  }

  public static void main(String[] args) {
    // Anzahl Achsen und Schadstoffklasse und länge der Strecke
    Scanner myscanner = new Scanner(System.in);
    char Klasse;
    int Achsen = 0;
    int kilometer = 0;
    System.out.println("Geben Sie die Anzahl der Achsen ein: ");
    Achsen = myscanner.nextInt();
    System.out.println("Gebe die Schadstoff Klasse  A, B, C, D, E oder F an: ");
    Klasse = myscanner.next().charAt(0);
    System.out.println("Gebe die länge der Strecke in Km an: ");
    kilometer = myscanner.nextInt();
    berechneMaut(Achsen, Klasse, kilometer);
  }
}
