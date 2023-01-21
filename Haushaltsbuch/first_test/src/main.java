import java.util.Scanner;

public class main {
  static Housekeeping_book.entries write_entries() {
    Scanner myscammer = new Scanner(System.in);
    System.out.println("Title, Ein oder Ausgaben, Betrag, Datum:");
    Housekeeping_book.entries housentry = new Housekeeping_book.entries(
        myscammer.next(),
        myscammer.next(),
        myscammer.nextInt(),
        myscammer.next()
    );
    return housentry;

  }

  public static void main(String[] args) {
  Housekeeping_book housekeeping_book = new Housekeeping_book();
  housekeeping_book.booking.add(write_entries());
  // Ausgabe
    for (Housekeeping_book.entries e : housekeeping_book.booking) {
      System.out.println("Titel: " + e.title);
    }

  }
}
