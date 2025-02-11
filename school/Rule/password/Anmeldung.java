
/**
 * Anmeldung
 */
public class Anmeldung {
  public static String getPasswort(String satz) {
    // split und for , firt Uppercase then lowerCase
    String result = "";
    String[] temp = satz.split(" ");
    Integer num = 0;
    for (String word : temp) {
      if ((num % 2) == 0) {
        result += Character.toUpperCase(word.charAt(0));
      } else {
        result += Character.toLowerCase(word.charAt(0));
      }
      num += 1;
    }
    return result;
  }

  public static void main(String[] args) {
    String test = "Heute regnet es Am laufenden Bach";
    String temp = getPasswort(test);
    System.out.println(temp);
  }
}
