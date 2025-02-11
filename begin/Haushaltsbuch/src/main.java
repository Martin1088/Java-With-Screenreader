import java.util.Scanner;

public class main {
  static Housekeeping_book.entries write_entries() {
    Scanner myscammer = new Scanner(System.in);
    System.out.println("Title, Ein oder Ausgaben, Betrag, Datum:");
    Housekeeping_book.entries houseEntry = new Housekeeping_book.entries(
        myscammer.next(),
        myscammer.next(),
        myscammer.nextInt(),
        myscammer.next()
    );
    myscammer.close();
    return houseEntry;

  }

  public static void main(String[] args) {
    Scanner myscanner = new Scanner(System.in);
  Housekeeping_book housekeeping_book = new Housekeeping_book();
  char next_entry = 'n';
  while (next_entry != ('y')) {
    housekeeping_book.booking.add(write_entries());
    // Do you want to continue ? with y or n
    System.out.println("Do you want to continue ? y or n");
    next_entry = myscanner.next().charAt(0);
  }
    // Ausgabe
    for (Housekeeping_book.entries e : housekeeping_book.booking) {
      System.out.println("Titel: " + e.title);
      System.out.println("Typ: " + e.typ);
      System.out.println("Betrag: " + e.amount);
      System.out.println("Datum: " + e.datum);


    }


  }
}
