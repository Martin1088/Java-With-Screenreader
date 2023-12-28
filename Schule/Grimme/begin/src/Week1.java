import java.util.Scanner;

public class Week1 {

  public static void main(String[] args) {
    System.out.println("Ein Erfolgreiches Schuljahr ");
    System.out.println("One");
    System.out.print("Two \n");
    System.out.print("Three - leave! \n");
    double x = 5.328;
    System.out.println(x);
    Scanner myReader = new Scanner(System.in);
    String  vorname;
    String nachname;
    System.out.println("Gib deinen Namen ein!");
    vorname = myReader.next();
    nachname = myReader.nextLine();
    System.out.println("Willkommen " + vorname + " lerne die neuen Funktionen des Programms kennnen !");
    System.out.println("Gib dein Geburstsdatum ein!");
    String  geburtsdatum;
    geburtsdatum = myReader.nextLine();
    System.out.println("Dein Nachname ist: " + nachname);
    System.out.println("Dein Vorname ist : " + vorname);
    System.out.println("Das Gebusrsdatum ist : " + geburtsdatum);
    //



  }
}
