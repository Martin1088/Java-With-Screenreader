import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kalkulation {

  static double getUserInput(String out) {
    Scanner myscanner = new Scanner(System.in);
     System.out.println("Geben Sie den " +  out + " ein: " );
    double result = myscanner.nextDouble();
    return result;
  }
  public static ArrayList<String>  ReferenceCalculation() {
    double amount = 0;
    int amountProzent = 0;
    double calc= 0;
    String euro = "  Euro";
    String prozent = "  Prozent";
    String type;
    ArrayList<String> overview = new ArrayList<>();
    // Bezugskalkulation
    type = "Listeneinkaufspreis ";
    amount = getUserInput( type );
    overview.add(type + amount + euro);
    type = "Lieferrabbat ";
    amountProzent = (int) getUserInput(type);
    calc = ((amount / 100) * amountProzent);
    overview.add(type + amountProzent + prozent);
    overview.add(type + calc + euro);
    type = "Zieleinkaufspreis ";
    amount = amount - calc;
    overview.add(type + amount + euro);
    type= "Lieferskonto ";
    amountProzent = (int) getUserInput(type);
    calc = (amount / 100) * amountProzent;
    overview.add(type + amountProzent + prozent);
    overview.add(type + calc + euro);
    type = "Bareinkaufspreis ";
    amount = amount - calc;
    overview.add(type + amount + euro);
    type = "Bezugskosten (in Euro) ";
    calc = getUserInput(type);
    overview.add(type + calc + euro);
    type = "Einstandspreis ";
    calc = amount + calc;
    overview.add(type + calc + euro);
    overview.add(String.valueOf(calc));
    return overview;
  }
  public static ArrayList<String> SalesCalculation(double transfer) {
    double amount = 0;
    int amountProzent = 0;
    double calc= 0;
    String euro = "  Euro";
    String prozent = "  Prozent";
    String type;
    ArrayList<String> overview = new ArrayList<>();
    // Absatzkalkulation
    overview.add("-- Absatzkalkulation --");
    type = "Handlungskosten ";
    amountProzent = (int) getUserInput(type);
    calc = (transfer/100) * amountProzent;
    overview.add(type + amountProzent + prozent);
    overview.add(type + calc + euro);
    type = "Selbstkosten ";
    amount = transfer + calc;
    overview.add(type + amount + euro);
    type = "Gewinnzuschlag ";
    amountProzent = (int) getUserInput(type);
    calc = (amount/100) * amountProzent;
    overview.add(type + amountProzent + prozent);
    overview.add(type + calc + euro);
    type = "Barverkaufspreis ";
    amount = amount + calc;
    overview.add(type + amount  + euro);
    type = "Kundenskonto ";
    String type2 = "Provision ";
    int ap1 = 0; // amontProzent as help
    amountProzent = (int) getUserInput(type);
    overview.add(type + amount + prozent);
    ap1 = (int) getUserInput(type2);
    overview.add(type2 + ap1 + prozent);
    calc = (amount/(100-amountProzent-ap1)) * amountProzent;
    amount = amount + calc;
    overview.add(type + calc + euro);
    calc = (amount/(100-amountProzent-ap1)) * ap1;
    amount = amount + calc;
    overview.add(type + calc + euro);
    type = "Zielverkaufspreis ";
    overview.add((type + amount + euro));
    type = "Kundenrabatt ";
    amountProzent = (int) getUserInput(type);
    overview.add(type + amountProzent + prozent);
    calc = (amount/(100 + amountProzent) * amountProzent);
    overview.add(type + calc + euro);
    type = "Listenpreis ";
    amount = amount+ calc;
    overview.add(type + amount + euro);
    return overview;
  }

  public static void main(String[] args) {
    ArrayList<String> showRef = ReferenceCalculation();
    double transfer = Double.parseDouble(showRef.get(showRef.size() -1));
    ArrayList<String> showSal = SalesCalculation(transfer);
    // Anzeigen der Kalkulation
    for (String e: showRef) {
      System.out.println(e);
    }
    for (String e: showSal) {
      System.out.println(e);
    }
  }
}
