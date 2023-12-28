public class Tabelle {

  public static void main(String[] args) {
  System.out.println("Zahlen: ");
    for (int i = 48; i < 122; i++) {
      if (i >= 91 && i <= 96) {
        continue;
      } else if (i >= 58 && i <= 64) {
        continue;
      }
      System.out.print(i + " " + (char) i + " ");
      if ((i %4) == 0) {
        System.out.println();
      } else if (i == 90) {
        System.out.println("\n Kleinbuchstaben: \n");
      } else if (i == 57) {
        System.out.println("\n Grossbuchstaben: ");
      }
    }
  }
}
