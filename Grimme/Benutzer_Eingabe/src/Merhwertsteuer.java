import java.util.Scanner;

public class Merhwertsteuer {
  public static double country() {
    double mwst = 0;
    System.out.println("In welchem Land wohnen Sie ?");
    System.out.println("1. Deutschland");
    System.out.println("2. Dänemark ");
    System.out.println("3. Ungarn");
    System.out.println("4. Italien");
    Scanner myReader = new Scanner(System.in);
    switch (myReader.nextInt()) {
      case 1:
        mwst = 19.00;
        break;
      case 2:
        mwst = 25.00;
        break;
      case 3:
        mwst = 27.00;
        break;
      case 4:
        mwst = 22.00;
        break;
      default:
        System.out.println("Falsche Eingabe");
    }
    return mwst;
  }
  public static void main(String [] args) {
    // Einlesen eines Geldbetrags und berechnen der Merhwertsteuer
    Scanner myReader = new Scanner(System.in);
    double mwst;
    double totalAmount;
    double amount;
    mwst = country();
    System.out.println("Geben Sie Ihren Geldbetrag ein: ");
    amount = myReader.nextDouble();
    totalAmount = (amount / 100) * mwst;
    System.out.println("Geldbetrag: " + amount);
    System.out.println("+ MwSt: " + mwst);
    for (int i = 0; i < 10;i++) {
      System.out.print("-");
    }
    System.out.println("\n Gesamt: " + totalAmount);
  }

}
