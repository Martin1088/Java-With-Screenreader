import java.util.Scanner;

public class Schaltjahr {
  public static int Input() {
    Scanner myReader = new Scanner(System.in);
    int result;
    System.out.println("Geben Sie eine Jahreszahl ein: ");
    result = myReader.nextInt();
    return result;
  }
  public static void main(String[] args) {
    // Zahlen eingabe Jahreszahl
    int year;
    year = Input();
    if ((year % 4 == 0) && (year % 100 != 0)) {
      System.out.println("Das Jahr " + year + "ist eein SchaltJahr ");
    } else if (year % 400 == 0) {
      System.out.println("Das Jahr " + year + "ist eein SchaltJahr ");
    } else {
      System.out.println("Dieses Jahr ist kein Schaltjahr " + year);
    }
  }

}
