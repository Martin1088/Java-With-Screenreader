import java.util.Scanner;

public class Hamburger {
  public static void main(String [] args) {
    // Aufgabe Hamburger wettessen
    Scanner myReader = new Scanner(System.in);
    Integer weight;
    System.out.println("Geben Sie Ihr Gewicht ein:");
    weight = myReader.nextInt();
    if (weight < 60) {
        System.out.println("Sie sind zu leicht: " + (60- weight) + " kg zunehmen. das Sie im Leichtgewixcht teilnehmen können!");
    } else if (weight >= 60 && weight < 80) {
      System.out.println("Sie dürfen im Leichtgewicht teilnehmen. Guten Appetit !!");
    } else if (weight >= 80 && weight < 100) {
      System.out.println("Sie starten im Mittelgewicht!");
      System.out.println("Sie sind zu leicht: "+ (weight - 100) +" kg zunehmen, damit Sie im Schwergewicht starten dürfen!!");
    } else if (weight >= 100 && weight >= 120) {
      System.out.println("Sie starten im Schwergewicht!");
    } else {
      System.out.println("Sie sind um " + (weight - 120) + " kg zu schwer und kannst nicht teinehmen!");
    }
    //

  }


}
