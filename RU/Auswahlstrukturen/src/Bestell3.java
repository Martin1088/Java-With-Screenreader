import java.util.Scanner;

public class Bestell3 {
  static double Porto(double bill) {
    double result;
    if (bill < 100) {
      result = bill + 5.50;
      return result;
    } else if (bill < 200 && bill > 100) {
      result = bill + 3.0;
      return result;
    } else {
      result = bill;
      return result;
    }
    //
  }
  public static void main(String [] args) {
// Elektor firma
    // berechnen des Portos
    double bill;
    double endbill;
    Scanner myReader = new Scanner(System.in);
    System.out.println("Willkommen. Geben Sie den Rechnungsbetrag ein! zur Porto Berechnung: ");
    bill = myReader.nextDouble();
    endbill = Porto(bill);
    System.out.println("Der Rechnungsbetrag mit Porto ist: " + endbill);


  }

}
