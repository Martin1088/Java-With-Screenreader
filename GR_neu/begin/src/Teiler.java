import java.util.ArrayList;
import java.util.Scanner;

public class Teiler {
  public static void main(String [] args) {
    // ermitteln des Teilers einer eingegebenen Ganzzahl
    Scanner myReader = new Scanner(System.in);
    int number;
    System.out.println("Geben Sie eine Ganzzahl ein");
    ArrayList<Integer> teilerliste = new ArrayList<>();
    number = myReader.nextInt();
    for (int i = 2; i <= number/2; i++) {
    if (number % i == 0) {
        teilerliste.add(i);
      }

    }
    System.out.println(teilerliste);
    // Ausgabe mit Kommas

  }

}
