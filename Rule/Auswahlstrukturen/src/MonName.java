import java.util.Scanner;

public class MonName {
  public static void main(String [] args) {
    // Monatseingabe
    Scanner myReader = new Scanner(System.in);
    Integer number;
    String[] months = {
      "Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"
    };
    System.out.println("Gebe den Monat als Zahl ein! ");
    number = myReader.nextInt();
    if (number > 1 && number < 12) {
      System.out.println("Der Monat ist : " + (months[number-1]));
    } else {
      System.out.println("Die Zahl ist nicht zwischen 1 und 12 sondern: " + number);
    }
    System.out.println("Erfolg");

  }

}
