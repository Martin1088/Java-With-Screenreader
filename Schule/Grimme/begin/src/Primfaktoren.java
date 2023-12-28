import java.util.ArrayList;
import java.util.Scanner;
import javax.security.sasl.SaslClient;

public class Primfaktoren {
  public static void main(String[] args) {
    // Primfaktor bestimmen
    Scanner myReader = new Scanner(System.in);
    int number;
    // primfaktorzahl
    int prim = 2;
    ArrayList<Integer> teilerliste = new ArrayList<>();
    System.out.println("geben Sie eine Ganzzahl ein für die Primzahlzerlegung ");
    number = myReader.nextInt();
    while (prim <= number) {
      while (number % prim == 0) {
        number = number / prim;
        teilerliste.add(prim);
        System.out.println(prim);
      }
      prim++;

    }
    // ausgabe der Primfaktoren
  System.out.println(teilerliste);

  }

}
