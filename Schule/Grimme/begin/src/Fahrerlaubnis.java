import java.util.Scanner;

public class Fahrerlaubnis {
  public static void main(String[] args) {
    Scanner myReader = new Scanner(System.in);
    int age;
    System.out.println(" Geben Sie ihr Alter ein");
    age = myReader.nextInt();
    if (age <= 14) {
      System.out.println("Sie haben keine Fahr erlaubnis");
    } else if (age <= 16) {
      System.out.println("Sie dürfen Mopad fahren");
    } else if (age < 18) {
      System.out.println("Sie dürfen Mopad und Mofa fahren");
    } else {
      System.out.println("Sie dürfen alle fahrzeuge fahren");
    }
  }

}
