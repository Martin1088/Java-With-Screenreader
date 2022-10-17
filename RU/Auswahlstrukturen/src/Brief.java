import java.util.Scanner;

public class Brief {
  public static void show(double pay ) {
    System.out.println("Portoberechnung: ");
    System.out.println("Das Gewicht des Briefes ist (g): ");
    System.out.println(" Kosten" + (pay) + " D$");
  }
  public static void main(String[] args) {
    // Porto berechnen
    Scanner myReader = new Scanner(System.in);
    int weight;
    System.out.println("Geben Sie das Gewicht des Briefs ein in gramm: ");
    weight = myReader.nextInt();
    if (weight >= 20) {
      show(1.00);
    } else if (weight <= 50) {
      show( 1.70);
    } else if (weight <= 100) {
      show(2.40);
    } else if (weight <= 250) {
      show(3.20);
    } else if (weight <= 500) {
      show(4.00);
    } else if (weight <= 1000) {
      show(4.80);
    } else {
      System.out.println("Der Brief ist zu schwer es ist nun ein Paket");
    }
  }

}
